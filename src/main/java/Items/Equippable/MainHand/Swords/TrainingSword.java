package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingSword extends Weapon {

    public TrainingSword() {
        this.name = "Training Sword";
        this.type = "Sword";
        this.might = 3;
        this.accuracy = 100;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 4;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "This simple sword is perfect for training purposes. But cannot inflict critical hits.";
    }
}
