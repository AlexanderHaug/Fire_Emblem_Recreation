package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Elwind extends Weapon {

    public Elwind() {
        setName("Elwind");
        setItemType("Anima Magic: Wind");

        setMight(4);
        setAccuracy(95);
        setCritical(10);
        setItemsRange(new int[]{1,2});
        setItemWeight(3);
        setItemRank('D');

        setItemUses(6);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Intermediate wind magic.");
    }
}
