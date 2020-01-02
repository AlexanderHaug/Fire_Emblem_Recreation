package Battalions;

public abstract class Battalion {
    protected String battalionName = "No Battalion";
    protected int battalionPhysicalBonus = 0;
    protected int battalionMagicalBonus = 0;
    protected int battalionHitBonus = 0;
    protected int battalionCritBonus = 0;
    protected int battalionAvoBonus = 0;
    protected int battalionProtectionBonus = 0;
    protected int battalionResistanceBonus = 0;
    protected int battalionCharmBonus = 0;
    protected Gambit battalionGambit;
    protected Character battalionRank;
    protected int battalionEndurance = 0;

    public String getBattalionName() {return this.battalionName;}

    public int getBattalionPhysicalBonus() {return this.battalionPhysicalBonus;}

    public int getBattalionMagicalBonus() {return this.battalionMagicalBonus;}

    public int getBattalionHitBonus() {return this.battalionHitBonus;}

    public int getBattalionCritBonus() {return this.battalionCritBonus;}

    public int getBattalionAvoBonus() {return this.battalionAvoBonus;}

    public int getBattalionProtectionBonus() {return battalionProtectionBonus;}

    public int getBattalionResistanceBonus() {return battalionResistanceBonus;}

    public int getBattalionCharmBonus() {return battalionCharmBonus;}

    public Gambit getBattalionGambit() {return battalionGambit;}

    public Character getBattalionRank() {return battalionRank;}

    public int getBattalionEndurance() {return battalionEndurance;}
}
