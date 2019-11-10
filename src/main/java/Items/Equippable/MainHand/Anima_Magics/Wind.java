package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Wind extends Weapon {

    public Wind() {
        this.name = "Wind";
        this.type = "Anima Magic: Wind";
        this.might = 2;
        this.accuracy = 100;
        this.critical = 10;
        this.range = new int[]{1,2};
        this.weight = 2;
        this.rank = 'E';
        this.uses = 6;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Basic wind magic.";
    }
}
