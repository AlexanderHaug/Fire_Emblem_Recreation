package Items.Equippable.OffHand;

import Items.Equippable.EquippableItem;

import java.util.ArrayList;

public abstract class Accessory extends EquippableItem {
    protected int protection = 0;

    public int getProtection() {return this.protection;}

    public int getAccessoryResilience() {
        return this.additionalAbilities.get("Accessory: Resilience") != null ?
                this.additionalAbilities.get("Accessory: Resilience") : 0;
    }

    public int getAccessorySpeed() {
        return this.additionalAbilities.get("Accessory: Speed") != null ?
                this.additionalAbilities.get("Accessory: Speed") : 0;
    }

    public int getAccessoryLuck() {
        return this.additionalAbilities.get("Accessory: Luck") != null ?
                this.additionalAbilities.get("Accessory: Luck") : 0;
    }

    public int getAccessoryCharm() {
        return this.additionalAbilities.get("Accessory: Charm") != null ?
                this.additionalAbilities.get("Accessory: Charm") : 0;
    }

    public int getAccessoryMagicAttack() {
        return this.additionalAbilities.get("Accessory: Magic Attack") != null ?
                this.additionalAbilities.get("Accessory: Magic Attack") : 0;
    }

    public int getAccessoryMagicRange() {
        return this.additionalAbilities.get("Accessory: Magic Range") != null ?
                this.additionalAbilities.get("Accessory: Magic Range") : 0;
    }

    public int getAccessoryHit() {
        return this.additionalAbilities.get("Accessory: Hit") != null ?
                this.additionalAbilities.get("Accessory: Hit") : 0;
    }

    public int getAccessoryCritical() {
        return this.additionalAbilities.get("Accessory: Critical") != null ?
                this.additionalAbilities.get("Accessory: Critical") : 0;
    }

    public int getAccessoryAvoid() {
        return this.additionalAbilities.get("Accessory: Avoid") != null ?
                this.additionalAbilities.get("Accessory: Avoid") : 0;
    }

    public ArrayList<String> getNullifies() {
        ArrayList<String> nullify = new ArrayList<>();
        if (this.additionalAbilities.get("Nullify: Infantry") != null) {nullify.add("Infantry");}
        if (this.additionalAbilities.get("Nullify: Armored") != null) {nullify.add("Armored");}
        if (this.additionalAbilities.get("Nullify: Flying") != null) {nullify.add("Flying");}
        if (this.additionalAbilities.get("Nullify: Calvary") != null) {nullify.add("Calvary");}
        if (this.additionalAbilities.get("Nullify: Dragon") != null) {nullify.add("Dragon");}
        if (this.additionalAbilities.get("Nullify: Monster") != null) {nullify.add("Monster");}
        return nullify;
    }
}
