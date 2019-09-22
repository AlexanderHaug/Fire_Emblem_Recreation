package testWeaponCreation;

import org.testng.annotations.Test;

import static testWeaponCreation.WeaponCreationTestMethod.createAndTestStaves;

public class testStaves {
    @Test
    public void testHeal() {
        createAndTestStaves("Heal", "Heal", "Staff",
                10, 100,1,1,4,
                "E",20,true,false,
                false,false,
                "Basic light magic. Heals an adjacent ally." );
    }
}
