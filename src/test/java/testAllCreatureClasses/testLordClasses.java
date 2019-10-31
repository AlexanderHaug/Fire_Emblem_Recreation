package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.unitClassCreationTestMethod.createAndTestClass;

public class testLordClasses {

    @Test
    public void testCleric() {
        createAndTestClass("Lord", new String[]{"Infantry"}, new int[]{25,9,6,10,10,8,6,3,0,5},
                new int[]{20,0,0,10,0,0,0,0,10}, 5, new ArrayList<>(Arrays.asList("Sword", "Axe",
                        "Lance", "Bow", "Brawl", "Dagger", "Light Magic", "Dark Magic", "Anima Magic")));
    }
}
