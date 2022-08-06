package Characters;

public class Dragon extends Character {

    private int power;
    private int essence;

    public Dragon(int id, String name, int hp, boolean isAlive, boolean inCombat, int power, int essence) {
        super(id, name, hp, isAlive, inCombat);
        this.power = power;
        this.essence = essence;
    }

    //el dragon es exactamente normal, como un wizard o una witch, pero tiene el condicional de "if hp<50{ daño*2}"
    // asi que tendras que usar el mismo codigo que para un warrior, basicamente, pero con 2 loops adicionales, uno
    // que una vez sabes si tiene suficiente mana y va a hacer el ataque fuerte, compare la vida, si tiene menos de vida
    // X, hace daño*2, sino, que haya un "else" que haga el daño normal, y yata
    @Override
    public int[] attackCommand() {
        super.attackCommand();
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
