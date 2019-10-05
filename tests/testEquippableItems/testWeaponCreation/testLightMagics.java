package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testLightMagics {

    @Test
    public void testShine() {
        createAndTestWeapon("Shine", "Shine", "Light Magic",
                3, 100,0,1,2,
                1,'E', 8,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic light magic.");
    }

    @Test
    public void testSeraphim() {
        ArrayList<String> effectiveAgainst = new ArrayList<>();
        effectiveAgainst.add("Monster");
        createAndTestWeapon("Seraphim", "Seraphim", "Light Magic",
                5, 95,5,1,2,
                2,'D', 12,540,true,
                false,false, false, new int[9],
                effectiveAgainst, "Intermediate light magic that is effective against Monster foes.");
    }

    @Test
    public void testDivine() {
        createAndTestWeapon("Divine", "Divine", "Light Magic",
                7, 90,10,1,2,
                4,'C', 6,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate light magic.");
    }

    // Lvl	Range	Use	Wt	Mt	Hit	Crit
    // B	1-2	    3	12	12	70	20
}
