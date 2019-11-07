package Creatures;

import Creatures.UnitClass.UnitClass;

import java.util.HashMap;

public class CreatureStats {

    private UnitClass unitclass;
    private HashMap<String, Integer> allStats = new HashMap<>();
    private CreatureStatBonuses statBonuses = new CreatureStatBonuses();
    private String status = "Normal";

    private HashMap<String, Character> skillRanks = new HashMap<>();

    public CreatureStats(UnitClass unit, int[] stats, int[] statGrowthRates, int[] statCaps, Character[] ranks) {
        this.unitclass = unit;
        setAllStats(stats, statCaps, statGrowthRates);
        setAllSkillRanks(ranks);
    }

    public void setAllStats(int[] initialStats, int[] caps, int[] growths) {
        String[] statNames = new String[]{"Level", "Health", "Strength", "Magic", "Skill", "Luck",
                                           "Speed", "Defense", "Resistance", "Charisma"};
        for (int x = 0; x < initialStats.length; x++) {
            if (initialStats[x] > caps[x]) {
                initialStats[x] = caps[x];
            }

            this.allStats.put(statNames[x], initialStats[x]);
            this.allStats.put("Max " + statNames[x], caps[x]);

            if (x == 1) {
                this.allStats.put("Current Health", initialStats[x]);
            }
        }
        this.allStats.put("Experience", 0);
        setStatGrowths(growths);
    }

    private void setStatGrowths(int[] growths) {
        String[] statNames = new String[]{"Health", "Strength", "Magic", "Skill", "Luck",
                "Speed", "Defense", "Resistance", "Charisma"};
        for (int x = 0; x < growths.length; x++) {
            this.allStats.put(statNames[x] + " Growth", growths[x]);
        }
    }

    private void setAllSkillRanks(Character[] ranks) {
        String[] skillNames = new String[]{"Sword","Axe","Lance","Dagger","Bow","Brawl","Anima Magic",
                                           "Dark Magic","Light Magic","Staff","Riding","Armor","Flying"};
        for (int x = 0; x < skillNames.length; x++) {this.skillRanks.put(skillNames[x], ranks[x]);}
    }

    public UnitClass getUnitclass() {return unitclass;}

    public int getLevel() {return this.allStats.get("Level");}
    public int getHealth() {return this.allStats.get("Health");}
    public int getCurrentHealth() {return this.allStats.get("Current Health") + this.statBonuses.getCreatureStatBonuses()[0];}
    public int getStrength() {return this.allStats.get("Strength") + this.statBonuses.getCreatureStatBonuses()[1];}
    public int getMagic() {return this.allStats.get("Magic") + this.statBonuses.getCreatureStatBonuses()[2];}
    public int getSkill() {return this.allStats.get("Skill") + this.statBonuses.getCreatureStatBonuses()[3];}
    public int getLuck() {return this.allStats.get("Luck") + this.statBonuses.getCreatureStatBonuses()[4];}
    public int getSpeed() {return this.allStats.get("Speed") + this.statBonuses.getCreatureStatBonuses()[5];}
    public int getDefense() {return this.allStats.get("Defense") + this.statBonuses.getCreatureStatBonuses()[6];}
    public int getResistance() {return this.allStats.get("Resistance") + this.statBonuses.getCreatureStatBonuses()[7];}
    public int getCharisma() {return this.allStats.get("Charisma") + this.statBonuses.getCreatureStatBonuses()[8];}
    public String getStatus() {return this.status;}

    public HashMap<String, Character> getSkillRanks() {return skillRanks;}

    public int getExperience() {return this.allStats.get("Experience");}

    public int getHealthCap() {return this.allStats.get("Max Health");}

    public void setLevel(int level) {this.allStats.put("Level",level);}
    public void setCurrentHealth(int health) {this.allStats.put("Current Health",health);}
    public void setStrength(int strength) {this.allStats.put("Strength",strength);}
    public void setMagic(int magic) {this.allStats.put("Magic",magic);}
    public void setSkill(int skill) {this.allStats.put("Skill",skill);}
    public void setSpeed(int speed) {this.allStats.put("Speed",speed);}

    public void setStatus(String status) {
        if (status.equals("Poison") || status.equals("Beserk") || status.equals("Silence") || status.equals("Sleep")
                || status.equals("Normal")) {
            this.status = status;
        }
    }

    public void gainExperience(int exp) {
        int current_experience = this.allStats.get("Experience");
        current_experience += exp;
        if (current_experience >= 100) {
            current_experience -= 100;
            this.allStats.put("Experience", current_experience);
            levelUp();
        }
    }

    private void levelUp() {
        int[] levelUps = new int[10];
        String[] statNames = new String[]{"Health", "Strength", "Magic", "Skill", "Luck", "Speed", "Defense",
                                          "Resistance", "Charisma"};
        for (int x = 0; x < statNames.length; x++) {
            int statUpChance = (int)(Math.random() * 100);
            boolean statDoesIncrease =
                    (this.allStats.get(statNames[x] + " Growth") + this.unitclass.getUnitClassGrowth()[x]) >= statUpChance;
            if (statDoesIncrease) {levelUps[x] = 1;}
        }
        levelUps[9] = 1;
        LevelUpStats(levelUps);
    }

    private void LevelUpStats(int[] statsThatIncrease) {
        String[] statNames = new String[]{"Health", "Strength", "Magic", "Skill", "Luck",
                "Speed", "Defense", "Resistance", "Charisma", "Level"};

        for (int x = 0; x < statsThatIncrease.length; x++) {
            int a = Math.min(this.allStats.get(statNames[x]) + statsThatIncrease[x],
                    this.allStats.get("Max "+statNames[x]));
            this.allStats.put(statNames[x], a);
        }
    }

    public CreatureStatBonuses getStatBonuses() {return this.statBonuses;}
}
