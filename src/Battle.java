import Items.Equippable.MainHand.PrimaryItem;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;

class Battle {
    private static String winner = "No Winner";
    private static String message = "";

    public static void doBattle(Creature attacker, Creature defender, int distance) {

        String fighter1Name = attacker.getCreatureName();
        String fighter2Name = defender.getCreatureName();

        int[] weaponTriangleBonus = new int[4];
        if (attacker.getMainItem() != null && defender.getMainItem() != null) {
            weaponTriangleBonus = weaponTriangleCalculator(attacker.getMainItem(), defender.getMainItem());
        }

        if (attacker.getMainItem() == null ||
                isTargetNotInRangeAttack(attacker.getMainItem().getItemRange(), distance)) {
            System.out.println(fighter1Name + " cannot attack.");
        }

        else {unitAttacks(attacker, defender, weaponTriangleBonus[0], weaponTriangleBonus[1]);}

        if (!isDead(defender) || !isDead(attacker)) {
            if (defender.getMainItem() == null||
                    isTargetNotInRangeAttack(defender.getMainItem().getItemRange(), distance)) {
                System.out.println(fighter2Name + " cannot attack.");
            }
            else {unitAttacks(defender, attacker, weaponTriangleBonus[2], weaponTriangleBonus[3]);}
        }
    }

    public static void fightInColosseum(Creature combatant1, Creature combatant2, int distance) {
        int turnCount = 1;

        while (((combatant1.getCreatureStats().getHealth() != 0) || (combatant2.getCreatureStats().getHealth() != 0))
                || turnCount <= 20) {

            System.out.println("Round: " + turnCount);
            doBattle(combatant1, combatant2, distance);
            if (isDead(combatant1) || isDead(combatant2)) {break;}
            turnCount += 1;
        }

        System.out.println("The winner is " + winner);
    }

    public static void assist(Creature supporter, Creature target, int distance) {
        if (!isTargetNotInRangeAssist(supporter, supporter.getMainItem().getItemRange(), distance)) {
            if (((Staff)supporter.getMainItem()).getAssistType().equals("Healing")) {
                target.healHealth(supporter.getCreatureStats().getMagic() +
                        ((Staff)supporter.getMainItem()).getHealAmount());
            }
            else if (((Staff)supporter.getMainItem()).getAssistType().equals("Cleansing")) {
                target.getCreatureStats().setStatus("Normal");
            }
        }
    }

    private static void unitAttacks(Creature attacker, Creature defender, int hitBonus, int damageBonus) {
        boolean attackerHits = doesHit(attacker, defender, hitBonus);
        if (attackerHits) {
            int attackerDamageDealt = damageCalculator(attacker, defender, damageBonus);
            displayActionTaken(attacker.getCreatureName(), attackerDamageDealt, defender);
        }
        else {System.out.println(attacker.getCreatureName() + " missed.");}
    }

    private static boolean isTargetNotInRangeAttack(ArrayList<Integer> weaponRange, int distance) {
        int shortDistance = weaponRange.get(0);
        int longDistance = weaponRange.get(1);

        return (shortDistance > distance) || (distance > longDistance);
    }

    private static boolean isTargetNotInRangeAssist(Creature creature, ArrayList<Integer> weaponRange, int distance) {
        int shortDistance = weaponRange.get(0);
        int longDistance = weaponRange.get(1);
        if (longDistance > 1) {longDistance = creature.getCreatureStats().getMagic()/longDistance;}

        return (shortDistance > distance) || (distance > longDistance);
    }

    private static void displayActionTaken(String attackerName, int attackerDamageDealt, Creature defender) {

        System.out.println(attackerName + message + attackerDamageDealt + " damage.");
        defender.damageToHealth(attackerDamageDealt);
        System.out.println(defender.getCreatureName() + " Health: " + defender.getCreatureStats().getHealth());

        if (isDead(defender)) {
            System.out.println(defender.getCreatureName() + " died!");
            winner = attackerName;
        }
    }

    private static boolean doesHit(Creature attacker, Creature defender, int hitBonus){
        int hits = attacker.getHitRate() + hitBonus - defender.getAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    private static int damageCalculator(Creature attacker, Creature defender, int damageBonus) {
        boolean weaponIsMagic = ((Weapon) attacker.getMainItem()).isWeaponMagic();
        int damage = attacker.getDamage() + damageBonus;

        if (weaponIsMagic) {
            damage =  damage - defender.getCreatureStats().getResistance();
        }
        else {
            damage = damage - defender.getCreatureStats().getDefense();
        }

        damage = criticalCalculator(attacker, defender, damage);

        return Math.max(damage, 0);

    }

    private static int criticalCalculator(Creature attacker, Creature defender, int damageDone) {

        int attackerCritical = attacker.getCritRate() - defender.getCreatureStats().getLuck();
        int chance = (int)(Math.random() * 100);

        boolean isCritical = attackerCritical >= chance;

        if (isCritical) {
            message = " hits for a critical of ";
            return damageDone*3;
        }

        else {
            message = " hits " + defender.getCreatureName() + " for ";
            return damageDone;
        }
    }

    public static int[] weaponTriangleCalculator(PrimaryItem attacker, PrimaryItem defender) {
        if (attackingAtAdvantage(attacker, defender))
            return new int[] {1,15,-1,-15};
        else if (attackingAtDisadvantage(attacker, defender))
            return new int[] {-1,-15,1,15};
        else
            return new int[] {0,0,0,0};
    }

    private static boolean attackingAtAdvantage(PrimaryItem attacker, PrimaryItem defender) {
        return attacker.getItemType().equals("Sword") && defender.getItemType().equals("Axe") ||
                attacker.getItemType().equals("Axe") && defender.getItemType().equals("Lance") ||
                attacker.getItemType().equals("Lance") && defender.getItemType().equals("Sword");
    }

    private static boolean attackingAtDisadvantage(PrimaryItem attacker, PrimaryItem defender) {
        return attacker.getItemType().equals("Axe") && defender.getItemType().equals("Sword") ||
                attacker.getItemType().equals("Lance") && defender.getItemType().equals("Axe") ||
                attacker.getItemType().equals("Sword") && defender.getItemType().equals("Lance");
    }

    private static boolean isDead(Creature creature) {return (creature.getCreatureStats().getHealth() == 0);}
}
