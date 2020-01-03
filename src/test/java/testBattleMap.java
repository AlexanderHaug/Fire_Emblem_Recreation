import Creatures.Creature.Creature;
import BattleMap.Maps.Map3x3;
import BattleMap.Maps.Map5x3;
import BattleMap.BattleMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static testSetUpMethods.createCreatureSetUp.createArmy;

public class testBattleMap {

    @Test
    public void testTileMap3x3() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(1, new String[]{"Knight"}, "Red"));
        armys.add(createArmy(1, new String[]{"Knight"}, "Blue"));
        BattleMap battleMap = new Map3x3(armys);

        Creature[][] testMap = new Creature[3][3];
        testMap[0][1] = armys.get(0).get(0);
        testMap[2][1] = armys.get(1).get(0);

        assert battleMap.getArmys().equals(armys);
        assert Arrays.deepEquals(battleMap.getMap(), testMap);
    }

    @Test
    public void testTileMap5x3() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(3, new String[]{"Knight"}, "Red"));
        armys.add(createArmy(3, new String[]{"Knight"}, "Blue"));
        BattleMap battleMap = new Map5x3(armys);

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
        armys.add(createArmy(1, new String[]{"Knight"}, "Red"));
        armys.add(createArmy(1, new String[]{"Knight"}, "Blue"));
        BattleMap battleMap = new Map3x3(armys);
        battleMap.placeCreatureOnMap(0,1, armys.get(1).get(0));

        assert battleMap.getMap()[0][1].equals(armys.get(0).get(0));
    }

    @Test
    public void testArmyHasLessPeople() {

        ArrayList<ArrayList<Creature>> armys = new ArrayList<>();
        armys.add(createArmy(3, new String[]{"Knight"}, "Red"));
        armys.add(createArmy(2, new String[]{"Knight"}, "Blue"));
        BattleMap battleMap = new Map5x3(armys);

        Creature[][] testMap = new Creature[5][3];

        testMap[0][0] = armys.get(0).get(0);
        testMap[0][2] = armys.get(0).get(1);
        testMap[1][1] = armys.get(0).get(2);

        testMap[3][1] = armys.get(1).get(0);
        testMap[4][0] = armys.get(1).get(1);

        assert battleMap.getArmys().equals(armys);
        assert Arrays.deepEquals(battleMap.getMap(), testMap);
    }
}
