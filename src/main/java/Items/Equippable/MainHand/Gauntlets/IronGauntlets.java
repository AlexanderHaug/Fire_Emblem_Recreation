package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class IronGauntlets extends Weapon {

    public IronGauntlets() {
        setName("Iron Gauntlets");
        setItemType("Brawl");

        setMight(1);
        setAccuracy(85);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(3);
        setItemRank('E');

        setItemUses(50);
        setItemCost(520);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Standard iron gauntlets-simple but effective. Wielder strikes twice when initiating combat.");
    }
}
