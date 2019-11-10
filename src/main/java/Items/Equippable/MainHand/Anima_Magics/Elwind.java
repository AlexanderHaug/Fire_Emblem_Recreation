package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Elwind extends Weapon {

    public Elwind() {
        this.name = "Elwind";
        this.type = "Anima Magic: Wind";
        this.might = 4;
        this.accuracy = 95;
        this.critical = 10;
        this.range = new int[]{1,2};
        this.weight = 3;
        this.rank = 'D';
        this.uses = 6;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Intermediate wind magic.";
    }
}
