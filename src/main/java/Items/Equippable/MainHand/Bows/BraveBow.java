package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class BraveBow extends Weapon {

    public BraveBow() {
        this.name = "Brave Bow";
        this.type = "Bow";
        this.might = 10;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{2,2};
        this.weight = 13;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "The wielded of this bow is emboldened and will attack twice when initiating combat.";
    }
}
