package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class Hammer extends Weapon {

    public Hammer() {
        setName("Hammer");
        setItemType("Axe");

        setMight(10);
        setAccuracy(60);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(15);
        setItemRank('D');

        setItemUses(20);
        setItemCost(1550);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Armored"});
        setItemDescription("This hammer can pummel metal with astonishing force. " +
                "This hammer is effective against armored units.");
    }
}
