package testSetUpMethods;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

import static Creatures.UnitClassGenerator.createUnitClass;

public class UnitClassTestMethod {

    public static void testClass(String className, String[] unitClassType, int[] minimumStats,
                                 int[] classGrowthRates, int classMove, ArrayList<String> equippable) {

        UnitClass unitClass = createUnitClass(className);
        assert unitClass.getName().equals(className);
        assert Arrays.equals(unitClass.getUnitClassType(), unitClassType);

        assert unitClass.getMinHealth() == minimumStats[0];
        assert unitClass.getMinStrength() == minimumStats[1];
        assert unitClass.getMinMagic() == minimumStats[2];
        assert unitClass.getMinSkill() == minimumStats[3];
        assert unitClass.getMinSpeed() == minimumStats[4];
        assert unitClass.getMinLuck() == minimumStats[5];
        assert unitClass.getMinDefense() == minimumStats[6];
        assert unitClass.getMinResistance() == minimumStats[7];
        assert unitClass.getMinCharm() == minimumStats[8];

        assert unitClass.getHealthGrowth() == classGrowthRates[0];
        assert unitClass.getStrengthGrowth() == classGrowthRates[1];
        assert unitClass.getMagicGrowth() == classGrowthRates[2];
        assert unitClass.getSkillGrowth() == classGrowthRates[3];
        assert unitClass.getSpeedGrowth() == classGrowthRates[4];
        assert unitClass.getLuckGrowth() == classGrowthRates[5];
        assert unitClass.getDefenseGrowth() == classGrowthRates[6];
        assert unitClass.getResistanceGrowth() == classGrowthRates[7];
        assert unitClass.getCharmGrowth() == classGrowthRates[8];

        assert unitClass.getMove() == classMove;

        assert unitClass.getEquippable().equals(equippable);
    }
}
