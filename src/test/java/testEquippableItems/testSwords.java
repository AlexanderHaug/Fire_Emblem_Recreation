package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testSwords {

    @Test
    public void testTrainingSword() {
        testWeapon("Training Sword", "Sword", 3, 100,0,1,1,
                4,'E', 50,260, new HashMap<String,Integer>(),
                "This simple sword is perfect for training purposes. But cannot inflict critical hits.");
    }

    @Test
    public void testIronSword() {
        testWeapon("Iron Sword", "Sword", 5, 90,0,1,1,
                5,'E', 40,520, new HashMap<String,Integer>(),
                "A standard sword made of iron, simple but effective.");
    }

    @Test
    public void testSteelSword() {
        testWeapon("Steel Sword", "Sword", 8, 85,0,1,1,
                10,'D', 50,910, new HashMap<String,Integer>(),
                "A weighty steel sword that deals significant blows.");
    }

    @Test
    public void testSilverSword() {
        testWeapon("Silver Sword", "Sword", 12, 90,0,1,1,
                8,'B', 30,1410, new HashMap<String,Integer>(),
                "A sword crafted from shining silver.");
    }

    @Test
    public void testBraveSword() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Brave Sword", "Sword", 9, 75,0,1,1,
                12,'B', 30,2100, a, "The wielder of this blade is emboldened and " +
                        "will attack twice when initiating combat.");

    }

    @Test
    public void testKillingEdge() {
        testWeapon("Killing Edge", "Sword", 8, 85,25,1,1,
                10, 'C', 20,1470, new HashMap<String,Integer>(),
                "Deadly sharp, this sword boasts a high critical-hit rate.");
    }

    @Test
    public void testArmorSlayer() {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("Effective: Armored", 1);
        testWeapon("Armorslayer", "Sword", 8, 80,0,1,1,
                11, 'D', 20,1450, a, "Sharp enough to pierce even " +
                        "the thickest plate. This sword is effective against armored units.");
    }
}
