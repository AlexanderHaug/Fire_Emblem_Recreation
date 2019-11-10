package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class IronGauntlets extends Weapon {

    public IronGauntlets() {
        this.name = "Iron Gauntlets";
        this.type = "Brawl";
        this.might = 1;
        this.accuracy = 85;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 3;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "Standard iron gauntlets-simple but effective. " +
                "Wielder strikes twice when initiating combat.";
    }
}
