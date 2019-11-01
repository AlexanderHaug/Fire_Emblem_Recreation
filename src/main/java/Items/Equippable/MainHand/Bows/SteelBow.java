package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class SteelBow extends Weapon {

    public SteelBow() {
        setName("Steel Bow");
        setItemType("Bow");

        setMight(9);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{2,2});
        setItemWeight(11);
        setItemRank('D');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A weighty steel bow that deals significant blows.");
    }
}
