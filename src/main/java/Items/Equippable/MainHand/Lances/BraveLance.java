package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class BraveLance extends Weapon {

    public BraveLance() {
        this.name = "Brave Lance";
        this.type = "Lance";
        this.might = 10;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 13;
        this.rank = 'B';
        this.uses = 25;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "The wielded of this lance is emboldened and will attack twice when initiating combat.";
    }
}
