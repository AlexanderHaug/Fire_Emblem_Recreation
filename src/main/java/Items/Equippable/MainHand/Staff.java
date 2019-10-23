package Items.Equippable.MainHand;

public abstract class Staff extends PrimaryItem {
    private int healAmount = 0;
    private String assistType = "";
    private String staffStatusEffect = "";

    public void setHealAmount(int heal) {this.healAmount = heal;}

    public void setAssistType(String data) {this.assistType = data;}

    public void setStaffStatusEffect(String data) {this.staffStatusEffect = data;}

    public int getHealAmount() {return healAmount;}

    public String getStaffStatusEffect() {return staffStatusEffect;}

    public String getAssistType() {return assistType;}

    public boolean getStaffIsMagic() {return true;}

    public String toString() {return this.getName() +  ", Accuracy " + this.getAccuracy();}
}
