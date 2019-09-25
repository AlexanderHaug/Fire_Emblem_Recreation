import Classes.UnitClass;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class testCreature {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testCreatureCreation() {
        int[] robinStats = new int[]{1,21,80,9,45,40,40,40,40,40};
        int[] robinGrowthRates = new int[]{100,60,50,70,80,20,30,10,5};
        int[] robinStatCaps = new int[]{99,80,80,80,80,80,80,80,80,80};
        Character[] robinSkillRanks = new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E'};

        Creature robin = new Creature("Robin", new CreatureStats(
                new UnitClass(filePath.toString()+"/Classes/Cleric.csv"),
                robinStats, robinGrowthRates, robinStatCaps, robinSkillRanks), "Ylisse");

        robin.equipItem(new Weapons.MainItem("Staves/Heal.csv"));

    }
}
