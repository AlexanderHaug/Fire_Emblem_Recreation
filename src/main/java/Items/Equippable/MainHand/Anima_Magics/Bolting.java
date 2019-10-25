package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Bolting extends Weapon {

    public Bolting() {
        setName("Bolting");
        setItemType("Anima Magic: Lightning");

        setMight(12);
        setAccuracy(65);
        setCritical(15);
        setItemsRange(new int[]{3,10});
        setItemWeight(18);
        setItemRank('B');

        setItemUses(2);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Superior lightning magic. Cannot trigger follow-up attacks.");
    }
}
