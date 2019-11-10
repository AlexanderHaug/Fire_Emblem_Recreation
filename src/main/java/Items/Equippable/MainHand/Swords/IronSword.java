package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

import java.util.HashMap;

public class IronSword extends Weapon {

    public IronSword() {
        this.name = "Iron Sword";
        this.type = "Sword";
        this.might = 5;
        this.accuracy = 90;
        this.critical = 0;
        this.range = new int[]{1,1};
        this.weight = 5;
        this.rank = 'E';
        this.uses = 40;
        this.cost = 520;
        this.additionalAbilities = new HashMap<>();
        this.description = "A standard sword made of iron, simple but effective.";
    }
}
