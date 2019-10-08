package Battle;

import Items.Equippable.MainHand.PrimaryItem;

public class WeaponTriangle {

    public static int[] weaponTriangleCalculator(PrimaryItem attacker, PrimaryItem defender) {
        if (attackingAtAdvantage(attacker, defender))
            return new int[] {1,15,-1,-15};
        else if (attackingAtDisadvantage(attacker, defender))
            return new int[] {-1,-15,1,15};
        else
            return new int[] {0,0,0,0};
    }

    private static boolean attackingAtAdvantage(PrimaryItem attacker, PrimaryItem defender) {
        if (attacker.isItemMagic() && defender.isItemMagic())
            if (attacker.getItemType().contains("Anima Magic") && defender.getItemType().contains("Anima Magic"))
                return  attacker.getItemType().contains("Wind") && defender.getItemType().contains("Thunder") ||
                        attacker.getItemType().contains("Thunder") && defender.getItemType().contains("Fire") ||
                        attacker.getItemType().contains("Fire") && defender.getItemType().contains("Wind");
            else
                return  attacker.getItemType().contains("Anima Magic") && defender.getItemType().equals("Light Magic") ||
                        attacker.getItemType().equals("Light Magic") && defender.getItemType().equals("Dark Magic") ||
                        attacker.getItemType().equals("Dark Magic") && defender.getItemType().contains("Anima Magic");

        return  attacker.getItemType().equals("Sword") && defender.getItemType().equals("Axe") ||
                attacker.getItemType().equals("Axe") && defender.getItemType().equals("Lance") ||
                attacker.getItemType().equals("Lance") && defender.getItemType().equals("Sword");
    }

    private static boolean attackingAtDisadvantage(PrimaryItem attacker, PrimaryItem defender) {
        if (attacker.isItemMagic() && defender.isItemMagic())
            if (attacker.getItemType().contains("Anima Magic") && defender.getItemType().contains("Anima Magic"))
                return  attacker.getItemType().contains("Thunder") && defender.getItemType().contains("Wind") ||
                        attacker.getItemType().contains("Fire") && defender.getItemType().contains("Thunder") ||
                        attacker.getItemType().contains("Wind") && defender.getItemType().contains("Fire");
            else
                return  attacker.getItemType().equals("Light Magic") && defender.getItemType().contains("Anima Magic") ||
                        attacker.getItemType().equals("Dark Magic") && defender.getItemType().equals("Light Magic") ||
                        attacker.getItemType().contains("Anima Magic") && defender.getItemType().equals("Dark Magic");

        return  attacker.getItemType().equals("Axe") && defender.getItemType().equals("Sword") ||
                attacker.getItemType().equals("Lance") && defender.getItemType().equals("Axe") ||
                attacker.getItemType().equals("Sword") && defender.getItemType().equals("Lance");
    }
}
