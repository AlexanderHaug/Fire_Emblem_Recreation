package Items.Equippable.MainHand.Staves;

import Items.Equippable.MainHand.Staff;

public class Heal extends Staff {

    public Heal() {
        setName("Heal");
        setItemType("Staff");
        setAssistType("Healing");

        setHealAmount(10);
        setAccuracy(100);
        setItemsRange(new int[]{1,1});

        setItemWeight(4);
        setItemRank('E');
        setItemUses(20);

        setStaffStatusEffect("");
        setItemDescription("Heals an adjacent ally.");
    }
}
