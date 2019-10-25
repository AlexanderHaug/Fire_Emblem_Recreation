package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class Bolganone extends Weapon {

    public Bolganone() {
        setName("Bolganone");
        setItemType("Anima Magic: Fire");

        setMight(8);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{1,2});
        setItemWeight(6);
        setItemRank('C');

        setItemUses(5);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Advanced fire magic.");
    }
}