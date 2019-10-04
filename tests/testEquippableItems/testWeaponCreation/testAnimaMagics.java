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
                new ArrayList<String>(), "Basic fire magic.");
    }

    @Test
    public void testElfire() {
        createAndTestWeapon("Elfire", "Elfire", "Anima Magic: Fire",
                5, 85,0,1,2,
                4,'D', 7,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate fire magic.");
    }

    @Test
    public void testBolganone() {
        createAndTestWeapon("Bolganone", "Bolganone", "Anima Magic: Fire",
                8, 80,0,1,2,
                6,'C', 5,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Advanced fire magic.");
    }

}
