package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SteelSword extends Weapon {

    public SteelSword() {
        this.name = "Steel Sword";
        this.type = "Sword";
        this.might = 8;
        this.accuracy = 85;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 10;
        this.rank = 'D';
        this.uses = 50;
        this.cost = 910;
        this.additionalAbilities = new HashMap<>();
        this.description = "A weighty steel sword that deals significant blows.";
    }
}
