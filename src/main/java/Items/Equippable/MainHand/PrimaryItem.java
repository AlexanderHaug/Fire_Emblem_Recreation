package Items.Equippable.MainHand;

import Items.Equippable.EquippableItem;

import java.util.HashMap;

public abstract class PrimaryItem extends EquippableItem {
    protected String type;
    protected int accuracy = 0;
    protected int[] range = new int[2];
    protected Character rank;

    public boolean isBrave() {return this.additionalAbilities.get("Brave") != null;}
    public boolean isDevil() {return this.additionalAbilities.get("Devil") != null;}
    public boolean isPoison() {return this.additionalAbilities.get("Poison") != null;}
    public boolean isMagic() {return this.additionalAbilities.get("Magic") != null;}
    public boolean isDebuff() {return this.additionalAbilities.get("Debuff") != null;}

    public int getAccuracy() {return accuracy;}
    public Character getRank() {return rank;}
    public String getType() {return type;}
    public int[] getRange() {return range;}
    public int shortRange() {return range[0];}
    public int longRange() {return range[1];}

    public int getDefense() {
        return this.additionalAbilities.get("PrimaryItem: Defense") != null ?
                this.additionalAbilities.get("PrimaryItem: Defense") : 0;
    }

    public int getResistance() {
        return this.additionalAbilities.get("PrimaryItem: Resistance") != null ?
                this.additionalAbilities.get("PrimaryItem: Resistance") : 0;
    }

    public HashMap<String, Integer> getDebuffs() {
        HashMap<String, Integer> debuffs = new HashMap<>();
        if (this.additionalAbilities.get("Temp Debuff: Def") != null) {
            debuffs.put("Temp Debuff: Def", this.additionalAbilities.get("Temp Debuff: Def"));
        }
        return debuffs;
    }
}
