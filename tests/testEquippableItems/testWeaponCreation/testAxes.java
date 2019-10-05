package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testAxes {

    @Test
    public void testTrainingAxe() {
        createAndTestWeapon("Training_Axe", "Training Axe", "Axe",
                6, 80,0,1,1,
                6,'E', 50,260,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "This simple axe is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }

    @Test
    public void testIronAxe() {
        createAndTestWeapon("Iron_Axe", "Iron Axe", "Axe",
                8, 70,0,1,1,
                7,'E', 45,270,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A standard axe made of iron--simple but effective." );
    }

    @Test
    public void testSteelAxe() {
        createAndTestWeapon("Steel_Axe", "Steel Axe", "Axe",
                11, 65,0,1,1,
                12,'D', 55,920,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "A weighty steel axe that deals significant blows." );
    }

    @Test
    public void testSilverAxe() {
        createAndTestWeapon("Silver_Axe", "Silver Axe", "Axe",
                16, 70,0,1,1,
                10,'B', 30,1500,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "An axe crafted from shining silver." );
    }

    @Test
    public void testBraveAxe() {
        createAndTestWeapon("Brave_Axe", "Brave Axe", "Axe",
                12, 60,0,1,1,
                14,'B', 30,2300,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "The wielder of this axe is emboldened and will attack " +
                        "twice when initiating combat." );
    }

    @Test
    public void testKillerAxe() {
        createAndTestWeapon("Killer_Axe", "Killer Axe", "Axe",
                11, 70,25,1,1,
                12,'C', 20,1530,false,
                false,false, false, new int[9],
                new ArrayList<String>(), "Deadly sharp. This axe boasts a high critical-hit rate.");
    }

    @Test
    public void testHammer() {
        ArrayList<String> a = new ArrayList<>();
        a.add("Armored");
        createAndTestWeapon("Hammer", "Hammer", "Axe",
                10, 60,0,1,1,
                15,'D', 20,1550,false,
                false,false, false, new int[9],
                a, "This hammer can pummel metal with astonishing force. " +
                        "This axe is effective against armored units.");
    }
}
