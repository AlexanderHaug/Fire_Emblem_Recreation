import java.util.ArrayList;

class Battle {
    private static String winner = "No Winner";
    private static String message = "";

    public static void fightRound(Creature fighter1, Creature fighter2, int distance) {

        String fighter1Name = fighter1.getCreatureName();
        String fighter2Name = fighter2.getCreatureName();

        if (fighter1.getWeapon() == null || isEnemyNotInRange(fighter1.getWeapon().getAttackRange(), distance)) {System.out.println(fighter1Name + " cannot attack.");}

        else {
            unitAttacks(fighter1, fighter2);}

        if (!isDead(fighter2)) {
            if (fighter2.getWeapon() == null|| isEnemyNotInRange(fighter2.getWeapon().getAttackRange(), distance)) {System.out.println(fighter2Name + " cannot attack.");}
            else {
                unitAttacks(fighter2, fighter1);}
        }
    }

    public static void fightInColosseum(Creature combatant1, Creature combatant2, int distance) {
        int turnCount = 1;

        while (((combatant1.getCreatureStats().getHealth() != 0) || (combatant2.getCreatureStats().getHealth() != 0)) || turnCount <= 20) {

            System.out.println("Round: " + turnCount);

            if (turnCount % 2 == 1) {fightRound(combatant1, combatant2, distance);}

            else {fightRound(combatant2, combatant1, distance);}

            if (isDead(combatant1) || isDead(combatant2)) {break;}

            turnCount += 1;
        }

        System.out.println("The winner is " + winner);
    }

    private static void unitAttacks(Creature creature1, Creature creature2) {
        boolean fighter1hit = doesHit(creature1, creature2);
        if (fighter1hit) {
            int fighter1DamageDealt = damageCalculator(creature1, creature2);
            displayActionTaken(creature1.getCreatureName(), fighter1DamageDealt, creature2);
        }
        else {System.out.println(creature1.getCreatureName() + " missed.");}
    }

    private static boolean isEnemyNotInRange(ArrayList<Integer> weaponRange, int distance) {
        int shortDistance = weaponRange.get(0);
        int longDistance = weaponRange.get(1);

        return (shortDistance > distance) || (distance > longDistance);
    }

    private static void displayActionTaken(String fighter1Name, int fighter1DamageDealt, Creature fighter2) {

        System.out.println(fighter1Name + message + fighter1DamageDealt + " damage.");
        fighter2.damageToHealth(fighter1DamageDealt);
        System.out.println( fighter2.getCreatureName() + " Health: " + fighter2.getCreatureStats().getHealth());

        if (isDead(fighter2)) {
            System.out.println(fighter2.getCreatureName() + " died!");
            winner = fighter1Name;
        }
    }

    private static boolean doesHit(Creature attacker, Creature defender){
        int hits = attacker.getHitRate() - defender.getAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    private static int damageCalculator(Creature attacker, Creature defender) {
        if (attacker.getWeapon() == null) {return 0;}

        boolean type = attacker.getWeapon().isWeaponIsMagic();
        int damage;

        if (type) {
            damage = attacker.getDamage() - defender.getCreatureStats().getResistance();
            damage = criticalCalculator(attacker, defender, damage);
            if (damage <= 0){damage = 0;}
        }

        else {
            damage = attacker.getDamage() - defender.getCreatureStats().getDefense();
            damage = criticalCalculator(attacker, defender, damage);
            if (damage <= 0){damage = 0;}
        }

        return damage;
    }

    private static int criticalCalculator(Creature attacker, Creature defender, int damageDone) {

        int attackerCritical = attacker.getCritRate() - defender.getCreatureStats().getLuck();
        int chance = (int)(Math.random() * 100);

        boolean success = attackerCritical >= chance;

        if (success) {
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
