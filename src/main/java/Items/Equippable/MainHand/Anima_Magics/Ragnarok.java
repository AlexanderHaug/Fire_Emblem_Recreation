package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Ragnarok extends Weapon {

    public Ragnarok() {
        setName("Ragnarok");
        setItemType("Anima Magic: Fire");

        setMight(15);
        setAccuracy(75);
        setCritical(5);
        setItemsRange(new int[]{1,2});
        setItemWeight(9);
        setItemRank('B');

        setItemUses(3);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Superior fire magic.");
    }
}
