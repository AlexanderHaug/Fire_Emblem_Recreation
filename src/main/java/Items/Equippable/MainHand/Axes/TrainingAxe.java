package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

public class TrainingAxe extends Weapon {

    public TrainingAxe() {
        setName("Training Axe");
        setItemType("Axe");

        setMight(6);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(6);
        setItemRank('E');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("This simple axe is perfect for training purposes. But cannot inflict critical hits.");
    }
}
