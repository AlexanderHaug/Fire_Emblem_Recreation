package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class KillerAxe extends Weapon {

    public KillerAxe() {
        this.name = "Killer Axe";
        this.type = "Axe";
        this.might = 11;
        this.accuracy = 70;
        this.critical = 25;
        this.range = new int[]{1,1};
        this.weight = 12;
        this.rank = 'C';
        this.uses = 20;
        this.cost = 1530;
        this.additionalAbilities = new HashMap<>();
        this.description = "Deadly sharp, this axe boasts a high critical-hit rate.";
    }
}
