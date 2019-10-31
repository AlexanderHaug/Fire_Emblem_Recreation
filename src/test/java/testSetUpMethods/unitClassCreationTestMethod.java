package testSetUpMethods;

import Creatures.UnitClass.PromotedClasses.*;
import Creatures.UnitClass.UnitClass;
import Creatures.UnitClass.UnpromotedClasses.Archer;
import Creatures.UnitClass.UnpromotedClasses.Cleric;
import Creatures.UnitClass.UnpromotedClasses.Lord;
import Creatures.UnitClass.UnpromotedClasses.Shaman;

import java.util.ArrayList;
import java.util.Arrays;

public class unitClassCreationTestMethod {

    public static void createAndTestClass(String className, String[] unitClassType, int[] minimumStats,
                                          int[] classGrowthRates, int classMove, ArrayList<String> equippable) {

        UnitClass unitClass = createUnitClass(className);
        assert unitClass.getName().equals(className);
        assert Arrays.equals(unitClass.getUnitClassType(), unitClassType);
        assert Arrays.equals(unitClass.getUnitClassMinStats(), minimumStats);
        assert Arrays.equals(unitClass.getUnitClassGrowth(), classGrowthRates);
        assert unitClass.getMove() == classMove;
        assert unitClass.getEquipable().equals(equippable);
    }

    public static UnitClass createUnitClass(String className) {
        switch (className) {
            case "Archer":
                return new Archer();
            case "Sniper":
                return new Sniper();
            case "Ranger":
                return new Ranger();
            case "Shaman":
                return new Shaman();
            case "Cleric":
                return new Cleric();
            case "Lord":
                return new Lord();
            default:
                return null;
        }
    }
}
