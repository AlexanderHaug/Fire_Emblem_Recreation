package Creatures.UnitClass.AllClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Shaman extends UnitClass {

    public Shaman() {
        setName("Shaman");
        setUnitClassType(new String[]{"Infantry"});
        setUnitClassMinStats(new int[]{25,4,10,7,6,8,3,5,0,4});
        setUnitClassGrowth(new int[]{5,-5,10,5,0,0,-5,5,0});
        setEquipable(new ArrayList<>(Arrays.asList("Dark Magic")));
    }
}
