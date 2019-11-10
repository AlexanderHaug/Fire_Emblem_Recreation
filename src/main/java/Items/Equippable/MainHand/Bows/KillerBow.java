package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class KillerBow extends Weapon {

    public KillerBow() {
        this.name = "Killer Bow";
        this.type = "Bow";
        this.might = 9;
        this.accuracy = 80;
        this.critical = 25;
        this.range = new int[]{2,2};
        this.weight = 11;
        this.rank = 'C';
        this.uses = 20;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A bow that boasts a high critical-hit rate.";
    }
}
