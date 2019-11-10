package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Excalibur extends Weapon {

    public Excalibur() {
        this.name = "Excalibur";
        this.type = "Anima Magic: Wind";
        this.might = 11;
        this.accuracy = 100;
        this.critical = 15;
        this.range = new int[]{1,2};
        this.weight = 8;
        this.rank = 'B';
        this.uses = 4;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.additionalAbilities.put("Effective: Flying", 1);
        this.description = "Superior wind magic.";
    }
}
