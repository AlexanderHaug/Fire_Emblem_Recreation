package Items.Equippable.MainHand;

public abstract class Staff extends PrimaryItem {
    protected String assistType = "";
    protected String inflictedStatusEffect = "";

    public int getHealAmount() {
        return this.additionalAbilities.get("Heal Amount") != null ? this.additionalAbilities.get("Heal Amount") : 0;
    }

    public String getInflictedStatusEffect() {return inflictedStatusEffect;}

    public String getAssistType() {return assistType;}

    public String toString() {return this.getName() +  ", Accuracy " + this.getAccuracy();}
}
