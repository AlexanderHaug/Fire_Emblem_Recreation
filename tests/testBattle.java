import Creatures.Creature;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;
import org.testng.annotations.Test;
import testSetUpMethods.createCreatureSetUp;

public class testBattle {
    @Test
    public void testHealing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord.csv","Ylisee");

        robin.getCreatureStats().setMagic(9);
        chrom.damageToHealth(49);

        Staff heal = new Staff("Staves/Heal.csv");
        robin.equipItem(heal);

        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getHealth() == 20;
    }

    @Test
    public void testCleansing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Cleric.csv", "Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord.csv", "Ylisee");

        robin.getCreatureStats().getSkillRanks().put("Staff", 'C');

        Staff restore = new Staff("Staves/Restore.csv");
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

        Weapon flux = new Weapon("Dark_Magics/Flux.csv");
        Weapon claws = new Weapon("Swords/Armorslayer.csv");

        robin.equipItem(flux);
        risen.equipItem(claws);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 50;
        assert risen.getCreatureStats().getHealth() >= 0;
    }

    @Test
    public void testWeaponTriangle() {
        Weapon trainingSword = new Weapon("Swords/Training_Sword.csv");
        Weapon trainingAxe = new Weapon("Axes/Training_Axe.csv");

        int[] results = Battle.weaponTriangleCalculator(trainingSword, trainingAxe);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = Battle.weaponTriangleCalculator(trainingAxe, trainingSword);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = Battle.weaponTriangleCalculator(trainingAxe, trainingAxe);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testNormalCollosseum() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord.csv","Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord.csv", "Monster");

        robin.getCreatureStats().getSkillRanks().put("Sword", 'C');
        risen.getCreatureStats().getSkillRanks().put("Sword", 'C');
        risen.getCreatureStats().setSkill(1);

        Weapon killingEdge = new Weapon("Swords/Killing_Edge.csv");
        Weapon claws = new Weapon("Swords/Armorslayer.csv");

        robin.equipItem(killingEdge);
        risen.equipItem(claws);

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getHealth() == 0;
    }
}