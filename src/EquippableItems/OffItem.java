package EquippableItems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class OffItem {
    private String name = "";
    private int itemProtection = 0;
    private int itemWeight = 0;
    private int[] otherStatIncreases = new int[9]; // Hp,Str,Mag,Skill,Luck,Spd,Def,Res,Charm
    private int[] otherBattleIncreases = new int[5]; // +PhysAtk,MagAtk,Hit,Crit,Avoid
    private ArrayList<String> otherNullifyEffective = new ArrayList<>();
    private String itemDescription = "";

    public OffItem(String file) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/EquippableItems/Accessories/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + file));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.itemProtection = Integer.parseInt(data[1]);
                this.itemWeight = Integer.parseInt(data[2]);
                setOtherEffects(data[3]);
                this.itemDescription = data[4];
            }
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getName() {return this.name;}
    public int getItemProtection() {return this.itemProtection;}
    public int getItemWeight() {return this.itemWeight;}
    public int[] getOtherStatIncreases() {return this.otherStatIncreases;}
    public int[] getOtherBattleIncreases() {return this.otherBattleIncreases;}
    public ArrayList<String> getOtherNullifyEffective() {return this.otherNullifyEffective;}
    public String getItemDescription() {return this.itemDescription;}

    private void setOtherEffects(String data) {
        String[] effects = data.split(":");
        if (effects.length == 9) {setOtherStatIncreases(effects);}
        else if (effects.length == 5) {setOtherBattleIncreases(effects);}
        else if (effects.length == 1 && !effects[0].equals("")) {Collections.addAll(this.otherNullifyEffective, effects);}
    }

    private void setOtherStatIncreases(String[] data) {
        for (int x = 0; x < data.length; x++) {this.otherStatIncreases[x] = Integer.parseInt(data[x]);}
    }

    private void setOtherBattleIncreases(String[] data) {
        for (int x = 0; x < data.length; x++) {this.otherBattleIncreases[x] = Integer.parseInt(data[x]);}
    }
}
