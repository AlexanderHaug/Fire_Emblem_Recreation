package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Excalibur extends Weapon {

    public Excalibur() {
        setName("Excalibur");
        setItemType("Anima Magic: Wind");

        setMight(11);
        setAccuracy(100);
        setCritical(15);
        setItemsRange(new int[]{1,2});
        setItemWeight(8);
        setItemRank('B');

        setItemUses(4);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Flying"});
        setItemDescription("Superior wind magic.");
    }
}
