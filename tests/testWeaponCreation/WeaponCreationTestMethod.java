package testWeaponCreation;

import Weapons.Staff;
import Weapons.Weapon;

import java.util.ArrayList;
import java.util.Set;

class WeaponCreationTestMethod {
    public static void createAndTestWeapon(String weaponFile, String weaponName, String weaponType, int weaponMight,
                                           int weaponAccuracy, int weaponCritical, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, String weaponRank, int weaponUses,
                                           int weaponCost, boolean weaponIsMagic,boolean weaponIsBrave,
                                           boolean weaponIsDevil, boolean weaponIsPoison,
                                           Set weaponStatModifiersKeySet, ArrayList<String> weaponEffectiveAgainst,
                                           String weaponDescription) {
        Weapon weapon = new Weapons.Weapon(determineWeaponFileLocation(weaponType)+ "/" +
                                            weaponFile + ".csv");
        assert weapon.getName().equals(weaponName);
        assert weapon.getWeaponType().equals(weaponType);
        assert weapon.getMight() == weaponMight;
        assert weapon.getAccuracy() == weaponAccuracy;
        assert weapon.getCritical() == weaponCritical;
        assert weapon.getAttackRange().get(0) == weaponShortRange;
        assert weapon.getAttackRange().get(1) == weaponLongRange;
        assert weapon.getWeaponWeight() == weaponWeight;
        assert weapon.getWeaponRank().equals(weaponRank);
        assert weapon.getWeaponUses() == weaponUses;
        assert weapon.getWeaponCost() == weaponCost;
        assert weapon.isWeaponMagic() == weaponIsMagic;
        assert weapon.isWeaponBrave() == weaponIsBrave;
        assert weapon.isWeaponDevil() == weaponIsDevil;
        assert weapon.isWeaponPoison() == weaponIsPoison;
        assert weapon.getWeaponStatModifiers().keySet().equals(weaponStatModifiersKeySet);
        assert weapon.getEffectiveAgainst().equals(weaponEffectiveAgainst);
        assert weapon.getDescription().equals(weaponDescription);
    }

    public static void createAndTestStaves(String weaponFile, String assistType, String weaponName, String weaponType, int healAmount,
                                           int weaponAccuracy, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, String weaponRank, int weaponUses,
                                           boolean weaponIsMagic, String staffStatusEffect,
                                           String weaponDescription) {
        Staff staff = new Weapons.Staff(determineWeaponFileLocation(weaponType)+ "/" +
                weaponFile + ".csv");
        assert staff.getName().equals(weaponName);
        assert staff.getAssistType().equals(assistType);
        assert staff.getHealAmount() == healAmount;
        assert staff.getWeaponType().equals(weaponType);
        assert staff.getAccuracy() == weaponAccuracy;
        assert staff.getStaffRange().get(0) == weaponShortRange;
        assert staff.getStaffRange().get(1) == weaponLongRange;
        assert staff.getWeaponWeight() == weaponWeight;
        assert staff.getWeaponRank().equals(weaponRank);
        assert staff.getWeaponUses() == weaponUses;
        assert staff.isWeaponMagic() == weaponIsMagic;
        assert staff.getStaffStatusEffect().equals(staffStatusEffect);
        assert staff.getDescription().equals(weaponDescription);
    }

    private static String determineWeaponFileLocation(String weaponType) {
        switch (weaponType) {
            case "Sword":
                return "Swords";
            case "Staff":
                return "Staves";
            case "Dark Magic":
                return "Dark_Magics";
            default:
                return "Axes";
        }
    }
}
