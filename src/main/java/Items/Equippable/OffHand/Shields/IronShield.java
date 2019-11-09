package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class IronShield extends Accessory {

    public IronShield() {
        this.name = "Iron Shield";
        this.protection = 2;
        this.weight = 2;
        this.additionalAbilities = new HashMap<>();
        this.description = "A wrought-iron shield. The standard for defense.";
    }
}
