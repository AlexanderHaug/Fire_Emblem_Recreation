package Battalions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Battalion {
    private String battalionName = "";
    private int battlionPhysicalBonus = 0;
    private int battlionMagicalBonus = 0;

    public Battalion(String file) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/Battalions/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+file+".csv"));
            String row;
            row = reader.readLine();
            String[] data = row.split(",");
            this.battalionName = data[0];
            this.battlionPhysicalBonus = Integer.parseInt(data[1]);
            this.battlionMagicalBonus = Integer.parseInt(data[2]);
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getBattalionName() {
        return this.battalionName;
    }

    public int getPhysicalBonus() {
        return this.battlionPhysicalBonus;
    }

    public int getMagicalBonus() {
        return this.battlionMagicalBonus;
    }
}
