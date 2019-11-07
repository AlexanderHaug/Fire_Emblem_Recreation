package testSetUpMethods;

import Creatures.UnitClass.Ability;

import java.util.Arrays;

import static Creatures.SkillGenerator.createSkill;

public class SkillTestMethods {

    public static void testBaseStatIncreaseSkill(String skillName, int[] statIncreases) {
        Ability skill = createSkill(skillName);
        assert Arrays.equals(statIncreases, skill.getBaseStatIncreases());

    }
}
