import EquippableItems.PrimaryItem;
import org.testng.annotations.Test;

public class testBattle {
    @Test
    public void testHealing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord.csv","Ylisee");

        robin.getCreatureStats().setMagic(9);
        chrom.damageToHealth(49);

        PrimaryItem heal = new PrimaryItem("Staves/Heal.csv", true);
        robin.equipItem(heal);

        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getHealth() == 20;
    }

    @Test
    public void testCleansing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Cleric.csv", "Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord.csv", "Ylisee");

        robin.getCreatureStats().getSkillRanks().put("Staff", 'C');

        PrimaryItem restore = new PrimaryItem("Staves/Restore.csv", true);
        robin.equipItem(restore);

        chrom.getCreatureStats().setStatus("Poison");
        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getStatus().equals("Normal");
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Shaman.csv", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord.csv", "Monster");

        risen.getCreatureStats().getSkillRanks().put("Sword", 'C');

        PrimaryItem flux = new PrimaryItem("Dark_Magics/Flux.csv", false);
        PrimaryItem claws = new PrimaryItem("Swords/Armorslayer.csv", false);

        robin.equipItem(flux);
        risen.equipItem(claws);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 50;
        assert risen.getCreatureStats().getHealth() >= 0;
    }

    @Test
    public void testWeaponTriangle() {
        PrimaryItem trainingSword = new PrimaryItem("Swords/Training_Sword.csv", false);
        PrimaryItem trainingAxe = new PrimaryItem("Axes/Training_Axe.csv", false);

        int[] results = Battle.weaponTriangleCalculator(trainingSword, trainingAxe);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;
    }

    @Test
    public void testNormalCollosseum() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord.csv","Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord.csv", "Monster");

        robin.getCreatureStats().getSkillRanks().put("Sword", 'C');
        risen.getCreatureStats().getSkillRanks().put("Sword", 'C');
        risen.getCreatureStats().setSkill(1);

        PrimaryItem killingEdge = new PrimaryItem("Swords/Killing_Edge.csv", false);
        PrimaryItem claws = new PrimaryItem("Swords/Armorslayer.csv", false);

        robin.equipItem(killingEdge);
        risen.equipItem(claws);

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getHealth() == 0;
    }
}