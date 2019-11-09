package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testStaff;

public class testStaves {

    @Test
    public void testHeal() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Magic", 1);
        map.put("Heal Amount", 10);
        testStaff("Heal", "Healing", "Staff", map, 100,1,1,
                4, 'E',20,"", "Heals an adjacent ally.");
    }

    @Test
    public void testRestore() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Magic", 1);
        testStaff("Restore", "Cleansing", "Staff", map, 100,1,
                1,4, 'C',5,"", "Cures status effects.");
    }
}
