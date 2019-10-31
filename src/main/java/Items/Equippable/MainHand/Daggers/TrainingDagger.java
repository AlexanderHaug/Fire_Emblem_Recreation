package Items.Equippable.MainHand.Daggers;

import Items.Equippable.MainHand.Weapon;

public class TrainingDagger extends Weapon {

    public TrainingDagger() {
        setName("Training Dagger");
        setItemType("Dagger");

        setMight(2);
        setAccuracy(95);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(2);
        setItemRank('E');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("This simple dagger is perfect for training purposes. But cannot inflict critical hits.");
    }
}
