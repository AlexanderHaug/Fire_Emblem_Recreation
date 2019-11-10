package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Elfire extends Weapon {

    public Elfire() {
        this.name = "Elfire";
        this.type = "Anima Magic: Fire";
        this.might = 5;
        this.accuracy = 85;
        this.critical = 0;
        this.range = new int[]{1,2};
        this.weight = 4;
        this.rank = 'D';
        this.uses = 7;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Intermediate fire magic.";
    }
}
