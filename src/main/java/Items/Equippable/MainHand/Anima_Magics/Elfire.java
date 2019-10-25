package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Elfire extends Weapon {

    public Elfire() {
        setName("Elfire");
        setItemType("Anima Magic: Fire");

        setMight(5);
        setAccuracy(85);
        setCritical(0);
        setItemsRange(new int[]{1,2});
        setItemWeight(4);
        setItemRank('D');

        setItemUses(7);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Intermediate fire magic.");
    }
}
