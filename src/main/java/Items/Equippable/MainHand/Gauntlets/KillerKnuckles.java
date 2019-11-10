package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class KillerKnuckles extends Weapon {

    public KillerKnuckles() {
        this.name = "Killer Knuckles";
        this.type = "Brawl";
        this.might = 3;
        this.accuracy = 80;
        this.critical = 20;
        this.range = new int[]{1,1};
        this.weight = 5;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "Gauntlets with a high critical-hit rate that allows the wielder " +
                "to attack twice when initiating combat.";
    }
}
