package Creatures.Creature;

import Battalions.Battalion;
import Items.Equippable.MainHand.PrimaryItem;
import Items.Equippable.MainHand.Weapon;
import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;
import java.util.HashMap;

public class Creature {

    protected String name;
    protected CreatureStats creatureStats;
    protected PrimaryItem mainItem = null;
    protected Accessory secondaryItem = null;
    protected Battalion battalion = new Battalion();
    protected String armyAffiliation;

    public Creature() {};

    public Creature(String Name, CreatureStats creatureStats, String army_affiliation) {
        this.name = Name;
        this.creatureStats = creatureStats;
        this.armyAffiliation = army_affiliation;
    }

    public CreatureStats getCreatureStats() {return creatureStats;}

    public String getName() {return name;}

    public String getArmyAffiliation() {
        return armyAffiliation;
    }

    // Battle Functions
    public boolean getEffective(String[] types) {
        for (String type : types) {
            if (((Weapon) mainItem).getEffectiveAgainst().contains(type)) {return true;}
        }
        return false;
    }

    public boolean getEffectiveNulls(String[] types) {
        if (secondaryItem != null) {
            for (String type : types) {
                if (secondaryItem.getNullifies().contains(type)) {return true;}
            }
            return false;
        }
        else {return false;}
    }

    public int getDefense() {
        int def = this.creatureStats.getDefense();
        def += getEquipmentBonusDefense();
        def += this.creatureStats.getStatBonuses().getBonusDefense();
        return def;
    }

    public int getProtection() {
        int res = getDefense();
        res += getEquipmentBonusProtection();
        return res;
    }

    public int getResistance() {
        int res = this.creatureStats.getResistance();
        res += getEquipmentBonusResistance();
        res += this.creatureStats.getStatBonuses().getBonusResistance();
        return res;
    }

    public int getResilience() {
        int res = getResistance();
        res += getEquipmentBonusResilience();
        return res;
    }

    public int getPhysicalBonus() {return creatureStats.getStrength() +  battalion.getBattalionPhysicalBonus();}

    public int getMagicalBonus() {return creatureStats.getMagic() + battalion.getBattalionMagicalBonus();}

    public int getAttackSpeed() {
        int weaponWeight = 0;

        if (this.mainItem != null) {
            weaponWeight = Math.max(this.mainItem.getWeight() - (this.getCreatureStats().getStrength()/5), 0);
        }

        return this.getCreatureStats().getSpeed() - weaponWeight;
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
        creatureStats.setCurrentHealth(creatureStats.getCurrentHealth() + healing);
        if (creatureStats.getCurrentHealth() > creatureStats.getHealthCap()) {
            creatureStats.setCurrentHealth(creatureStats.getHealthCap());
        }
    }

    public void damageToHealth(int damage) {
        creatureStats.setCurrentHealth(creatureStats.getCurrentHealth() - damage);
        if (creatureStats.getCurrentHealth() < 0) {creatureStats.setCurrentHealth(0);}
    }

    public void applyDebuffs(HashMap<String, Integer> debuffs) {
        this.creatureStats.getStatBonuses().addDebuffs(debuffs);

    }

    // Item Functions
    public void equipItem(PrimaryItem item) {
        ArrayList<String> list = creatureStats.getUnitclass().getEquippable();
        if (list.contains(item.getType())) {

            int creatureRank = creatureStats.getSkillRanks().get(item.getType());
            int weaponRank = item.getRank();

            if (creatureRank <= weaponRank) {
                this.mainItem = item;
            }
        }
    }

    public void equipItem(Accessory item) {
        this.secondaryItem = item;
    }

    public PrimaryItem getMainItem() {return mainItem;}

    public String getMainItemName() {
        if (mainItem != null) {return mainItem.getName();}
        else {return "No Main Item Equipped.";}
    }

    public void unequipMainItem() {
        this.mainItem = null;
    }

    public Accessory getSecondaryItem() {return secondaryItem;}

    public void unequipOffItem() {
        this.secondaryItem = null;
    }

    // Battalion Functions
    public void setBattalion(Battalion battalion) {this.battalion = battalion;}

    public Battalion getBattalion() {return this.battalion;}

    private int getEquipmentBonusDefense() {
        int bonus = 0;
        if (mainItem != null) {bonus += mainItem.getDefense();}
        return bonus;
    }

    private int getEquipmentBonusProtection() {
        int bonus = 0;
        if (secondaryItem != null) {bonus += secondaryItem.getProtection();}
        return bonus;
    }

    private int getEquipmentBonusResistance() {
        int bonus = 0;
        if (mainItem != null) {bonus += mainItem.getResistance();}
        return bonus;
    }

    private int getEquipmentBonusResilience() {
        int bonus = 0;
        if (secondaryItem != null) {bonus += secondaryItem.getAccessoryResilience();}
        return bonus;
    }

    public String toString() {return name + " Class: " + creatureStats.getUnitclass().getName() + " Level: " +
            creatureStats.getLevel() + "\n" + "HP " + creatureStats.getCurrentHealth() + ", Attack " +
            creatureStats.getStrength() + ", Magic "+ creatureStats.getMagic() + "\n" + "Skill " +
            creatureStats.getSkill() + ", Luck " + creatureStats.getLuck() + ", Speed " +
            creatureStats.getSpeed() + "\n" + "Defense " + creatureStats.getDefense() + ", Resistance " +
            creatureStats.getResistance() + ", Exp " + creatureStats.getExperience() + "\n" +
            getMainItemName();}
}
