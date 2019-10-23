package Items.Equippable.MainHand.Light_Magics;

import Items.Equippable.MainHand.Weapon;

public class Aura extends Weapon {

    public Aura() {
        setName("Aura");
        setItemType("Light Magic");

        setMight(10);
        setAccuracy(85);
        setCritical(20);
        setItemsRange(new int[]{1,2});
        setItemWeight(7);
        setItemRank('B');

        setItemUses(3);
        setItemCost(540);
        setItemIs("Magic");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Superior light attack magic. Assails foes with rings of light.");
    }
}
