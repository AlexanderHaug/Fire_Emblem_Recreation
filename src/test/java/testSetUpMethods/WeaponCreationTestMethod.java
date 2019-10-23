package testSetUpMethods;

import Items.Equippable.MainHand.Anima_Magics.*;
import Items.Equippable.MainHand.Axes.*;
import Items.Equippable.MainHand.Dark_Magics.*;
import Items.Equippable.MainHand.Light_Magics.*;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Swords.*;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

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
        assert staff.getItemShortRange() == weaponShortRange;
        assert staff.getItemLongRange() == weaponLongRange;
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
            case "Brawl":
                return "Gauntlets";
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

    private static Weapon createWeapon(String weaponName) {
        switch (weaponName) {
            case "Training Sword":
                return new TrainingSword();
            case "Iron Sword":
                return new IronSword();
            case "Steel Sword":
                return new SteelSword();
            case "Silver Sword":
                return new SilverSword();
            case "Brave Sword":
                return new BraveSword();
            case "Killing Edge":
                return new KillingEdge();
            case "Armorslayer":
                return new Armorslayer();
            case "Training Axe":
                return new TrainingAxe();
            case "Iron Axe":
                return new IronAxe();
            case "Steel Axe":
                return new SteelAxe();
            case "Silver Axe":
                return new SilverAxe();
            case "Brave Axe":
                return new BraveAxe();
            case "Killer Axe":
                return new KillerAxe();
            case "Hammer":
                return new Hammer();
            case "Fire":
                return new Fire();
            case "Wind":
                return new Wind();
            case "Shine":
                return new Shine();
            case "Seraphim":
                return new Seraphim();
            case "Divine":
                return new Divine();
            case "Aura":
                return new Aura();
            case "Flux":
                return new Flux();
            case "Mire":
                return new Mire();
            default:
                return null;
        }
    }
}
