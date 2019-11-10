package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class KillerLance extends Weapon {

    public KillerLance() {
        this.name = "Killer Lance";
        this.type = "Lance";
        this.might = 9;
        this.accuracy = 80;
        this.critical = 25;
        this.range = new int[]{1,1};
        this.weight = 11;
        this.rank = 'C';
        this.uses = 20;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "Deadly sharp, this lance boasts a high critical-hit rate.";
    }
}
