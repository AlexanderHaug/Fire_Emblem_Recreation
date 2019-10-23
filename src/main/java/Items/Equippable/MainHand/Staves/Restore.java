package Items.Equippable.MainHand.Staves;

import Items.Equippable.MainHand.Staff;

public class Restore extends Staff {

    public Restore() {
        setName("Restore");
        setItemType("Staff");
        setAssistType("Cleansing");

        setHealAmount(0);
        setAccuracy(100);
        setItemsRange(new int[]{1,1});

        setItemWeight(4);
        setItemRank('C');
        setItemUses(5);

        setStaffStatusEffect("");
        setItemDescription("Cures status effects.");
    }
}
