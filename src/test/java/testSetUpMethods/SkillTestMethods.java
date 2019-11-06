package testSetUpMethods;

import Creatures.UnitClass.Skill;

import java.util.Arrays;

import static Creatures.SkillGenerator.createSkill;

public class SkillTestMethods {

    public static void testBaseStatIncreaseSkill(String skillName, int[] statIncreases) {
        Skill skill = createSkill(skillName);
        assert Arrays.equals(statIncreases, skill.getBaseStatIncreases());

    }
}
