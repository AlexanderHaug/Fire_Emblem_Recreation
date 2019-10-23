package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class KillerLance extends Weapon {

    public KillerLance() {
        setName("Killer Lance");
        setItemType("Lance");

        setMight(9);
        setAccuracy(80);
        setCritical(25);
        setItemsRange(new int[]{1,1});
        setItemWeight(11);
        setItemRank('C');

        setItemUses(20);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Deadly sharp, this lance boasts a high critical-hit rate.");
    }
}
