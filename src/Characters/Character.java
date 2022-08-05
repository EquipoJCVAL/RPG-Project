package Characters;

public class Character {

    //properties
    private int id;
    private String name;
    private int hp;
    private boolean isAlive;
    private boolean inCombat;

    //Constructor
    public Character(int id, String name, int hp, boolean isAlive, boolean inCombat) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
        this.inCombat = inCombat;
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
    public void setId(int id) {
        this.id = id;
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
