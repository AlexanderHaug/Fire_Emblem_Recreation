import Classes.UnitClass;
import Weapons.Weapon;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Generator {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src/Classes/Lord.csv");

    public static void main(String[] args) {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()), 1, 21, 80, 45, 45, 40, 40, 40, 40));
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()), 1, 21, 80, 45, 45, 40, 40, 40, 40));

        Weapon killingEdge = new Weapons.Swords.KillingEdgeSword();
        Weapon claws = new Weapons.Swords.RuneSword();

        robin.equipWeapon(killingEdge);
        risen.equipWeapon(claws);

        System.out.println(robin);
        System.out.println(risen);

        Battle battle = new Battle();

        battle.fightInColosseum(robin, risen);
        
    }
}
