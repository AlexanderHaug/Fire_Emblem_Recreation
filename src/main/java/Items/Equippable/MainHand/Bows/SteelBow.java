package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SteelBow extends Weapon {

    public SteelBow() {
        this.name = "Steel Bow";
        this.type = "Bow";
        this.might = 9;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{2,2};
        this.weight = 11;
        this.rank = 'D';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "A weighty steel bow that deals significant blows.";
    }
}
