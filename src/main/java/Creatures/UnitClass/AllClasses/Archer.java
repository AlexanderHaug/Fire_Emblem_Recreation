package Creatures.UnitClass.AllClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Archer extends UnitClass {

    public Archer() {
        setName("Archer");
        setUnitClassType(new String[]{"Infantry"});
        setUnitClassMinStats(new int[]{25,8,6,8,7,8,5,2,0,5});
        setUnitClassGrowth(new int[]{5,0,0,10,0,5,0,0,5});
        setEquipable(new ArrayList<>(Arrays.asList("Bow")));
    }
}
