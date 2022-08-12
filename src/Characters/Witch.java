package Characters;

public class Witch extends Character{


    private int darkMana;
    private int arcane;
    private int poison = 0;

    //constructor
    public Witch(String name, int hp, boolean isAlive, boolean inCombat, int darkMana, int arcane) {
        super(name, hp, isAlive, inCombat);
        this.darkMana = darkMana;
        this.arcane = arcane;
    }

    //recuerda que la witch tiene el atque normal -> "cada turno hace baseDamage + baseDamage; el primer turno hace
    // daño = baseDamage, el segundo turno seria baseDamage*2, el tercero baseDamage*3, etc
    // y luego el "ataque" que gastara recursos es un if(hp < 70 (un valor plano cualquiera)) { hp+50; darkMana -10
    //eso es lo que tiene que hacer el attack command de la witch
    @Override
    public int[] attackCommand() {
        super.attackCommand();
        int cura = 0;

        if (getDarkMana() > 10 && getHp() < 70) {
            cura = 50;
            setDarkMana(getDarkMana()-10);
        } else {
            setPoison(getPoison() + arcane/2);
            setDarkMana(getDarkMana()+3);
        }

        int[] results = new int[4];

        //results
        results[0] = poison;
        results[1] = cura;
        results[2] = 2;
        results[3] = 0;
        return results;

    }

    //getters
    public int getDarkMana() {
        return darkMana;
    }
    public int getArcane() {
        return arcane;
    }
    public int getPoison() {
        return poison;
    }

    //setters
    public void setDarkMana(int darkMana) {
        this.darkMana = darkMana;
    }
    public void setArcane(int arcane) {
        this.arcane = arcane;
    }
    public void setPoison(int poison) {
        this.poison = poison;
    }
}
