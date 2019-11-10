package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class SteelGauntlets extends Weapon {

    public SteelGauntlets() {
        this.name = "Steel Gauntlets";
        this.type = "Brawl";
        this.might = 3;
        this.accuracy = 80;
        this.critical = 5;
        this.range = new int[]{1,1};
        this.weight = 5;
        this.rank = 'D';
        this.uses = 60;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "Weighty steel gauntlets that deal heavy blows. " +
                "Wielder strikes twice when initiating combat.";
    }
}
