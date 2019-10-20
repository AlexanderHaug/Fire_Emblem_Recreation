import Battle_Map.BattleMap;
import Creatures.Creature;
import org.junit.Test;

import java.util.ArrayList;

import static testSetUpMethods.createCreatureSetUp.createArmy;

public class testBattleMap {

    @Test
    public void testBattleMapWith2Teams() {
        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(1, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(1, new String[]{"Shaman"}, "Blue"));
        BattleMap battleMap = new BattleMap(armys);
    }
}
