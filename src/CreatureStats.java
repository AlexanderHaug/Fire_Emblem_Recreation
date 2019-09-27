import Classes.UnitClass;

import java.util.HashMap;

public class CreatureStats {

    private UnitClass unitclass;
    private int[] stats = new int[10];
    private int experience = 0;
    private int[] statGrowthRates;
    private int[] statCaps = new int[10];
    private String status = "Normal";

    private HashMap<String, Character> skillRanks = new HashMap<>();

    public CreatureStats(UnitClass unit, int[] stats, int[] statGrowthRates, int[] statCaps, Character[] ranks) {
        this.unitclass = unit;
        setAllStats(stats, statCaps);
        this.statGrowthRates = statGrowthRates;
        setAllSkillRanks(ranks);
    }

    private void setAllStats(int[] stats, int[] statCaps) {

        for (int x = 0; x < stats.length; x++) {
            if (stats[x] > statCaps[x]) {stats[x] = statCaps[x];}
        }
        this.stats = stats;
        this.statCaps = statCaps;
    }

    private void setAllSkillRanks(Character[] ranks) {
        String[] skillNames = new String[]{"Sword","Axe","Lance","Dagger","Bow","Anima Magic",
                                           "Dark Magic","Light Magic","Staff","Riding","Armor","Flying"};
        for (int x = 0; x < skillNames.length; x++) {this.skillRanks.put(skillNames[x], ranks[x]);}
    }

    public UnitClass getUnitclass() {return unitclass;}

    public int getLevel() {return this.stats[0];}
    public int getHealth() {return this.stats[1];}
    public int getStrength() {return this.stats[2];}
    public int getMagic() {return this.stats[3];}
    public int getSkill() {return this.stats[4];}
    public int getLuck() {return this.stats[5];}
    public int getSpeed() {return this.stats[6];}
    public int getDefense() {return this.stats[7];}
    public int getResistance() {return this.stats[8];}
    public int getCharisma() {return this.stats[9];}
    public String getStatus() {return this.status;}

    public HashMap<String, Character> getSkillRanks() {return skillRanks;}

    public int getExperience() {return experience;}

    public int getHealthCap() {return this.statCaps[1];}

    public void setLevel(int level) {this.stats[0] = level;}
    public void setHealth(int health) {this.stats[1] = health;}
    public void setStrength(int strength) {this.stats[2] = strength;}
    public void setMagic(int magic) {this.stats[3] = magic;}
    public void setSkill(int skill) {this.stats[4] = skill;}

    public void setStatus(String status) {
        if (status.equals("Poison") || status.equals("Beserk") || status.equals("Silence") || status.equals("Sleep")
                || status.equals("Normal")) {
            this.status = status;
        }
    }

    public void gainExperience(int exp) {
        this.experience += exp;
        if (this.experience >= 100) {
            this.experience -= 100;
            levelUp();
        }
    }

    private void levelUp() {
        int[] levelUps = new int[10];
        levelUps[0] = 1;
        for (int x = 1; x < 9; x++) {
            int statUpChance = (int)(Math.random() * 100);
            boolean doesStatIncrease = (statGrowthRates[x] + unitclass.getUnitClassGrowth()[x]) >= statUpChance;
            if (doesStatIncrease) {levelUps[x] = 1;}
        }
        increaseStats(levelUps);
    }

    private void increaseStats(int[] statsThatIncrease) {
        for (int x = 0; x < statsThatIncrease.length; x++) {this.stats[x] += statsThatIncrease[0];}
        setAllStats(this.stats, this.statCaps);
    }
}
