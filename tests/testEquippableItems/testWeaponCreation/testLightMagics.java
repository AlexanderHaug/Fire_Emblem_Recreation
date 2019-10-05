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
                new ArrayList<String>(), "Basic light magic." );
    }

    // Lvl	Range	Use	Wt	Mt	Hit	Crit
    // E	1-2	    8	8	1	80	0
}
