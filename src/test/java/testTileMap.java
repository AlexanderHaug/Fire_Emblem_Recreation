import TileMap.TileMap;
import Creatures.Creature;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.createArmy;

public class testTileMap {

    @Test
    public void testPlaceCreatureOnOccupied() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(1, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(1, new String[]{"Shaman"}, "Blue"));
        TileMap battleMap = new TileMap(armys, new int[]{3,3});
        battleMap.placeCreatureOnMap(0,1, armys.get(0).get(0));
        battleMap.placeCreatureOnMap(0,1, armys.get(1).get(0));

        assert battleMap.getMap()[0][1].equals(armys.get(0).get(0));
    }

    @Test
    public void testTileMapWith2Teams() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(1, new String[]{"Cleric"}, "Red"));
        armys.add(createArmy(1, new String[]{"Shaman"}, "Blue"));
        TileMap battleMap = new TileMap(armys, new int[]{3,3});

        battleMap.placeCreatureOnMap(0,1, armys.get(0).get(0));
        battleMap.placeCreatureOnMap(2,1, armys.get(1).get(0));

        Creature[][] testMap = new Creature[3][3];
        testMap[0][1] = armys.get(0).get(0);
        testMap[2][1] = armys.get(1).get(0);

        assert battleMap.getArmys().equals(armys);
        assert Arrays.deepEquals(battleMap.getMap(), testMap);
    }

    @Test
    public void testTileMapWithCSV() {

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
}
