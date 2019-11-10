package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Bolganone extends Weapon {

    public Bolganone() {
        this.name = "Bolganone";
        this.type = "Anima Magic: Fire";
        this.might = 8;
        this.accuracy = 80;
        this.critical = 0;
        this.range = new int[]{1,2};
        this.weight = 6;
        this.rank = 'C';
        this.uses = 5;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Advanced fire magic.";
    }
}