package Weapons;

public abstract class Weapon {

    private String name = null;
    private int might = 0;
    private int accuracy = 0;
    private int critical = 0;
    private WeaponType type;
    private String weaponRank;



    public Weapon() {}

    public Weapon(String Name, int Might, int Accuracy, int Critical, WeaponType Type, String WeaponRank) {

        name = Name;
        might = Might;
        accuracy = Accuracy;
        critical = Critical;
        type = Type;
        setWeaponRank(WeaponRank);
    }

    public String getName() {return name;}

    public void setName(String Name) {name = Name;}

    public int getMight() {return might;}

    public void setMight(int Might) {might = Might;}

    public int getAccuracy() {return accuracy;}

    public void setAccuracy(int Accuracy) {accuracy = Accuracy;}

    public int getCritical() {return critical;}

    public void setCritical(int Critical) {critical = Critical;}

    public WeaponType getType() {return type;}

    public void setType(WeaponType weaponType) {type = weaponType;}

    public String getWeaponRank() {return weaponRank;}

    public void setWeaponRank(String WeaponRank) {

        if (    WeaponRank.equals("S") || WeaponRank.equals("A") ||
                WeaponRank.equals("B") || WeaponRank.equals("C") ||
                WeaponRank.equals("D") || WeaponRank.equals("E")) {


            weaponRank = WeaponRank;
        }

        else {weaponRank = "E";}
    }

    public String toString() {
        return name + ": Mt " + might + ", Accuracy " + accuracy + ", Critical " + critical;
    }
}


