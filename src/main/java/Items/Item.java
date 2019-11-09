package Items;

public abstract class Item {
    protected String name;
    protected int uses = 0;
    protected int cost = 0;
    protected String description = "";

    public void setUses(int uses) {this.uses = uses;}

    public String getName() {return this.name;}
    public int getUses() {return this.uses;}
    public int getCost() {return this.cost;}
    public String getDescription() {return this.description;}
}
