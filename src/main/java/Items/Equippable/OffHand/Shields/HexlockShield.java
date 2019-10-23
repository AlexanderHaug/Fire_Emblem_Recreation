package Items.Equippable.OffHand.Shields;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;

public class HexlockShield extends Accessory {

    public HexlockShield() {
        setName("Hexlock Shield");
        setItemProtection(2);
        setItemWeight(5);
        setStatModifiers(new int[]{0,0,0,0,0,0,0,4,0});
        setOtherNullifyEffective(new ArrayList<String>());
        setOtherBattleIncreases(new int[5]);
        setItemDescription("A Shield offering strong protection and resilience.");
    }
}
