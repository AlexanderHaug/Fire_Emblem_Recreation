package BattleMap.Maps;

import Creatures.Creature.Creature;
import BattleMap.BattleMap;

import java.util.ArrayList;

public class Map5x3 extends BattleMap {

    public Map5x3(ArrayList<ArrayList<Creature>> allArmys) {
        armys = allArmys;
        map = new Creature[5][3];
        ArrayList<String> army0 = new ArrayList<>();
        army0.add("0,0");
        army0.add("0,2");
        army0.add("1,1");
        ArrayList<String> army1 = new ArrayList<>();
        army1.add("3,1");
        army1.add("4,0");
        army1.add("4,2");

        placeArmy(0, army0);
        placeArmy(1, army1);
    }
}
