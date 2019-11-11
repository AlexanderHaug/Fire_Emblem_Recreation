package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static testSetUpMethods.UnitClassTestMethod.testClass;

public class testUnpromotedClasses {

    @Test
    public void testLord() {
        testClass("Lord", new String[]{"Infantry"}, new int[]{25,8,7,10,10,8,5,4,0},
                new int[]{5,5,5,5,5,5,5,5,5}, 5, new ArrayList<>(Arrays.asList("Sword", "Axe",
                        "Lance", "Bow", "Brawl", "Dagger", "Light Magic", "Dark Magic", "Anima Magic", "Staff")));
    }

    @Test
    public void testKnight() {
        testClass("Knight", new String[]{"Armored"}, new int[]{30,9,6,7,4,8,12,1,0,4},
                new int[]{25,5,0,0,-10,0,10,-5,5}, 4, new ArrayList<>(Collections.singletonList("Lance")));
    }
}
