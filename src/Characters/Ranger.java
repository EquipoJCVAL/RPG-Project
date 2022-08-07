package Characters;

import Interface.Attacker;

public class Ranger extends Character{

    //Class properties
    private int agility;
    private int energy;


    //constructor
    public Ranger(int id, String name, int hp, boolean isAlive, boolean inCombat, int agility, int energy) {
        super(id, name, hp, isAlive, inCombat);
        this.agility = agility;
        this.energy = energy;
    }


    // como al final no sabemos muy bien que haremos con el ranger, si quieres puedes dejarlo normal/basico como el wizard
    // o el guerrero, y luego ya pensaremos algo

    //interface methods
    @Override
    public int[] attackCommand() {
        super.attackCommand();
    }

    //getters
    public int getAgility() {
        return agility;
    }
    public int getEnergy() {
        return energy;
    }

    //setters
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
