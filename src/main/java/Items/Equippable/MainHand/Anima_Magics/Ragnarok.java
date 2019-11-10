package Items.Equippable.MainHand.Anima_Magics;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class Ragnarok extends Weapon {

    public Ragnarok() {
        this.name = "Ragnarok";
        this.type = "Anima Magic: Fire";
        this.might = 15;
        this.accuracy = 75;
        this.critical = 5;
        this.range = new int[]{1,2};
        this.weight = 9;
        this.rank = 'B';
        this.uses = 3;
        this.cost = 540;
        this.additionalAbilities = new HashMap<>();
        this.additionalAbilities.put("Magic", 1);
        this.description = "Superior fire magic.";
    }
}
