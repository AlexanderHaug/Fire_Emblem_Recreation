package testEquippableItems.testAccessoryCreation;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static testEquippableItems.AccessoryCreationTestMethod.createAndTestAccessory;

public class testShields {
    @Test
    public void testLeatherShield() {
        createAndTestAccessory("Leather_Shield", "Leather Shield", "Shield",
                1,1, new int[9], new int[5], new ArrayList<String>(),
                "A shield made of leather. Simple but sturdy.");
    }

    @Test
    public void testIronShield() {
        createAndTestAccessory("Iron_Shield", "Iron Shield", "Shield",
                2,2, new int[9], new int[5], new ArrayList<String>(),
                "A wrought-iron shield. The standard for defense.");
    }

    @Test
    public void testSteelShield() {
        createAndTestAccessory("Steel_Shield", "Steel Shield", "Shield",
                3,3, new int[9], new int[5], new ArrayList<String>(),
                "A weighty shield offering strong protection.");
    }
}
