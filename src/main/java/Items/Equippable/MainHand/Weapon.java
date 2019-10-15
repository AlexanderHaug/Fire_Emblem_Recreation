package Items.Equippable.MainHand;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Weapon extends PrimaryItem {
    private int might = 0;
    private int critical = 0;
    private ArrayList<String> effectiveAgainst = new ArrayList<>();

    public Weapon(String fileName) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/main/java/Items/Equippable/MainHand/Weapons/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + fileName));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                setName(data[0]);
                setItemType(data[1]);

                this.might = Integer.parseInt(data[2]);
                setAccuracy(Integer.parseInt(data[3]));
                this.critical = Integer.parseInt(data[4]);

                setItemsRange(data[5]);
                setItemWeight(Integer.parseInt(data[6]));
                setItemRank(data[7].charAt(0));

                setItemUses(Integer.parseInt(data[8]));
                setItemCost(Integer.parseInt(data[9]));
                setItemIs(data[10]);

                setOtherStats(data[11]);
                setEffectiveAgainst(data[12]);
                setItemDescription(data[13]);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    public int getMight() {return might;}

    public int getCritical() {return critical;}

    private void setEffectiveAgainst(String data) {
        if (!data.equals("")) {
            String[] splt = data.split(":");
            Collections.addAll(this.effectiveAgainst, splt);
        }
    }

    private void setOtherStats(String data) {
        if (!data.equals("")) {setOtherStatIncreases(data.split(":"));}
    }

    public ArrayList<String> getEffectiveAgainst() {return effectiveAgainst;}
}
