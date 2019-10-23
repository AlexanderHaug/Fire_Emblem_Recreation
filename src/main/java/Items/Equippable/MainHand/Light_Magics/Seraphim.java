package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

public class Seraphim extends Weapon {

    public Seraphim() {
        setName("Seraphim");
        setItemType("Light Magic");

        setMight(5);
        setAccuracy(95);
        setCritical(5);
        setItemsRange(new int[]{1,2});
        setItemWeight(2);
        setItemRank('D');

        setItemUses(12);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Monster"});
        setItemDescription("Intermediate light magic that is effective against Monster foes.");
    }
}
