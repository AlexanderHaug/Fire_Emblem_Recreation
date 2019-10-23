package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class SteelLance extends Weapon {

    public SteelLance() {
        setName("Steel Lance");
        setItemType("Lance");

        setMight(9);
        setAccuracy(75);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(11);
        setItemRank('D');

        setItemUses(40);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A weighty steel lance that deals significant blows.");
    }
}
