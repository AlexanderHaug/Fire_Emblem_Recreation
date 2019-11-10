package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class HexlockShield extends Accessory {

    public HexlockShield() {
        this.name = "Hexlock Shield";
        this.protection = 2;
        this.weight = 5;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Accessory: Resilience", 4);
        this.description = "A shield offering strong protection and resilience.";
    }
}
