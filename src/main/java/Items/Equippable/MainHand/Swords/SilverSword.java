package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SilverSword extends Weapon {

    public SilverSword() {
        this.name = "Silver Sword";
        this.type = "Sword";
        this.might = 12;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 8;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 1410;
        this.additionalAbilities = new HashMap<>();
        this.description = "A sword crafted from shining silver.";
    }
}
