package testBattleOptions;

import Battle.Battle;
import Creatures.Creature.Creature;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Staves.Heal;
import Items.Equippable.MainHand.Staves.Restore;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

public class testAssist {

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
}
