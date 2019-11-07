package Creatures;

import Creatures.UnitClass.UnitClass;
import Creatures.UnitClass.UnpromotedClasses.Lord;


public class UnitClassGenerator {

    public static UnitClass createUnitClass(String className) {
        switch (className) {
            case "Lord":
                return new Lord();
            default:
                return null;
        }
    }
}
