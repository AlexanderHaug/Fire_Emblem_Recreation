package testBattleOptions;

import Battle.Battle;
import Creatures.Creature.Creature;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

import static Items.Equippable.AccessoryGenerator.createAccessory;
import static Items.Equippable.WeaponGenerator.createWeapon;

public class testBattle {

    @Test
    public void testBattleAgainstOpposingArmies() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        robin.equipItem(createWeapon("Flux"));
        risen.equipItem(createWeapon("Flux"));

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 45;
        assert risen.getCreatureStats().getCurrentHealth() == 45;
    }

    @Test
    public void testBattleAgainstSameArmies() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Ylisee");

        robin.equipItem(createWeapon("Flux"));
        risen.equipItem(createWeapon("Flux"));

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 50;
    }

    @Test
    public void testAttackTwice() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");
        robin.getCreatureStats().setSpeed(60);

        robin.equipItem(createWeapon("Flux"));

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 40;
    }

    @Test
    public void testEffectiveAgainst() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Knight", "Monster");
        robin.getCreatureStats().getSkillRanks().put("Sword", 'A');

        robin.equipItem(createWeapon("Armorslayer"));

        Battle.doBattle(robin, risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 26;
    }

    @Test
    public void testNullifyEffectiveAgainst() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Knight", "Monster");
        robin.getCreatureStats().getSkillRanks().put("Sword", 'A');

        robin.equipItem(createWeapon("Armorslayer"));
        risen.equipItem(createAccessory("Kadmos Shield"));

        Battle.doBattle(robin, risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() == 45;
    }

    @Test
    public void testBattleWithRangeCannotCounterAttack() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        risen.getCreatureStats().getSkillRanks().put("Sword", 'C');

        robin.equipItem(createWeapon("Flux"));
        risen.equipItem(createWeapon("Armorslayer"));

        Battle.doBattle(robin,risen, 2);
        assert robin.getCreatureStats().getCurrentHealth() == 50;
        assert risen.getCreatureStats().getCurrentHealth() >= 0;
    }

    @Test
    public void testDebuffOpponentsStats() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature risen = createCreatureSetUp.setUpCreature("Risen", "Lord", "Monster");

        robin.getCreatureStats().getSkillRanks().put("Dark Magic", 'C');

        robin.equipItem(createWeapon("Mire"));

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

        robin.equipItem(createWeapon("Killing Edge"));
        risen.equipItem(createWeapon("Armorslayer"));

        Battle.fightInColosseum(robin,risen, 1);
        assert robin.getCreatureStats().getCurrentHealth() >= 0;
        assert risen.getCreatureStats().getCurrentHealth() == 0;
    }
}