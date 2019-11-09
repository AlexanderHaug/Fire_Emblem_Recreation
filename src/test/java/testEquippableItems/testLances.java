package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testLances {

    @Test
    public void testTrainingLance() {
        testWeapon("Training Lance", "Lance", 4, 90,0,1,1,
                5,'E', 50,260, new HashMap<String, Integer>(),
                "This simple lance is perfect for training purposes. But cannot inflict critical hits.");
    }

    @Test
    public void testIronLance() {
        testWeapon("Iron Lance", "Lance", 6, 80,0,1,1,
                6,'E', 30,260, new HashMap<String, Integer>(),
                "A standard lance made of iron--simple but effective.");
    }

    @Test
    public void testSteelLance() {
        testWeapon("Steel Lance","Lance", 9, 75,0,1,1,
                11,'D', 40,260, new HashMap<String, Integer>(),
                "A weighty steel lance that deals significant blows.");
    }

    @Test
    public void testSilverLance() {
        testWeapon("Silver Lance","Lance",13,80,0,1,1,
                9,'B', 25,260, new HashMap<String, Integer>(),
                "A lance crafted from shining silver.");
    }

    @Test
    public void testBraveLance() {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("Brave", 1);
        testWeapon("Brave Lance", "Lance", 10, 70,0,1,1,
                13,'B', 25,260, a, "The wielded of this lance is emboldened and " +
                        "will attack twice when initiating combat.");
    }

    @Test
    public void testKillerLance() {
        testWeapon("Killer Lance", "Lance", 9, 80,25,1,1,
                11,'C', 20,260, new HashMap<String, Integer>(),
                "Deadly sharp, this lance boasts a high critical-hit rate.");
    }

    @Test
    public void testHeavySpear() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Effective: Armored", 1);
        testWeapon("Heavy Spear", "Lance", 9, 75,0,1,1,
                12,'C', 20,260,a, "Sharp enough to pierce even " +
                        "the thickest plate. This lance is effective against armored units.");
    }
}
