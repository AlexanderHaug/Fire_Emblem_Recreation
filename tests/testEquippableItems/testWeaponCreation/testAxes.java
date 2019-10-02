package testEquippableItems.testWeaponCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static testEquippableItems.WeaponCreationTestMethod.createAndTestWeapon;

public class testAxes {

    @Test
    public void testTrainingAxe() {
        createAndTestWeapon("Training_Axe", "Training Axe", "Axe",
                6, 80,0,1,1,
                6,'E', 50,260,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "This simple axe is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }

    @Test
    public void testIronAxe() {
        createAndTestWeapon("Iron_Axe", "Iron Axe", "Axe",
                8, 70,0,1,1,
                7,'E', 45,270,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A standard axe made of iron--simple but effective." );
    }

    @Test
    public void testSteelAxe() {
        createAndTestWeapon("Steel_Axe", "Steel Axe", "Axe",
                11, 65,0,1,1,
                12,'D', 55,920,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A weighty steel axe that deals significant blows." );
    }

    @Test
    public void testSilverAxe() {
        createAndTestWeapon("Silver_Axe", "Silver Axe", "Axe",
                16, 70,0,1,1,
                10,'B', 30,1500,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "An axe crafted from shining silver." );
    }
}
