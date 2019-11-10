package Items.Equippable.MainHand.Dark_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Mire extends Weapon {

    public Mire() {
        this.name = "Mire";
        this.type = "Dark Magic";
        this.might = 3;
        this.accuracy = 70;
        this.critical = 0;
        this.range = new int[]{1,3};
        this.weight = 5;
        this.rank = 'D';
        this.uses = 8;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.additionalAbilities.put("Debuff", 1);
        this.additionalAbilities.put("Temp Debuff: Def", 5);
        this.description = "Intermediate dark magic. Inflicts Def -5 to foe for 1 turn.";
    }
}
