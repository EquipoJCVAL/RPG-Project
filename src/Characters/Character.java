package Characters;

import Interface.Attacker;

public class Character implements Attacker {

    //properties
    private int id;
    private static int counterId = 0;
    private String name;
    private int hp;
    private boolean isAlive;
    private boolean inCombat;

    //Constructor
    public Character(String name, int hp, boolean isAlive, boolean inCombat) {
        setId();
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
        this.inCombat = inCombat;
    }



    //Interface Methods
    public int[] attackCommand(){
        return null;

    }

    //getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public boolean isInCombat() {
        return inCombat;
    }

    //setters
    public void setId() {
        this.id = counterId++;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public void setInCombat(boolean inCombat) {
        this.inCombat = inCombat;
    }
}
