package Items.Equippable;

import Items.Equippable.OffHand.Accessory;
import Items.Equippable.OffHand.Shields.*;

public class AccessoryGenerator {

    public static Accessory createAccessory(String accessoryName) {
        switch (accessoryName) {
            case "Iron Shield":
                return new IronShield();
            case "Steel Shield":
                return new SteelShield();
            case "Silver Shield":
                return new SilverShield();
            case "Hexlock Shield":
                return new HexlockShield();
            case "Kadmos Shield":
                return new KadmosShield();
            default:
                return new LeatherShield();
        }
    }
}
