package Creatures.UnitClass.AllClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Lord extends UnitClass {

    public Lord() {
        setName("Lord");
        setUnitClassType(new String[]{"Infantry"});
        setUnitClassMinStats(new int[]{25,9,6,10,10,8,6,3,0,5});
        setUnitClassGrowth(new int[]{20,0,0,10,0,0,0,0,10});
        setEquipable(new ArrayList<>(Arrays.asList("Sword", "Axe", "Lance", "Bow", "Brawl", "Dagger", "Light Magic",
                "Dark Magic", "Anima Magic")));
    }
}
