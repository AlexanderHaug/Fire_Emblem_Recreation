package testEquippableItems;

import org.junit.Test;

import static testSetUpMethods.EquippableItemTestMethod.testStaff;

public class testStaves {

    @Test
    public void testHeal() {
        testStaff("Heal", "Healing", "Staff",
                10, 100,1,1,4,
                'E',20,true,"",
                "Heals an adjacent ally.");
    }

    @Test
    public void testRestore() {
        testStaff("Restore", "Cleansing", "Staff",
                0, 100,1,1,4,
                'C',5,true,"",
                "Cures status effects.");
    }
}
