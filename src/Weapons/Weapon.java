package Weapons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Weapon {

    private String name = null;
    private int might = 0;
    private int accuracy = 0;
    private int critical = 0;
    private String weaponType;
    private String weaponRank;
    private boolean weaponIsMagic;
    private int[] attackRange = new int[2];
    private String[] effectiveAgainst = new String[7];
    private String flavorText = "";

    public Weapon(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                this.name = data[0];
                this.might = Integer.parseInt(data[1]);
                this.accuracy = Integer.parseInt(data[2]);
                this.critical = Integer.parseInt(data[3]);
                this.weaponType = data[4];
                this.weaponRank = data[5];
                this.weaponIsMagic = Boolean.parseBoolean(data[6]);
                setAttackRange(data[7]);
                setEffectiveAgainst(data[8]);
                this.flavorText = data[9];
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {return name;}

    public int getMight() {return might;}

    public int getAccuracy() {return accuracy;}

    public int getCritical() {return critical;}

    public String getWeaponRank() {return weaponRank;}

    public boolean isWeaponIsMagic() {return weaponIsMagic;}

    public String getWeaponType() {return weaponType;}

    private void setAttackRange(String data) {
        String[] splt = data.split(":");
        System.arraycopy(splt, 0, this.effectiveAgainst, 0, splt.length);
    }

    public int[] getAttackRange() {return attackRange;}

    private void setEffectiveAgainst(String data) {
        String[] splt = data.split(":");
        System.arraycopy(splt, 0, this.effectiveAgainst, 0, splt.length);
    }

    public String[] getEffectiveAgainst() {return effectiveAgainst;}

    public String getFlavorText() {
        return flavorText;
    }

    public String toString() {return name + ": Mt " + might + ", Accuracy " + accuracy + ", Critical " + critical;}


}


