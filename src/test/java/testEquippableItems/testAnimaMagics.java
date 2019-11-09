package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testAnimaMagics {
    // Fire Magic
    @Test
    public void testFire() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Fire", "Anima Magic: Fire", 3, 90,0,1,2,
                3,'E', 10,540, a, "Basic fire magic.");
    }

    @Test
    public void testElfire() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Elfire", "Anima Magic: Fire", 5, 85,0,1,2,
                4,'D', 7,540, a, "Intermediate fire magic.");
    }

    @Test
    public void testBolganone() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Bolganone", "Anima Magic: Fire", 8, 80,0,1,
                2, 6,'C', 5,540,a, "Advanced fire magic.");
    }

    @Test
    public void testRagnarok() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Ragnarok", "Anima Magic: Fire", 15, 75,5,1,
                2, 9,'B', 3,540,a, "Superior fire magic.");
    }

    // Wind Magic
    @Test
    public void testWind() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Wind", "Anima Magic: Wind", 2, 100,10,1,2,
                2,'E', 6,540,a, "Basic wind magic.");
    }

    @Test
    public void testElwind() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Elwind", "Anima Magic: Wind", 4, 95,10,1,2,
                3,'D', 6,540,a, "Intermediate wind magic.");
    }

    @Test
    public void testCuttingGale() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Cutting Gale", "Anima Magic: Wind", 7, 90,10,1,
                2, 5,'C', 6,540, a, "Advanced wind magic.");
    }

    @Test
    public void testExcalibur() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        a.put("Effective: Flying", 1);
        testWeapon("Excalibur", "Anima Magic: Wind", 11, 100,15,1,
                2, 8, 'B', 4,540, a, "Superior wind magic.");
    }

    // Thunder Magic
    @Test
    public void testThunder() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Thunder", "Anima Magic: Lightning", 4, 80,5,1,
                2, 4,'E', 8,540,a, "Basic lightning magic.");
    }

    @Test
    public void testElthunder() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Elthunder", "Anima Magic: Lightning", 6, 75,5,1,
                2, 5,'D', 6,540, a, "Intermediate lightning magic.");
    }

    @Test
    public void testThoron() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Thoron", "Anima Magic: Lightning", 9, 70,10,1,
                3, 7,'C', 4,540, a, "Advanced lightning magic.");
    }

    @Test
    public void testBolting() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Bolting", "Anima Magic: Lightning", 12, 65,15,3,
                10, 18,'B', 2,540, a, "Superior lightning magic. " +
                        "Cannot trigger follow-up attacks.");
    }
}
