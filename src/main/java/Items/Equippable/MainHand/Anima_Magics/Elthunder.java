package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Elthunder extends Weapon {

    public Elthunder() {
        setName("Elthunder");
        setItemType("Anima Magic: Lightning");

        setMight(6);
        setAccuracy(75);
        setCritical(5);
        setItemsRange(new int[]{1,2});
        setItemWeight(5);
        setItemRank('D');

        setItemUses(6);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Intermediate lightning magic.");
    }
}
