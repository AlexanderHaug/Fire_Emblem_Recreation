package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

public class Divine extends Weapon {

    public Divine() {
        setName("Divine");
        setItemType("Light Magic");

        setMight(7);
        setAccuracy(90);
        setCritical(10);
        setItemsRange(new int[]{1,2});
        setItemWeight(4);
        setItemRank('C');

        setItemUses(6);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Advanced light magic.");
    }
}
