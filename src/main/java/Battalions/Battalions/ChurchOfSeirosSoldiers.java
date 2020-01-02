package Battalions.Battalions;

import Battalions.Battalion;
import Battalions.Gambits.Disturbance;

public class ChurchOfSeirosSoldiers extends Battalion {

    public ChurchOfSeirosSoldiers() {
        battalionName = "Church of Seiros Soldiers";
        battalionPhysicalBonus = 0;
        battalionMagicalBonus = 0;
        battalionHitBonus = 0;
        battalionCritBonus = 0;
        battalionAvoBonus = 0;
        battalionProtectionBonus = 1;
        battalionResistanceBonus = 1;
        battalionCharmBonus = 1;
        battalionGambit = new Disturbance();
        battalionRank = 'E';
        battalionEndurance = 30;
    }
}
