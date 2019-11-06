package Creatures;

import Creatures.UnitClass.Skill;
import Creatures.UnitClass.Skills.HPPlus5;
import Creatures.UnitClass.Skills.StrengthPlus2;

public class SkillGenerator {

    public static Skill createSkill(String skillName) {
        switch (skillName) {
            case "HP +5":
                return new HPPlus5();
            case "Strength +2":
                return new StrengthPlus2();
            default:
                return null;
        }
    }
}
