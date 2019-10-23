package Items.Equippable.MainHand;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Weapon extends PrimaryItem {
    private int might = 0;
    private int critical = 0;
    private ArrayList<String> effectiveAgainst = new ArrayList<>();

    public int getMight() {return this.might;}

    public int getCritical() {return this.critical;}

    public void setMight(int might) {this.might = might;}

    public void setCritical(int crit) {this.critical = crit;}

    public void setEffectiveAgainst(String[] data) {Collections.addAll(this.effectiveAgainst, data);}

    public ArrayList<String> getEffectiveAgainst() {return effectiveAgainst;}
}
