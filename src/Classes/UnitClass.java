package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class UnitClass {

    private String name = "";
    private int lvlCap = 0;
    private int hpCap = 0;
    private int attCap = 0;
    private int magCap = 0;
    private int sklCap = 0;
    private int luckCap = 0;
    private int spdCap = 0;
    private int defCap = 0;
    private int resCap = 0;

    private int hpGrowth = 0;
    private int attGrowth = 0;
    private int magGrowth = 0;
    private int sklGrowth = 0;
    private int luckGrowth = 0;
    private int spdGrowth = 0;
    private int defGrowth = 0;
    private int resGrowth = 0;

    private ArrayList<String> equipable = new ArrayList<>();

    public UnitClass(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String row;
            row = reader.readLine();
            String[] data = row.split(",");
            this.name = data[0];
            setClassStatCap(Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),
                            Integer.parseInt(data[4]), Integer.parseInt(data[5]),Integer.parseInt(data[6]),
                            Integer.parseInt(data[7]), Integer.parseInt(data[8]),Integer.parseInt(data[9]));

            setClassGrowthRate(Integer.parseInt(data[10]),Integer.parseInt(data[11]),Integer.parseInt(data[12]),
                               Integer.parseInt(data[13]),Integer.parseInt(data[14]),Integer.parseInt(data[15]),
                               Integer.parseInt(data[16]),Integer.parseInt(data[17]));
            setEquipableWeapons(data[18]);
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setClassStatCap(int LvlCap, int HpCap, int AttackCap,
                                int MagicCap, int SkillCap, int LuckCap,
                                int SpeedCap, int DefenseCap, int ResistenceCap) {

        lvlCap = LvlCap;
        hpCap = HpCap;
        attCap = AttackCap;
        magCap = MagicCap;
        sklCap = SkillCap;
        luckCap = LuckCap;
        spdCap = SpeedCap;
        defCap = DefenseCap;
        resCap = ResistenceCap;
    }

    private void setClassGrowthRate(int HpGrowth, int AttackGrowth,
                              int MagicGrowth, int SkillGrowth, int LuckGrowth,
                              int SpeedGrowth, int DefenseGrowth, int ResistanceGrowth) {

        hpGrowth = HpGrowth;
        attGrowth = AttackGrowth;
        magGrowth = MagicGrowth;
        sklGrowth = SkillGrowth;
        luckGrowth = LuckGrowth;
        spdGrowth = SpeedGrowth;
        defGrowth = DefenseGrowth;
        resGrowth = ResistanceGrowth;
    }

    private void setEquipableWeapons(String weapons) {
        String[] all_weapons = weapons.split(":");
        Collections.addAll(this.equipable, all_weapons);
    }

    public ArrayList<String> getEquipable() {return equipable;}

    public String getName() {return name;}
    public int getHealthCap() {return hpCap;}
    public int getLevelCap() {return lvlCap;}
    public int getAttackCap() {return attCap;}
    public int getMagicCap() {return magCap;}
    public int getSkillCap() {return sklCap;}
    public int getLuckCap() {return luckCap;}
    public int getSpeedCap() {return spdCap;}
    public int getDefenseCap() {return defCap;}
    public int getResistanceCap() {return resCap;}

    public int getHpGrowth() {return hpGrowth;}
    public int getAttGrowth() {return attGrowth;}
    public int getMagGrowth() {return magGrowth;}
    public int getSklGrowth() {return sklGrowth;}
    public int getLuckGrowth() {return luckGrowth;}
    public int getSpdGrowth() {return spdGrowth;}
    public int getDefGrowth() {return defGrowth;}
    public int getResGrowth() {return resGrowth;}
}
