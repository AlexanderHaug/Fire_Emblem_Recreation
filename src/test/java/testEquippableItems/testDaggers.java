package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testDaggers {

    @Test
    public void testTrainingDagger() {
        testWeapon("Training Dagger", "Dagger", 2, 95,0,1,1,
                2,'E', 50,260, new HashMap<String, Integer>(),
                "This simple dagger is perfect for training purposes. But cannot inflict critical hits.");
    }
}
