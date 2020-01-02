package Battalions.Battalions;

import Battalions.Battalion;
import Battalions.Gambits.Onslaught;

public class SeirosMercenaries extends Battalion {

    public SeirosMercenaries() {
        battalionName = "Seiros Mercenaries";
        battalionPhysicalBonus = 1;
        battalionMagicalBonus = -2;
        battalionHitBonus = 5;
        battalionCritBonus = 0;
        battalionAvoBonus = 0;
        battalionProtectionBonus = 0;
        battalionResistanceBonus = 0;
        battalionCharmBonus = 1;
        battalionGambit = new Onslaught();
        battalionRank = 'E';
        battalionEndurance = 30;
    }
}
