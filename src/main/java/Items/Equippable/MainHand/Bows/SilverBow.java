package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class SilverBow extends Weapon {

    public SilverBow() {
        setName("Silver Bow");
        setItemType("Bow");

        setMight(12);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{2,2});
        setItemWeight(9);
        setItemRank('B');

        setItemUses(30);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A bow crafted from shining silver.");
    }
}
