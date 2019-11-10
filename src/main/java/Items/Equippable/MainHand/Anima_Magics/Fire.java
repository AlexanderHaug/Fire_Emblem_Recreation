package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Fire extends Weapon {

    public Fire() {
        this.name = "Fire";
        this.type = "Anima Magic: Fire";
        this.might = 3;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{1,2};
        this.weight = 3;
        this.rank = 'E';
        this.uses = 10;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Basic fire magic.";
    }
}
