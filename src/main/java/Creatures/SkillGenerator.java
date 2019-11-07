package Creatures;

import Creatures.UnitClass.Ability;
import Creatures.UnitClass.Skills.HPPlus5;
import Creatures.UnitClass.Skills.MagicPlus2;
import Creatures.UnitClass.Skills.StrengthPlus2;

public class SkillGenerator {

    public static Ability createSkill(String skillName) {
        switch (skillName) {
            case "HP +5":
                return new HPPlus5();
            case "Strength +2":
                return new StrengthPlus2();
            case "Magic +2":
                return new MagicPlus2();
            default:
                return null;
        }
    }
}
