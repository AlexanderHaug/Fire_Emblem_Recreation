package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class DragonClaws extends Weapon {

    public DragonClaws() {
        setName("Dragon Claws");
        setItemType("Brawl");

        setMight(4);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(7);
        setItemRank('A');

        setItemUses(30);
        setItemCost(520);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Dragon"});
        setItemDescription("Said to have slain a legendary beast. Effective against dragons. Attack twice if initiating combat.");
    }
}
