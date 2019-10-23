package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class SilverShield extends Accessory {

    public SilverShield() {
        setName("Silver Shield");
        setItemProtection(4);
        setItemWeight(4);
        setStatModifiers(new int[9]);
        setOtherNullifyEffective(new ArrayList<String>());
        setOtherBattleIncreases(new int[5]);
        setItemDescription("A Shield made of shining silver.");
    }
}
