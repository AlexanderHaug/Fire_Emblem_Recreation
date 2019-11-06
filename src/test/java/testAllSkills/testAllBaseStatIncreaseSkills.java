package testAllSkills;

import org.junit.Test;

import static testSetUpMethods.SkillTestMethods.testBaseStatIncreaseSkill;

public class testAllBaseStatIncreaseSkills {

    @Test
    public void testHPPlus5() {
        testBaseStatIncreaseSkill("HP +5", new int[]{5,0,0,0,0,0,0,0,0,0});
    }

    @Test
    public void testStrengthPlus2() {
        testBaseStatIncreaseSkill("Strength +2", new int[]{0,2,0,0,0,0,0,0,0,0});
    }
}
