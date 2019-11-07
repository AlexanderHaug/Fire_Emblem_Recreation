package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.UnitClassTestMethod.testClass;

public class testUnpromotedClasses {

    @Test
    public void testLord() {
        testClass("Lord", new String[]{"Infantry"}, new int[]{25,8,7,10,10,8,5,4,0},
                new int[]{5,5,5,5,5,5,5,5,5}, 5, new ArrayList<>(Arrays.asList("Sword", "Axe",
                        "Lance", "Bow", "Brawl", "Dagger", "Light Magic", "Dark Magic", "Anima Magic", "Staff")));
    }
}
