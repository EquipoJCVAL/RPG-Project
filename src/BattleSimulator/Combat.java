package BattleSimulator;
import Characters.Wizard;
import java.util.ArrayList;

public class Combat {

    ArrayList<String> colorArray = new ArrayList<String>(){
        {
            add("\u001B[32m"); //RANGER + HOUNDMASTER
            add("\u001B[34m"); //WIZARD
            add("\u001B[35m"); //WITCH
            add("\u001b[31m"); //DRAGON + WARRIOR
        }
    };

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_HEAL = "\u001B[36m";
    public static final String ANSI_CRIT = "\u001B[33m";

    /*
    public static final String ANSI_RANGER = "\u001B[32m";
    public static final String ANSI_WIZARD = "\u001B[34m";
    public static final String ANSI_WITCH = "\u001B[35m";
     */

    public void combat(){

        Wizard laia = new Wizard(03, "Laia", 200, true, false, 40, 40);
        Wizard alex = new Wizard(04, "Alex", 200, true, false, 40, 40);

        Wizard fighter1 = laia;
        Wizard fighter2 = alex;


        while(fighter1.getHp()>0||fighter2.getHp()>0){

            //damage and heal values
            int damage1 = fighter1.attackCommand()[0];
            int heal1 = fighter1.attackCommand()[1];
            int classColor1 = fighter1.attackCommand()[2];
            int damage2 = fighter2.attackCommand()[0];
            int heal2 = fighter2.attackCommand()[1];
            int classColor2 = fighter2.attackCommand()[2];


            //dice rolls
            int random1 = (int) (Math.random() * 20) + 1;
            int random2 = (int) (Math.random() * 20) + 1;

            System.out.println("The next turn is about to begin!");

            //we check if either characters can heal themselves (if attackCommand()[1] is bigger than 0, means
            //they can
            if(heal1 > 0){
                System.out.println(colorArray.get(classColor1) + fighter1.getName() + "heals themselves for "
                        + heal1 + "life points!");
                fighter1.setHp(fighter1.getHp() +heal1);
            }
            if(heal2 > 0){
                System.out.println(colorArray.get(classColor1) + fighter2.getName() + "heals themselves for "
                        + heal2 + "life points!");
                fighter1.setHp(fighter2.getHp() +heal2);
            }

            //we start combat
            if(random1 < 4){
                //we miss!
                System.out.println(fighter1.getName() + "misses their attack.");
            } else if(random1 < 18){
                //Hit! We do the damage
                System.out.println(colorArray.get(classColor1) + fighter1.getName()
                        + "deals " + damage1 + "damage." + ANSI_RESET);
                fighter2.setHp(fighter2.getHp() - damage1);
            } else {
                //we do crit damage!
                System.out.println(colorArray.get(classColor1) + fighter1.getName() + "deals "
                        + damage1 + ANSI_CRIT + "CRITICAL" + colorArray.get(classColor1) + "damage." + ANSI_RESET);
                fighter2.setHp(fighter2.getHp() - damage1 * 2);
            }

            if(random2 < 4){
                //we miss!
                System.out.println(fighter2.getName() + "misses their attack.");
            } else if(random2 < 18){
                //Hit! We do the damage
                System.out.println(colorArray.get(classColor2) + fighter2.getName() + "deals " + damage2 + "damage." + ANSI_RESET);
                fighter1.setHp(fighter1.getHp() - damage2);
            } else {
                //we do crit damage!
                System.out.println(colorArray.get(classColor2) + fighter2.getName() + "deals "
                        + damage2 + ANSI_CRIT + "CRITICAL" + colorArray.get(classColor2) + "damage." + ANSI_RESET);
                fighter1.setHp(fighter1.getHp() - damage2 *2);
            }
        }
    }
}
