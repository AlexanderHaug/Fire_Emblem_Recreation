package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class IronLance extends Weapon {

    public IronLance() {
        setName("Iron Lance");
        setItemType("Lance");

        setMight(6);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(6);
        setItemRank('E');

        setItemUses(30);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A standard lance made of iron--simple but effective.");
    }
}
