package Battle;

import Creatures.Creature.Creature;
import Items.Equippable.MainHand.Staff;

public class Assist {

    public static void assist(Creature supporter, Creature target, int distance) {
        if (!isTargetNotInRangeAssist(supporter, supporter.getMainItem().getRange(), distance)) {
            if (((Staff)supporter.getMainItem()).getAssistType().equals("Healing")) {
                target.healHealth(supporter.getCreatureStats().getMagic() +
                        ((Staff)supporter.getMainItem()).getHealAmount());
            }
            else if (((Staff)supporter.getMainItem()).getAssistType().equals("Cleansing")) {
                target.getCreatureStats().setStatus("Normal");
            }
        }
    }

    private static boolean isTargetNotInRangeAssist(Creature creature, int[] weaponRange, int distance) {
        int shortDistance = weaponRange[0];
        int longDistance = weaponRange[1];
        if (longDistance > 1) {longDistance = creature.getCreatureStats().getMagic()/longDistance;}

        return (shortDistance > distance) || (distance > longDistance);
    }
}
