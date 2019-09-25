import java.util.ArrayList;

class Battle {
    private static String winner = "No Winner";
    private static String message = "";

    public static void doBattle(Creature attacker, Creature defender, int distance) {

        String fighter1Name = attacker.getCreatureName();
        String fighter2Name = defender.getCreatureName();

        if (attacker.getMainItem() == null || isTargetNotInRangeAttack(attacker.getMainItem().getAttackRange(), distance)) {
            System.out.println(fighter1Name + " cannot attack.");
        }

        else {unitAttacks(attacker, defender);}

        if (!isDead(defender)) {
            if (defender.getMainItem() == null|| isTargetNotInRangeAttack(defender.getMainItem().getAttackRange(), distance)) {
                System.out.println(fighter2Name + " cannot attack.");
            }
            else {unitAttacks(defender, attacker);}
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
        if (!isTargetNotInRangeAssist(supporter, supporter.getMainItem().getAttackRange(), distance)) {
            if (supporter.getMainItem().getAssistType().equals("Healing")) {
                target.healHealth(supporter.getCreatureStats().getMagic() +
                        supporter.getMainItem().getHealAmount());
            }
        }
    }

    private static void unitAttacks(Creature attacker, Creature defender) {
        boolean attackerHits = doesHit(attacker, defender);
        if (attackerHits) {
            int attackerDamageDealt = damageCalculator(attacker, defender);
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

    private static boolean doesHit(Creature attacker, Creature defender){
        int hits = attacker.getHitRate() - defender.getAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    private static int damageCalculator(Creature attacker, Creature defender) {
        boolean weaponIsMagic = attacker.getMainItem().isWeaponMagic();
        int damage;

        if (weaponIsMagic) {damage = attacker.getDamage() - defender.getCreatureStats().getResistance();}
        else {damage = attacker.getDamage() - defender.getCreatureStats().getDefense();}

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

    private static boolean isDead(Creature creature) {return (creature.getCreatureStats().getHealth() == 0);}
}
