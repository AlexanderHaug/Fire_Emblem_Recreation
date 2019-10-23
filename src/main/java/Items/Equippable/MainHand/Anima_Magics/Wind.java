package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Wind extends Weapon {

    public Wind() {
        setName("Wind");
        setItemType("Anima Magic: Wind");

        setMight(2);
        setAccuracy(100);
        setCritical(10);
        setItemsRange(new int[]{1,2});
        setItemWeight(2);
        setItemRank('E');

        setItemUses(6);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Basic wind magic.");
    }
}
