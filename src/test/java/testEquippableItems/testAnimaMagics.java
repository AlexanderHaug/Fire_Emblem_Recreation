package testEquippableItems;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testAnimaMagics {
    // Fire Magic
    @Test
    public void testFire() {
        createAndTestWeapon("Fire", "Anima Magic: Fire",
                3, 90,0,1,2,
                3,'E', 10,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic fire magic.");
    }

    @Test
    public void testElfire() {
        createAndTestWeapon("Elfire", "Anima Magic: Fire",
                5, 85,0,1,2,
                4,'D', 7,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate fire magic.");
    }

    @Test
    public void testBolganone() {
        createAndTestWeapon("Bolganone", "Anima Magic: Fire",
                8, 80,0,1,2,
                6,'C', 5,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Advanced fire magic.");
    }

    @Test
    public void testRagnarok() {
        createAndTestWeapon("Ragnarok", "Anima Magic: Fire",
                15, 75,5,1,2,
                9,'B', 3,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Superior fire magic.");
    }

    // Wind Magic
    @Test
    public void testWind() {
        createAndTestWeapon("Wind", "Anima Magic: Wind",
                2, 100,10,1,2,
                2,'E', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic wind magic.");
    }

    @Test
    public void testElwind() {
        createAndTestWeapon("Elwind", "Anima Magic: Wind",
                4, 95,10,1,2,
                3,'D', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate wind magic.");
    }

    @Test
    public void testCuttingGale() {
        createAndTestWeapon("Cutting Gale", "Anima Magic: Wind",
                7, 90,10,1,2,
                5,'C', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Advanced wind magic.");
    }

    @Test
    public void testExcalibur() {
        ArrayList<String> effectiveAgainst = new ArrayList<>();
        effectiveAgainst.add("Flying");
        createAndTestWeapon("Excalibur", "Anima Magic: Wind",
                11, 100,15,1,2,
                8, 'B', 4,540,true,
                false, false, false, new int[9],
                effectiveAgainst, "Superior wind magic.");
    }

    // Thunder Magic
    @Test
    public void testThunder() {
        createAndTestWeapon("Thunder", "Anima Magic: Lightning",
                4, 80,5,1,2,
                4,'E', 8,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic lightning magic.");
    }

    @Test
    public void testElthunder() {
        createAndTestWeapon("Elthunder", "Anima Magic: Lightning",
                6, 75,5,1,2,
                5,'D', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate lightning magic.");
    }

    @Test
    public void testThoron() {
        createAndTestWeapon("Thoron", "Anima Magic: Lightning",
                9, 70,10,1,3,
                7,'C', 4,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Advanced lightning magic.");
    }

    @Test
    public void testBolting() {
        createAndTestWeapon("Bolting", "Anima Magic: Lightning",
                12, 65,15,3,10,
                18,'B', 2,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Superior lightning magic. " +
                        "Cannot trigger follow-up attacks.");
    }
}
