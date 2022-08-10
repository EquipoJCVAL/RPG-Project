package Characters;

public class Dragon extends Character {

    private int power;
    private int essence;

    public Dragon(int id, String name, int hp, boolean isAlive, boolean inCombat, int power, int essence) {
        super(id, name, hp, isAlive, inCombat);
        this.power = power;
        this.essence = essence;
    }

    //el dragon es exactamente normal, como un wizard o una wizard/warrior, pero tiene el condicional de "if hp<50{ daño*2}"
    // asi que tendras que usar el mismo codigo que para un warrior, basicamente, pero con 2 loops adicionales, uno
    // que una vez sabes si tiene suficiente mana y va a hacer el ataque fuerte, compare la vida, si tiene menos de vida
    // X, hace daño*2, sino, que haya un "else" que haga el daño normal, y yata
    @Override
    public int[] attackCommand() {
        super.attackCommand();
        int damage;
        if (getEssence() > 5) {
            if (getHp() < 50) {
                damage = this.power*2;
                setEssence(getEssence()-5);
            } else {
                damage = this.power;
                setEssence(getEssence()-5);
            }
        } else {
            if( getHp() < 50) {
                damage = this.power;
                setEssence(getEssence()+3);
            } else {
                damage = this.power/2;
                setEssence(getEssence()+3);
            }
        }

        int[] results = new int[3];

        //results
        results[0] = damage;
        results[2] = 3;
        return results;
    }

    //getters
    public int getPower() {
        return power;
    }
    public int getEssence() {
        return essence;
    }

    //setters
    public void setPower(int power) {
        this.power = power;
    }
    public void setEssence(int essence) {
        this.essence = essence;
    }
}
