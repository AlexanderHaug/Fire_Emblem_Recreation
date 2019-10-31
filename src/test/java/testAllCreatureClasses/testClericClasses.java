package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.unitClassCreationTestMethod.createAndTestClass;

public class testClericClasses {

    @Test
    public void testCleric() {
        createAndTestClass("Cleric", new String[]{"Infantry"}, new int[]{25,4,9,7,6,8,3,5,0,4},
                new int[]{5,-5,5,5,0,0,-5,10,10}, 4, new ArrayList<>(Arrays.asList("Staff")));
    }
}
