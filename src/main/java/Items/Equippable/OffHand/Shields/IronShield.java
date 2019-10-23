package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class IronShield extends Accessory {

    public IronShield() {
        setName("Iron Shield");
        setItemProtection(2);
        setItemWeight(2);
        setStatModifiers(new int[9]);
        setOtherNullifyEffective(new ArrayList<String>());
        setOtherBattleIncreases(new int[5]);
        setItemDescription("A wrought-iron shield. The standard for defense.");
    }
}
