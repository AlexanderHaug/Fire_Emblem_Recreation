package testEquippableItems;

import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.WeaponCreationTestMethod.createAndTestWeapon;

public class testGauntlets {

    @Test
    public void testTrainingGauntlets() {
        createAndTestWeapon("Training Gauntlets", "Brawl",
                0, 90,0,1,1,
                1,'E', 70,100,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Simple gauntlets perfect for training purposes. " +
                        "Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testIronGauntlets() {
        createAndTestWeapon("Iron Gauntlets", "Brawl",
                1, 85,0,1,1,
                3,'E', 50,520,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Standard iron gauntlets-simple but effective. " +
                        "Wielder strikes twice when initiating combat." );
    }

    @Test
    public void testSteelGauntlets() {
        createAndTestWeapon("Steel Gauntlets", "Brawl",
                3, 80,5,1,1,
                5,'D', 60,520,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Weighty steel gauntlets that deal heavy blows. " +
                        "Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testSilverGauntlets() {
        createAndTestWeapon("Silver Gauntlets", "Brawl",
                4, 85,5,1,1,
                7,'B', 40,520,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Gauntlets crafted from shining silver. " +
                        "Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testKillerKnuckles() {
        createAndTestWeapon("Killer Knuckles", "Brawl",
                3, 80,20,1,1,
                5,'B', 30,520,false,
                true,false, false, new int[9],
                new ArrayList<String>(), "Gauntlets with a high critical-hit rate that allows " +
                        "the wielder to attack twice when initiating combat.");
    }

    @Test
    public void testAuraKnuckles() {
        createAndTestWeapon("Aura Knuckles", "Brawl",
                2, 70,0,1,1,
                4,'A', 30,520,true,
                true,false, false, new int[9],
                new ArrayList<String>(), "Magical gauntlets that allow wielder to attack twice " +
                        "when initiating combat.");
    }

    @Test
    public void testDragonClaws() {
        ArrayList<String> effectiveAgainst = new ArrayList<>();
        effectiveAgainst.add("Dragon");
        createAndTestWeapon("Dragon Claws", "Brawl",
                4, 75,0,1,1,
                7,'A', 30,520,false,
                true,false, false, new int[9],
                effectiveAgainst, "Said to have slain a legendary beast. " +
                        "Effective against dragons. Attack twice if initiating combat.");
    }
}
