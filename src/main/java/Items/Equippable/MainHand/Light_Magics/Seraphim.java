package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Seraphim extends Weapon {

    public Seraphim() {
        this.name = "Seraphim";
        this.type = "Light Magic";
        this.might = 5;
        this.accuracy = 95;
        this.critical = 5;
        this.range = new int[]{1,2};
        this.weight = 2;
        this.rank = 'D';
        this.uses = 12;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.additionalAbilities.put("Effective: Monster", 1);
        this.description = "Intermediate light magic that is effective against Monster foes.";
    }
}
