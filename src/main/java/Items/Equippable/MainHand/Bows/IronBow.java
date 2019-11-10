package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class IronBow extends Weapon {

    public IronBow() {
        this.name = "Iron Bow";
        this.type = "Bow";
        this.might = 6;
        this.accuracy = 85;
        this.critical = 0;
        this.range = new int[]{2,2};
        this.weight = 6;
        this.rank = 'E';
        this.uses = 40;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A standard bow made of iron--simple but effective.";
    }
}
