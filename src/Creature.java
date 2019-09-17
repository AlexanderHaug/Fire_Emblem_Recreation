import Weapons.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public class Creature {

    private String name;
    private CreatureStats creatureStats;

    private Weapon weapon = null;
    private int weaponRankDamageBonus = 0;
    private int weaponRankHitRateBonus = 0;

    private HashMap<String, String> creaturesWeaponRanks = new HashMap<>();


    public Creature(String Name, CreatureStats creatureStats) {

        this.name = Name;
        this.creatureStats = creatureStats;

        creaturesWeaponRanks.put("Weapons.Weapons.Swords", "E");
        creaturesWeaponRanks.put("Weapons.Weapons.Axes", "E");
        creaturesWeaponRanks.put("Weapons.Lances", "E");
        creaturesWeaponRanks.put("Daggers", "E");
        creaturesWeaponRanks.put("Bows", "E");
        creaturesWeaponRanks.put("Anima Weapons.Magic", "E");
        creaturesWeaponRanks.put("Dark Weapons.Magic", "E");
        creaturesWeaponRanks.put("Light Weapons.Magic", "E");
    }

    public CreatureStats getCreatureStats() {return creatureStats;}


    public void equipWeapon(Weapon item) {
        ArrayList<String> list = creatureStats.getUnitclass().getEquipable();
        if (list.contains(item.getWeaponType()))
            weapon = item;
    }

    public void damageToHealth(int damage) {
        creatureStats.setHealth(creatureStats.getHealth() - damage);
        if (creatureStats.getHealth() < 0) {
             creatureStats.setHealth(0);
        }
    }

    public String getCreatureName() {return name;}

    public Weapon getWeapon() {return weapon;}

    public String getWeaponName() {

        if (weapon == null) {return "No Weapon Equipped.";}

        else {return weapon.getName();}
    }

    public int getDamage() {

        if (weapon == null) {return 0;}

        else if (weapon.isWeaponIsMagic()) {return weapon.getMight() + creatureStats.getMagic();}

        else {return weapon.getMight() + creatureStats.getStrength();}
    }

    public int getAvoidRate() {return (int)(creatureStats.getSpeed() * 1.5 * creatureStats.getLuck() * .5);}

    public int getHitRate() {

        if (weapon == null) {return 0;}

        else {return (int)((creatureStats.getSkill() * 2) * (creatureStats.getLuck() * .5)) + weapon.getAccuracy();}
    }

    public int getCritRate() {

        int criticalRate = creatureStats.getSkill()/3;

        if (weapon == null) {return criticalRate;}

        else {return criticalRate + weapon.getCritical();}
    }

    public String toString() {return name + " Class: " + creatureStats.getUnitclass().getName() + " Level: " + creatureStats.getLevel() + "\n" +
            "HP " + creatureStats.getHealth() + ", Attack " + creatureStats.getStrength() +
            ", Magic "+ creatureStats.getMagic() + "\n" + "Skill " + creatureStats.getSkill() +
            ", Luck " + creatureStats.getLuck() + ", Speed " + creatureStats.getSpeed() + "\n" +
            "Defense " + creatureStats.getDefense() + ", Resistance " + creatureStats.getResistance() +
            ", Exp " + creatureStats.getExperience() + "\n" + getWeaponName();}
}
