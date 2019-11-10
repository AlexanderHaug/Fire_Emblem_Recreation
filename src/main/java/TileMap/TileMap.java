package TileMap;

import Creatures.Creature.Creature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class TileMap {
    private ArrayList<ArrayList<Creature>> armys;
    private Creature[][] map;
    private HashMap<Integer, Integer> armyDeploymentTracker = new HashMap<>();

    public TileMap(ArrayList<ArrayList<Creature>> armys, String mapFile) {
        this.armys = armys;
        for (int x = 0; x < this.armys.size(); x++) {armyDeploymentTracker.put(x, 0);}
        setMap(mapFile);
    }

    private void setMap(String mapFile) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/TileMaps/";

        Creature[][] genericMap = new Creature[50][50];
        int finalNumberOfColumns = 0;
        int finalNumberOfRows = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+mapFile+".csv"));
            String row;
            int arrayRow = 0;

            while ((row = reader.readLine()) != null) {
                int arrayColumn = 0;
                String[] lineOfTiles = row.split(",");

                for (String tile : lineOfTiles) {

                    if (tile.equals("-")) {
                        genericMap[arrayRow][arrayColumn] = null;
                        arrayColumn += 1;
                    }

                    else {
                        int armyNumber = Integer.parseInt(tile);
                        if (getArmySize(armyNumber) > getCurrentArmyCount(armyNumber)) {
                            genericMap[arrayRow][arrayColumn] = getCreature(armyNumber);
                            arrayColumn += 1;
                            incrementArmyTracker(armyNumber);
                        }
                    }
                }
                arrayRow += 1;
                finalNumberOfColumns = lineOfTiles.length;
                finalNumberOfRows += 1;
            }
            reader.close();
        }

        catch (FileNotFoundException e) {System.out.println("The TileMap file was not found.");}
        catch (IOException e) {e.printStackTrace();}

        this.map = createFinalMap(finalNumberOfRows, finalNumberOfColumns, genericMap);
    }

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

    private Creature getCreature(int whichArmy) {
        return armys.get(whichArmy).get(armyDeploymentTracker.get(whichArmy));
    }

    private int getCurrentArmyCount(int armyNumber) {return armyDeploymentTracker.get(armyNumber);}

    private void incrementArmyTracker(int armyNumber) {
        armyDeploymentTracker.put(armyNumber, armyDeploymentTracker.get(armyNumber) + 1);
    }

    private int getArmySize(int armyNumber) {return armys.get(armyNumber).size();}

    private Creature[][] createFinalMap(int rows, int columns, Creature[][] biggerMap) {
        Creature[][] tileMap = new Creature[rows][columns];
        for (int x = 0; x < tileMap.length; x++) {
            System.arraycopy(biggerMap[x], 0, tileMap[x], 0, tileMap[0].length);
        }
        return tileMap;
    }
}
