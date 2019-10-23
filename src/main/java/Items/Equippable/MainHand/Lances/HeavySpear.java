package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class HeavySpear extends Weapon {

    public HeavySpear() {
        setName("Heavy Spear");
        setItemType("Lance");

        setMight(9);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(12);
        setItemRank('C');

        setItemUses(20);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Armored"});
        setItemDescription("Sharp enough to pierce even the thickest plate. " +
                "This lance is effective against armored units.");
    }
}
