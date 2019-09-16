import Classes.UnitClass;
import Weapons.Weapon;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testGenerator {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testNormalCollosseum() {
        System.out.println(filePath);
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 45, 40, 40, 40, 40));
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 0, 40, 40, 40, 40));

        Weapon killingEdge = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Killing_Edge.csv");
        Weapon claws = new Weapons.Weapon(filePath.toString()+"/Weapons/Swords/Armorslayer.csv");

        robin.equipWeapon(killingEdge);
        risen.equipWeapon(claws);

        Battle.fightInColosseum(robin, risen);
        assert robin.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getHealth() == 0;
    }
}