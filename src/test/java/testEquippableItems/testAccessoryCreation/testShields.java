package testEquippableItems.testAccessoryCreation;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.AccessoryCreationTestMethod.createAndTestAccessory;

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

    @Test
    public void testSilverShield() {
        createAndTestAccessory("Silver_Shield", "Silver Shield", "Shield",
                4,4, new int[9], new int[5], new ArrayList<String>(),
                "A Shield made of shining silver.");
    }

    @Test
    public void testHexlockShield() {
        createAndTestAccessory("Hexlock_Shield", "Hexlock Shield", "Shield",
                2,5, new int[]{0,0,0,0,0,0,0,4,0}, new int[5], new ArrayList<String>(),
                "A Shield offering strong protection and resilience.");
    }
}
