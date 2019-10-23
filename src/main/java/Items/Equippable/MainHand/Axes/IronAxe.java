package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class IronAxe extends Weapon {

    public IronAxe() {
        setName("Iron Axe");
        setItemType("Axe");

        setMight(8);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(7);
        setItemRank('E');

        setItemUses(45);
        setItemCost(270);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A standard axe made of iron--simple but effective.");
    }
}
