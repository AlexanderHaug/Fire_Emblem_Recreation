package Items.Equippable.MainHand.Dark_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Flux extends Weapon {

    public Flux() {
        this.name = "Flux";
        this.type = "Dark Magic";
        this.might = 5;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{1,2};
        this.weight = 5;
        this.rank = 'E';
        this.uses = 10;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Basic dark magic.";
    }
}
