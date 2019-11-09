package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testLightMagics {

    @Test
    public void testShine() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Shine", "Light Magic", 3, 100,0,1,2,
                1,'E', 8,540, a, "Basic light magic.");
    }

    @Test
    public void testSeraphim() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Magic", 1);
        a.put("Effective: Monster", 1);
        testWeapon("Seraphim", "Light Magic", 5, 95,5,1,2,
                2,'D', 12,540, a, "Intermediate light magic that is " +
                        "effective against Monster foes.");
    }

    @Test
    public void testDivine() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Divine", "Light Magic", 7, 90,10,1,2,
                4,'C', 6,540, a, "Advanced light magic.");
    }

    @Test
    public void testAura() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Aura", "Light Magic", 10, 85,20,1,2,
                7,'B', 3,540, a, "Superior light attack magic. " +
                        "Assails foes with rings of light.");
    }
}
