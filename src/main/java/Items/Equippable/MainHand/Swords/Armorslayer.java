package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Armorslayer extends Weapon {

    public Armorslayer() {
        this.name = "Armorslayer";
        this.type = "Sword";
        this.might = 8;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 11;
        this.rank = 'D';
        this.uses = 20;
        this.cost = 1450;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Effective: Armored", 1);
        this.description = "Sharp enough to pierce even the thickest plate. " +
                "This sword is effective against armored units.";
    }
}
