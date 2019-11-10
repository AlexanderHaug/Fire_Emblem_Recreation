package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class CuttingGale extends Weapon {

    public CuttingGale() {
        this.name = "Cutting Gale";
        this.type = "Anima Magic: Wind";
        this.might = 7;
        this.accuracy = 90;
        this.critical = 10;
        this.range = new int[]{1,2};
        this.weight = 5;
        this.rank = 'C';
        this.uses = 6;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Advanced wind magic.";
    }
}
