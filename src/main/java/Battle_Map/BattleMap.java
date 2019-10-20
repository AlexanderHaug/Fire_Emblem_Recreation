package Battle_Map;

import Creatures.Creature;

import java.util.ArrayList;

public class BattleMap {
    private ArrayList<ArrayList<Creature>> armys;
    private Creature[][] map;

    public BattleMap(ArrayList<ArrayList<Creature>> armys, int[] mapSize) {
        this.armys = armys;
        this.map = new Creature[mapSize[0]][mapSize[1]];
    }

    public Creature[][] getMap() {return this.map;}

    public ArrayList<ArrayList<Creature>> getArmys() {return this.armys;}
}
