package Characters;

public class Witch extends Character{

    private int arcane;
    private int darkMana;

    //constructor
    public Witch(int id, String name, int hp, boolean isAlive, boolean inCombat, int arcane, int darkMana) {
        super(id, name, hp, isAlive, inCombat);
        this.arcane = arcane;
        this.darkMana = darkMana;
    }

    //recuerda que la witch tiene el atque normal -> "cada turno hace baseDamage + baseDamage; el primer turno hace
    // daño = baseDamage, el segundo turno seria baseDamage*2, el tercero baseDamage*3, etc
    // y luego el "ataque" que gastara recursos es un if(hp < 70 (un valor plano cualquiera)) { hp+50; darkMana -10
    //eso es lo que tiene que hacer el attack command de la witch
    @Override
    public void attackCommand() {
        super.attackCommand();
    }

    //getters
    public int getArcane() {
        return arcane;
    }
    public int getDarkMana() {
        return darkMana;
    }

    //setters
    public void setArcane(int arcane) {
        this.arcane = arcane;
    }
    public void setDarkMana(int darkMana) {
        this.darkMana = darkMana;
    }
}
