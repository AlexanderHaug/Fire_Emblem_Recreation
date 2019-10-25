package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class KillerKnuckles extends Weapon {

    public KillerKnuckles() {
        setName("Killer Knuckles");
        setItemType("Brawl");

        setMight(3);
        setAccuracy(80);
        setCritical(20);
        setItemsRange(new int[]{1,1});
        setItemWeight(5);
        setItemRank('B');

        setItemUses(30);
        setItemCost(520);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Gauntlets with a high critical-hit rate that allows the wielder to attack twice when initiating combat.");
    }
}
