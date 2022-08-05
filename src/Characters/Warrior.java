package Characters;

import Interface.Attacker;

public class Warrior extends Character implements Attacker {


    //Class properties
    private int stamina;
    private int strength;

    //constructors
    public Warrior(int id, String name, int hp, boolean isAlive, boolean inCombat, int stamina, int strength) {
        super(id, name, hp, isAlive, inCombat);
        this.stamina = stamina;
        this.strength = strength;
    }

    //interface methods
    public void strongAttack() {
    }
    public void weakAttack() {
    }
    public void regeneration() {
    }

    //getters
    public int getStamina() {
        return stamina;
    }
    public int getStrength() {
        return strength;
    }

    //setters
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
}