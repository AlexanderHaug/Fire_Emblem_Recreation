package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testDarkMagics {

    @Test
    public void testFlux() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        testWeapon("Flux", "Dark Magic", 5, 75,0,1,2,
                5,'E', 10,540, a, "Basic dark magic.");
    }

    @Test
    public void testMire() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Magic", 1);
        a.put("Debuff", 1);
        a.put("Temp Debuff: Def", 5);
        testWeapon("Mire", "Dark Magic", 3, 70,0,1,3,
                5,'D', 8,540, a,
                "Intermediate dark magic. Inflicts Def -5 to foe for 1 turn.");
    }
}
