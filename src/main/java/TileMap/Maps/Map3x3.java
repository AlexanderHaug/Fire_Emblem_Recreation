package TileMap.Maps;

import Creatures.Creature.Creature;
import TileMap.TileMap;

import java.util.ArrayList;

public class Map3x3 extends TileMap {

    public Map3x3(ArrayList<ArrayList<Creature>> allArmys) {
        armys = allArmys;
        map = new Creature[3][3];

        map[0][1]= armys.get(0).get(0);
        map[2][1]= armys.get(1).get(0);
    }
}
