package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class BraveLance extends Weapon {

    public BraveLance() {
        setName("Brave Lance");
        setItemType("Lance");

        setMight(10);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(13);
        setItemRank('B');

        setItemUses(25);
        setItemCost(260);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("The wielded of this lance is emboldened " +
                "and will attack twice when initiating combat.");
    }
}
