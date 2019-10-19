import org.junit.Test;

import static testSetUpMethods.battalionTestMethod.createAndTestBattalion;

public class testBattalions {

    @Test
    public void testChurchOfSeirosSoldiers() {
        createAndTestBattalion("Church_of_Seiros_Soldiers", "Church of Seiros Soldiers",
                0, 0, 0, 0, 0, 1, 1,
                1, "Disturbance", 'E', 30);
    }

    @Test
    public void testSeirosMercenaries() {
        createAndTestBattalion("Seiros_Mercenaries", "Seiros Mercenaries",
                1, -2, 5, 0, 0, 0, 0,
                1, "Onslaught", 'E', 30);
    }
}
