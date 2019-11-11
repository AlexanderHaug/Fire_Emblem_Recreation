package Creatures.UnitClass.UnpromotedClasses;

import Creatures.UnitClass.UnitClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Knight extends UnitClass {

    public Knight() {
        name = "Knight";
        unitClassType = new String[]{"Armored"};
        allStats = new HashMap<>();
        allStats.put("Health", 30);
        allStats.put("Strength", 9);
        allStats.put("Magic", 6);
        allStats.put("Skill", 7);
        allStats.put("Speed", 4);
        allStats.put("Luck", 8);
        allStats.put("Defense", 12);
        allStats.put("Resistance", 1);
        allStats.put("Charm", 0);
        allStats.put("Move", 4);

        allStats.put("Health Growth", 25);
        allStats.put("Strength Growth", 5);
        allStats.put("Magic Growth", 0);
        allStats.put("Skill Growth", 0);
        allStats.put("Speed Growth", -10);
        allStats.put("Luck Growth", 0);
        allStats.put("Defense Growth", 10);
        allStats.put("Resistance Growth", -5);
        allStats.put("Charm Growth", 5);

        equippable = new ArrayList<>(Collections.singletonList("Lance"));
    }
}
