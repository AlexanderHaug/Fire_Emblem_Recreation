package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Bolting extends Weapon {

    public Bolting() {
        this.name = "Bolting";
        this.type = "Anima Magic: Lightning";
        this.might = 12;
        this.accuracy = 65;
        this.critical = 15;
        this.range = new int[]{3,10};
        this.weight = 18;
        this.rank = 'B';
        this.uses = 2;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Superior lightning magic. Cannot trigger follow-up attacks.";
    }
}
