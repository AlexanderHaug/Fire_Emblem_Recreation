package Creatures.UnitClass.UnpromotedClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lord extends UnitClass {

    public Lord() {
        name = "Lord";
        unitClassType = new String[]{"Infantry"};
        allStats = new HashMap<>();
        allStats.put("Health", 25);
        allStats.put("Strength", 8);
        allStats.put("Magic", 7);
        allStats.put("Skill", 10);
        allStats.put("Speed", 10);
        allStats.put("Luck", 8);
        allStats.put("Defense", 5);
        allStats.put("Resistance", 4);
        allStats.put("Charm", 0);
        allStats.put("Move", 5);

        allStats.put("Health Growth", 5);
        allStats.put("Strength Growth", 5);
        allStats.put("Magic Growth", 5);
        allStats.put("Skill Growth", 5);
        allStats.put("Speed Growth", 5);
        allStats.put("Luck Growth", 5);
        allStats.put("Defense Growth", 5);
        allStats.put("Resistance Growth", 5);
        allStats.put("Charm Growth", 5);

        equippable = new ArrayList<>(Arrays.asList("Sword", "Axe", "Lance", "Bow", "Brawl", "Dagger", "Light Magic",
                "Dark Magic", "Anima Magic", "Staff"));
    }
}
