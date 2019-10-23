package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class SteelShield extends Accessory {

    public SteelShield() {
        setName("Steel Shield");
        setItemProtection(3);
        setItemWeight(3);
        setStatModifiers(new int[9]);
        setOtherNullifyEffective(new ArrayList<String>());
        setOtherBattleIncreases(new int[5]);
        setItemDescription("A weighty shield offering strong protection.");
    }
}
