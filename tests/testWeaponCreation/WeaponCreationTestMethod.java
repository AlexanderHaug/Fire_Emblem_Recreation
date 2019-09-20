package testWeaponCreation;

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

    private static String determineWeaponFileLocation(String weaponType) {
        if (weaponType.equals("Sword")) {return "Swords";}
        else if (weaponType.equals("Dark Magic")) {return "Dark_Magics";}
        else {return "Axes";}
    }
}
