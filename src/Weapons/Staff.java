package Weapons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Staff{

    private String name = "";
    private String weaponType = "";
    private String assistType = "";
    private int healAmount = 0;
    private int accuracy = 0;
    private ArrayList<Integer> staffRange = new ArrayList<>();
    private int weaponWeight = 0;
    private Character weaponRank;
    private int weaponUses = 0;
    private boolean staffIsMagic = false;
    private String staffStatusEffect = "";
    private String description = "";

    public Staff(String fileName) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/Weapons/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + fileName));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.weaponType = "Staff";
                setAssistType(data[1]);
                this.healAmount = Integer.parseInt(data[2]);
                this.accuracy = Integer.parseInt(data[3]);
                setAttackRange(data[4]);
                this.weaponWeight = Integer.parseInt(data[5]);
                this.weaponRank = data[6].charAt(0);
                this.weaponUses = Integer.parseInt(data[7]);
                this.staffIsMagic = true;
                setWeaponEffect(data[8]);
                this.description = data[9];
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getName() {return name;}

    public int getAccuracy() {return accuracy;}

    public Character getWeaponRank() {return weaponRank;}

    public boolean isWeaponMagic() {return staffIsMagic;}

    public String getWeaponType() {return weaponType;}

    private void setAssistType(String data) {
        if (data.contains("Healing")) {this.assistType = "Healing";}
        else if (data.contains("Cleansing")) {this.assistType = "Cleansing";}
        else if (data.contains("Attacking")) {this.assistType = "Attacking";}

    }

    private void setAttackRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.staffRange.add(Integer.parseInt(s));
        }
    }

    private void setWeaponEffect(String data) {
        if (data.contains("Silence")) {this.staffStatusEffect = "Silence";}
        else if (data.contains("Sleep")) {this.staffStatusEffect= "Sleep";}
        else if (data.contains("Berserk")) {this.staffStatusEffect = "Berserk";}
        else if (data.contains("Freeze")) {this.staffStatusEffect = "Freeze";}
        else if (data.contains("Enfeeble")) {this.staffStatusEffect = "Enfeeble";}

    }

    public ArrayList<Integer> getStaffRange() {return staffRange;}

    public String getDescription() {return description;}

    public int getWeaponWeight() {return weaponWeight;}

    public int getWeaponUses() {return weaponUses;}

    public int getHealAmount() {return healAmount;}

    public String getStaffStatusEffect() {return staffStatusEffect;}

    public String toString() {return name +  ", Accuracy " + accuracy;}

    public String getAssistType() {return assistType;}
}



