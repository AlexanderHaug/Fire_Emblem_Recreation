package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class BraveBow extends Weapon {

    public BraveBow() {
        setName("Brave Bow");
        setItemType("Bow");

        setMight(10);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{2,2});
        setItemWeight(13);
        setItemRank('B');

        setItemUses(30);
        setItemCost(260);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("The wielded of this bow is emboldened and will attack twice when initiating combat.");
    }
}
