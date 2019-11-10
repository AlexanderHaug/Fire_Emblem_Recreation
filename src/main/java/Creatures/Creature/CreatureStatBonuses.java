package Creatures.Creature;

import java.util.HashMap;
import java.util.Set;

public class CreatureStatBonuses {
    private HashMap<String, Integer> statBonuses;

    public CreatureStatBonuses() {
        this.statBonuses = new HashMap<>();
        this.statBonuses.put("Temp Buff: Def", 0);
        this.statBonuses.put("Temp Debuff: Def", 0);
        this.statBonuses.put("Temp Buff: Res", 0);
        this.statBonuses.put("Temp Debuff: Res", 0);
    }

    public int getBonusDefense() {
        return statBonuses.get("Temp Buff: Def") - statBonuses.get("Temp Debuff: Def");
    }

    public int getBonusResistance() {
        return statBonuses.get("Temp Buff: Res") - statBonuses.get("Temp Debuff: Res");
    }

    public void addDebuffs(HashMap<String, Integer> debuffs) {
        Set keys = debuffs.keySet();
        if (keys.contains("Temp Debuff: Def")) {
            if (this.statBonuses.get("Temp Debuff: Def") < debuffs.get("Temp Debuff: Def")) {
                this.statBonuses.put("Temp Debuff: Def", debuffs.get("Temp Debuff: Def"));
            }
        }
    }
}
