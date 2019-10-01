package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testDarkMagics {
    @Test
    public void testFlux() {
        createAndTestWeapon("Flux", "Flux", "Dark Magic",
                5, 70,0,1,2,
                5,'E', 45,540,true,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A basic dark magic attack.");
    }

    @Test
    public void testFlux() {
        createAndTestWeapon("Flux", "Flux", "Dark Magic",
                5, 70,0,1,2,
                5,'E', 45,540,true,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A basic dark magic attack.");
    }
}
