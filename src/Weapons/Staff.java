package Weapons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Staff {

    private String name = "";
    private String weaponType = "";
    private int healAmount = 0;
    private int accuracy = 0;
    private ArrayList<Integer> staffRange = new ArrayList<>();
    private int weaponWeight = 0;
    private String weaponRank = "";
    private int weaponUses = 0;
    private boolean staffIsMagic = false;
    private boolean staffCausesSilence = false;
    private boolean staffCausesSleep = false;
    private boolean staffCausesBerserk = false;
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
                this.healAmount = Integer.parseInt(data[1]);
                this.accuracy = Integer.parseInt(data[2]);
                setAttackRange(data[3]);
                this.weaponWeight = Integer.parseInt(data[4]);
                this.weaponRank = data[5];
                this.weaponUses = Integer.parseInt(data[6]);
                this.staffIsMagic = true;
                setWeaponIs(data[7]);
                this.description = data[8];
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getName() {return name;}

    public int getAccuracy() {return accuracy;}

    public String getWeaponRank() {return weaponRank;}

    public boolean isWeaponMagic() {return staffIsMagic;}

    public String getWeaponType() {return weaponType;}

    private void setAttackRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.staffRange.add(Integer.parseInt(s));
        }
    }

    private void setWeaponIs(String data) {
        if (data.contains("Silence")) {this.staffCausesSilence = true;}
        else if (data.contains("Sleep")) {this.staffCausesSleep = true;}
        else if (data.contains("Berserk")) {this.staffCausesBerserk = true;}
    }

    public ArrayList<Integer> getStaffRange() {return staffRange;}

    public String getDescription() {return description;}

    public int getWeaponWeight() {return weaponWeight;}

    public int getWeaponUses() {return weaponUses;}

    public int getHealAmount() {return healAmount;}

    public boolean doesStaffCauseSilence() {return staffCausesSilence;}

    public boolean doesStaffCauseSleep() {return staffCausesSleep;}

    public boolean doesStaffCauseBerserk() {return staffCausesBerserk;}

    public String toString() {return name +  ", Accuracy " + accuracy;}
}



