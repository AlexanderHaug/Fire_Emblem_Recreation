package Battle;

import Creatures.Creature;
import Items.Equippable.MainHand.Staff;
import Items.Equippable.MainHand.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

import static Battle.WeaponTriangle.triangleCalculator;

public class Battle {
    private static String winner = "No Winner";
    private static String message = "";
    private static HashMap<String, Boolean> targetsHits = new HashMap<>();

    public static void runBattle(Creature attacker, Creature defender, int distance) {
        doBattle(attacker, defender, distance);
        resolveConflict(attacker, defender);
    }

    public static void doBattle(Creature attacker, Creature defender, int distance) {

        int[] weaponTriangleBonus = getTriangleBonuses(attacker, defender);

        boolean attackerDoubles = (attacker.getAttackSpeed() - defender.getAttackSpeed()) > 4;

        if (creatureCannotAttack(attacker, defender, distance)) {}
        else {unitAttacks(attacker, defender, weaponTriangleBonus[0], weaponTriangleBonus[1]);}

        if (!isDead(defender) || !isDead(attacker)) {
            if (creatureCannotAttack(defender, attacker, distance)) {}
            else {unitAttacks(defender, attacker, weaponTriangleBonus[2], weaponTriangleBonus[3]);}
        }

        if ((!isDead(defender) || !isDead(attacker)) && attackerDoubles && attacker.getMainItem() != null) {
            unitAttacks(attacker, defender, weaponTriangleBonus[0], weaponTriangleBonus[1]);
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
            targetsHits.put(defender.getCreatureName(),true);
        }
        else {
            System.out.println(attacker.getCreatureName() + " missed.");
            targetsHits.put(defender.getCreatureName(),false);
        }
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
        int hits = attacker.getHitRate() + hitBonus - defender.getPhysicalAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    public static int damageCalculator(Creature attacker, Creature defender, int damageBonus) {
        boolean weaponIsMagic = ((Weapon) attacker.getMainItem()).isItemMagic();
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

    public static int criticalCalculator(Creature attacker, Creature defender, int damageDone) {

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

    private static void resolveConflict(Creature attacker, Creature defender) {

        if (targetsHits.get(attacker.getCreatureName())) {
            if (defender.getMainItem().isItemDebuff()) {
                attacker.getCreatureStats().getStatBonuses().decreaseStatBonuses(defender.getMainItem().getTempDebuffOpponentStats());
            }
        }

        if (targetsHits.get(defender.getCreatureName())) {
            if (attacker.getMainItem().isItemDebuff()) {
                defender.getCreatureStats().getStatBonuses().decreaseStatBonuses(attacker.getMainItem().getTempDebuffOpponentStats());
            }
        }
        targetsHits.clear();
    }

    private static int[] getTriangleBonuses(Creature attacker, Creature defender) {
        if (attacker.getMainItem() != null && defender.getMainItem() != null) {
            return triangleCalculator(attacker.getMainItem(), defender.getMainItem());
        }
        return new int[]{0,0,0,0};
    }

    private static boolean creatureCannotAttack(Creature attacker, Creature defender, int distance) {
        if (attacker.getMainItem() == null ||
                isTargetNotInRangeAttack(attacker.getMainItem().getItemRange(), distance)) {
            System.out.println(attacker.getCreatureName() + " cannot attack.");
            targetsHits.put(defender.getCreatureName(), false);
            return true;
        }
        return false;
    }

    private static boolean isDead(Creature creature) {return (creature.getCreatureStats().getHealth() == 0);}
}
