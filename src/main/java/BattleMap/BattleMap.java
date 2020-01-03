package BattleMap;

import Creatures.Creature.Creature;

import java.util.ArrayList;

public abstract class BattleMap {
    protected ArrayList<ArrayList<Creature>> armys;
    protected Creature[][] map;

    public Creature[][] getMap() {return this.map;}

    public ArrayList<ArrayList<Creature>> getArmys() {return this.armys;}

    public void placeArmy(int armyNumber, ArrayList<String> placements) {
        int counter = 0;
        while (counter < armys.get(armyNumber).size() && counter < placements.size()) {
            String[] coordinates = placements.get(counter).split(",");
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            map[row][column] = armys.get(armyNumber).get(counter);
            counter++;
        }
    }

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
