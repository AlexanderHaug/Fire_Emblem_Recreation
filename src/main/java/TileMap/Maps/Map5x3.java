package TileMap.Maps;

import Creatures.Creature.Creature;
import TileMap.TileMap;

import java.util.ArrayList;

public class Map5x3 extends TileMap {

    public Map5x3(ArrayList<ArrayList<Creature>> allArmys) {
        armys = allArmys;

        map = new Creature[5][3];

        map[0][0]= armys.get(0).get(0);
        map[0][2]= armys.get(0).get(1);
        map[1][1]= armys.get(0).get(2);
        map[3][1]= armys.get(1).get(0);
        map[4][0]= armys.get(1).get(1);
        map[4][2]= armys.get(1).get(2);
    }
}
