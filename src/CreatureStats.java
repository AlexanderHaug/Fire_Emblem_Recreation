import Classes.UnitClass;
import Weapons.Weapon;

public class CreatureStats {

    private UnitClass unitclass;
    private int[] stats = new int[10];
    private int experience = 0;
    private int[] statGrowthRates;
    private int[] statCaps = new int[10];

    private Weapon weapon = null;

    public CreatureStats(UnitClass unit, int[] stats, int[] statGrowthRates, int[] statCaps) {
        this.unitclass = unit;
        setAllStats(stats, statCaps);
        this.statGrowthRates = statGrowthRates;
    }

    private void setAllStats(int[] stats, int[] statCaps) {

        if (stats[0] > statCaps[0]) {stats[0] = statCaps[0];}
        if (stats[1] > statCaps[1]) {stats[1] = statCaps[1];}
        if (stats[2] > statCaps[2]) {stats[2] = statCaps[2];}
        if (stats[3] > statCaps[3]) {stats[3] = statCaps[3];}
        if (stats[4] > statCaps[4]) {stats[4] = statCaps[4];}
        if (stats[5] > statCaps[5]) {stats[5] = statCaps[5];}
        if (stats[6] > statCaps[6]) {stats[6] = statCaps[6];}
        if (stats[7] > statCaps[7]) {stats[7] = statCaps[7];}
        if (stats[8] > statCaps[8]) {stats[8] = statCaps[8];}
        if (stats[9] > statCaps[9]) {stats[9] = statCaps[9];}

        this.stats = stats;
        this.statCaps = statCaps;
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

    public int getExperience() {return experience;}

    public int getHealthCap() {return this.statCaps[1];}

    public void setLevel(int level) {this.stats[0] = level;}
    public void setHealth(int health) {this.stats[1] = health;}
    public void setStrength(int strength) {this.stats[2] = strength;}
    public void setMagic(int magic) {this.stats[3] = magic;}
}
