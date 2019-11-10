package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class HeavySpear extends Weapon {

    public HeavySpear() {
        this.name = "Heavy Spear";
        this.type = "Lance";
        this.might = 9;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 12;
        this.rank = 'C';
        this.uses = 20;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Effective: Armored", 1);
        this.description = "Sharp enough to pierce even the thickest plate. " +
                "This lance is effective against armored units.";
    }
}
