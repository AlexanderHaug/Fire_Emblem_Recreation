package testAllCreatureClasses;

import Creatures.Creature;
import org.testng.annotations.Test;

import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.setUpCreature;

public class testArcherClasses {

    @Test
    public void testArcher() {
        Creature archer = setUpCreature("Robin","Archer/Archer.csv","Ylisee");
        assert Arrays.equals(archer.getCreatureStats().getUnitclass().getUnitClassGrowth(),
                new int[]{5,0,0,10,0,5,0,0,5});
    }


}
