package Battalions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Battalion {
    private String battalionName = "";
    private int battalionPhysicalBonus = 0;
    private int battalionMagicalBonus = 0;
    private int battalionHitBonus = 0;
    private int battalionCritBonus = 0;
    private int battalionAvoBonus = 0;
    private int battalionProtectionBonus = 0;
    private int battalionResistanceBonus = 0;
    private int battalionCharmBonus = 0;
    private Gambit battalionGambit;

    public Battalion(String file) {
        String filePath = Paths.get(Paths.get(System.getProperty("user.dir")).toString(),
                "src").toString() + "/main/resources/Battalions/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath+file+".csv"));
            String row;
            row = reader.readLine();
            String[] data = row.split(",");
            this.battalionName = data[0];
            this.battalionPhysicalBonus = Integer.parseInt(data[1]);
            this.battalionMagicalBonus = Integer.parseInt(data[2]);
            this.battalionHitBonus = Integer.parseInt(data[3]);
            this.battalionCritBonus = Integer.parseInt(data[4]);
            this.battalionAvoBonus = Integer.parseInt(data[5]);
            this.battalionProtectionBonus = Integer.parseInt(data[6]);
            this.battalionResistanceBonus = Integer.parseInt(data[7]);
            this.battalionCharmBonus = Integer.parseInt(data[8]);
            this.battalionGambit = new Gambit(data[9]);
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The battalion file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public String getBattalionName() {return this.battalionName;}

    public int getBattalionPhysicalBonus() {return this.battalionPhysicalBonus;}

    public int getBattalionMagicalBonus() {return this.battalionMagicalBonus;}

    public int getBattalionHitBonus() {return this.battalionHitBonus;}

    public int getBattalionCritBonus() {return this.battalionCritBonus;}

    public int getBattalionAvoBonus() {return this.battalionAvoBonus;}

    public int getBattalionProtectionBonus() {return battalionProtectionBonus;}

    public int getBattalionResistanceBonus() {return battalionResistanceBonus;}

    public int getBattalionCharmBonus() {return battalionCharmBonus;}

    public Gambit getBattalionGambit() {return battalionGambit;}
}
