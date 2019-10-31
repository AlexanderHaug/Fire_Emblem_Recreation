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
        assert Arrays.equals(unitClass.getUnitClassMinStats(), minimumStats);
        assert Arrays.equals(unitClass.getUnitClassGrowth(), classGrowthRates);
        assert unitClass.getMove() == classMove;
        assert unitClass.getEquipable().equals(equippable);
    }
}
