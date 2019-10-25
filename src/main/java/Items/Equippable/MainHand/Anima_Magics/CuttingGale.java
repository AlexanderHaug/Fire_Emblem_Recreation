package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

public class CuttingGale extends Weapon {

    public CuttingGale() {
        setName("Cutting Gale");
        setItemType("Anima Magic: Wind");

        setMight(7);
        setAccuracy(90);
        setCritical(10);
        setItemsRange(new int[]{1,2});
        setItemWeight(5);
        setItemRank('C');

        setItemUses(6);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Advanced wind magic.");
    }
}
