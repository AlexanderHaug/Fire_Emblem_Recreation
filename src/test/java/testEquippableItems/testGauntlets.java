package testEquippableItems;

import org.junit.Test;

import java.util.HashMap;

import static testSetUpMethods.EquippableItemTestMethods.testWeapon;

public class testGauntlets {

    @Test
    public void testTrainingGauntlets() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Training Gauntlets", "Brawl", 0, 90,0,1,1,
                1,'E', 70,100, a, "Simple gauntlets perfect for training purposes." +
                        " Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testIronGauntlets() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Iron Gauntlets", "Brawl", 1, 85,0,1,1,
                3,'E', 50,520, a, "Standard iron gauntlets-simple but effective. " +
                        "Wielder strikes twice when initiating combat." );
    }

    @Test
    public void testSteelGauntlets() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Steel Gauntlets", "Brawl", 3, 80,5,1,1,
                5,'D', 60,520, a, "Weighty steel gauntlets that deal heavy blows. " +
                        "Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testSilverGauntlets() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Silver Gauntlets", "Brawl", 4, 85,5,1,1,
                7,'B', 40,520, a, "Gauntlets crafted from shining silver. " +
                        "Wielder strikes twice when initiating combat.");
    }

    @Test
    public void testKillerKnuckles() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        testWeapon("Killer Knuckles", "Brawl",
                3, 80,20,1,1,
                5,'B', 30,520, a, "Gauntlets with a high critical-hit " +
                        "rate that allows the wielder to attack twice when initiating combat.");
    }

    @Test
    public void testAuraKnuckles() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        a.put("Magic", 1);
        testWeapon("Aura Knuckles", "Brawl", 2, 70,0,1,1,
                4,'A', 30,520, a,
                "Magical gauntlets that allow wielder to attack twice when initiating combat.");
    }

    @Test
    public void testDragonClaws() {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("Brave", 1);
        a.put("Effective: Dragon", 1);
        testWeapon("Dragon Claws", "Brawl", 4, 75,0,1,1,
                7,'A', 30,520, a, "Said to have slain a legendary beast. " +
                        "Effective against dragons. Attack twice if initiating combat.");
    }
}
