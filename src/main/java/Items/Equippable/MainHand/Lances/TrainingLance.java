package Items.Equippable.MainHand.Lances;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingLance extends Weapon {

    public TrainingLance() {
        this.name = "Training Lance";
        this.type = "Lance";
        this.might = 4;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 5;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "This simple lance is perfect for training purposes. But cannot inflict critical hits.";
    }
}
