package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class DragonClaws extends Weapon {

    public DragonClaws() {
        this.name = "Dragon Claws";
        this.type = "Brawl";
        this.might = 4;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 7;
        this.rank = 'A';
        this.uses = 30;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.additionalAbilities.put("Effective: Dragon",1);
        this.description = "Said to have slain a legendary beast. Effective against dragons. " +
                "Attack twice if initiating combat.";
    }
}
