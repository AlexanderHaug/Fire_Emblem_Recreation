package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Shine extends Weapon {

    public Shine() {
        this.name = "Shine";
        this.type = "Light Magic";
        this.might = 3;
        this.accuracy = 100;
        this.critical = 0;
        this.range = new int[]{1,2};
        this.weight = 1;
        this.rank = 'E';
        this.uses = 8;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Basic light magic.";
    }
}
