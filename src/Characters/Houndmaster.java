package Characters;

public class Houndmaster extends Character {


    private int focus;
    private int precision;


    //constructor
    public Houndmaster(String name, int hp, boolean isAlive, boolean inCombat, int precision, int focus) {
        super(name, hp, isAlive, inCombat);
        this.precision = precision;
        this.focus = focus;
    }

    //el hooundmaster va a tener unas mecanicas más o menos normales, con la unica diferencia que cada vez que ataque va a
    //atacar 2 veces, una el mismo, y la otra el perro, no tienes que crear un object que se llame perro, puede ser
    //simplemetne que haga daño dos veces, una que sea daño = precision*0.75, y otra que sea daño = precision*0.25
    //luego ya podemos pensar de añadir alguna mecanica mas que interactue con el perrete
    @Override
    public int[] attackCommand() {
        super.attackCommand();
        int dogHits = 0;
        int damage;

        if (getFocus() > 5) {
            dogHits = (int) (Math.random() * 3);
            damage = (int) (this.precision*0.75);
            setFocus(getFocus()-5);
        } else {
            damage = (int) (this.precision*0.75);
            setFocus(getFocus()+1);
        }

        int[] results = new int[4];

        //results
        results[0] = damage;
        results[2] = 0;
        results[3] = dogHits;
        return results;

    }

    //getters
    public int getFocus() {
        return focus;
    }
    public int getPrecision() {
        return precision;
    }


    //setters
    public void setFocus(int focus) {
        this.focus = focus;
    }
    public void setPrecision(int precision) {
        this.precision = precision;
    }

}

