class Battle {

    private static String winner = "No Winner";
    private static String message = "";

    static void fightInColosseum(Creature combatant1, Creature combatant2) {

        int turnCount = 1;

        while (((combatant1.getCreatureStats().getHealth() != 0) || (combatant2.getCreatureStats().getHealth() != 0)) || turnCount <= 20) {

            System.out.println("Round: " + turnCount);

            if (turnCount % 2 == 1) {fightRound(combatant1, combatant2);}

            else {fightRound(combatant2, combatant1);}

            if (isDead(combatant1) || isDead(combatant2)) {break;}

            turnCount += 1;
        }

        System.out.println("The winner is " + winner);
    }

    private static void fightRound(Creature fighter1, Creature fighter2) {

        String fighter1Name = fighter1.getCreatureName();
        String fighter2Name = fighter2.getCreatureName();

        if (fighter1.getWeapon() == null) {System.out.println(fighter1Name + " cannot attack.");}

        else {

            boolean fighter1hit = doesHit(fighter1, fighter2);
            if (fighter1hit) {
                int fighter1DamageDealt = damageCalculator(fighter1, fighter2);
                displayActionTaken(fighter1Name, fighter1DamageDealt, fighter2);
            }

            else {System.out.println(fighter1Name + " missed.");}
        }

        if (isDead(fighter2)) {}

        else {

            if (fighter2.getWeapon() == null) {System.out.println(fighter2Name + " cannot attack.");}


            else {
                boolean fighter2hit = doesHit(fighter2, fighter1);
                if (fighter2hit) {
                    int fighter2DamageDealt = damageCalculator(fighter2, fighter1);
                    displayActionTaken(fighter2Name, fighter2DamageDealt, fighter1);
                }

                else {System.out.println(fighter2Name + " missed.");}
            }
        }
    }

    private static void displayActionTaken(String fighter1Name, int fighter1DamageDealt, Creature fighter2) {


        System.out.println(fighter1Name + message + fighter1DamageDealt +
                           " damage, " + fighter2.getCreatureName() + " Health: " + fighter2.getCreatureStats().getHealth());

        fighter2.damageToHealth(fighter1DamageDealt);

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
