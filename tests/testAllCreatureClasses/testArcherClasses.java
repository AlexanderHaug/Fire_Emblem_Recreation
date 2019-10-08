package testAllCreatureClasses;

import Creatures.Creature;
import org.testng.annotations.Test;

import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.setUpCreature;
import static testSetUpMethods.createCreatureSetUp.getClassGrowthRates;

public class testArcherClasses {

    @Test
    public void testArcher() {
        Creature archer = setUpCreature("Robin","Archer.csv","Ylisee");
        assert Arrays.equals(getClassGrowthRates(archer), new int[]{5,0,0,10,0,5,0,0,5});
    }

    @Test
    public void testSniper() {
        Creature sniper = setUpCreature("Robin","Sniper.csv","Ylisee");
        assert Arrays.equals(getClassGrowthRates(sniper), new int[]{10,5,0,20,0,10,0,0,5});
    }
}
