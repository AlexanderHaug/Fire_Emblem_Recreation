package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class IronSword extends Weapon {

    public IronSword() {
        setName("Iron Sword");
        setItemType("Sword");

        setMight(5);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(5);
        setItemRank('E');

        setItemUses(40);
        setItemCost(520);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("A standard sword made of iron, simple but effective.");
    }
}
