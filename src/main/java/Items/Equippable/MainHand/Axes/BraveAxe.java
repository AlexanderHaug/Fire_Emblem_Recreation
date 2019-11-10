package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class BraveAxe extends Weapon {

    public BraveAxe() {
        this.name = "Brave Axe";
        this.type = "Axe";
        this.might = 12;
        this.accuracy = 60;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 14;
        this.rank = 'B';
        this.uses = 30;
        this.cost = 2300;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "The wielder of this axe is emboldened and will attack twice when initiating combat.";
    }
}
