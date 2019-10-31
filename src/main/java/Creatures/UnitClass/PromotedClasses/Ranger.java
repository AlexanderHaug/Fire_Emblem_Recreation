package Creatures.UnitClass.PromotedClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger extends UnitClass {

    public Ranger() {
        setName("Ranger");
        setUnitClassType(new String[]{"Calvary"});
        setUnitClassMinStats(new int[]{32,17,10,14,16,12,14,10,0,8});
        setUnitClassGrowth(new int[]{10,0,0,0-5,0,0,0,5});
        setEquipable(new ArrayList<>(Arrays.asList("Bow", "Sword")));
    }
}