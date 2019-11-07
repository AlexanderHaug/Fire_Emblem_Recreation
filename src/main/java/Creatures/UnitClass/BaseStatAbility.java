package Creatures.UnitClass;

public class BaseStatAbility extends Ability {
    private int[] baseStatIncreases = new int[10];

    public void setBaseStatIncreases(int[] stats) {baseStatIncreases = stats;}

    public int[] getBaseStatIncreases() {return baseStatIncreases;}
    public int getMaxHPIncrease() {return baseStatIncreases[0];}
    public int getStrengthIncrease() {return baseStatIncreases[1];}
    public int getMagicIncrease() {return baseStatIncreases[2];}
    public int getSkillIncrease() {return baseStatIncreases[3];}
    public int getLuckIncrease() {return baseStatIncreases[4];}
    public int getSpeedIncrease() {return baseStatIncreases[5];}
    public int getDefenseIncrease() {return baseStatIncreases[6];}
    public int getResistanceIncrease() {return baseStatIncreases[7];}
    public int getCharmIncrease() {return baseStatIncreases[8];}
    public int getMoveIncrease() {return baseStatIncreases[9];}
}
