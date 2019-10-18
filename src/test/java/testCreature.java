import Creatures.Creature;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.OffHand.Accessory;
import Items.Item;
import org.junit.Test;
import testSetUpMethods.createCreatureSetUp;

import java.util.ArrayList;

public class testCreature {

    @Test
    public void testCreatureCreation() {
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        robin.setAllStats(new int[]{1,21,80,9,45,40,40,40,40,40}, new int[]{99,80,80,80,80,80,80,80,80,80});
        robin.setGrowthRates(new int[]{100,60,50,70,80,20,30,10,5});

        robin.equipItem(new Staff("Staves/Heal.csv"));

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
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        robin.setAllStats(new int[]{1,10,10,10,10,10,10,10,10,10}, new int[]{99,80,80,80,80,80,80,80,80,80});
        robin.setGrowthRates(new int[]{200,200,200,200,200,200,200,200,200});

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
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        robin.setAllStats(new int[]{1,80,10,10,10,10,10,10,10,10}, new int[]{99,80,80,80,80,80,80,80,80,80});
        robin.setGrowthRates(new int[]{200,200,200,200,200,200,200,200,200});

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
        Creature robin = createCreatureSetUp.setUpCreature("Robin","Cleric.csv","Ylisee");
        robin.setAllStats(new int[]{1,80,10,10,10,10,10,10,10,10}, new int[]{99,80,80,80,80,80,80,80,80,80});

        assert robin.getCreatureStats().getResistance() == 10;
        robin.equipItem(new Accessory("Shields/Hexlock_Shield.csv"));
        assert robin.getCreatureStats().getResistance() == 14;
        robin.unequipOffItem();
        assert robin.getCreatureStats().getResistance() == 10;
    }

    @Test
    public void testMakingInventory() {

        ArrayList<Item> inventory = new ArrayList<>();

        Staff heal = new Staff("Staves/Heal.csv");
        Accessory hexlockShield = new Accessory("Shields/Hexlock_Shield.csv");

        inventory.add(heal);
        inventory.add(hexlockShield);

        Staff hal = (Staff)inventory.get(0);
        Accessory hex = (Accessory) inventory.get(1);

        assert hal.getName().equals("Heal");
        assert hex.getName().equals("Hexlock Shield");
    }

}
