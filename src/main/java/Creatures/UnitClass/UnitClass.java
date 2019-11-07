package Creatures.UnitClass;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class UnitClass {

    protected String name = "";
    protected HashMap<String, Integer> allStats;
    protected String[] unitClassType;
    protected ArrayList<String> equippable;
    protected ArrayList<Ability> unitClassSkills;

    public String getName() {return name;}
    public String[] getUnitClassType() {return unitClassType;}

    public int getMinHealth() {return allStats.get("Health");}
    public int getMinStrength() {return allStats.get("Strength");}
    public int getMinMagic() {return allStats.get("Magic");}
    public int getMinSkill() {return allStats.get("Skill");}
    public int getMinSpeed() {return allStats.get("Speed");}
    public int getMinLuck() {return allStats.get("Luck");}
    public int getMinDefense() {return allStats.get("Defense");}
    public int getMinResistance() {return allStats.get("Resistance");}
    public int getMinCharm() {return allStats.get("Charm");}

    public int getMove() {return allStats.get("Move");}

    public int getHealthGrowth() {return allStats.get("Health Growth");}
    public int getStrengthGrowth() {return allStats.get("Strength Growth");}
    public int getMagicGrowth() {return allStats.get("Magic Growth");}
    public int getSkillGrowth() {return allStats.get("Skill Growth");}
    public int getSpeedGrowth() {return allStats.get("Speed Growth");}
    public int getLuckGrowth() {return allStats.get("Luck Growth");}
    public int getDefenseGrowth() {return allStats.get("Defense Growth");}
    public int getResistanceGrowth() {return allStats.get("Resistance Growth");}
    public int getCharmGrowth() {return allStats.get("Charm Growth");}

    public HashMap<String, Integer> getClassStats() {return allStats;}

    public ArrayList<String> getEquippable() {return equippable;}
}
