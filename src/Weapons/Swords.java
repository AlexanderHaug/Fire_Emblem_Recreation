package Weapons;

public class Swords extends Weapon {

public static class BronzeSword extends Swords {

    public BronzeSword() {
        setName("Bronze Sword");
        setMight(3);
        setAccuracy(100);
        setCritical(0);
        setType(new Sword(0));
        setWeaponRank("E");
    }
}

public static class IronSword extends Swords {

    public IronSword() {
        setName("Iron Sword");
        setMight(5);
        setAccuracy(95);
        setCritical(0);
        setType(new Sword(0));
        setWeaponRank("D");
    }
}

public static class SteelSword extends Swords {

    public SteelSword() {
        setName("Steel Sword");
        setMight(8);
        setAccuracy(80);
        setCritical(0);
        setType(new Sword(0));
        setWeaponRank("C");
    }
}

public static class SilverSword extends Swords {

    public SilverSword() {
        setName("Silver Sword");
        setMight(13);
        setAccuracy(80);
        setCritical(0);
        setType(new Sword(0));
        setWeaponRank("B");
    }
}

public static class BraveSword extends Swords {

    public BraveSword() {
        setName("Brave Sword");
        setMight(8);
        setAccuracy(80);
        setCritical(0);
        setType(new Sword(0));
        setWeaponRank("A");
    }
}

public static class KillingEdgeSword extends Swords {

    public KillingEdgeSword() {
        setName("Killing Edge");
        setMight(9);
        setAccuracy(85);
        setCritical(30);
        setType(new Sword(0));
        setWeaponRank("C");
    }
}

public static class RuneSword extends Swords {

    public RuneSword() {
        setName("Rune Sword");
        setMight(12);
        setAccuracy(65);
        setCritical(0);
        setType(new Sword(1));
        setWeaponRank("A");
    }
}

public static class LanceReaverSword extends Swords {

    public LanceReaverSword() {
        setName("Lancereaver");
        setMight(9);
        setAccuracy(75);
        setCritical(5);
        setType(new Axe(0));
        setWeaponRank("C");
    }
}
}


