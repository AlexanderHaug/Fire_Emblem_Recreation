package testSetUpMethods;

import Items.Equippable.MainHand.Anima_Magics.*;
import Items.Equippable.MainHand.Axes.*;
import Items.Equippable.MainHand.Dark_Magics.*;
import Items.Equippable.MainHand.Light_Magics.*;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Staves.*;
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
            case "Training Lance":
                return new TrainingLance();
            case "Iron Lance":
                return new IronLance();
            case "Steel Lance":
                return new SteelLance();
            case "Silver Lance":
                return new SilverLance();
            case "Brave Lance":
                return new BraveLance();
            case "Killer Lance":
                return new KillerLance();
            case "Heavy Spear":
                return new HeavySpear();
            case "Training Gauntlets":
                return new TrainingGauntlets();
            case "Iron Gauntlets":
                return new IronGauntlets();
            case "Steel Gauntlets":
                return new SteelGauntlets();
            case "Silver Gauntlets":
                return new SilverGauntlets();
            case "Aura Knuckles":
                return new AuraKnuckles();
            case "Killer Knuckles":
                return new KillerKnuckles();
            case "Dragon Claws":
                return new DragonClaws();
            case "Fire":
                return new Fire();
            case "Elfire":
                return new Elfire();
            case "Bolganone":
                return new Bolganone();
            case "Ragnarok":
                return new Ragnarok();
            case "Wind":
                return new Wind();
            case "Elwind":
                return new Elwind();
            case "Cutting Gale":
                return new CuttingGale();
            case "Excalibur":
                return new Excalibur();
            case "Thunder":
                return new Thunder();
            case "Elthunder":
                return new Elthunder();
            case "Thoron":
                return new Thoron();
            case "Bolting":
                return new Bolting();
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

    private static Staff createStaff(String staffName) {
        switch (staffName) {
            case "Heal":
                return new Heal();
            case "Restore":
                return new Restore();
            default:
                return null;
        }
    }
}
