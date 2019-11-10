package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingAxe extends Weapon {

    public TrainingAxe() {
        this.name = "Training Axe";
        this.type = "Axe";
        this.might = 6;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 6;
        this.rank = 'E';
        this.uses = 50;
        this.cost = 260;
        this.additionalAbilities = new HashMap<>();
        this.description = "This simple axe is perfect for training purposes. But cannot inflict critical hits.";
    }
}
