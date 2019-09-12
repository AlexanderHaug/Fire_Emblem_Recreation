import Classes.UnitClass;
import Weapons.Weapon;

public class CreatureStats {

    private UnitClass unitclass;
    private int level = 0;
    private int health = 0;
    private int attack = 0;
    private int magic = 0;
    private int skill = 0;
    private int luck = 0;
    private int speed = 0;
    private int defense = 0;
    private int resistance = 0;
    private int experience = 0;

    private int maxHpMod = 0;
    private int maxAttMod = 0;
    private int maxMagMod = 0;
    private int maxSklMod = 0;
    private int maxLuckMod = 0;
    private int maxSpdMod = 0;
    private int maxDefMod = 0;
    private int maxResMod = 0;

    private int hpGrowth = 0;
    private int attGrowth = 0;
    private int magGrowth = 0;
    private int sklGrowth = 0;
    private int luckGrowth = 0;
    private int spdGrowth = 0;
    private int defGrowth = 0;
    private int resGrowth = 0;

    private Weapon weapon = null;

    public CreatureStats(UnitClass unit ,int Level,
                    int Health, int Attack, int Magic, int Skill,
                    int Luck, int Speed, int Defense, int Resistance) {

        setAllStats(unit , Level, Health, Attack, Magic, Skill, Luck, Speed, Defense, Resistance);
    }

    private void setAllStats(UnitClass unit , int Level,
                             int Health, int Attack, int Magic, int Skill,
                             int Luck, int Speed, int Defense, int Resistance) {

        this.unitclass = unit;

        if (Level > unit.getLevelCap()) {level = unit.getLevelCap();}
        else {level = Level;}

        if (Health > unit.getHealthCap()) {health = unit.getHealthCap();}
        else {health = Health;}

        if (Attack > unit.getAttackCap()) {attack = unit.getAttackCap();}
        else {attack = Attack;}

        if (Magic > unit.getMagicCap()) {magic = unit.getMagicCap();}
        else {magic = Magic;}

        if (Skill > unit.getSkillCap()) {skill = unit.getSkillCap();}
        else {skill = Skill;}

        if (Luck > unit.getLuckCap()) {luck = unit.getLuckCap();}
        else {luck = Luck;}

        if (Speed > unit.getSpeedCap()) {speed = unit.getSpeedCap();}
        else {speed = Speed;}

        if (Defense > unit.getDefenseCap()) {defense = unit.getDefenseCap();}
        else {defense = Defense;}

        if (Resistance > unit.getResistanceCap()) {resistance = unit.getResistanceCap();}
        else {resistance = Resistance;}
    }

    public UnitClass getUnitclass() {return unitclass;}

    public int getLevel() {return level;}

    public int getHealth() {return health;}

    public int getAttack() {return attack;}

    public int getMagic() {return magic;}

    public int getSkill() {return skill;}

    public int getLuck() {return luck;}

    public int getSpeed() {return speed;}

    public int getDefense() {return defense;}

    public int getResistance() {return resistance;}

    public int getExperience() {return experience;}

    public void setLevel(int level) {this.level = level;}
    public void setHealth(int health) {this.health = health;}

    public void setAttack(int attack) {this.attack = attack;}

    public void setMagic(int magic) {this.magic = magic;}
}
