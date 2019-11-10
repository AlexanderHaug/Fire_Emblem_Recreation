package Items.Equippable.MainHand.Axes;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Hammer extends Weapon {

    public Hammer() {
        this.name = "Hammer";
        this.type = "Axe";
        this.might = 10;
        this.accuracy = 60;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 15;
        this.rank = 'D';
        this.uses = 20;
        this.cost = 1550;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Effective: Armored", 1);
        this.description = "This hammer can pummel metal with astonishing force. " +
                "This hammer is effective against armored units.";
    }
}
