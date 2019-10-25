package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class SteelGauntlets extends Weapon {

    public SteelGauntlets() {
        setName("Steel Gauntlets");
        setItemType("Brawl");

        setMight(3);
        setAccuracy(80);
        setCritical(5);
        setItemsRange(new int[]{1,1});
        setItemWeight(5);
        setItemRank('D');

        setItemUses(60);
        setItemCost(520);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Weighty steel gauntlets that deal heavy blows. Wielder strikes twice when initiating combat.");
    }
}
