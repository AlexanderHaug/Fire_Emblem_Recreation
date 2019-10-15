package Creatures;

import Items.Equippable.OffHand.Accessory;
import Items.Equippable.MainHand.PrimaryItem;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;

public class Creature {

    private String name;
    private CreatureStats creatureStats;
    private PrimaryItem mainItem = null;
    private Accessory secondaryItem = null;
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

            if (creatureRank <= weaponRank) {this.mainItem = item;}
        }
    }

    public void equipItem(Accessory item) {
        this.secondaryItem = item;
        this.creatureStats.increaseStats(item.getOtherStatIncreases());
    }

    public void healHealth(int healing) {
        creatureStats.setHealth(creatureStats.getHealth() + healing);
        if (creatureStats.getHealth() > creatureStats.getHealthCap()) {
            creatureStats.setHealth(creatureStats.getHealthCap());
        }
    }

    public void damageToHealth(int damage) {
        creatureStats.setHealth(creatureStats.getHealth() - damage);
        if (creatureStats.getHealth() < 0) {creatureStats.setHealth(0);}
    }

    public String getCreatureName() {return name;}

    public PrimaryItem getMainItem() {return mainItem;}

    public String getMainItemName() {
        if (mainItem != null) {return mainItem.getName();}
        else {return "No Main Item Equipped.";}
    }

    public int getDamage() {
        if (mainItem != null) {
            if (((Weapon)mainItem).isItemMagic()) {return ((Weapon)mainItem).getMight() + creatureStats.getMagic();}
            else {return ((Weapon)mainItem).getMight() + creatureStats.getStrength();}
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

        if (mainItem != null) {
            return criticalRate + ((Weapon)mainItem).getCritical();
        }

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

    public Accessory getSecondaryItem() {return secondaryItem;}

    public void unequipOffItem() {
        this.creatureStats.decreaseStats(this.secondaryItem.getOtherStatIncreases());
        this.secondaryItem = null;
    }

    public void setAllStats(int[] stats, int[] statCaps) {this.creatureStats.setAllStats(stats, statCaps);}
    public void setGrowthRates(int[] growthRates) {this.creatureStats.setStatGrowthRates(growthRates);}
}
