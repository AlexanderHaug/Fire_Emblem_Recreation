package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Thunder extends Weapon {

    public Thunder() {
        this.name = "Thunder";
        this.type = "Anima Magic: Lightning";
        this.might = 4;
        this.accuracy = 80;
        this.critical = 5;
        this.range = new int[]{1,2};
        this.weight = 4;
        this.rank = 'E';
        this.uses = 8;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Basic lightning magic.";
    }
}
