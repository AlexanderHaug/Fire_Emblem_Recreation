package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class AuraKnuckles extends Weapon {

    public AuraKnuckles() {
        this.name = "Aura Knuckles";
        this.type = "Brawl";
        this.might = 2;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 4;
        this.rank = 'A';
        this.uses = 30;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.additionalAbilities.put("Magic", 1);
        this.description = "Magical gauntlets that allow wielder to attack twice when initiating combat.";
    }
}
