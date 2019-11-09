package Creatures;

public class CreatureStatBonuses {
    private int[] statBuffs;
    private int[] statDebuffs;
    private int[] statBonuses;

    public CreatureStatBonuses() {
        statBuffs = new int[9];
        statDebuffs = new int[9];
        statBonuses = new int[9];
    }

    public void setStatBonuses(int[] bonuses) {
        for (int x = 0; x < statBuffs.length; x++) {
            if (bonuses[x] < 0) {this.statDebuffs[x] = bonuses[x];}

            else {this.statBuffs[x] = bonuses[x];}
        }
    }

    public void decreaseStatBonuses(int[] bonuses) {
        for (int x = 0; x < statBuffs.length; x++) {
            if (bonuses[x] < 0) {this.statDebuffs[x] += Math.abs(bonuses[x]);}

            else {this.statBuffs[x] -= bonuses[x];}
        }
    }

    public int[] getCreatureStatBonuses() {
        for (int x = 0; x < statBonuses.length; x++) {statBonuses[x] = statBuffs[x] - statDebuffs[x];}
        return statBonuses;
    }
}
