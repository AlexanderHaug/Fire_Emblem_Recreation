import Battle.Battle;
import Battle.WeaponTriangle;
import Creatures.Creature;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

public class testBattle {

    @Test
    public void testAttackTwice() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Shaman", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");
        robin.getCreatureStats().increaseStats(new int[]{0,0,0,0,10,0,0,0});

        Weapon flux = new Weapon("Dark_Magics/Flux.csv");

        robin.equipItem(flux);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 50;
        assert risen.getCreatureStats().getHealth() == 40;
    }

    @Test
    public void testHealing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric","Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord","Ylisee");

        robin.getCreatureStats().setMagic(9);
        chrom.damageToHealth(49);

        Staff heal = new Staff("Staves/Heal.csv");
        robin.equipItem(heal);

        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getHealth() == 20;
    }

    @Test
    public void testCleansing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Cleric", "Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord", "Ylisee");

        robin.getCreatureStats().getSkillRanks().put("Staff", 'C');

        Staff restore = new Staff("Staves/Restore.csv");
        robin.equipItem(restore);

        chrom.getCreatureStats().setStatus("Poisoned");
        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getStatus().equals("Normal");
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Shaman", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

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
    public void testDebuffOpponentsStats() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Shaman", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        robin.getCreatureStats().getSkillRanks().put("Dark Magic", 'C');

        Weapon mire = new Weapon("Dark_Magics/Mire.csv");

        robin.equipItem(mire);

        Battle.runBattle(robin,risen, 2);
        assert robin.getCreatureStats().getHealth() == 50;
        assert risen.getCreatureStats().getHealth() >= 0;
        assert risen.getCreatureStats().getDefense() == 45;
    }

    @Test
    public void testWeaponTriangle() {
        Weapon trainingSword = new Weapon("Swords/Training_Sword.csv");
        Weapon trainingAxe = new Weapon("Axes/Training_Axe.csv");

        int[] results = WeaponTriangle.triangleCalculator(trainingSword, trainingAxe);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(trainingAxe, trainingSword);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(trainingAxe, trainingAxe);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testTrinityOfMagic() {
        Weapon fire = new Weapon("Anima_Magics/Fire.csv");
        Weapon shine = new Weapon("Light_Magics/Shine.csv");

        int[] results = WeaponTriangle.triangleCalculator(fire, shine);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(shine, fire);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(fire, fire);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testAnimaTriangle() {
        Weapon fire = new Weapon("Anima_Magics/Fire.csv");
        Weapon wind = new Weapon("Anima_Magics/Wind.csv");

        int[] results = WeaponTriangle.triangleCalculator(fire, wind);
        assert results[0] == 1;
        assert results[1] == 15;
        assert results[2] == -1;
        assert results[3] == -15;

        results = WeaponTriangle.triangleCalculator(wind, fire);
        assert results[0] == -1;
        assert results[1] == -15;
        assert results[2] == 1;
        assert results[3] == 15;

        results = WeaponTriangle.triangleCalculator(fire, fire);
        assert results[0] == 0;
        assert results[1] == 0;
        assert results[2] == 0;
        assert results[3] == 0;
    }

    @Test
    public void testNormalCollosseum() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord","Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

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