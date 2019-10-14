package testSetUpMethods;

import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class WeaponCreationTestMethod {
    public static void createAndTestWeapon(String weaponFile, String weaponName, String weaponType, int weaponMight,
                                           int weaponAccuracy, int weaponCritical, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, Character weaponRank, int weaponUses,
                                           int weaponCost, boolean weaponIsMagic,boolean weaponIsBrave,
                                           boolean weaponIsDevil, boolean weaponIsPoison,
                                           int[] otherStatIncreases, ArrayList<String> weaponEffectiveAgainst,
                                           String weaponDescription) {
        Weapon weapon = new Weapon(determineWeaponFileLocation(weaponType) + "/" + weaponFile + ".csv");
        assert weapon.getName().equals(weaponName);
        assert weapon.getItemType().equals(weaponType);
        assert weapon.getMight() == weaponMight;
        assert weapon.getAccuracy() == weaponAccuracy;
        assert weapon.getCritical() == weaponCritical;
        assert weapon.getItemRange().get(0) == weaponShortRange;
        assert weapon.getItemRange().get(1) == weaponLongRange;
        assert weapon.getItemWeight() == weaponWeight;
        assert weapon.getItemRank().equals(weaponRank);
        assert weapon.getItemUses() == weaponUses;
        assert weapon.getItemCost() == weaponCost;
        assert weapon.isItemMagic() == weaponIsMagic;
        assert weapon.isItemBrave() == weaponIsBrave;
        assert weapon.isItemDevil() == weaponIsDevil;
        assert weapon.isItemPoison() == weaponIsPoison;
        assert Arrays.equals(weapon.getOtherStatIncreases(),otherStatIncreases);
        assert weapon.getEffectiveAgainst().equals(weaponEffectiveAgainst);
        assert weapon.getItemDescription().equals(weaponDescription);
    }

    public static void createAndTestStaves(String weaponFile, String assistType, String weaponName, String weaponType,
                                           int healAmount, int weaponAccuracy, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, Character weaponRank, int weaponUses,
                                           boolean weaponIsMagic, String staffStatusEffect,
                                           String weaponDescription) {
        Staff staff = new Staff(determineWeaponFileLocation(weaponType)+ "/" + weaponFile + ".csv");
        assert staff.getName().equals(weaponName);
        assert staff.getAssistType().equals(assistType);
        assert staff.getHealAmount() == healAmount;
        assert staff.getItemType().equals(weaponType);
        assert staff.getAccuracy() == weaponAccuracy;
        assert staff.getItemRange().get(0) == weaponShortRange;
        assert staff.getItemRange().get(1) == weaponLongRange;
        assert staff.getItemWeight() == weaponWeight;
        assert staff.getItemRank().equals(weaponRank);
        assert staff.getItemUses() == weaponUses;
        assert staff.getStaffIsMagic() == weaponIsMagic;
        assert staff.getStaffStatusEffect().equals(staffStatusEffect);
        assert staff.getItemDescription().equals(weaponDescription);
    }

    private static String determineWeaponFileLocation(String weaponType) {
        switch (weaponType) {
            case "Sword":
                return "Swords";
            case "Axe":
                return "Axes";
            case "Lance":
                return "Lances";
            case "Staff":
                return "Staves";
            case "Light Magic":
                return "Light_Magics";
            case "Dark Magic":
                return "Dark_Magics";
            default:
                return "Anima_Magics";
        }
    }
}
