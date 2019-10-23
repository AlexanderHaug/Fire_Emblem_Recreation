package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class SilverLance extends Weapon {

    public SilverLance() {
        setName("Silver Lance");
        setItemType("Lance");

        setMight(13);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(9);
        setItemRank('B');

        setItemUses(25);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A lance crafted from shining silver.");
    }
}
