package Items.Equippable;

import Items.Item;

public abstract class EquippableItem extends Item {
    private boolean isAccessory;
    private int itemWeight = 0;
    private int[] otherStatIncreases = new int[9]; // Hp,Str,Mag,Skill,Luck,Spd,Def,Res,Charm

    public void setIsAccessory(boolean itemType) {this.isAccessory = itemType;}
    public void setItemWeight(int itemWeight) {this.itemWeight = itemWeight;}

    public boolean isAccessory() {return isAccessory;}
    public int getItemWeight() {return itemWeight;}
    public int[] getOtherStatIncreases() {return this.otherStatIncreases;}

    public void setStatModifiers(int[] data) {this.otherStatIncreases = data;}
}

