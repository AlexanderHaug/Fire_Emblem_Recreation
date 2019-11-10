package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SilverGauntlets extends Weapon {

    public SilverGauntlets() {
        this.name = "Silver Gauntlets";
        this.type = "Brawl";
        this.might = 4;
        this.accuracy = 85;
        this.critical = 5;
        this.range = new int[]{1,1};
        this.weight = 7;
        this.rank = 'B';
        this.uses = 40;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "Gauntlets crafted from shining silver. Wielder strikes twice when initiating combat.";
    }
}
