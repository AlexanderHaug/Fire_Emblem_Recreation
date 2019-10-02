package Items.Equippable.MainHand;

import Items.Equippable.EquippableItem;

import java.util.ArrayList;

public abstract class PrimaryItem extends EquippableItem {
    private String itemType;
    private int accuracy = 0;
    private ArrayList<Integer> itemRange = new ArrayList<>();
    private Character itemRank;

    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}
    public void setItemRange(ArrayList<Integer> range) {this.itemRange = range;}
    public void setItemRank(Character rank) {this.itemRank = rank;}
    public void setItemType(String itemType) {this.itemType = itemType;}

    public int getAccuracy() {return accuracy;}
    public Character getItemRank() {return itemRank;}
    public String getItemType() {return itemType;}
    public ArrayList<Integer> getItemRange() {return itemRange;}

    public void setItemsRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.itemRange.add(Integer.parseInt(s));
        }
    }
}
