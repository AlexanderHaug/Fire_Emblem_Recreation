package BattleMap.Maps;

import Creatures.Creature.Creature;
import BattleMap.BattleMap;

import java.util.ArrayList;

public class Map3x3 extends BattleMap {

    public Map3x3(ArrayList<ArrayList<Creature>> allArmys) {
        armys = allArmys;
        map = new Creature[3][3];
        ArrayList<String> army0 = new ArrayList<>();
        army0.add("0,1");
        ArrayList<String> army1 = new ArrayList<>();
        army1.add("2,1");

        placeArmy(0, army0);
        placeArmy(1, army1);
    }
}
