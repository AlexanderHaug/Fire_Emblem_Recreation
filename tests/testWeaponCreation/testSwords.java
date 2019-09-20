package testWeaponCreation;

import Weapons.Weapon;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testSwords {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testCreateTrainingSword() {
        Weapon weapon = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Training_Sword.csv");
        assert weapon.getName().equals("Training Sword");
        assert weapon.getWeaponType().equals("Sword");
        assert weapon.getMight() == 3;
        assert weapon.getAccuracy() == 100;
        assert weapon.getCritical() == 0;
        assert weapon.getAttackRange().get(0) == 1;
        assert weapon.getAttackRange().get(1) == 1;
        assert weapon.getWeaponWeight() == 4;
        assert weapon.getWeaponRank().equals("E");
        assert weapon.getWeaponUses() == 50;
        assert weapon.getWeaponCost() == 260;
        assert !weapon.getWeaponIsMagic();
        assert !weapon.getIsWeaponIsBrave();
        assert !weapon.getIsWeaponIsDevil();
        assert !weapon.getIsWeaponIsPoison();
        assert weapon.getWeaponStatModifiers().isEmpty();
        assert weapon.getEffectiveAgainst().isEmpty();
        assert weapon.getDescription().equals("This simple sword is perfect for training purposes. But cannot inflict critical hits.");
    }

    @Test
    public void testCreateIronSword() {
        Weapon weapon = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Iron_Sword.csv");
        assert weapon.getName().equals("Iron Sword");
        assert weapon.getWeaponType().equals("Sword");
        assert weapon.getMight() == 5;
        assert weapon.getAccuracy() == 90;
        assert weapon.getCritical() == 0;
        assert weapon.getAttackRange().get(0) == 1;
        assert weapon.getAttackRange().get(1) == 1;
        assert weapon.getWeaponWeight() == 5;
        assert weapon.getWeaponRank().equals("E");
        assert weapon.getWeaponUses() == 40;
        assert weapon.getWeaponCost() == 520;
        assert !weapon.getWeaponIsMagic();
        assert !weapon.getIsWeaponIsBrave();
        assert !weapon.getIsWeaponIsDevil();
        assert !weapon.getIsWeaponIsPoison();
        assert weapon.getWeaponStatModifiers().isEmpty();
        assert weapon.getEffectiveAgainst().isEmpty();
        assert weapon.getDescription().equals("A standard sword made of iron simple but effective.");
    }

    @Test
    public void testCreateSteelSword() {
        Weapon weapon = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Steel_Sword.csv");
        assert weapon.getName().equals("Steel Sword");
        assert weapon.getWeaponType().equals("Sword");
        assert weapon.getMight() == 8;
        assert weapon.getAccuracy() == 85;
        assert weapon.getCritical() == 0;
        assert weapon.getAttackRange().get(0) == 1;
        assert weapon.getAttackRange().get(1) == 1;
        assert weapon.getWeaponWeight() == 10;
        assert weapon.getWeaponRank().equals("D");
        assert weapon.getWeaponUses() == 50;
        assert weapon.getWeaponCost() == 910;
        assert !weapon.getWeaponIsMagic();
        assert !weapon.getIsWeaponIsBrave();
        assert !weapon.getIsWeaponIsDevil();
        assert !weapon.getIsWeaponIsPoison();
        assert weapon.getWeaponStatModifiers().isEmpty();
        assert weapon.getEffectiveAgainst().isEmpty();
        assert weapon.getDescription().equals("A weighty steel sword that deals significant blows.");
    }

    @Test
    public void testCreateSilverSword() {
        Weapon weapon = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Silver_Sword.csv");
        assert weapon.getName().equals("Silver Sword");
        assert weapon.getWeaponType().equals("Sword");
        assert weapon.getMight() == 12;
        assert weapon.getAccuracy() == 90;
        assert weapon.getCritical() == 0;
        assert weapon.getAttackRange().get(0) == 1;
        assert weapon.getAttackRange().get(1) == 1;
        assert weapon.getWeaponWeight() == 8;
        assert weapon.getWeaponRank().equals("B");
        assert weapon.getWeaponUses() == 30;
        assert weapon.getWeaponCost() == 1410;
        assert !weapon.getWeaponIsMagic();
        assert !weapon.getIsWeaponIsBrave();
        assert !weapon.getIsWeaponIsDevil();
        assert !weapon.getIsWeaponIsPoison();
        assert weapon.getWeaponStatModifiers().isEmpty();
        assert weapon.getEffectiveAgainst().isEmpty();
        assert weapon.getDescription().equals("A sword crafted from shining silver.");
    }
}
