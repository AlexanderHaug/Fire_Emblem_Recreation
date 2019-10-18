package testSetUpMethods;

import Battalions.Battalion;

public class battalionTestMethod {

    public static void createAndTestBattalion(String battalionFile, String battalionName,
                                              int physicalBonus, int magicalBonus, int hitBonus,
                                              int critBonus, int avoBonus) {
        Battalion battalion = new Battalion(battalionFile);
        assert battalion.getBattalionName().equals(battalionName);
        assert battalion.getPhysicalBonus() == physicalBonus;
        assert battalion.getMagicalBonus() == magicalBonus;
        assert battalion.getBattalionHitBonus() == hitBonus;
        assert battalion.getBattalionCritBonus() == critBonus;
        assert battalion.getBattalionAvoBonus() == avoBonus;
    }
}
