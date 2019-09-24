package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class UnitClass {

    private String name = "";
    private int[] unitClassGrowth = new int[9];
    private int move = 0;
    private String[] unitClassType = new String[7];
    private ArrayList<String> equipable = new ArrayList<>();

    public UnitClass(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String row;
            row = reader.readLine();
            String[] data = row.split(",");
            this.name = data[0];
            setClassGrowthRate(data[1]);
            this.move = Integer.parseInt(data[2]);
            setUnitClassType(data[3]);
            setEquipableWeapons(data[4]);
            reader.close();
        }

        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    private void setClassGrowthRate(String growths) {

        String[] all_growths = growths.split(":");
        for (int x = 0; x < 9; x++) {this.unitClassGrowth[x] = Integer.parseInt(all_growths[x]);}
    }

    private void setUnitClassType(String data) {
        if (!data.equals("")) {this.unitClassType = data.split(":");}
    }

    private void setEquipableWeapons(String weapons) {
        String[] all_weapons = weapons.split(":");
        Collections.addAll(this.equipable, all_weapons);
    }

    public ArrayList<String> getEquipable() {return equipable;}

    public String getName() {return name;}

    public int getHpGrowth() {return this.unitClassGrowth[0];}
    public int getAttGrowth() {return this.unitClassGrowth[1];}
    public int getMagGrowth() {return this.unitClassGrowth[2];}
    public int getSklGrowth() {return this.unitClassGrowth[3];}
    public int getLuckGrowth() {return this.unitClassGrowth[4];}
    public int getSpdGrowth() {return this.unitClassGrowth[5];}
    public int getDefGrowth() {return this.unitClassGrowth[6];}
    public int getResGrowth() {return this.unitClassGrowth[7];}

    public int getMove() {return move;}

    public String[] getUnitClassType() {return unitClassType;}
}
