package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SilverAxe extends Weapon {

    public SilverAxe() {
        this.name = "Silver Axe";
        this.type = "Axe";
        this.might = 16;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 10;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 1500;
        this.additionalAbilities = new HashMap<>();
        this.description = "An axe crafted from shining silver.";
    }
}
