package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

public class Shine extends Weapon {

    public Shine() {
        setName("Shine");
        setItemType("Light Magic");

        setMight(3);
        setAccuracy(100);
        setCritical(0);
        setItemsRange(new int[]{1,2});
        setItemWeight(1);
        setItemRank('E');

        setItemUses(8);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Basic light magic.");
    }
}
