package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class BraveSword extends Weapon {

    public BraveSword() {
        this.name = "Brave Sword";
        this.type = "Sword";
        this.might = 9;
        this.accuracy = 75;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 12;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 2100;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "The wielder of this blade is emboldened and will attack twice when initiating combat.";
    }
}
