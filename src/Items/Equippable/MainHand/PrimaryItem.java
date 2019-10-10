package Items.Equippable.MainHand;

import Items.Equippable.EquippableItem;

import java.util.ArrayList;

public abstract class PrimaryItem extends EquippableItem {
    private String itemType;
    private int accuracy = 0;
    private ArrayList<Integer> itemRange = new ArrayList<>();
    private Character itemRank;
    private ArrayList<String> itemIs = new ArrayList<>();
    private int[] tempDebuffOpponentStats = new int[8];

    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}
    public void setItemRank(Character rank) {this.itemRank = rank;}
    public void setItemType(String itemType) {this.itemType = itemType;}

    public void setTempDebuffOpponentStats(String debuffs) {
        String[] splt = debuffs.split(":");
        for (int x = 0; x < splt.length; x++) {
            if (x == 0) {}
            else
                this.tempDebuffOpponentStats[x-1] = (Integer.parseInt(splt[x]));
        }
    }

    public int getAccuracy() {return accuracy;}
    public Character getItemRank() {return itemRank;}
    public String getItemType() {return itemType;}
    public ArrayList<Integer> getItemRange() {return itemRange;}
    public int[] getTempDebuffOpponentStats() {return tempDebuffOpponentStats;}

    public void setItemsRange(String data) {
        String[] splt = data.split(":");
        for (String s : splt) {
            this.itemRange.add(Integer.parseInt(s));
        }
    }

    public void setItemIs(String data) {
        if (data.contains("Magic")) {this.itemIs.add("Magic");}
        if (data.contains("Brave")) {this.itemIs.add("Brave");}
        if (data.contains("Devil")) {this.itemIs.add("Devil");}
        if (data.contains("Poison")) {this.itemIs.add("Poison");}
        if (data.contains("Debuff")) {setTempDebuffOpponentStats(data);}
    }

    public boolean isItemBrave() {return itemIs.contains("Brave");}
    public boolean isItemDevil() {return itemIs.contains("Devil");}
    public boolean isItemPoison() {return itemIs.contains("Poison");}

    public boolean isItemMagic() {return itemIs.contains("Magic");}
}
