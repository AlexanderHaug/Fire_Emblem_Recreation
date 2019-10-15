package testEquippableItems.testWeaponCreation;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testLances {

    @Test
    public void testTrainingLance() {
        createAndTestWeapon("Training_Lance", "Training Lance", "Lance",
                4, 90,0,1,1,
                5,'E', 50,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "This simple lance is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }

    @Test
    public void testIronLance() {
        createAndTestWeapon("Iron_Lance", "Iron Lance", "Lance",
                6, 80,0,1,1,
                6,'E', 30,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A standard lance made of iron--simple but effective." );
    }

    @Test
    public void testSteelLance() {
        createAndTestWeapon("Steel_Lance", "Steel Lance", "Lance",
                9, 75,0,1,1,
                11,'D', 40,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A weighty steel lance that deals significant blows." );
    }

    @Test
    public void testSilverLance() {
        createAndTestWeapon("Silver_Lance", "Silver Lance", "Lance",
                13, 80,0,1,1,
                9,'B', 25,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A lance crafted from shining silver." );
    }

    @Test
    public void testBraveLance() {
        createAndTestWeapon("Brave_Lance", "Brave Lance", "Lance",
                10, 70,0,1,1,
                13,'B', 25,260,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "The wielded of this lance is emboldened and " +
                        "will attack twice when initiating combat." );
    }

    @Test
    public void testKillerLance() {
        createAndTestWeapon("Killer_Lance", "Killer Lance", "Lance",
                9, 80,25,1,1,
                11,'C', 20,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "Deadly sharp. This lance boasts a " +
                        "high critical-hit rate." );
    }

    @Test
    public void testHeavySpear() {
        ArrayList<String> a = new ArrayList<>();
        a.add("Armored");
        createAndTestWeapon("Heavy_Spear", "Heavy Spear", "Lance",
                9, 75,0,1,1,
                12,'C', 20,260,false,
                false,false, false, new int[9],
                a, "Sharp enough to pierce even the thickest plate. " +
                        "This lance is effective against armored units." );
    }
}
