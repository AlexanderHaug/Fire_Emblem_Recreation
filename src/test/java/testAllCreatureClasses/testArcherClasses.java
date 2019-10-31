package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.unitClassCreationTestMethod.createAndTestClass;

public class testArcherClasses {

    @Test
    public void testArcher() {
        createAndTestClass("Archer", new String[]{"Infantry"}, new int[]{25,8,6,8,7,8,5,2,0,5},
                new int[]{5,0,0,10,0,5,0,0,5}, 5, new ArrayList<>(Arrays.asList("Bow")));
    }

    @Test
    public void testSniper() {
        createAndTestClass("Sniper", new String[]{"Infantry"}, new int[]{30,17,8,12,14,10,12,8,0,5},
                new int[]{10,5,0,20,0,10,0,0,5}, 5, new ArrayList<>(Arrays.asList("Bow")));
    }

    @Test
    public void testRanger() {
        createAndTestClass("Ranger", new String[]{"Calvary"}, new int[]{32,17,10,14,16,12,14,10,0,8},
                new int[]{10,0,0,0-5,0,0,0,5}, 8, new ArrayList<>(Arrays.asList("Bow", "Sword")));
    }
}
