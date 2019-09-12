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

    public void setName(String Name) {name = Name;}

    public int getMight() {return might;}

    public void setMight(int Might) {might = Might;}

    public int getAccuracy() {return accuracy;}

    public void setAccuracy(int Accuracy) {accuracy = Accuracy;}

    public int getCritical() {return critical;}

    public void setCritical(int Critical) {critical = Critical;}

    public String getWeaponRank() {return weaponRank;}

    public boolean isWeaponIsMagic() {return weaponIsMagic;}

    public void setWeaponIsMagic(boolean weaponIsMagic) {this.weaponIsMagic = weaponIsMagic;}

    public String getWeaponType() {return weaponType;}

    public void setWeaponType(String weaponType) {this.weaponType = weaponType;}

    public void setWeaponRank(String WeaponRank) {

        if (    WeaponRank.equals("S") || WeaponRank.equals("A") ||
                WeaponRank.equals("B") || WeaponRank.equals("C") ||
                WeaponRank.equals("D") || WeaponRank.equals("E")) {


            weaponRank = WeaponRank;
        }

        else {weaponRank = "E";}
    }

    public String toString() {return name + ": Mt " + might + ", Accuracy " + accuracy + ", Critical " + critical;}


}


