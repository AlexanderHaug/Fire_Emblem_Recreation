package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testAxes {
    @Test
    public void testTrainingAxe() {
        createAndTestWeapon("Training_Axe", "Training Axe", "Axe",
                6, 80,0,1,1,
                6,'E', 50,260,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "This simple axe is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }
}
