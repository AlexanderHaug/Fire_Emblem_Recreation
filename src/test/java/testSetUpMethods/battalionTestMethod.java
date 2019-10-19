package testSetUpMethods;

import Battalions.Battalion;
import Battalions.Gambit;

public class battalionTestMethod {

    public static void createAndTestBattalion(String battalionFile, String battalionName,
                                              int physicalBonus, int magicalBonus, int hitBonus,
                                              int critBonus, int avoBonus, int proBonus, int resBonus,
                                              int chrmBonus, String gambit) {
        Battalion battalion = new Battalion(battalionFile);
        assert battalion.getBattalionName().equals(battalionName);
        assert battalion.getBattalionPhysicalBonus() == physicalBonus;
        assert battalion.getBattalionMagicalBonus() == magicalBonus;
        assert battalion.getBattalionHitBonus() == hitBonus;
        assert battalion.getBattalionCritBonus() == critBonus;
        assert battalion.getBattalionAvoBonus() == avoBonus;
        assert battalion.getBattalionProtectionBonus() == proBonus;
        assert battalion.getBattalionResistanceBonus() == resBonus;
        assert battalion.getBattalionCharmBonus() == chrmBonus;
        assert battalion.getBattalionGambit().getGambitName().equals(new Gambit(gambit).getGambitName());
    }
}
