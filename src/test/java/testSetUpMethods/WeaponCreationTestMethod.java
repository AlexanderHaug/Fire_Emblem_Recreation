package testSetUpMethods;

import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

import static Items.Equippable.StaffGenerator.createStaff;
import static Items.Equippable.WeaponGenerator.createWeapon;

public class WeaponCreationTestMethod {
    public static void createAndTestWeapon(String weaponName, String weaponType, int weaponMight,
                                           int weaponAccuracy, int weaponCritical, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, Character weaponRank, int weaponUses,
                                           int weaponCost, boolean weaponIsMagic,boolean weaponIsBrave,
                                           boolean weaponIsDevil, boolean weaponIsPoison,
                                           int[] otherStatIncreases, ArrayList<String> weaponEffectiveAgainst,
                                           String weaponDescription) {
        Weapon weapon = createWeapon(weaponName);
        assert weapon.getName().equals(weaponName);
        assert weapon.getItemType().equals(weaponType);
        assert weapon.getMight() == weaponMight;
        assert weapon.getAccuracy() == weaponAccuracy;
        assert weapon.getCritical() == weaponCritical;
        assert weapon.getItemShortRange() == weaponShortRange;
        assert weapon.getItemLongRange() == weaponLongRange;
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

    public static void createAndTestStaves(String staffName, String assistType, String itemType,
                                           int healAmount, int weaponAccuracy, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, Character weaponRank, int weaponUses,
                                           boolean weaponIsMagic, String staffStatusEffect,
                                           String weaponDescription) {
        Staff staff = createStaff(staffName);
        assert staff.getName().equals(staffName);
        assert staff.getAssistType().equals(assistType);
        assert staff.getHealAmount() == healAmount;
        assert staff.getItemType().equals(itemType);
        assert staff.getAccuracy() == weaponAccuracy;
        assert staff.getItemShortRange() == weaponShortRange;
        assert staff.getItemLongRange() == weaponLongRange;
        assert staff.getItemWeight() == weaponWeight;
        assert staff.getItemRank().equals(weaponRank);
        assert staff.getItemUses() == weaponUses;
        assert staff.getStaffIsMagic() == weaponIsMagic;
        assert staff.getStaffStatusEffect().equals(staffStatusEffect);
        assert staff.getItemDescription().equals(weaponDescription);
    }
}
