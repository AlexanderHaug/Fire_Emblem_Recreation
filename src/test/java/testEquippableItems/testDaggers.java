package testEquippableItems;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.EquippableItemTestMethod.testWeapon;

public class testDaggers {

    @Test
    public void testTrainingDagger() {
        testWeapon("Training Dagger", "Dagger",
                2, 95,0,1,1,
                2,'E', 50,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "This simple dagger is perfect for training purposes. " +
                        "But cannot inflict critical hits.");
    }
}
