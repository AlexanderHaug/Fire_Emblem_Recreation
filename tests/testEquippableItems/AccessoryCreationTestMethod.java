package testEquippableItems;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;
import java.util.Arrays;

public class AccessoryCreationTestMethod {
    public static void createAndTestAccessory(String accessoryFile, String accessoryName, String accessoryType,
                                           int accessoryProtection, int accessoryWeight, int[] otherStat,
                                           int[] otherBattle, ArrayList<String> otherNull, String weaponDescription) {
        Accessory accessory = new Accessory(determineAccessoryFileLocation(accessoryType) +
                "/" + accessoryFile + ".csv");
        assert accessory.getName().equals(accessoryName);
        assert accessory.getItemProtection() == accessoryProtection;
        assert accessory.getItemWeight() == accessoryWeight;
        assert Arrays.equals(accessory.getOtherStatIncreases(), otherStat);
        assert Arrays.equals(accessory.getOtherBattleIncreases(), otherBattle);
        assert accessory.getOtherNullifyEffective().equals(otherNull);
        assert accessory.getItemDescription().equals(weaponDescription);
    }

    private static String determineAccessoryFileLocation(String accessoryType) {
        switch (accessoryType) {
            case "Shield":
                return "Shields";
            case "Ring":
                return "Rings";
            case "Staff":
                return "Staves";
            default:
                return "Gems";
        }
    }
}
