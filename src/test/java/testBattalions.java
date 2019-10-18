import org.junit.Test;

import static testSetUpMethods.battalionTestMethod.createAndTestBattalion;

public class testBattalions {

    @Test
    public void testChurchOfSeirosSoldiers() {
        createAndTestBattalion("Church_of_Seiros_Soldiers", "Church of Seiros Soldiers",
                0, 0);
    }

    @Test
    public void testBattalion() {
        createAndTestBattalion("Seiros_Mercenaries", "Seiros Mercenaries",
                1, -2);
    }
}
