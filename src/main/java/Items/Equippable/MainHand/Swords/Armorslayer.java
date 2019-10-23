package Items.Equippable.MainHand.Swords;

import Items.Equippable.MainHand.Weapon;

public class Armorslayer extends Weapon {

    public Armorslayer() {
        setName("Armorslayer");
        setItemType("Sword");

        setMight(8);
        setAccuracy(80);
        setCritical(0);
        setItemsRange(new int[]{1,1});
        setItemWeight(11);
        setItemRank('D');

        setItemUses(20);
        setItemCost(1450);
        setItemIs("");

        setStatModifiers(new int[]{0,0,0,0,0,0,0,0,0});
        setEffectiveAgainst(new String[]{"Armored"});
        setItemDescription("Sharp enough to pierce even the thickest plate. This sword is effective against armored units.");
    }
}
