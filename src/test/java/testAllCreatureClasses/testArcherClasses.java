package testAllCreatureClasses;

import Creatures.Creature;
import org.junit.Test;
import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.setUpCreature;
import static testSetUpMethods.createCreatureSetUp.getClassGrowthRates;

public class testArcherClasses {

    @Test
    public void testArcher() {
        Creature archer = setUpCreature("Robin","Archer","Ylisee");
        assert Arrays.equals(getClassGrowthRates(archer), new int[]{5,0,0,10,0,5,0,0,5});
    }

    @Test
    public void testSniper() {
        Creature sniper = setUpCreature("Robin","Sniper","Ylisee");
        assert Arrays.equals(getClassGrowthRates(sniper), new int[]{10,5,0,20,0,10,0,0,5});
    }

    @Test
    public void testRanger() {
        Creature ranger = setUpCreature("Robin","Ranger","Ylisee");
        assert Arrays.equals(getClassGrowthRates(ranger), new int[]{10,0,0,0,-5,0,0,0,5});
    }
}
