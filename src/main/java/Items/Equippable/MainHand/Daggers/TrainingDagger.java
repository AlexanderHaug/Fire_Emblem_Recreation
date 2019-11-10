package Items.Equippable.MainHand.Daggers;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingDagger extends Weapon {

    public TrainingDagger() {
        this.name = "Training Dagger";
        this.type = "Dagger";
        this.might = 2;
        this.accuracy = 95;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 2;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "This simple dagger is perfect for training purposes. But cannot inflict critical hits.";
    }
}
