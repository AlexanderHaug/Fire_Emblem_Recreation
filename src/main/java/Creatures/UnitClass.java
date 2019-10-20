package Creatures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class UnitClass {

    private String name = "";
    private int[] unitClassGrowth = new int[9];
    private int move = 0;
    private String[] unitClassType = new String[7];
    private ArrayList<String> equipable = new ArrayList<>();

    public UnitClass(String file) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/Classes/";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+file+".csv"));
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

    public int[] getUnitClassGrowth() {return this.unitClassGrowth;}

    public int getMove() {return move;}

    public String[] getUnitClassType() {return unitClassType;}
}
