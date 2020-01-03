package Battle;

import Creatures.Creature.Creature;
import Items.Equippable.MainHand.Weapon;

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

        if (!attacker.getArmyAffiliation().equals(defender.getArmyAffiliation()) ||
                attacker.getCreatureStats().getStatus().equals("Berserk")) {

            int[] weaponTriangleBonus = getTriangleBonuses(attacker, defender);

            boolean attackerDoubles = (attacker.getAttackSpeed() - defender.getAttackSpeed()) > 4;

            if (creatureCannotAttack(attacker, defender, distance)) {
                unitAttacks(attacker, defender, weaponTriangleBonus[0], weaponTriangleBonus[1]);
            }

            if (!isDead(defender) && !isDead(attacker)) {
                if (creatureCannotAttack(defender, attacker, distance) &&
                        !attacker.getArmyAffiliation().equals(defender.getArmyAffiliation())) {
                    unitAttacks(defender, attacker, weaponTriangleBonus[2], weaponTriangleBonus[3]);
                }
            }

            if ((!isDead(defender) && !isDead(attacker)) && attackerDoubles && attacker.getMainItem() != null) {
                unitAttacks(attacker, defender, weaponTriangleBonus[0], weaponTriangleBonus[1]);
            }
        }
    }

    public static void fightInColosseum(Creature combatant1, Creature combatant2, int distance) {
        int turnCount = 1;

        while (((combatant1.getCreatureStats().getCurrentHealth() != 0) ||
                (combatant2.getCreatureStats().getCurrentHealth() != 0)) || turnCount <= 20) {

            System.out.println("Round: " + turnCount);
            doBattle(combatant1, combatant2, distance);
            if (isDead(combatant1) || isDead(combatant2)) {break;}
            turnCount += 1;
        }

        System.out.println("The winner is " + winner);
    }

    private static void unitAttacks(Creature attacker, Creature defender, int triangleHitBonus, int triangleDamageBonus) {
        boolean attackerHits = doesHit(attacker, defender, triangleHitBonus);
        if (attackerHits) {
            int attackerDamageDealt = damageCalculator(attacker, defender, triangleDamageBonus);
            displayActionTaken(attacker.getName(), attackerDamageDealt, defender);
            targetsHits.put(defender.getName(),true);
        }
        else {
            System.out.println(attacker.getName() + " missed.");
            targetsHits.put(defender.getName(),false);
        }
    }

    private static boolean isTargetNotInRangeAttack(int[] weaponRange, int distance) {
        int shortDistance = weaponRange[0];
        int longDistance = weaponRange[1];

        return (shortDistance > distance) || (distance > longDistance);
    }

    private static void displayActionTaken(String attackerName, int attackerDamageDealt, Creature defender) {

        System.out.println(attackerName + message + attackerDamageDealt + " damage.");
        defender.damageToHealth(attackerDamageDealt);
        System.out.println(defender.getName() + " Health: " + defender.getCreatureStats().getCurrentHealth());

        if (isDead(defender)) {
            System.out.println(defender.getName() + " died!");
            winner = attackerName;
        }
    }

    private static boolean doesHit(Creature attacker, Creature defender, int hitBonus){
        int hits = attacker.getHitRate() + hitBonus - defender.getPhysicalAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    public static int damageCalculator(Creature attacker, Creature defender, int triangleDamageBonus) {
        boolean weaponIsMagic = attacker.getMainItem().isMagic();
        int damage = effectiveAgainstDamageCalculator(attacker, defender);
        damage += triangleDamageBonus;

        if (weaponIsMagic) {
            damage += attacker.getMagicalBonus();
            damage =  damage - defender.getResilience();
        }
        else {
            damage += attacker.getPhysicalBonus();
            damage = damage - defender.getProtection();
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
            message = " hits " + defender.getName() + " for ";
            return damageDone;
        }
    }

    private static void resolveConflict(Creature attacker, Creature defender) {

        if (targetsHits.get(attacker.getName())) {
            if (defender.getMainItem().isDebuff()) {
                attacker.applyDebuffs(defender.getMainItem().getDebuffs());
            }
        }

        if (targetsHits.get(defender.getName())) {
            if (attacker.getMainItem().isDebuff()) {
                defender.applyDebuffs(attacker.getMainItem().getDebuffs());
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
                isTargetNotInRangeAttack(attacker.getMainItem().getRange(), distance)) {
            System.out.println(attacker.getName() + " cannot attack.");
            targetsHits.put(defender.getName(), false);
            return false;
        }
        return true;
    }

    private static int effectiveAgainstDamageCalculator(Creature attacker, Creature defender) {
        boolean effective = false;
        String[] defenderTypes = defender.getCreatureStats().getUnitclass().getUnitClassType();
        if (attacker.getEffective(defenderTypes) && !defender.getEffectiveNulls(defenderTypes)) {effective = true;}

        if (effective) {return 3* ((Weapon)attacker.getMainItem()).getMight();}
        else {return ((Weapon)attacker.getMainItem()).getMight();}
    }

    private static boolean isDead(Creature creature) {return (creature.getCreatureStats().getCurrentHealth() == 0);}
}
