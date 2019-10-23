package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Thunder extends Weapon {

    public Thunder() {
        setName("Thunder");
        setItemType("Anima Magic: Lightning");

        setMight(4);
        setAccuracy(80);
        setCritical(5);
        setItemsRange(new int[]{1,2});
        setItemWeight(4);
        setItemRank('E');

        setItemUses(8);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Basic lightning magic.");
    }
}
