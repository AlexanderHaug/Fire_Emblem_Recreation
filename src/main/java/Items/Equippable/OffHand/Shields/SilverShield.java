package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class SilverShield extends Accessory {

    public SilverShield() {
        this.name = "Silver Shield";
        this.protection = 4;
        this.weight = 4;
        this.additionalAbilities = new HashMap<>();
        this.description = "A shield made of shining silver.";
    }
}
