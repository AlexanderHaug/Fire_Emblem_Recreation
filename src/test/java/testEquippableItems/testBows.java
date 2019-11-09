package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testBows {

    @Test
    public void testTrainingBow() {
        testWeapon("Training Bow", "Bow", 3, 90,0,2,2,
                5,'E', 50,260, new HashMap<String, Integer>(),
                "This simple bow is perfect for training purposes. But cannot inflict critical hits.");
    }

    @Test
    public void testIronBow() {
        testWeapon("Iron Bow", "Bow", 6, 85,0,2,2,
                6,'E', 40,260, new HashMap<String, Integer>(),
                "A standard bow made of iron--simple but effective.");
    }

    @Test
    public void testSteelBow() {
        testWeapon("Steel Bow", "Bow", 9, 80,0,2,2,
                11,'D', 50,260,new HashMap<String, Integer>(),
                "A weighty steel bow that deals significant blows.");
    }

    @Test
    public void testSilverBow() {
        testWeapon("Silver Bow", "Bow", 12, 75,0,2,2,
                9,'B', 30,260, new HashMap<String, Integer>(),
                "A bow crafted from shining silver.");
    }

    @Test
    public void testBraveBow() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Brave Bow", "Bow", 10, 70,0,2,2,
                13,'B', 30,260, a,
                "The wielded of this bow is emboldened and will attack twice when initiating combat.");
    }

    @Test
    public void testKillerBow() {
        testWeapon("Killer Bow", "Bow", 9, 80,25,2,2,
                11,'C', 20,260, new HashMap<String, Integer>(),
                "A bow that boasts a high critical-hit rate.");
    }
}
