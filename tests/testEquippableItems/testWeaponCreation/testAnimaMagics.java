package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testAnimaMagics {
    // Fire Magic
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

    @Test
    public void testRagnarok() {
        createAndTestWeapon("Ragnarok", "Ragnarok", "Anima Magic: Fire",
                15, 75,5,1,2,
                9,'B', 3,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Superior fire magic.");
    }

    // Wind Magic
    @Test
    public void testWind() {
        createAndTestWeapon("Wind", "Wind", "Anima Magic: Wind",
                2, 100,10,1,2,
                2,'E', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic wind magic.");
    }

    @Test
    public void testElwind() {
        createAndTestWeapon("Elwind", "Elwind", "Anima Magic: Wind",
                4, 95,10,1,2,
                3,'D', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate wind magic.");
    }

    @Test
    public void testCuttingGale() {
        createAndTestWeapon("Cutting_Gale", "Cutting Gale", "Anima Magic: Wind",
                7, 90,10,1,2,
                5,'C', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Advanced wind magic.");
    }
}
