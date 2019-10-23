package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class TrainingSword extends Weapon {

    public TrainingSword() {
        setName("Training Sword");
        setItemType("Sword");

        setMight(3);
        setAccuracy(100);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(4);
        setItemRank('E');

        setItemUses(50);
        setItemCost(260);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("This simple sword is perfect for training purposes. But cannot inflict critical hits.");
    }
}
