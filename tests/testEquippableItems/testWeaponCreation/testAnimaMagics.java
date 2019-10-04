package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testAnimaMagics {

    @Test
    public void testFire() {
        createAndTestWeapon("Fire", "Fire", "Anima Magic: Fire",
                3, 90,0,1,2,
                3,'E', 10,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "A basic fire spell.");
    }
}
