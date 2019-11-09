package Items.Equippable;

import Items.Item;

import java.util.HashMap;

public abstract class EquippableItem extends Item {
    protected int weight = 0;
    protected HashMap<String, Integer> additionalAbilities;

    public int getWeight() {return this.weight;}
    public HashMap<String, Integer> getAdditionalAbilities() {return this.additionalAbilities;}
}

