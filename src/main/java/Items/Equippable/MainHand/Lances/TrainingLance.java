package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

public class TrainingLance extends Weapon {

    public TrainingLance() {
        setName("Training Lance");
        setItemType("Lance");

        setMight(4);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(5);
        setItemRank('E');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("This simple lance is perfect for training purposes. " +
                "But cannot inflict critical hits.");
    }
}
