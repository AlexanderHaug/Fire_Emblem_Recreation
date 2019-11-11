package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class KadmosShield extends Accessory {

    public KadmosShield() {
        this.name = "Kadmos Shield";
        this.protection = 3;
        this.weight = 0;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Nullify: Armored", 1);
        this.description = "A shield that can stop armor-piercing attacks. " +
                "Nullifies effectiveness against armored units.";
    }
}
