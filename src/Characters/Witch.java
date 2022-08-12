package Characters;

public class Witch extends Character{

    private int arcane;
    private int darkMana;

    private int poison = 0;

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
    public int[] attackCommand() {
        super.attackCommand();
        int cura = 0;
        if (getDarkMana() > 5 && getHp() < 70) {
            cura = 50;
            setDarkMana(getDarkMana()-5);
        } else {
            poison = this.arcane/2;
            setDarkMana(getDarkMana()+3);
        }

        int[] results = new int[3];

        //results
        results[0] = poison;
        results[1] = cura;
        results[2] = 2;
        results[3] = 0;
        return results;

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
