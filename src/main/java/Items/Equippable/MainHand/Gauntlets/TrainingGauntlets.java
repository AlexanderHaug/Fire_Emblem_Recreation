package Items.Equippable.MainHand.Gauntlets;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class TrainingGauntlets extends Weapon {

    public TrainingGauntlets() {
        this.name = "Training Gauntlets";
        this.type = "Brawl";
        this.might = 0;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 1;
        this.rank = 'E';
        this.uses = 70;
        this.cost = 100;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Brave", 1);
        this.description = "Simple gauntlets perfect for training purposes. " +
                "Wielder strikes twice when initiating combat.";
    }
}
