package Items.Equippable.MainHand;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Staff extends PrimaryItem {
    private int healAmount = 0;
    private String assistType = "";
    private String staffStatusEffect = "";

    public Staff(String fileName) {
        Path currentPath = Paths.get(System.getProperty("user.dir"));
        String srcPath = Paths.get(currentPath.toString(), "src").toString() + "/main/java/Items/Equippable/MainHand/Weapons/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(srcPath + fileName));
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                setName(data[0]);
                setItemType(data[1]);
                setAssistType(data[2]);

                this.healAmount = Integer.parseInt(data[3]);
                setAccuracy(Integer.parseInt(data[4]));
                setItemsRange(data[5]);

                setItemWeight(Integer.parseInt(data[6]));
                setItemRank(data[7].charAt(0));
                setItemUses(Integer.parseInt(data[8]));

                setItemEffect(data[9]);
                setItemDescription(data[10]);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {System.out.println("The file was not found.");}
        catch (IOException e) {e.printStackTrace();}
    }

    private void setAssistType(String data) {
        if (data.contains("Healing")) {this.assistType = "Healing";}
        else if (data.contains("Cleansing")) {this.assistType = "Cleansing";}
        else if (data.contains("Attacking")) {this.assistType = "Attacking";}
    }

    private void setItemEffect(String data) {
        if (data.contains("Silence")) {this.staffStatusEffect = "Silence";}
        else if (data.contains("Sleep")) {this.staffStatusEffect= "Sleep";}
        else if (data.contains("Berserk")) {this.staffStatusEffect = "Berserk";}
        else if (data.contains("Freeze")) {this.staffStatusEffect = "Freeze";}
        else if (data.contains("Enfeeble")) {this.staffStatusEffect = "Enfeeble";}
    }

    public int getHealAmount() {return healAmount;}

    public String getStaffStatusEffect() {return staffStatusEffect;}

    public String getAssistType() {return assistType;}

    public boolean getStaffIsMagic() {return true;}

    public String toString() {return this.getName() +  ", Accuracy " + this.getAccuracy();}
}
