package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class LeatherShield extends Accessory {

    public LeatherShield() {
        setName("Leather Shield");
        setItemProtection(1);
        setItemWeight(1);
        setStatModifiers(new int[9]);
        setOtherNullifyEffective(new ArrayList<String>());
        setOtherBattleIncreases(new int[5]);
        setItemDescription("A shield made of leather. Simple but sturdy.");
    }
}
