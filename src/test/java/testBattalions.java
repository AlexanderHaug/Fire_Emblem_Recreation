import Battalions.Battalion;
import org.junit.Test;

public class testBattalions {

    @Test
    public void testChurchOfSeirosSoldiers() {
        Battalion battalion = new Battalion("Church_of_Seiros_Soldiers");
        assert battalion.getBattalionName().equals("Church of Seiros Soldiers");
        assert battalion.getPhysicalBonus() == 0;
        assert battalion.getMagicalBonus() == 0;
    }

    @Test
    public void testBattalion() {
        Battalion battalion = new Battalion("Seiros_Mercenaries");
        assert battalion.getBattalionName().equals("Seiros Mercenaries");
        assert battalion.getPhysicalBonus() == 1;
        assert battalion.getMagicalBonus() == -2;
    }
}
