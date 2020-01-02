package testSetUpMethods;

import Battalions.Battalion;

import static Battalions.BattalionGenerator.createBattalion;
import static Battalions.GambitGenerator.createGambit;

public class BattalionTestMethod {

    public static void testBattalion(String battalionFile, String battalionName,
                                     int physicalBonus, int magicalBonus, int hitBonus,
                                     int critBonus, int avoBonus, int proBonus, int resBonus,
                                     int chrmBonus, String gambit, Character rank, int end) {
        Battalion battalion = createBattalion(battalionFile);
        assert battalion.getBattalionName().equals(battalionName);
        assert battalion.getBattalionPhysicalBonus() == physicalBonus;
        assert battalion.getBattalionMagicalBonus() == magicalBonus;
        assert battalion.getBattalionHitBonus() == hitBonus;
        assert battalion.getBattalionCritBonus() == critBonus;
        assert battalion.getBattalionAvoBonus() == avoBonus;
        assert battalion.getBattalionProtectionBonus() == proBonus;
        assert battalion.getBattalionResistanceBonus() == resBonus;
        assert battalion.getBattalionCharmBonus() == chrmBonus;
        assert battalion.getBattalionGambit().getGambitName().equals(createGambit(gambit).getGambitName());
        assert battalion.getBattalionRank().equals(rank);
        assert battalion.getBattalionEndurance() == end;
    }
}
