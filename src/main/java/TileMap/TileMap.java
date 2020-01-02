package TileMap;

import Creatures.Creature.Creature;

import java.util.ArrayList;

public abstract class TileMap {
    protected ArrayList<ArrayList<Creature>> armys;
    protected Creature[][] map;

    public Creature[][] getMap() {return this.map;}

    public ArrayList<ArrayList<Creature>> getArmys() {return this.armys;}

    public void placeCreatureOnMap(int row, int column, Creature creature) {

        if (this.map[row][column] == null) {this.map[row][column] = creature;}

        else {System.out.println("This tile is already occupied.");}
    }

    public void displayBattleMap() {
        System.out.println("Current Battle Map");
        for (int x = 0; x < map.length; x++) {
            if (x != 0) {System.out.println();}

            for (int y = 0; y < map.length; y++) {
                if (this.map[x][y] == null) {System.out.print(" - ");}

                else {
                    System.out.print(this.map[x][y].getName().charAt(0) + ":" +
                            this.map[x][y].getArmyAffiliation().charAt(0));
                }
            }
        }
    }
}
