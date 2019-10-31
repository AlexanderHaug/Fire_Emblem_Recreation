package Creatures.UnitClass.AllClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Sniper extends UnitClass {

    public Sniper() {
        setName("Sniper");
        setUnitClassType(new String[]{"Infantry"});
        setUnitClassMinStats(new int[]{30,17,8,12,14,10,12,8,0,5});
        setUnitClassGrowth(new int[]{10,5,0,20,0,10,0,0,5});
        setEquipable(new ArrayList<>(Arrays.asList("Bow")));
    }
}
