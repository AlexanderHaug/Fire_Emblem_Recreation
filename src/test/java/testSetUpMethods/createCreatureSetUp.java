package testSetUpMethods;

import Creatures.Creature;
import Creatures.CreatureStats;
import Creatures.UnitClass;

import java.util.ArrayList;

public class createCreatureSetUp {

    private static int[] generateStats() {return new int[]{1,50,50,50,50,50,50,50,50,50};}

    private static int[] generateLowStats() {
        int[] stats = new int[10];
        for (int x = 0; x < 10; x++) {
            int number = (int)(Math.random() * 10 + 1);
            stats[x] = number;
            }
        return stats;
    }

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

    public static Creature createBaseCreature(String file, String army) {
        return new Creature("Risen", new CreatureStats(new UnitClass(file),
                generateLowStats(), generateGrowthRates(),
                generateMaxStatCaps(), generateSkillRanks()), army);
    }

    public static ArrayList<Creature> createArmy(int numberOfMembers, String[] unitClasses, String armyName) {
        ArrayList<Creature> army = new ArrayList<>();
        for (int x = 0; x < numberOfMembers; x++) {
            if (x >= unitClasses.length) {
                int number = (int)(Math.random() * unitClasses.length + 1);
                army.add(createBaseCreature(unitClasses[number-1], armyName));
            }
            else {army.add(createBaseCreature(unitClasses[x], armyName));}
        }
        return army;
    }
}
