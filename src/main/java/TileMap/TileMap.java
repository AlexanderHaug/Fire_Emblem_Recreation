package TileMap;

import Creatures.Creature;

import java.util.ArrayList;

public class TileMap {
    private ArrayList<ArrayList<Creature>> armys;
    private Creature[][] map;

    public TileMap(ArrayList<ArrayList<Creature>> armys, int[] mapSize) {
        this.armys = armys;
        this.map = new Creature[mapSize[0]][mapSize[1]];
    }

    public Creature[][] getMap() {return this.map;}

    public void placeCreatureOnMap(int row, int column, Creature creature) {
        if (this.map[row][column] == null) {
            this.map[row][column] = creature;
        }
        else {
            System.out.println("This tile is already occupied.");
        }
    }

    public ArrayList<ArrayList<Creature>> getArmys() {return this.armys;}

    public void displayBattleMap() {
        System.out.println("Current Battle Map");
        for (int x = 0; x < map.length; x++) {
            if (x != 0) {
                System.out.println();
            }
            for (int y = 0; y < map.length; y++) {
                if (this.map[x][y] == null) {
                    System.out.printf(" - ");
                }

                else {
                    System.out.printf(this.map[x][y].getCreatureName().charAt(0) + ":" +
                            this.map[x][y].getArmyAffiliation().charAt(0));
                }
            }
        }
    }
}
