package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Thoron extends Weapon {

    public Thoron() {
        this.name = "Thoron";
        this.type = "Anima Magic: Lightning";
        this.might = 9;
        this.accuracy = 70;
        this.critical = 10;
        this.range = new int[]{1,3};
        this.weight = 7;
        this.rank = 'C';
        this.uses = 4;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Advanced lightning magic.";
    }
}
