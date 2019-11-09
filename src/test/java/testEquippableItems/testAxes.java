package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testAxes {

    @Test
    public void testTrainingAxe() {
        testWeapon("Training Axe", "Axe", 6, 80,0,1,1,
                6,'E', 50,260, new HashMap<String, Integer>(),
                "This simple axe is perfect for training purposes. But cannot inflict critical hits.");
    }

    @Test
    public void testIronAxe() {
        testWeapon("Iron Axe", "Axe", 8, 70,0,1,1,
                7,'E', 45,270, new HashMap<String, Integer>(),
                "A standard axe made of iron--simple but effective.");
    }

    @Test
    public void testSteelAxe() {
        testWeapon("Steel Axe", "Axe", 11, 65,0,1,1,
                12,'D', 55,920, new HashMap<String, Integer>(),
                "A weighty steel axe that deals significant blows.");
    }

    @Test
    public void testSilverAxe() {
        testWeapon("Silver Axe", "Axe", 16, 70,0,1,1,
                10,'B', 30,1500, new HashMap<String, Integer>(),
                "An axe crafted from shining silver.");
    }

    @Test
    public void testBraveAxe() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Brave Axe", "Axe", 12, 60,0,1,1,
                14,'B', 30,2300, a, "The wielder of this axe is emboldened " +
                        "and will attack twice when initiating combat.");
    }

    @Test
    public void testKillerAxe() {
        testWeapon("Killer Axe", "Axe", 11, 70,25,1,1,
                12,'C', 20,1530, new HashMap<String, Integer>(),
                "Deadly sharp, this axe boasts a high critical-hit rate.");
    }

    @Test
    public void testHammer() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Effective: Armored", 1);
        testWeapon("Hammer", "Axe", 10, 60,0,1,1,
                15,'D', 20,1550, a,
                "This hammer can pummel metal with astonishing force. " +
                        "This hammer is effective against armored units.");
    }
}
