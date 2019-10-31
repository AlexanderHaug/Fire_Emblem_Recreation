package Creatures.UnitClass.AllClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric extends UnitClass {

    public Cleric() {
        setName("Cleric");
        setUnitClassType(new String[]{"Infantry"});
        setUnitClassMinStats(new int[]{25,4,9,7,6,8,3,5,0,4});
        setUnitClassGrowth(new int[]{5,-5,5,5,0,0,-5,10,10});
        setEquipable(new ArrayList<>(Arrays.asList("Staff")));
    }
}
