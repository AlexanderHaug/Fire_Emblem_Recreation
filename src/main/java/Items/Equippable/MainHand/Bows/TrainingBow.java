package Items.Equippable.MainHand.Bows;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingBow extends Weapon {

    public TrainingBow() {
        this.name = "Training Bow";
        this.type = "Bow";
        this.might = 3;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{2,2};
        this.weight = 5;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "This simple bow is perfect for training purposes. But cannot inflict critical hits.";
    }
}
