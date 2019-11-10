package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class IronAxe extends Weapon {

    public IronAxe() {
        this.name = "Iron Axe";
        this.type = "Axe";
        this.might = 8;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 7;
        this.rank = 'E';
        this.uses = 45;
        this.cost = 270;
        this.additionalAbilities = new HashMap<>();
        this.description = "A standard axe made of iron--simple but effective.";
    }
}
