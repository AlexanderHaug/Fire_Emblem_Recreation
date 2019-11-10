package Creatures.Creature;

import Creatures.UnitClass.UnitClass;

import java.util.HashMap;

public class CreatureStats {

    private UnitClass unitclass;
    private HashMap<String, Integer> allStats = new HashMap<>();
    private CreatureStatBonuses statBonuses = new CreatureStatBonuses();
    private String status = "Normal";
    private HashMap<String, Character> skillRanks = new HashMap<>();
    private String[] statNames = new String[]{"Level", "Health", "Strength", "Magic", "Skill", "Luck", "Speed",
            "Defense", "Resistance", "Charm"};

    public CreatureStats(UnitClass unit, int[] stats, int[] statGrowthRates, int[] statCaps, Character[] ranks) {
        this.unitclass = unit;
        setAllStats(stats, statCaps, statGrowthRates);
        setAllSkillRanks(ranks);
    }

    public UnitClass getUnitclass() {return unitclass;}

    public int getLevel() {return this.allStats.get("Level");}
    public int getHealth() {return this.allStats.get("Health");}
    public int getCurrentHealth() {return this.allStats.get("Current Health");}
    public int getStrength() {return this.allStats.get("Strength");}
    public int getMagic() {return this.allStats.get("Magic");}
    public int getSkill() {return this.allStats.get("Skill");}
    public int getLuck() {return this.allStats.get("Luck");}
    public int getSpeed() {return this.allStats.get("Speed");}
    public int getDefense() {return this.allStats.get("Defense");}
    public int getResistance() {return this.allStats.get("Resistance");}
    public int getCharm() {return this.allStats.get("Charm");}

    public String getStatus() {return this.status;}
    public HashMap<String, Character> getSkillRanks() {return skillRanks;}
    public CreatureStatBonuses getStatBonuses() {return this.statBonuses;}
    public int getExperience() {return this.allStats.get("Experience");}


    public int getHealthCap() {return this.allStats.get("Max Health");}
    public void setCurrentHealth(int health) {this.allStats.put("Current Health",health);}
    public void setMagic(int magic) {this.allStats.put("Magic",magic);}
    public void setSkill(int skill) {this.allStats.put("Skill",skill);}
    public void setSpeed(int speed) {this.allStats.put("Speed",speed);}

    public void setStatus(String status) {
        if (status.equals("Poison") || status.equals("Beserk") || status.equals("Silence") || status.equals("Sleep") ||
                status.equals("Normal")) {
            this.status = status;
        }
    }

    public void gainExperience(int exp) {
        int current_experience = this.allStats.get("Experience") + exp;
        if (current_experience >= 100) {
            current_experience -= 100;
            this.allStats.put("Experience", current_experience);
            levelUp();
        }
    }

    public void setAllStats(int[] initialStats, int[] caps, int[] growths) {
        for (int x = 0; x < initialStats.length; x++) {
            if (initialStats[x] > caps[x]) {
                initialStats[x] = caps[x];
            }

            this.allStats.put(statNames[x], initialStats[x]);
            this.allStats.put("Max " + statNames[x], caps[x]);

            if (x == 1) {this.allStats.put("Current Health", initialStats[x]);}
        }
        this.allStats.put("Experience", 0);
        setStatGrowths(growths);
    }

    private void setStatGrowths(int[] growths) {
        for (int x = 0; x < growths.length; x++) {this.allStats.put(statNames[x+1] + " Growth", growths[x]);}
    }

    private void setAllSkillRanks(Character[] ranks) {
        String[] skillNames = new String[]{"Sword","Axe","Lance","Dagger","Bow","Brawl","Anima Magic",
                "Dark Magic","Light Magic","Staff"};
        for (int x = 0; x < skillNames.length; x++) {this.skillRanks.put(skillNames[x], ranks[x]);}
    }

    private void levelUp() {
        int[] levelUps = new int[10];
        for (int x = 1; x < statNames.length; x++) {
            int statUpChance = (int)(Math.random() * 100);
            boolean statDoesIncrease = getGrowth(statNames[x]) >= statUpChance;
            if (statDoesIncrease) {levelUps[x] = 1;}
        }
        levelUps[0] = 1;
        increaseStats(levelUps);
    }

    private int getGrowth(String stat) {
        return this.allStats.get(stat + " Growth") + this.unitclass.getClassStats().get(stat + " Growth");
    }

    private void increaseStats(int[] increases) {

        for (int x = 0; x < increases.length; x++) {
            int a = Math.min(this.allStats.get(statNames[x]) + increases[x], this.allStats.get("Max " + statNames[x]));
            this.allStats.put(statNames[x], a);
        }
    }
}
