package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class SilverGauntlets extends Weapon {

    public SilverGauntlets() {
        setName("Silver Gauntlets");
        setItemType("Brawl");

        setMight(4);
        setAccuracy(85);
        setCritical(5);
        setItemsRange(new int[]{1,1});
        setItemWeight(7);
        setItemRank('B');

        setItemUses(40);
        setItemCost(520);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Gauntlets crafted from shining silver. Wielder strikes twice when initiating combat.");
    }
}
