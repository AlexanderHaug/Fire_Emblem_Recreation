package Items.Equippable.MainHand.Dark_Magics;

import Items.Equippable.MainHand.Weapon;

public class Flux extends Weapon {

    public Flux() {
        setName("Flux");
        setItemType("Dark Magic");

        setMight(5);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{1,2});
        setItemWeight(5);
        setItemRank('E');

        setItemUses(10);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Basic dark magic.");
    }
}
