package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.HashMap;

public class LeatherShield extends Accessory {

    public LeatherShield() {
        this.name = "Leather Shield";
        this.protection = 1;
        this.weight = 1;
        this.additionalAbilities = new HashMap<>();
        this.description = "A shield made of leather. Simple but sturdy.";
    }
}
