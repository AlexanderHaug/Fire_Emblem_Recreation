package Battalions;

import Battalions.Battalions.ChurchOfSeirosSoldiers;
import Battalions.Battalions.SeirosMercenaries;

public class BattalionGenerator {
    public static Battalion createBattalion(String className) {
        switch (className) {
            case "Church of Seiros Soldiers":
                return new ChurchOfSeirosSoldiers();
            default:
                return new SeirosMercenaries();
        }
    }
}
