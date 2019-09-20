package testWeaponCreation;

import Weapons.Weapon;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;

class WeaponCreationTestMethod {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    public static void createAndTestWeapon(String weaponFile, String weaponName, String weaponType, int weaponMight,
                                           int weaponAccuracy, int weaponCritical, int weaponShortRange,
                                           int weaponLongRange, int weaponWeight, String weaponRank, int weaponUses,
                                           int weaponCost, boolean weaponIsMagic,boolean weaponIsBrave,
                                           boolean weaponIsDevil, boolean weaponIsPoison,
                                           Set weaponStatModifiersKeySet, ArrayList<String> weaponEffectiveAgainst,
                                           String weaponDescription) {
        Weapon weapon = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/" + weaponFile + ".csv");
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
        assert weapon.getWeaponIsMagic() == weaponIsMagic;
        assert weapon.getIsWeaponIsBrave() == weaponIsBrave;
        assert weapon.getIsWeaponIsDevil() == weaponIsDevil;
        assert weapon.getIsWeaponIsPoison() == weaponIsPoison;
        assert weapon.getWeaponStatModifiers().keySet().equals(weaponStatModifiersKeySet);
        assert weapon.getEffectiveAgainst().equals(weaponEffectiveAgainst);
        assert weapon.getDescription().equals(weaponDescription);
    }
}
