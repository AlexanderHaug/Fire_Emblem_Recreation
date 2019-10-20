import Battle_Map.BattleMap;
import Creatures.Creature;
import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.createCreatureSetUp.createArmy;

public class testBattleMap {

    @Test
    public void testBattleMapWith2Teams() {
        ArrayList<Creature> ylisseArmy = createArmy(2, new String[]{"Cleric"}, "Ylisse");
        BattleMap battleMap = new BattleMap();
    }
}
