package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class KillerAxe extends Weapon {

    public KillerAxe() {
        setName("Killer Axe");
        setItemType("Axe");

        setMight(11);
        setAccuracy(70);
        setCritical(25);
        setItemsRange(new int[]{1,1});
        setItemWeight(12);
        setItemRank('C');

        setItemUses(20);
        setItemCost(1530);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Deadly sharp, this axe boasts a high critical-hit rate.");
    }
}
