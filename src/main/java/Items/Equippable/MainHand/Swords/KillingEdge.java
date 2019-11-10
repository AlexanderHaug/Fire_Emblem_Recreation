package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class KillingEdge extends Weapon {

    public KillingEdge() {
        this.name = "Killing Edge";
        this.type = "Sword";
        this.might = 8;
        this.accuracy = 85;
        this.critical = 25;
        this.range = new int[]{1,1};
        this.weight = 10;
        this.rank = 'C';
        this.uses = 20;
        this.cost = 1470;
        this.additionalAbilities = new HashMap<>();
        this.description = "Deadly sharp, this sword boasts a high critical-hit rate.";
    }
}
