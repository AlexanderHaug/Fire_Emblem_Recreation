package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Fire extends Weapon {

    public Fire() {
        setName("Fire");
        setItemType("Anima Magic: Fire");

        setMight(3);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{1,2});
        setItemWeight(3);
        setItemRank('E');

        setItemUses(10);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Basic fire magic.");
    }
}
