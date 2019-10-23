package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class BraveAxe extends Weapon {

    public BraveAxe() {
        setName("Brave Axe");
        setItemType("Axe");

        setMight(12);
        setAccuracy(60);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(14);
        setItemRank('B');

        setItemUses(30);
        setItemCost(2300);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("The wielder of this axe is emboldened and will attack twice when initiating combat.");
    }
}
