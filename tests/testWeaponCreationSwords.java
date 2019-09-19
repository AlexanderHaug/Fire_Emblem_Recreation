import Weapons.Weapon;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testWeaponCreationSwords {
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
        assert weapon.getWeaponCost() == 230;
        assert !weapon.getWeaponIsMagic();
        assert !weapon.getIsWeaponIsBrave();
        assert !weapon.getIsWeaponIsDevil();
        assert !weapon.getIsWeaponIsPoison();
        assert weapon.getWeaponStatModifiers().isEmpty();
        assert weapon.getEffectiveAgainst().isEmpty();
        assert weapon.getDescription().equals("This simple sword is perfect for training purposes. But cannot inflict critical hits.");
    }
}
