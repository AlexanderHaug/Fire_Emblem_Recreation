package Items.Equippable.OffHand;

import Items.Equippable.EquippableItem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Accessory extends EquippableItem {
    private int itemProtection = 0;
    private int[] otherBattleIncreases = new int[5]; // +PhysAtk,MagAtk,Hit,Crit,Avoid
    private ArrayList<String> otherNullifyEffective = new ArrayList<>();

    public Accessory(String file) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/main/java/Items/Equippable/OffHand/Accessories/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + file));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                setName(data[0]);
                this.itemProtection = Integer.parseInt(data[1]);
                setItemWeight(Integer.parseInt(data[2]));
                setOtherEffects(data[3]);
                setItemDescription(data[4]);
            }
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public int getItemProtection() {return this.itemProtection;}
    public int[] getOtherBattleIncreases() {return this.otherBattleIncreases;}
    public ArrayList<String> getOtherNullifyEffective() {return this.otherNullifyEffective;}

    private void setOtherEffects(String data) {
        String[] effects = data.split(":");
        if (effects.length == 9) {setOtherStatIncreases(effects);}
        else if (effects.length == 5) {setOtherBattleIncreases(effects);}
        else if (effects.length == 1 && !effects[0].equals("")) {Collections.addAll(this.otherNullifyEffective, effects);}
    }

    private void setOtherBattleIncreases(String[] data) {
        for (int x = 0; x < data.length; x++) {this.otherBattleIncreases[x] = Integer.parseInt(data[x]);}
    }
}
