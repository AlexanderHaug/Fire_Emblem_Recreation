package testAllCreatureClasses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.unitClassCreationTestMethod.createAndTestClass;

public class testShamanClasses {

    @Test
    public void testShaman() {
        createAndTestClass("Shaman", new String[]{"Infantry"}, new int[]{25,4,10,7,6,8,3,5,0,4},
                new int[]{5,-5,10,5,0,0,-5,5,0}, 4, new ArrayList<>(Arrays.asList("Dark Magic")));
    }
}
