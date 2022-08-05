package Characters;

import Interface.Attacker;

public class Wizard extends Character implements Attacker {

    //Class properties;
    private int mana;
    private int intelligence;

    //Constructor
    public Wizard(int id, String name, int hp, boolean isAlive, boolean inCombat, int mana, int intelligence) {
        super(id, name, hp, isAlive, inCombat);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    //Interface methods
    public void strongAttack() {
    }
    public void weakAttack() {
    }
    public void regeneration() {
    }

    //getters
    public int getMana() {
        return mana;
    }
    public int getIntelligence() {
        return intelligence;
    }

    //setters
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
