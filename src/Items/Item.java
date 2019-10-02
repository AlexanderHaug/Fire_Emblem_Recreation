package Items;

public abstract class Item {
    private String name;
    private int itemUses = 0;
    private int itemCost = 0;
    private String itemDescription = "";
    private boolean equippable = false;

    public void setName(String name) {this.name = name;}
    public void setItemUses(int uses) {this.itemUses = uses;}
    public void setItemCost(int cost) {this.itemCost = cost;}
    public void setItemDescription(String description) {this.itemDescription = description;}
    public void setEquippable(boolean isEquippable) {this.equippable = isEquippable;}

    public String getName() {return this.name;}
    public int getItemUses() {return this.itemUses;}
    public int getItemCost() {return this.itemCost;}
    public String getItemDescription() {return this.itemDescription;}
    public boolean isEquippable() {return this.equippable;}
}
