package Creatures;

import Battalions.Battalion;
import Items.Equippable.MainHand.PrimaryItem;
import Items.Equippable.MainHand.Weapon;
import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class Creature {

    private String name;
    private CreatureStats creatureStats;
    private PrimaryItem mainItem = null;
    private Accessory secondaryItem = null;
    private Battalion battalion = new Battalion();
    private String armyAffiliation;

    public Creature(String Name, CreatureStats creatureStats, String army_affiliation) {
        this.name = Name;
        this.creatureStats = creatureStats;
        this.armyAffiliation = army_affiliation;
    }

    public CreatureStats getCreatureStats() {return creatureStats;}

    public String getCreatureName() {return name;}

    public String getArmyAffiliation() {
        return armyAffiliation;
    }

    public void setAllStats(int[] stats, int[] statCaps) {this.creatureStats.setAllStats(stats, statCaps);}
    public void setGrowthRates(int[] growthRates) {this.creatureStats.setStatGrowthRates(growthRates);}

    // Battle Functions
    public int getDamage() {
        if (mainItem != null) {
            int weaponMight = ((Weapon)mainItem).getMight();

            if (mainItem.isItemMagic()) {return weaponMight +
                    creatureStats.getMagic() + battalion.getBattalionMagicalBonus();}

            else {return weaponMight + creatureStats.getStrength() +  battalion.getBattalionPhysicalBonus();}
        }

        else {return 0;}
    }

    public int getAttackSpeed() {
        int weaponWeight = 0;
        if (this.mainItem != null) {
            weaponWeight = this.mainItem.getItemWeight() - (this.getCreatureStats().getStrength()/5);}
        return Math.max(this.getCreatureStats().getSpeed() - weaponWeight, 0);
    }

    public int getPhysicalAvoidRate() {
        return getAttackSpeed() + this.battalion.getBattalionAvoBonus();
    }

    public int getMagicalAvoidRate() {return (this.creatureStats.getSpeed() + this.creatureStats.getLuck())/2 +
            this.battalion.getBattalionAvoBonus();}

    public int getHitRate() {

        if (mainItem != null) {
            return (int)((creatureStats.getSkill() * 2) *
                    (creatureStats.getLuck() * .5)) + mainItem.getAccuracy() + battalion.getBattalionHitBonus();
        }

        else {return 0;}
    }

    public int getCritRate() {

        int criticalRate = creatureStats.getSkill()/3 + battalion.getBattalionCritBonus();

        if (mainItem != null) {
            return criticalRate + ((Weapon)mainItem).getCritical();
        }

        else {return criticalRate;}
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

    // Item Functions
    public void equipItem(PrimaryItem item) {
        ArrayList<String> list = creatureStats.getUnitclass().getEquipable();
        if (list.contains(item.getItemType())) {

            int creatureRank = creatureStats.getSkillRanks().get(item.getItemType());
            int weaponRank = item.getItemRank();

            if (creatureRank <= weaponRank) {
                this.mainItem = item;
                this.creatureStats.getStatBonuses().setStatBonuses(item.getOtherStatIncreases());
            }
        }
    }

    public void equipItem(Accessory item) {
        this.secondaryItem = item;
        this.creatureStats.getStatBonuses().setStatBonuses(item.getOtherStatIncreases());
    }

    public PrimaryItem getMainItem() {return mainItem;}

    public String getMainItemName() {
        if (mainItem != null) {return mainItem.getName();}
        else {return "No Main Item Equipped.";}
    }

    public void unequipMainItem() {
        this.creatureStats.getStatBonuses().decreaseStatBonuses(this.mainItem.getOtherStatIncreases());
        this.mainItem = null;
    }

    public Accessory getSecondaryItem() {return secondaryItem;}

    public void unequipOffItem() {
        this.creatureStats.getStatBonuses().decreaseStatBonuses(this.secondaryItem.getOtherStatIncreases());
        this.secondaryItem = null;
    }

    // Battalion Functions
    public void setBattalion(Battalion battalion) {this.battalion = battalion;}

    public Battalion getBattalion() {return this.battalion;}

    public String toString() {return name + " Class: " + creatureStats.getUnitclass().getName() + " Level: " +
            creatureStats.getLevel() + "\n" + "HP " + creatureStats.getHealth() + ", Attack " +
            creatureStats.getStrength() + ", Magic "+ creatureStats.getMagic() + "\n" + "Skill " +
            creatureStats.getSkill() + ", Luck " + creatureStats.getLuck() + ", Speed " +
            creatureStats.getSpeed() + "\n" + "Defense " + creatureStats.getDefense() + ", Resistance " +
            creatureStats.getResistance() + ", Exp " + creatureStats.getExperience() + "\n" +
            getMainItemName();}
}
