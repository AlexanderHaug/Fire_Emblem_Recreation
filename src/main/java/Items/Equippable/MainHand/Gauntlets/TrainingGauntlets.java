package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

public class TrainingGauntlets extends Weapon {

    public TrainingGauntlets() {
        setName("Training Gauntlets");
        setItemType("Brawl");

        setMight(0);
        setAccuracy(90);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(1);
        setItemRank('E');

        setItemUses(70);
        setItemCost(100);
        setItemIs("Brave");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{});
        setItemDescription("Simple gauntlets perfect for training purposes. Wielder strikes twice when initiating combat.");
    }
}
