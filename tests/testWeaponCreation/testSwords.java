package testWeaponCreation;

import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;

import static testWeaponCreation.WeaponCreationTestMethod.createAndTestWeapon;


public class testSwords {
    private static Path currentPath = Paths.get(System.getProperty("user.dir"));
    private static Path filePath = Paths.get(currentPath.toString(), "src");

    @Test
    public void testCreateTrainingSword() {
        createAndTestWeapon("Training_Sword", "Training Sword", "Sword",
                3, 100,0,1,1,
                4,"E", 50,260,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "This simple sword is perfect for training purposes. " +
                        "But cannot inflict critical hits." );
    }

    @Test
    public void testCreateIronSword() {
        createAndTestWeapon("Iron_Sword", "Iron Sword", "Sword", 5,
                90,0,1,1,5,"E",
                40,520,false,false,false,
                false, new HashSet<String>(), new ArrayList<String>(),
                "A standard sword made of iron simple but effective." );
    }

    @Test
    public void testCreateSteelSword() {
        createAndTestWeapon("Steel_Sword", "Steel Sword", "Sword", 8,
                85,0,1,1,10,"D",
                50,910,false,false,false,
                false, new HashSet<String>(), new ArrayList<String>(),
                "A weighty steel sword that deals significant blows." );
    }

    @Test
    public void testCreateSilverSword() {
        createAndTestWeapon("Silver_Sword", "Silver Sword", "Sword",
                12, 90,0,1,1,
                8,"B", 30,1410,false,
                false,false, false, new HashSet<String>(),
                new ArrayList<String>(), "A sword crafted from shining silver." );
    }

    @Test
    public void testCreateBraveSword() {
        createAndTestWeapon("Brave_Sword", "Brave Sword", "Sword", 9,
                75,0,1,1,12,"B",
                30,2100,false,true,false,
                false, new HashSet<String>(), new ArrayList<String>(),
                "The wielder of this blade is emboldened and " +
                        "will attack twice when initiating combat." );

    }

    @Test
    public void testCreateKillingEdge() {
        createAndTestWeapon("Killing_Edge", "Killing Edge", "Sword", 8,
                85,25,1,1,10,
                "C", 20,1470,false,false,
                false, false, new HashSet<String>(), new ArrayList<String>(),
                "Deadly sharp this sword boasts a high critical-hit rate." );
    }
}
