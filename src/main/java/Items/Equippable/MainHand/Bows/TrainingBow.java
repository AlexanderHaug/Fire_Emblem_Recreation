package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

public class TrainingBow extends Weapon {

    public TrainingBow() {
        setName("Training Bow");
        setItemType("Bow");

        setMight(3);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{2,2});
        setItemWeight(5);
        setItemRank('E');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("This simple bow is perfect for training purposes. " +
                "But cannot inflict critical hits.");
    }
}
