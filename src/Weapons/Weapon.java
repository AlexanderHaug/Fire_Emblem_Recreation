package Weapons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Weapon {

    private String name = "";
    private String weaponType;
    private int might = 0;
    private int accuracy = 0;
    private int critical = 0;
    private ArrayList<Integer> attackRange = new ArrayList<>();
    private int weaponWeight = 0;
    private String weaponRank = "";
    private int weaponUses = 0;
    private int weaponCost = 0;
    private boolean weaponIsMagic = false;
    private boolean weaponIsBrave = false;
    private boolean weaponIsDevil = false;
    private boolean weaponIsPoison = false;
    private HashMap<String, Integer> weaponStatModifiers = new HashMap<>();
    private ArrayList<String> effectiveAgainst = new ArrayList<>();
    private String description = "";

    public Weapon(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.weaponType = data[1];
                this.might = Integer.parseInt(data[2]);
                this.accuracy = Integer.parseInt(data[3]);
                this.critical = Integer.parseInt(data[4]);
                setAttackRange(data[5]);
                this.weaponWeight = Integer.parseInt(data[6]);
                this.weaponRank = data[7];
                this.weaponUses = Integer.parseInt(data[8]);
                this.weaponCost = Integer.parseInt(data[9]);
                setWeaponIs(data[10]);
                setWeaponStatModifiers(data[11]);
                setEffectiveAgainst(data[12]);
                this.description = data[13];
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getName() {return name;}

    public int getMight() {return might;}

    public int getAccuracy() {return accuracy;}

    public int getCritical() {return critical;}

    public String getWeaponRank() {return weaponRank;}

    public boolean getWeaponIsMagic() {return weaponIsMagic;}

    public String getWeaponType() {return weaponType;}

    private void setAttackRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.attackRange.add(Integer.parseInt(s));
        }
    }

    public ArrayList<Integer> getAttackRange() {return attackRange;}

    private void setWeaponIs(String data) {
        if (data.contains("Magic")) {this.weaponIsMagic = true;}
        if (data.contains("Brave")) {this.weaponIsBrave = true;}
        if (data.contains("Devil")) {this.weaponIsDevil = true;}
        if (data.contains("Poison")) {this.weaponIsPoison = true;}
    }

    private void setWeaponStatModifiers(String data) {
        if (!data.equals("")) {
            String[] splt = data.split(":");
            for (String s : splt) {
                String[] stat = s.split(";");
                this.weaponStatModifiers.put(stat[0], Integer.parseInt(stat[1]));
            }
        }
    }

    private void setEffectiveAgainst(String data) {
        if (!data.equals("")) {
            String[] splt = data.split(":");
            Collections.addAll(this.effectiveAgainst, splt);
        }
    }

    public ArrayList<String> getEffectiveAgainst() {return effectiveAgainst;}

    public String getDescription() {return description;}

    public int getWeaponWeight() {return weaponWeight;}

    public int getWeaponUses() {return weaponUses;}

    public int getWeaponCost() {return weaponCost;}

    public boolean getIsWeaponIsBrave() {return weaponIsBrave;}

    public boolean getIsWeaponIsDevil() {return weaponIsDevil;}

    public boolean getIsWeaponIsPoison() {return weaponIsPoison;}

    public HashMap<String, Integer> getWeaponStatModifiers() {
        return this.weaponStatModifiers;
    }

    public String toString() {return name + ": Mt " + might + ", Accuracy " + accuracy + ", Critical " + critical;}
}


