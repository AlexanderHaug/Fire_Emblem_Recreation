package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class SteelAxe extends Weapon {

    public SteelAxe() {
        setName("Steel Axe");
        setItemType("Axe");

        setMight(11);
        setAccuracy(65);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(12);
        setItemRank('D');

        setItemUses(55);
        setItemCost(920);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A weighty steel axe that deals significant blows.");
    }
}
