package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Divine extends Weapon {

    public Divine() {
        this.name = "Divine";
        this.type = "Light Magic";
        this.might = 7;
        this.accuracy = 90;
        this.critical = 10;
        this.range = new int[]{1,2};
        this.weight = 4;
        this.rank = 'C';
        this.uses = 6;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Advanced light magic.";
    }
}
