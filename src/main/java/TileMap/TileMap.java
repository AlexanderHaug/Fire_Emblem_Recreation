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
    private HashMap<Integer, Integer> armyPlacementTracker = new HashMap<>();

    public TileMap(ArrayList<ArrayList<Creature>> armys, String mapFile) {
        this.armys = armys;
        for (int x = 0; x < this.armys.size(); x++) {
            armyPlacementTracker.put(x, 0);
        }
        setMap(mapFile);
    }

    public TileMap(ArrayList<ArrayList<Creature>> armys, int[] mapSize) {
        this.armys = armys;
        this.map = new Creature[mapSize[0]][mapSize[1]];
    }

    private void setMap(String mapFile) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/TileMaps/";

        Creature[][] tileMap = new Creature[20][20];
        int rowBound = 0;
        int columnBound = 0;

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
                        if (armys.get(Integer.parseInt(data[x])).size() >
                                armyPlacementTracker.get(Integer.parseInt(data[x]))) {
                            tileMap[arrayRow][arrayColumn] = getCreature(Integer.parseInt(data[x]),
                                    Integer.parseInt(data[x]));
                            arrayColumn++;
                            armyPlacementTracker.put(x, armyPlacementTracker.put(Integer.parseInt(data[x]), x+1));
                        }
                    }
                }
                arrayRow++;
                rowBound = data.length;
                columnBound += 1;
            }
            reader.close();
        }

        catch (FileNotFoundException e) {System.out.println("The TileMap file was not found.");}
        catch (IOException e) {e.printStackTrace();}

        this.map = createMap(rowBound,columnBound,tileMap);
    }

    private Creature getCreature(int whichArmy, int currentArmyMember) {
        return armys.get(whichArmy).get(armyPlacementTracker.get(currentArmyMember));
    }

    private Creature[][] createMap(int rows, int columns, Creature[][] biggerMap) {
        Creature[][] tileMap = new Creature[rows][columns];
        for (int x = 0; x < tileMap.length; x++) {
            for (int y = 0; y < tileMap.length; y++) {
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
