package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class SilverSword extends Weapon {

    public SilverSword() {
        setName("Silver Sword");
        setItemType("Sword");

        setMight(12);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(8);
        setItemRank('B');

        setItemUses(30);
        setItemCost(1410);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A sword crafted from shining silver.");
    }
}
