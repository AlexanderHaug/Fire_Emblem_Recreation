package Battle_Map;

import Creatures.Creature;

import java.util.ArrayList;

public class BattleMap {
    private ArrayList<ArrayList<Creature>> armys;

    public BattleMap(ArrayList<ArrayList<Creature>> armys) {
        this.armys = armys;
    }

    public ArrayList<ArrayList<Creature>> getArmys() {return this.armys;}
}
