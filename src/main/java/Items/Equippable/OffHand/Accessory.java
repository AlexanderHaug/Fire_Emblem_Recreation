package Items.Equippable.OffHand;

import Items.Equippable.EquippableItem;

import java.util.ArrayList;

public abstract class Accessory extends EquippableItem {
    private int itemProtection = 0;
    private int[] otherBattleIncreases = new int[5]; // +PhysAtk,MagAtk,Hit,Crit,Avoid
    private ArrayList<String> otherNullifyEffective = new ArrayList<>();

    public void setItemProtection(int amount) {this.itemProtection = amount;}

    public int getItemProtection() {return this.itemProtection;}
    public int[] getOtherBattleIncreases() {return this.otherBattleIncreases;}
    public ArrayList<String> getOtherNullifyEffective() {return this.otherNullifyEffective;}

    public void setOtherNullifyEffective(ArrayList<String> data) {this.otherNullifyEffective = data;}

    public void setOtherBattleIncreases(int[] data) {this.otherBattleIncreases = data;}
}
