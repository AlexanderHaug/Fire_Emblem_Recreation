package Items.Equippable.MainHand;

import java.util.ArrayList;

public abstract class Weapon extends PrimaryItem {
    protected int might = 0;
    protected int critical = 0;

    public int getMight() {return this.might;}

    public int getCritical() {return this.critical;}

    public ArrayList<String> getEffectiveAgainst() {
        ArrayList<String> effectiveAgainst = new ArrayList<>();
        if (this.additionalAbilities.get("Effective: Infantry") != null) {effectiveAgainst.add("Infantry");}
        if (this.additionalAbilities.get("Effective: Armored") != null) {effectiveAgainst.add("Armored");}
        if (this.additionalAbilities.get("Effective: Flying") != null) {effectiveAgainst.add("Flying");}
        if (this.additionalAbilities.get("Effective: Calvary") != null) {effectiveAgainst.add("Calvary");}
        if (this.additionalAbilities.get("Effective: Dragon") != null) {effectiveAgainst.add("Dragon");}
        if (this.additionalAbilities.get("Effective: Monster") != null) {effectiveAgainst.add("Monster");}
        return effectiveAgainst;
    }
}
