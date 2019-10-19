package Battalions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Gambit {

    private String gambitName = "";

    public Gambit(String file) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/Gambits/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+file+".csv"));
            String row;
            row = reader.readLine();
            String[] data = row.split(",");
            this.gambitName = data[0];
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The gambit file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getGambitName() {return gambitName;}
}
