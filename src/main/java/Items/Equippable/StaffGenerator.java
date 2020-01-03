package Items.Equippable;

import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Staves.Heal;
import Items.Equippable.MainHand.Staves.Restore;

public class StaffGenerator {

    public static Staff createStaff(String staffName) {
        switch (staffName) {
            case "Restore":
                return new Restore();
            default:
                return new Heal();
        }
    }
}
