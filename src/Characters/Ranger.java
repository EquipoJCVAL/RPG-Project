package Characters;

import Interface.Attacker;

public class Ranger extends Character implements Attacker {

    //Class properties
    private int agility;
    private int energy;
    private

    //constructor
    public Ranger(int id, String name, int hp, boolean isAlive, boolean inCombat, int agility, int energy) {
        super(id, name, hp, isAlive, inCombat);
        this.agility = agility;
        this.energy = energy;
    }



    //interface methods
    public void strongAttack() {
    }
    public void weakAttack() {
    }
    public void regeneration() {
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
