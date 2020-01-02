package Battalions;

import Battalions.Gambits.Disturbance;
import Battalions.Gambits.Onslaught;

public class GambitGenerator {
    public static Gambit createGambit(String className) {
        switch (className) {
            case "Onslaught":
                return new Onslaught();
            default:
                return new Disturbance();
        }
    }
}
