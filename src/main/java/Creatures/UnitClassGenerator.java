package Creatures;

import Creatures.UnitClass.UnitClass;
import Creatures.UnitClass.UnpromotedClasses.*;
import Creatures.UnitClass.PromotedClasses.*;


public class UnitClassGenerator {

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
