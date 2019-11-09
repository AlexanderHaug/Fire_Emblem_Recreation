package testSetUpMethods;

import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;
import Items.Equippable.OffHand.Accessory;

import java.util.ArrayList;
import java.util.HashMap;

import static Items.Equippable.AccessoryGenerator.createAccessory;
import static Items.Equippable.StaffGenerator.createStaff;
import static Items.Equippable.WeaponGenerator.createWeapon;

public class EquippableItemTestMethods {
    public static void testWeapon(String name, String type, int might, int accuracy, int critical, int shortRange,
                                  int longRange, int weight, Character rank, int uses, int cost,
                                  HashMap<String, Integer> additionalAbilities, String description) {
        Weapon weapon = createWeapon(name);
        assert weapon.getName().equals(name);
        assert weapon.getType().equals(type);
        assert weapon.getMight() == might;
        assert weapon.getAccuracy() == accuracy;
        assert weapon.getCritical() == critical;
        assert weapon.shortRange() == shortRange;
        assert weapon.longRange() == longRange;
        assert weapon.getWeight() == weight;
        assert weapon.getRank().equals(rank);
        assert weapon.getUses() == uses;
        assert weapon.getCost() == cost;
        assert weapon.getAdditionalAbilities().equals(additionalAbilities);
        assert weapon.getDescription().equals(description);
    }

    public static void testStaff(String name, String assistType, String type,
                                 HashMap<String, Integer> additionalAbilities, int accuracy, int shortRange,
                                 int longRange, int weight, Character rank, int uses, String inflictedStatusEffect,
                                 String weaponDescription) {
        Staff staff = createStaff(name);
        assert staff.getName().equals(name);
        assert staff.getAssistType().equals(assistType);
        assert staff.getAdditionalAbilities().equals(additionalAbilities);
        assert staff.getType().equals(type);
        assert staff.getAccuracy() == accuracy;
        assert staff.shortRange() == shortRange;
        assert staff.longRange() == longRange;
        assert staff.getWeight() == weight;
        assert staff.getRank().equals(rank);
        assert staff.getUses() == uses;
        assert staff.getInflictedStatusEffect().equals(inflictedStatusEffect);
        assert staff.getDescription().equals(weaponDescription);
    }

    public static void testAccessory(String name, int protection, int weight,
                                     HashMap<String, Integer> additionalAbilities, ArrayList<String> nullifies,
                                     String description) {
        Accessory accessory = createAccessory(name);
        assert accessory.getName().equals(name);
        assert accessory.getProtection() == protection;
        assert accessory.getWeight() == weight;
        assert accessory.getAdditionalAbilities().equals(additionalAbilities);
        assert accessory.getNullifies().equals(nullifies);
        assert accessory.getDescription().equals(description);
    }
}
