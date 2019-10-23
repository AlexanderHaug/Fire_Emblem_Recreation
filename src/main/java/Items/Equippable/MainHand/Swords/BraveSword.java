package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class BraveSword extends Weapon {

    public BraveSword() {
        setName("Brave Sword");
        setItemType("Sword");

        setMight(9);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(12);
        setItemRank('B');

        setItemUses(30);
        setItemCost(2100);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("The wielder of this blade is emboldened and will attack twice when initiating combat.");
    }
}
