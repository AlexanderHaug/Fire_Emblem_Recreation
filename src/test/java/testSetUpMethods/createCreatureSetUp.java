package testSetUpMethods;

import Creatures.Classes.UnitClass;
import Creatures.Creature;
import Creatures.CreatureStats;

import java.nio.file.Path;
import java.nio.file.Paths;

public class createCreatureSetUp {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static String filePath = Paths.get(currentPath.toString(), "src").toString() + "/main/java/Creatures/Classes/All_Classes/";

    private static int[] generateStats() {return new int[]{1,50,50,50,50,50,50,50,50,50};}

    private static int[] generateGrowthRates() {return new int[]{100,60,50,70,80,20,30,10,0};}

    private static int[] generateMaxStatCaps() {return new int[]{99,80,80,80,80,80,80,80,80,80};}

    private static Character[] generateSkillRanks() {return new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E'};}

    public static Creature setUpCreature(String  name, String unitClass, String army) {
        return new Creature(name, new CreatureStats(new UnitClass(filePath+unitClass),
                generateStats(), generateGrowthRates(), generateMaxStatCaps(), generateSkillRanks()), army);
    }

    public static int[] getClassGrowthRates(Creature creature) {
        return creature.getCreatureStats().getUnitclass().getUnitClassGrowth();
    }
}
