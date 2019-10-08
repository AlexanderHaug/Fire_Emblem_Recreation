package Battle;

import Items.Equippable.MainHand.PrimaryItem;

public class WeaponTriangle {

    public static int[] triangleCalculator(PrimaryItem attacker, PrimaryItem defender) {
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
                return  advantageAnimaTriangle(attacker.getItemType(), defender.getItemType());
            else
                return advantageTrinityOfMagic(attacker.getItemType(), defender.getItemType());

        return  advantageWeaponTriangle(attacker.getItemType(), defender.getItemType());
    }

    private static boolean attackingAtDisadvantage(PrimaryItem attacker, PrimaryItem defender) {
        if (attacker.isItemMagic() && defender.isItemMagic())
            if (attacker.getItemType().contains("Anima Magic") && defender.getItemType().contains("Anima Magic"))
                return  disadvantageAnimaTriangle(attacker.getItemType(), defender.getItemType());
            else
                return disadvantageTrinityOfMagic(attacker.getItemType(), defender.getItemType());

        return  disadvantageWeaponTriangle(attacker.getItemType(), defender.getItemType());
    }

    private static boolean advantageWeaponTriangle(String attacker, String defender) {
        return  attacker.equals("Sword") && defender.equals("Axe") ||
                attacker.equals("Axe") && defender.equals("Lance") ||
                attacker.equals("Lance") && defender.equals("Sword");
    }

    private static boolean disadvantageWeaponTriangle(String attacker, String defender) {
        return  attacker.equals("Axe") && defender.equals("Sword") ||
                attacker.equals("Lance") && defender.equals("Axe") ||
                attacker.equals("Sword") && defender.equals("Lance");
    }

    private static boolean advantageTrinityOfMagic(String attacker, String defender) {
        return  attacker.contains("Anima Magic") && defender.equals("Light Magic") ||
                attacker.equals("Light Magic") && defender.equals("Dark Magic") ||
                attacker.equals("Dark Magic") && defender.contains("Anima Magic");
    }

    private static boolean disadvantageTrinityOfMagic(String attacker, String defender) {
        return  attacker.equals("Light Magic") && defender.contains("Anima Magic") ||
                attacker.equals("Dark Magic") && defender.equals("Light Magic") ||
                attacker.contains("Anima Magic") && defender.equals("Dark Magic");
    }

    private static boolean advantageAnimaTriangle(String attacker, String defender) {
        return  attacker.contains("Wind") && defender.contains("Thunder") ||
                attacker.contains("Thunder") && defender.contains("Fire") ||
                attacker.contains("Fire") && defender.contains("Wind");
    }

    private static boolean disadvantageAnimaTriangle(String attacker, String defender) {
        return  attacker.contains("Thunder") && defender.contains("Wind") ||
                attacker.contains("Fire") && defender.contains("Thunder") ||
                attacker.contains("Wind") && defender.contains("Fire");
    }
}
