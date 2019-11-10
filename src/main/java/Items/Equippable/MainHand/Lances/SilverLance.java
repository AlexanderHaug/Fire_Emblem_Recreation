package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SilverLance extends Weapon {

    public SilverLance() {
        this.name = "Silver Lance";
        this.type = "Lance";
        this.might = 13;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 9;
        this.rank = 'B';
        this.uses = 25;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A lance crafted from shining silver.";
    }
}
