package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testLances {

    @Test
    public void testTrainingLance() {
        createAndTestWeapon("Training_Lance", "Training Lance", "Lance",
                4, 90,0,1,1,
                5,'E', 50,260,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "This simple lance is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }

    @Test
    public void testIronLance() {
        createAndTestWeapon("Iron_Lance", "Iron Lance", "Lance",
                6, 80,0,1,1,
                6,'E', 30,260,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A standard lance made of iron--simple but effective." );
    }
}
