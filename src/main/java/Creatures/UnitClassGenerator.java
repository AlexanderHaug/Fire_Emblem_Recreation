package Creatures;

import Creatures.UnitClass.UnitClass;
import Creatures.UnitClass.UnpromotedClasses.Knight;
import Creatures.UnitClass.UnpromotedClasses.Lord;


public class UnitClassGenerator {

    public static UnitClass createUnitClass(String className) {
        switch (className) {
            case "Knight":
                return new Knight();
            default:
                return new Lord();
        }
    }
}
