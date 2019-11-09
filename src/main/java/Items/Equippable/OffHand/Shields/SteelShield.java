package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class SteelShield extends Accessory {

    public SteelShield() {
        this.name = "Steel Shield";
        this.protection = 3;
        this.weight = 3;
        this.additionalAbilities = new HashMap<>();
        this.description = "A weighty shield offering strong protection.";
    }
}
