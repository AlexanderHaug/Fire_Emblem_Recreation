package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class AuraKnuckles extends Weapon {

    public AuraKnuckles() {
        setName("Aura Knuckles");
        setItemType("Brawl");

        setMight(2);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(4);
        setItemRank('A');

        setItemUses(30);
        setItemCost(520);
        setItemIs("MagicBrave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Magical gauntlets that allow wielder to attack twice when initiating combat.");
    }
}
