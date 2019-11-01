package testEquippableItems;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.EquippableItemTestMethod.testWeapon;

public class testBows {

    @Test
    public void testTrainingBow() {
        testWeapon("Training Bow", "Bow",
                3, 90,0,2,2,
                5,'E', 50,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "This simple bow is perfect for training purposes. " +
                        "But cannot inflict critical hits.");
    }

    @Test
    public void testIronBow() {
        testWeapon("Iron Bow", "Bow",
                6, 85,0,2,2,
                6,'E', 40,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A standard bow made of iron--simple but effective.");
    }

    @Test
    public void testSteelBow() {
        testWeapon("Steel Bow", "Bow",
                9, 80,0,2,2,
                11,'D', 50,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A weighty steel bow that deals significant blows.");
    }

    @Test
    public void testSilverBow() {
        testWeapon("Silver Bow", "Bow",
                12, 75,0,2,2,
                9,'B', 30,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A bow crafted from shining silver.");
    }
}
