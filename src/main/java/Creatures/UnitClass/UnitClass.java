package Creatures.UnitClass;

import java.util.ArrayList;

public abstract class UnitClass {

    private String name = "";
    private int[] unitClassMinStats = new int[10];
    private int[] unitClassGrowth = new int[9];
    private int move = 0;
    private String[] unitClassType = new String[7];
    private ArrayList<String> equipable = new ArrayList<>();

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int[] getUnitClassMinStats() {return unitClassMinStats;}

    public void setUnitClassMinStats(int[] unitClassMinStats) {this.unitClassMinStats = unitClassMinStats;}

    public int[] getUnitClassGrowth() {return unitClassGrowth;}

    public void setUnitClassGrowth(int[] unitClassGrowth) {this.unitClassGrowth = unitClassGrowth;}

    public int getMove() {return unitClassMinStats[9];}

    public String[] getUnitClassType() {return unitClassType;}

    public void setUnitClassType(String[] unitClassType) {this.unitClassType = unitClassType;}

    public ArrayList<String> getEquipable() {return equipable;}

    public void setEquipable(ArrayList<String> equipable) {this.equipable = equipable;}
}
