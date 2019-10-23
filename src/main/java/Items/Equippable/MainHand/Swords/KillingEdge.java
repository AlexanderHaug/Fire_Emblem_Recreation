package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class KillingEdge extends Weapon {

    public KillingEdge() {
        setName("Killing Edge");
        setItemType("Sword");

        setMight(8);
        setAccuracy(85);
        setCritical(25);
        setItemsRange(new int[]{1,1});
        setItemWeight(10);
        setItemRank('C');

        setItemUses(20);
        setItemCost(1470);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Deadly sharp, this sword boasts a high critical-hit rate.");
    }
}
