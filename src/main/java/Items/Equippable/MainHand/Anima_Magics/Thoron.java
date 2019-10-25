package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Thoron extends Weapon {

    public Thoron() {
        setName("Thoron");
        setItemType("Anima Magic: Lightning");

        setMight(9);
        setAccuracy(70);
        setCritical(10);
        setItemsRange(new int[]{1,3});
        setItemWeight(7);
        setItemRank('C');

        setItemUses(4);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Advanced lightning magic.");
    }
}
