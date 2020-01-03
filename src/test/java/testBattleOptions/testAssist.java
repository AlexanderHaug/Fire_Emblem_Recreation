package testBattleOptions;

import Battle.Assist;
import Creatures.Creature.Creature;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

import static Items.Equippable.StaffGenerator.createStaff;

public class testAssist {

    @Test
    public void testHealing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Lord","Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord","Ylisee");

        robin.getCreatureStats().setMagic(9);
        chrom.damageToHealth(49);
        
        robin.equipItem(createStaff("Heal"));

        Assist.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getCurrentHealth() == 20;
    }

    @Test
    public void testCleansing() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin", "Lord", "Ylisee");
        Creature chrom = createCreatureSetUp.setUpCreature("Chrom", "Lord", "Ylisee");

        robin.getCreatureStats().getSkillRanks().put("Staff", 'C');

        robin.equipItem(createStaff("Restore"));

        chrom.getCreatureStats().setStatus("Poisoned");
        Assist.assist(robin, chrom, 1);
        assert chrom.getCreatureStats().getStatus().equals("Normal");
    }
}
