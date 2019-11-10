package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SilverBow extends Weapon {

    public SilverBow() {
        this.name = "Silver Bow";
        this.type = "Bow";
        this.might = 12;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{2,2};
        this.weight = 9;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A bow crafted from shining silver.";
    }
}
