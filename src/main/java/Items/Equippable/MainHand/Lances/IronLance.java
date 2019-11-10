package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class IronLance extends Weapon {

    public IronLance() {
        this.name = "Iron Lance";
        this.type = "Lance";
        this.might = 6;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 6;
        this.rank = 'E';
        this.uses = 30;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A standard lance made of iron--simple but effective.";
    }
}
