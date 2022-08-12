package Characters;

import Interface.Attacker;

public class Warrior extends Character{


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
    @Override
    public int[] attackCommand() {
        super.attackCommand();
        int damage;
        if (getStamina() > 5) {
            damage = this.strength;
            setStamina(getStamina()-5);
        } else {
            damage = this.strength / 2;
            setStamina(getStamina()+3);
        }
        int[] results = new int[4];

        //results
        results[0] = damage;
        results[2] = 3;
        results[3] = 0;
        return results;

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