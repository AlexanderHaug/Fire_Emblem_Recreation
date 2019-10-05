package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testDarkMagics {
    @Test
    public void testFlux() {
        createAndTestWeapon("Flux", "Flux", "Dark Magic",
                5, 70,0,1,2,
                5,'E', 45,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "A basic dark magic attack.");
    }
}
