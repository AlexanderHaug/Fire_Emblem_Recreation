import Classes.UnitClass;
import EquippableItems.OffItem;
import EquippableItems.PrimaryItem;
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

        robin.equipItem(new PrimaryItem("Staves/Heal.csv", true));

        assert robin.getCreatureStats().getLevel() == 1;
        assert robin.getCreatureStats().getHealth() == 21;
        assert robin.getCreatureStats().getStrength() == 80;
        assert robin.getCreatureStats().getMagic() == 9;
        assert robin.getCreatureStats().getSkill() == 45;
        assert robin.getCreatureStats().getLuck() == 40;
        assert robin.getCreatureStats().getSpeed() == 40;
        assert robin.getCreatureStats().getDefense() == 40;
        assert robin.getCreatureStats().getResistance() == 40;
        assert robin.getCreatureStats().getCharisma() == 40;
        assert robin.getMainItem().getName().equals("Heal");

    }

    @Test
    public void testLevelUp() {
        int[] robinStats = new int[]{1,10,10,10,10,10,10,10,10,10};
        int[] robinGrowthRates = new int[]{200,200,200,200,200,200,200,200,200};
        int[] robinStatCaps = new int[]{99,80,80,80,80,80,80,80,80,80};
        Character[] robinSkillRanks = new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E'};

        Creature robin = new Creature("Robin", new CreatureStats(
                new UnitClass(filePath.toString()+"/Classes/Cleric.csv"),
                robinStats, robinGrowthRates, robinStatCaps, robinSkillRanks), "Ylisse");

        robin.getCreatureStats().gainExperience(100);

        assert robin.getCreatureStats().getLevel() == 2;
        assert robin.getCreatureStats().getHealth() == 11;
        assert robin.getCreatureStats().getStrength() == 11;
        assert robin.getCreatureStats().getMagic() == 11;
        assert robin.getCreatureStats().getSkill() == 11;
        assert robin.getCreatureStats().getLuck() == 11;
        assert robin.getCreatureStats().getSpeed() == 11;
        assert robin.getCreatureStats().getDefense() == 11;
        assert robin.getCreatureStats().getResistance() == 11;
        assert robin.getCreatureStats().getCharisma() == 11;
    }

    @Test
    public void testLevelUpMaxStats() {
        int[] robinStats = new int[]{1,80,10,10,10,10,10,10,10,10};
        int[] robinGrowthRates = new int[]{200,200,200,200,200,200,200,200,200};
        int[] robinStatCaps = new int[]{99,80,80,80,80,80,80,80,80,80};
        Character[] robinSkillRanks = new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E'};

        Creature robin = new Creature("Robin", new CreatureStats(
                new UnitClass(filePath.toString()+"/Classes/Cleric.csv"),
                robinStats, robinGrowthRates, robinStatCaps, robinSkillRanks), "Ylisse");

        robin.getCreatureStats().gainExperience(100);

        assert robin.getCreatureStats().getLevel() == 2;
        assert robin.getCreatureStats().getHealth() == 80;
        assert robin.getCreatureStats().getStrength() == 11;
        assert robin.getCreatureStats().getMagic() == 11;
        assert robin.getCreatureStats().getSkill() == 11;
        assert robin.getCreatureStats().getLuck() == 11;
        assert robin.getCreatureStats().getSpeed() == 11;
        assert robin.getCreatureStats().getDefense() == 11;
        assert robin.getCreatureStats().getResistance() == 11;
        assert robin.getCreatureStats().getCharisma() == 11;
    }

    @Test
    public void testRaisingAndRevertStatsFromOffItem() {
        int[] robinStats = new int[]{1,80,10,10,10,10,10,10,10,10};
        int[] robinGrowthRates = new int[]{200,200,200,200,200,200,200,200,200};
        int[] robinStatCaps = new int[]{99,80,80,80,80,80,80,80,80,80};
        Character[] robinSkillRanks = new Character[]{'E','E','E','E','E','E','E','E','E','E','E','E'};

        Creature robin = new Creature("Robin", new CreatureStats(
                new UnitClass(filePath.toString()+"/Classes/Cleric.csv"),
                robinStats, robinGrowthRates, robinStatCaps, robinSkillRanks), "Ylisse");

        assert robin.getCreatureStats().getResistance() == 10;
        robin.equipItem(new OffItem("/Shields/Hexlock_Shield.csv"));
        assert robin.getCreatureStats().getResistance() == 14;
        robin.unequipOffItem();
        assert robin.getCreatureStats().getResistance() == 10;
    }
}
