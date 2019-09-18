import Classes.UnitClass;
import Weapons.Weapon;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class testGenerator {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testCreateAllSwords() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Bronze_Sword.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Iron_Sword.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Steel_Sword.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Silver_Sword.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Brave_Sword.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Killing_Edge.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Armorslayer.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Runesword.csv"));
        for (Weapon weapon : weapons) {
            assert weapon.getName() != null;
        }
    }

    @Test
    public void testCreateAllAxes() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Bronze_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Iron_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Steel_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Silver_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Brave_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Killer_Axe.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Hammer.csv"));
        weapons.add(new Weapons.Weapon(filePath.toString()+"/Weapons/Axes/Bolt_Axe.csv"));
        for (Weapon weapon : weapons) {
            assert weapon.getName() != null;
        }
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Shaman.csv"), 1, 21, 80, 80, 45, 40, 40, 40, 40));
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 0, 40, 0, 40, 20));

        Weapon flux = new Weapons.Weapon(filePath.toString()+"/Weapons/Dark_Magics/Flux.csv");
        Weapon claws = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Armorslayer.csv");

        robin.equipWeapon(flux);
        risen.equipWeapon(claws);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 21;
        assert risen.getCreatureStats().getHealth() >= 0;
    }

    @Test
    public void testNormalCollosseum() {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 45, 40, 40, 40, 40));
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 0, 40, 40, 40, 40));

        Weapon killingEdge = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Killing_Edge.csv");
        Weapon claws = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Armorslayer.csv");

        robin.equipWeapon(killingEdge);
        risen.equipWeapon(claws);

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getHealth() == 0;
    }
}