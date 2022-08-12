package Characters;

import Interface.Attacker;

public class Wizard extends Character{

    //Class properties;
    private int mana;
    private int intelligence;

    //Constructor
    public Wizard(String name, int hp, boolean isAlive, boolean inCombat, int mana, int intelligence) {
        super(name, hp, isAlive, inCombat);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    //Interface methods
    @Override
    public int[] attackCommand() {
        super.attackCommand();
        int damage;
        if(getMana() > 5){
            damage = this.intelligence;
            setMana(getMana() -5);
        } else {
            damage = this.intelligence/2;
            setMana(getMana() +3);
        }
        int[] results = new int[4];

        // results
        results[0] = damage;
        results[2] = 1;
        results[3] = 0;
        return results;
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
