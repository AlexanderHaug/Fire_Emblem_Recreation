import Creatures.Creature;
import TileMap.TileMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.createArmy;

public class testTileMap {

    @Test
    public void testTileMap3x3() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(2, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(2, new String[]{"Shaman"}, "Blue"));
        TileMap battleMap = new TileMap(armys, "3x3");

        Creature[][] testMap = new Creature[3][3];
        testMap[0][1] = armys.get(0).get(0);
        testMap[2][1] = armys.get(1).get(0);

        assert battleMap.getArmys().equals(armys);
        assert Arrays.deepEquals(battleMap.getMap(), testMap);
    }

    @Test
    public void testTileMap5x3() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(3, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(3, new String[]{"Shaman"}, "Blue"));
        TileMap battleMap = new TileMap(armys, "5x3");

        Creature[][] testMap = new Creature[5][3];

        testMap[0][0] = armys.get(0).get(0);
        testMap[0][2] = armys.get(0).get(1);
        testMap[1][1] = armys.get(0).get(2);

        testMap[3][1] = armys.get(1).get(0);
        testMap[4][0] = armys.get(1).get(1);
        testMap[4][2] = armys.get(1).get(2);

        assert battleMap.getArmys().equals(armys);
        assert Arrays.deepEquals(battleMap.getMap(), testMap);
    }

    @Test
    public void testPlaceCreatureOnOccupied() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(1, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(1, new String[]{"Shaman"}, "Blue"));
        TileMap battleMap = new TileMap(armys, "3x3");
        battleMap.placeCreatureOnMap(0,1, armys.get(1).get(0));

        assert battleMap.getMap()[0][1].equals(armys.get(0).get(0));
    }
}
