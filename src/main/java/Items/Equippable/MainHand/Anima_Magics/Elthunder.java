package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Elthunder extends Weapon {

    public Elthunder() {
        this.name = "Elthunder";
        this.type = "Anima Magic: Lightning";
        this.might = 6;
        this.accuracy = 75;
        this.critical = 5;
        this.range = new int[]{1,2};
        this.weight = 5;
        this.rank = 'D';
        this.uses = 6;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Intermediate lightning magic.";
    }
}
