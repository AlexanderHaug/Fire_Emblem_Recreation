import Weapons.PrimaryItem;

import java.util.ArrayList;

public class Creature {

    private String name;
    private CreatureStats creatureStats;
    private PrimaryItem mainItem = null;
    private String armyAffiliation;

    public Creature(String Name, CreatureStats creatureStats, String army_affiliation) {
        this.name = Name;
        this.creatureStats = creatureStats;
        this.armyAffiliation = army_affiliation;
    }

    public CreatureStats getCreatureStats() {return creatureStats;}

    public void equipItem(PrimaryItem item) {
        ArrayList<String> list = creatureStats.getUnitclass().getEquipable();
        if (list.contains(item.getItemType())) {

            int creatureRank = creatureStats.getSkillRanks().get(item.getItemType());
            int weaponRank = item.getItemRank();

            if (creatureRank <= weaponRank) {
                this.mainItem = item;
            }
        }
    }

    public void healHealth(int healing) {
        creatureStats.setHealth(creatureStats.getHealth() + healing);
        if (creatureStats.getHealth() > creatureStats.getHealthCap()) {
            creatureStats.setHealth(creatureStats.getHealthCap());
        }
    }

    public void damageToHealth(int damage) {
        creatureStats.setHealth(creatureStats.getHealth() - damage);
        if (creatureStats.getHealth() < 0) {
             creatureStats.setHealth(0);
        }
    }

    public String getCreatureName() {return name;}

    public PrimaryItem getMainItem() {return mainItem;}

    public String getMainItemName() {
        if (mainItem != null) {return mainItem.getName();}
        else {return "No Main Item Equipped.";}
    }

    public int getDamage() {
        if (mainItem != null) {
            if (mainItem.isWeaponMagic()) {return mainItem.getMight() + creatureStats.getMagic();}
            else {return mainItem.getMight() + creatureStats.getStrength();}
        }

        else {return 0;}
    }

    public int getAvoidRate() {return (int)(creatureStats.getSpeed() * 1.5 * creatureStats.getLuck() * .5);}

    public int getHitRate() {

        if (mainItem != null) {
            return (int)((creatureStats.getSkill() * 2) * (creatureStats.getLuck() * .5)) + mainItem.getAccuracy();
        }

        else {return 0;}
    }

    public int getCritRate() {

        int criticalRate = creatureStats.getSkill()/3;

        if (mainItem != null) {return criticalRate + mainItem.getCritical();}

        else {return criticalRate;}
    }

    public String toString() {return name + " Class: " + creatureStats.getUnitclass().getName() + " Level: " +
            creatureStats.getLevel() + "\n" + "HP " + creatureStats.getHealth() + ", Attack " +
            creatureStats.getStrength() + ", Magic "+ creatureStats.getMagic() + "\n" + "Skill " +
            creatureStats.getSkill() + ", Luck " + creatureStats.getLuck() + ", Speed " +
            creatureStats.getSpeed() + "\n" + "Defense " + creatureStats.getDefense() + ", Resistance " +
            creatureStats.getResistance() + ", Exp " + creatureStats.getExperience() + "\n" +
            getMainItemName();}

    public String getArmyAffiliation() {
        return armyAffiliation;
    }
}
