import Classes.UnitClass;
import Weapons.Weapon;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testBattle {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testHealing() {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Cleric.csv"), 1, 21, 80, 9, 45, 40, 40, 40, 40), "Ylisse");
        Creature chrom = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 1, 80, 80, 45, 40, 40, 40, 40), "Ylisse");

        robin.equipItem(new Weapons.Staff("Staves/Heal.csv"));

        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getHealth() == 20;
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Shaman.csv"), 1, 21, 80, 80, 45, 40, 40, 40, 40), "Ylisse");
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 0, 40, 0, 40, 20), "Monsters");

        Weapon flux = new Weapons.Weapon("Dark_Magics/Flux.csv");
        Weapon claws = new Weapons.Weapon("Swords/Armorslayer.csv");

        robin.equipItem(flux);
        risen.equipItem(claws);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 21;
        assert risen.getCreatureStats().getHealth() >= 0;
    }

    @Test
    public void testNormalCollosseum() {
        Creature robin = new Creature("Robin", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 45, 40, 40, 40, 40), "Ylisse");
        Creature risen = new Creature("Risen", new CreatureStats(new UnitClass(filePath.toString()+"/Classes/Lord.csv"), 1, 21, 80, 45, 0, 40, 40, 40, 40), "Monsters");

        Weapon killingEdge = new Weapons.Weapon("Swords/Killing_Edge.csv");
        Weapon claws = new Weapons.Weapon("Swords/Armorslayer.csv");

        robin.equipItem(killingEdge);
        risen.equipItem(claws);

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getHealth() == 0;
    }
}