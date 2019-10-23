package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class SilverAxe extends Weapon {

    public SilverAxe() {
        setName("Silver Axe");
        setItemType("Axe");

        setMight(16);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(10);
        setItemRank('B');

        setItemUses(30);
        setItemCost(1500);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("An axe crafted from shining silver.");
    }
}
