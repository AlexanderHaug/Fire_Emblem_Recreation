package testEquippableItems;

import Items.Equippable.MainHand.Dark_Magics.Mire;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.EquippableItemTestMethod.testWeapon;

public class testDarkMagics {

    @Test
    public void testFlux() {
        testWeapon("Flux", "Dark Magic",
                5, 75,0,1,2,
                5,'E', 10,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic dark magic.");
    }

    @Test
    public void testMire() {
        testWeapon("Mire", "Dark Magic",
                3, 70,0,1,3,
                5,'D', 8,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Intermediate dark magic. Inflicts Def -5 to foe " +
                        "for 1 turn.");
        assert Arrays.equals(new Mire().getTempDebuffOpponentStats(),
                new int[]{0,0,0,0,0,0,5,0,0});
    }
}
