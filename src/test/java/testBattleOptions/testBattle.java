package testBattleOptions;

import Battle.Battle;
import Creatures.Creature.Creature;
import Items.Equippable.MainHand.Dark_Magics.Flux;
import Items.Equippable.MainHand.Dark_Magics.Mire;
import Items.Equippable.MainHand.Swords.Armorslayer;
import Items.Equippable.MainHand.Swords.KillingEdge;
import Items.Equippable.MainHand.Weapon;
import Items.Equippable.OffHand.Shields.KadmosShield;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

public class testBattle {

    @Test
    public void testBattleAgainstOpposingArmies() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        Weapon flux = new Flux();

        robin.equipItem(flux);
        risen.equipItem(flux);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 45;
        assert risen.getCreatureStats().getCurrentHealth() == 45;
    }

    @Test
    public void testBattleAgainstSameArmies() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Ylisee");

        Weapon flux = new Flux();

        robin.equipItem(flux);
        risen.equipItem(flux);

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 50;
    }

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
    public void testEffectiveAgainst() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Knight", "Monster");
        robin.getCreatureStats().getSkillRanks().put("Sword", 'A');

        robin.equipItem(new Armorslayer());

        Battle.doBattle(robin, risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 26;
    }

    @Test
    public void testNullifyEffectiveAgainst() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Knight", "Monster");
        robin.getCreatureStats().getSkillRanks().put("Sword", 'A');

        robin.equipItem(new Armorslayer());
        risen.equipItem(new KadmosShield());

        Battle.doBattle(robin, risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 45;
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