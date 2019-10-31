package testSetUpMethods;

import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;
import java.util.Arrays;

import static Items.Equippable.AccessoryGenerator.createAccessory;

public class AccessoryCreationTestMethod {
    public static void createAndTestAccessory(String accessoryName, String accessoryType,
                                           int accessoryProtection, int accessoryWeight, int[] otherStat,
                                           int[] otherBattle, ArrayList<String> otherNull, String weaponDescription) {
        Accessory accessory = createAccessory(accessoryName);
        assert accessory.getName().equals(accessoryName);
        assert accessory.getItemProtection() == accessoryProtection;
        assert accessory.getItemWeight() == accessoryWeight;
        assert Arrays.equals(accessory.getOtherStatIncreases(), otherStat);
        assert Arrays.equals(accessory.getOtherBattleIncreases(), otherBattle);
        assert accessory.getOtherNullifyEffective().equals(otherNull);
        assert accessory.getItemDescription().equals(weaponDescription);
    }
}
