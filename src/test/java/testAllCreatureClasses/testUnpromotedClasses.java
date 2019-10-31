package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.UnitClassTestMethod.testClass;

public class testUnpromotedClasses {

    @Test
    public void testArcher() {
        testClass("Archer", new String[]{"Infantry"}, new int[]{25,8,6,8,7,8,5,2,0,5},
                new int[]{5,0,0,10,0,5,0,0,5}, 5, new ArrayList<>(Arrays.asList("Bow")));
    }

    @Test
    public void testCleric() {
        testClass("Cleric", new String[]{"Infantry"}, new int[]{25,4,9,7,6,8,3,5,0,4},
                new int[]{5,-5,5,5,0,0,-5,10,10}, 4, new ArrayList<>(Arrays.asList("Staff")));
    }

    @Test
    public void testLord() {
        testClass("Lord", new String[]{"Infantry"}, new int[]{25,8,7,10,10,8,5,4,0,5},
                new int[]{20,0,0,10,0,0,0,0,10}, 5, new ArrayList<>(Arrays.asList("Sword", "Axe",
                        "Lance", "Bow", "Brawl", "Dagger", "Light Magic", "Dark Magic", "Anima Magic")));
    }

    @Test
    public void testShaman() {
        testClass("Shaman", new String[]{"Infantry"}, new int[]{25,4,10,7,6,8,3,5,0,4},
                new int[]{5,-5,10,5,0,0,-5,5,0}, 4, new ArrayList<>(Arrays.asList("Dark Magic")));
    }
}
