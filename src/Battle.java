public class Battle {

    private String winner = "No Winner";
    private String message = "";

    public Battle() {}

    public void fightRound(Creature fighter1, Creature fighter2) {

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

        if (!isAlive(fighter2)) {}

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

    private void displayActionTaken(String fighter1Name, int fighter1DamageDealt, Creature fighter2) {


        System.out.println(fighter1Name + message + fighter1DamageDealt +
                           " damage, " + fighter2.getCreatureName() + " Health:" + fighter2.getCreatureStats().getHealth());

        fighter2.damageToHealth(fighter1DamageDealt);

        if (!isAlive(fighter2)) {
            System.out.println(fighter2.getCreatureName() + " died!");
            winner = fighter1Name;
        }
    }

    private boolean doesHit(Creature attacker, Creature defender){

        int hits = attacker.getHitRate() - defender.getAvoidRate();
        return hits >= ((int)(Math.random() * 100));
    }

    private int damageCalculator(Creature attacker, Creature defender) {

        if (attacker.getWeapon() == null) {return 0;}

        int type = attacker.getWeapon().getType().getType();
        int damage;

        if (type == 1) {
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

    private int criticalCalculator(Creature attacker, Creature defender, int damageDone) {

        int attackerCritical = attacker.getCritRate() - defender.getCreatureStats().getLuck();
        int chance = (int)(Math.random() * 100);

        boolean success = attackerCritical >= chance;

        if (success) {
            message = " hits for a critical of ";
            return damageDone*3;
        }

        else {
            message = " hits enemy for ";
            return damageDone;
        }
    }

    private boolean isAlive(Creature creature) {
        return (creature.getCreatureStats().getHealth() != 0);
    }


    public void fightInColosseum(Creature fighter1, Creature fighter2) {

        int turns = 0;

        while (((fighter1.getCreatureStats().getHealth() != 0) && (fighter2.getCreatureStats().getHealth() != 0)) || turns <= 20) {

            System.out.println("Round: " + turns);

            if (turns % 2 == 0) {fightRound(fighter1, fighter2);}

            else {fightRound(fighter2, fighter1);}

            if (!isAlive(fighter1) || !isAlive(fighter2)) {break;}

            turns += 1;
        }

        System.out.println("The winner is " + winner);
    }

    public void fightSingleRound(Creature creature1, Creature creature2) {

        if (creature1.getWeapon().getType().getType() == 1) {
        }
    }
}
