package testSetUpMethods;

import Creatures.Creature;
import Creatures.CreatureStats;
import Creatures.UnitClass;

public class createCreatureSetUp {

    private static int[] generateStats() {return new int[]{1,50,50,50,50,50,50,50,50,50};}

    private static int[] generateGrowthRates() {return new int[]{100,60,50,70,80,20,30,10,0};}

    private static int[] generateMaxStatCaps() {return new int[]{99,80,80,80,80,80,80,80,80,80};}

    private static Character[] generateSkillRanks() {return new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E','E'};}

    public static Creature setUpCreature(String  name, String unitClass, String army) {
        return new Creature(name, new CreatureStats(new UnitClass(unitClass),
                generateStats(), generateGrowthRates(), generateMaxStatCaps(), generateSkillRanks()), army);
    }

    public static int[] getClassGrowthRates(Creature creature) {
        return creature.getCreatureStats().getUnitclass().getUnitClassGrowth();
    }
}
