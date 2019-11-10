package Items.Equippable.MainHand.Staves;

import Items.Equippable.MainHand.Staff;

import java.util.HashMap;

public class Restore extends Staff {

    public Restore() {
        this.name = "Restore";
        this.type = "Staff";
        this.assistType = "Cleansing";
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.accuracy = 100;
        this.range = new int[]{1,1};
        this.weight = 4;
        this.rank = 'C';
        this.uses = 5;
        this.cost = 260;
        this.description = "Cures status effects.";
    }
}
