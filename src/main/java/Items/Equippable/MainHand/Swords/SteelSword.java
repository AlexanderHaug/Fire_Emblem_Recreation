package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class SteelSword extends Weapon {

    public SteelSword() {
        setName("Steel Sword");
        setItemType("Sword");

        setMight(8);
        setAccuracy(85);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(10);
        setItemRank('D');

        setItemUses(50);
        setItemCost(910);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A weighty steel sword that deals significant blows.");
    }
}
