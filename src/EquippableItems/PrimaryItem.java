package EquippableItems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PrimaryItem {
    // General Variables
    private String name = "";
    private String itemType;
    private int accuracy = 0;
    private ArrayList<Integer> itemRange = new ArrayList<>();
    private int itemWeight = 0;
    private Character itemRank;
    private int itemUses = 0;
    private int itemCost = 0;
    private String itemDescription = "";

    // Weapon Variables
    private int might = 0;
    private int critical = 0;
    private ArrayList<String> weaponIs = new ArrayList<>();
    private HashMap<String, Integer> weaponStatModifiers = new HashMap<>();
    private ArrayList<String> effectiveAgainst = new ArrayList<>();

    // Staff Variables
    private int healAmount = 0;
    private String assistType = "";
    private String staffStatusEffect = "";

    public PrimaryItem(String fileName, boolean isStaff) {
        if (isStaff) {createStaff(fileName);}
        else {createWeapon(fileName);}
    }

    private void createWeapon(String fileName) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/EquippableItems/Weapons/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + fileName));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.itemType = data[1];
                this.might = Integer.parseInt(data[2]);
                this.accuracy = Integer.parseInt(data[3]);
                this.critical = Integer.parseInt(data[4]);
                this.setItemsRange(data[5]);
                this.setItemWeight(Integer.parseInt(data[6]));
                this.setItemRank(data[7].charAt(0));
                this.setItemUses(Integer.parseInt(data[8]));
                this.itemCost = Integer.parseInt(data[9]);
                setWeaponIs(data[10]);
                setWeaponStatModifiers(data[11]);
                setEffectiveAgainst(data[12]);
                this.setItemDescription(data[13]);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    private void createStaff(String fileName) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/EquippableItems/Weapons/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + fileName));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.itemType = data[1];
                setAssistType(data[2]);
                this.healAmount = Integer.parseInt(data[3]);
                this.accuracy = Integer.parseInt(data[4]);
                this.setItemsRange(data[5]);
                this.setItemWeight(Integer.parseInt(data[6]));
                this.setItemRank(data[7].charAt(0));
                this.setItemUses(Integer.parseInt(data[8]));
                setItemEffect(data[9]);
                this.setItemDescription(data[10]);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getName() {return name;}

    public int getAccuracy() {return accuracy;}

    public Character getItemRank() {return itemRank;}

    public String getItemType() {return itemType;}

    public ArrayList<Integer> getItemRange() {return itemRange;}

    public int getItemWeight() {return itemWeight;}

    public int getItemUses() {return itemUses;}

    public int getItemCost() {return itemCost;}

    public String getItemDescription() {return itemDescription;}

    public int getMight() {return might;}

    public int getCritical() {return critical;}

    public boolean isWeaponMagic() {return weaponIs.contains("Magic");}

    private void setWeaponIs(String data) {
        if (data.contains("Magic")) {this.weaponIs.add("Magic");}
        if (data.contains("Brave")) {this.weaponIs.add("Brave");}
        if (data.contains("Devil")) {this.weaponIs.add("Devil");}
        if (data.contains("Poison")) {this.weaponIs.add("Poison");}
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

    public boolean isWeaponBrave() {return weaponIs.contains("Brave");}

    public boolean isWeaponDevil() {return weaponIs.contains("Devil");}

    public boolean isWeaponPoison() {return weaponIs.contains("Poison");}

    public HashMap<String, Integer> getWeaponStatModifiers() {
        return this.weaponStatModifiers;
    }

    private void setAssistType(String data) {
        if (data.contains("Healing")) {this.assistType = "Healing";}
        else if (data.contains("Cleansing")) {this.assistType = "Cleansing";}
        else if (data.contains("Attacking")) {this.assistType = "Attacking";}
    }

    private void setItemEffect(String data) {
        if (data.contains("Silence")) {this.staffStatusEffect = "Silence";}
        else if (data.contains("Sleep")) {this.staffStatusEffect= "Sleep";}
        else if (data.contains("Berserk")) {this.staffStatusEffect = "Berserk";}
        else if (data.contains("Freeze")) {this.staffStatusEffect = "Freeze";}
        else if (data.contains("Enfeeble")) {this.staffStatusEffect = "Enfeeble";}
    }

    public int getHealAmount() {return healAmount;}

    public String getStaffStatusEffect() {return staffStatusEffect;}

    public String toString() {return this.getName() +  ", Accuracy " + this.getAccuracy();}

    public String getAssistType() {return assistType;}

    public boolean getStaffIsMagic() {return true;}

    public void setItemsRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.itemRange.add(Integer.parseInt(s));
        }
    }

    public void setItemWeight(int weight) {this.itemWeight = weight;}
    public void setItemRank(Character rank) {this.itemRank = rank;}
    public void setItemUses(int uses) {this.itemUses = uses;}
    public void setItemDescription(String description) {this.itemDescription = description;}
}
