package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class KillerBow extends Weapon {

    public KillerBow() {
        setName("Killer Bow");
        setItemType("Bow");

        setMight(9);
        setAccuracy(80);
        setCritical(25);
        setItemsRange(new int[]{2,2});
        setItemWeight(11);
        setItemRank('C');

        setItemUses(20);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A bow that boasts a high critical-hit rate.");
    }
}
