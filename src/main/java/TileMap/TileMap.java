package TileMap;

import Creatures.Creature;

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

        Creature[][] tileMap = new Creature[20][20];
        int numberOfColumns = 0;
        int numberOfRows = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+mapFile+".csv"));
            String row;
            int arrayRow = 0;

            while ((row = reader.readLine()) != null) {
                int arrayColumn = 0;
                String[] data = row.split(",");
                for (int x = 0; x < data.length; x++) {

                    if (data[x].equals("-")) {
                        tileMap[arrayRow][arrayColumn] = null;
                        arrayColumn++;
                    }

                    else {
                        int armyNumber = Integer.parseInt(data[x]);
                        if (armys.get(armyNumber).size() > getCurrentArmyCount(armyNumber)) {
                            tileMap[arrayRow][arrayColumn] = getCreature(armyNumber);
                            arrayColumn++;
                            incrementArmyTracker(armyNumber);
                        }
                    }
                }
                arrayRow++;
                numberOfColumns = data.length;
                numberOfRows += 1;
            }
            reader.close();
        }

        catch (FileNotFoundException e) {System.out.println("The TileMap file was not found.");}
        catch (IOException e) {e.printStackTrace();}

        this.map = createMap(numberOfRows, numberOfColumns, tileMap);
    }

    private Creature getCreature(int whichArmy) {
        return armys.get(whichArmy).get(armyDeploymentTracker.get(whichArmy));
    }

    private int getCurrentArmyCount(int armyNumber) {
        return armyDeploymentTracker.get(armyNumber);
    }

    private void incrementArmyTracker(int armyNumber) {
        armyDeploymentTracker.put(armyNumber, armyDeploymentTracker.get(armyNumber) + 1);
    }

    private Creature[][] createMap(int rows, int columns, Creature[][] biggerMap) {
        Creature[][] tileMap = new Creature[rows][columns];
        for (int x = 0; x < tileMap.length; x++) {
            for (int y = 0; y < tileMap[0].length; y++) {
                tileMap[x][y] = biggerMap[x][y];
            }
        }
        return tileMap;
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
                    System.out.print(" - ");
                }

                else {
                    System.out.print(this.map[x][y].getCreatureName().charAt(0) + ":" +
                            this.map[x][y].getArmyAffiliation().charAt(0));
                }
            }
        }
    }
}
