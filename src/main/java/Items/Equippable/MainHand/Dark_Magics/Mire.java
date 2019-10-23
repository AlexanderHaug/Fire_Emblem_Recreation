package Items.Equippable.MainHand.Dark_Magics;

import Items.Equippable.MainHand.Weapon;

public class Mire extends Weapon {

    public Mire() {
        setName("Mire");
        setItemType("Dark Magic");

        setMight(3);
        setAccuracy(70);
        setCritical(0);
        setItemsRange(new int[]{1,3});
        setItemWeight(5);
        setItemRank('D');

        setItemUses(8);
        setItemCost(540);
        setItemIs("MagicDebuff:0:0:0:0:0:0:5:0:0");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Intermediate dark magic. Inflicts Def -5 to foe for 1 turn.");
    }
}
