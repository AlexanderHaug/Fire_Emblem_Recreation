package testEquippableItems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testAccessory;

public class testShields {

    @Test
    public void testLeatherShield() {
        testAccessory("Leather Shield", 1,1, new HashMap<String, Integer>(),
                new ArrayList<String>(), "A shield made of leather. Simple but sturdy.");
    }

    @Test
    public void testIronShield() {
        testAccessory("Iron Shield", 2,2, new HashMap<String, Integer>(),
                new ArrayList<String>(), "A wrought-iron shield. The standard for defense.");
    }

    @Test
    public void testSteelShield() {
        testAccessory("Steel Shield", 3,3, new HashMap<String, Integer>(),
                new ArrayList<String>(), "A weighty shield offering strong protection.");
    }

    @Test
    public void testSilverShield() {
        testAccessory("Silver Shield", 4,4, new HashMap<String, Integer>(),
                new ArrayList<String>(), "A shield made of shining silver.");
    }

    @Test
    public void testHexlockShield() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Accessory: Resilience", 4);
        testAccessory("Hexlock Shield",2,5, map, new ArrayList<String>(),
                "A shield offering strong protection and resilience.");
    }

    @Test
    public void testKadmosShield() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nullify: Armored", 1);
        ArrayList<String> list = new ArrayList<>();
        list.add("Armored");
        testAccessory("Kadmos Shield",3,0, map, list,
                "A shield that can stop armor-piercing attacks. " +
                        "Nullifies effectiveness against armored units.");
    }
}
