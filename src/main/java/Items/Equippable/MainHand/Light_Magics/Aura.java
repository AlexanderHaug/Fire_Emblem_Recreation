package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Aura extends Weapon {

    public Aura() {
        this.name = "Aura";
        this.type = "Light Magic";
        this.might = 10;
        this.accuracy = 85;
        this.critical = 20;
        this.range = new int[]{1,2};
        this.weight = 7;
        this.rank = 'B';
        this.uses = 3;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Superior light attack magic. Assails foes with rings of light.";
    }
}
