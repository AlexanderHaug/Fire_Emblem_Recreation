package Items.Equippable.MainHand.Staves;

import Items.Equippable.MainHand.Staff;

import java.util.HashMap;

public class Heal extends Staff {

    public Heal() {
        this.name = "Heal";
        this.type = "Staff";
        this.assistType = "Healing";
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.additionalAbilities.put("Heal Amount", 10);
        this.accuracy = 100;
        this.range = new int[]{1,1};
        this.weight = 4;
        this.rank = 'E';
        this.uses = 20;
        this.cost = 260;
        this.description = "Heals an adjacent ally.";
    }
}
