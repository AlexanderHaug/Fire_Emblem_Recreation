package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class IronBow extends Weapon {

    public IronBow() {
        setName("Iron Bow");
        setItemType("Bow");

        setMight(6);
        setAccuracy(85);
        setCritical(0);
        setItemsRange(new int[]{2,2});
        setItemWeight(6);
        setItemRank('E');

        setItemUses(40);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A standard bow made of iron--simple but effective.");
    }
}
