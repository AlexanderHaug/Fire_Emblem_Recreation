import Battle.Battle;
import Battle.WeaponTriangle;
import Creatures.Creature.Creature;
import Items.Equippable.MainHand.Anima_Magics.Fire;
import Items.Equippable.MainHand.Anima_Magics.Wind;
import Items.Equippable.MainHand.Axes.TrainingAxe;
import Items.Equippable.MainHand.Dark_Magics.Flux;
import Items.Equippable.MainHand.Dark_Magics.Mire;
import Items.Equippable.MainHand.Light_Magics.Shine;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Staves.Heal;
import Items.Equippable.MainHand.Staves.Restore;
import Items.Equippable.MainHand.Swords.Armorslayer;
import Items.Equippable.MainHand.Swords.KillingEdge;
import Items.Equippable.MainHand.Swords.TrainingSword;
import Items.Equippable.MainHand.Weapon;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

public class testBattle {

    @Test
    public void testAttackTwice() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");
        robin.getCreatureStats().setSpeed(60);

        Weapon flux = new Flux();

        robin.equipItem(flux);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 40;
    }

    @Test
    public void testHealing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Lord","Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord","Ylisee");

        robin.getCreatureStats().setMagic(9);
        chrom.damageToHealth(49);

        Staff heal = new Heal();
        robin.equipItem(heal);

        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getCurrentHealth() == 20;
    }

    @Test
    public void testCleansing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord", "Ylisee");

        robin.getCreatureStats().getSkillRanks().put("Staff", 'C');

        Staff restore = new Restore();
        robin.equipItem(restore);

        chrom.getCreatureStats().setStatus("Poisoned");
        Battle.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getStatus().equals("Normal");
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        risen.getCreatureStats().getSkillRanks().put("Sword", 'C');

        Weapon flux = new Flux();
        Weapon claws = new Armorslayer();

        robin.equipItem(flux);
        risen.equipItem(claws);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() >= 0;
    }

    @Test
    public void testDebuffOpponentsStats() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        robin.getCreatureStats().getSkillRanks().put("Dark Magic", 'C');

        Weapon mire = new Mire();

        robin.equipItem(mire);

        Battle.runBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() >= 0;
        assert risen.getDefense() == 45;
    }

    @Test
    public void testWeaponTriangle() {
        Weapon trainingSword = new TrainingSword();
        Weapon trainingAxe = new TrainingAxe();

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
        Weapon fire = new Fire();
        Weapon shine = new Shine();

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
        Weapon fire = new Fire();
        Weapon wind = new Wind();

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

        Weapon killingEdge = new KillingEdge();
        Weapon claws = new Armorslayer();

        robin.equipItem(killingEdge);
        risen.equipItem(claws);

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() >= 0;
        assert risen.getCreatureStats().getCurrentHealth() == 0;
    }
}