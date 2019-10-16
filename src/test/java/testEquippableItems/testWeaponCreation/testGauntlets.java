package testEquippableItems.testWeaponCreation;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testGauntlets {

    @Test
    public void testTrainingGauntlets() {
        createAndTestWeapon("Training_Gauntlets", "Training Gauntlets", "Brawl",
                0, 90,0,1,1,
                1,'E', 70,100,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Simple gauntlets perfect for training purposes. " +
                        "Wielder strikes twice when initiating combat." );

    }
}
