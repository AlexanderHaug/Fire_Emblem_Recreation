package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SteelLance extends Weapon {

    public SteelLance() {
        this.name = "Steel Lance";
        this.type = "Lance";
        this.might = 9;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 11;
        this.rank = 'D';
        this.uses = 40;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A weighty steel lance that deals significant blows.";
    }
}
