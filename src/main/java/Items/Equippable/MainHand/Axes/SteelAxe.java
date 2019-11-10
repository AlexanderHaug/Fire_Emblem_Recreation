package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SteelAxe extends Weapon {

    public SteelAxe() {
        this.name = "Steel Axe";
        this.type = "Axe";
        this.might = 11;
        this.accuracy = 65;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 12;
        this.rank = 'D';
        this.uses = 55;
        this.cost = 920;
        this.additionalAbilities = new HashMap<>();
        this.description = "A weighty steel axe that deals significant blows.";
    }
}
