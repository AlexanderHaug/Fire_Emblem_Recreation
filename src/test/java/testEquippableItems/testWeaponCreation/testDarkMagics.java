package testEquippableItems.testWeaponCreation;

import Items.Equippable.MainHand.Weapon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testDarkMagics {

    @Test
    public void testFlux() {
        createAndTestWeapon("Flux", "Flux", "Dark Magic",
                5, 75,0,1,2,
                5,'E', 10,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic dark magic.");
    }

    @Test
    public void testMire() {
        createAndTestWeapon("Mire", "Mire", "Dark Magic",
                3, 70,0,1,3,
                5,'D', 8,540,true,
                false,false, false, new int[9],
                new ArrayList<String>(), "Basic dark magic. Inflicts Def -5 to foe for 1 turn.");
        assert Arrays.equals(new Weapon("Dark_Magics/Mire.csv").getTempDebuffOpponentStats(),
                new int[]{0,0,0,0,0,0,5,0,0});
    }
}
