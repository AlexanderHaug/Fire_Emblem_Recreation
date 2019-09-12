package Weapons;

public abstract class WeaponType {

    String typeName;
    int type;

    public String getWeaponTypeName() {
        return typeName;
    }

    public int getType() {return type;}
}

class Magic extends WeaponType {}

class AnimaMagic extends Magic {
    public AnimaMagic() {
        typeName = "Anima Magic";
        type = 1;
    }
}

class LightMagic extends Magic {
    public LightMagic() {
        typeName = "Light Magic";
        type = 1;
    }
}

class DarkMagic extends Magic {
    public DarkMagic() {
        typeName = "Dark Magic";
        type = 1;
    }
}

class Sword extends WeaponType {

    public Sword() {}

    public Sword(int weaponType) {

        if (weaponType == 0 || weaponType == 1) {
            typeName = "Sword";
            type = weaponType;
        }

        else {
            typeName = "Sword";
            type = 0;
        }
    }
}

class Axe extends WeaponType {

    public Axe() {}

    public Axe(int weaponType) {

        if (weaponType == 0 || weaponType == 1) {
            typeName = "Axe";
            type = weaponType;
        }

        else {
            typeName = "Axe";
            type = 0;
        }
    }
}

class Lance extends WeaponType {

    public Lance(){}

    public Lance(int weaponType) {

        if (weaponType == 0 || weaponType == 1) {
            typeName = "Lance";
            type = weaponType;
        }

        else {
            typeName = "Lance";
            type = 0;
        }
    }
}

class Bow extends WeaponType {

    public Bow() {}

    public Bow(int weaponType) {

        if (weaponType == 0 || weaponType == 1) {
            typeName = "Bow";
            type = weaponType;
        }

        else {
            typeName = "Bow";
            type = 0;
        }
    }
}

class Dagger extends WeaponType {

    public Dagger() {}

    public Dagger(int weaponType) {

        if (weaponType == 0 || weaponType == 1) {
            typeName = "Dagger";
            type = weaponType;
        }

        else {
            typeName = "Dagger";
            type = 0;
        }
    }
}

