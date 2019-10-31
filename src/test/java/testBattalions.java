import org.junit.Test;

import static testSetUpMethods.BattalionTestMethod.testBattalion;

public class testBattalions {

    @Test
    public void testChurchOfSeirosSoldiers() {
        testBattalion("Church_of_Seiros_Soldiers", "Church of Seiros Soldiers",
                0, 0, 0, 0, 0, 1, 1,
                1, "Disturbance", 'E', 30);
    }

    @Test
    public void testSeirosMercenaries() {
        testBattalion("Seiros_Mercenaries", "Seiros Mercenaries",
                1, -2, 5, 0, 0, 0, 0,
                1, "Onslaught", 'E', 30);
    }
}
