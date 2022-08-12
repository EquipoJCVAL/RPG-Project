package BattleSimulator;
import Characters.Character;
import Characters.Wizard;
import java.util.ArrayList;

public class Combat {

    static ArrayList<String> colorArray = new ArrayList<String>(){
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

    public static void combat(Character fighter1, Character fighter2){


        while(fighter1.getHp()>0||fighter2.getHp()>0){

            //damage and heal values
            int damage1 = fighter1.attackCommand()[0];
            int heal1 = fighter1.attackCommand()[1];
            int classColor1 = fighter1.attackCommand()[2];
            int damage2 = fighter2.attackCommand()[0];
            int heal2 = fighter2.attackCommand()[1];
            int classColor2 = fighter2.attackCommand()[2];
            int dogHit1 = fighter1.attackCommand()[3];
            int dogHit2 = fighter2.attackCommand()[3];


            //dice rolls
            int random1 = (int) (Math.random() * 20) + 1;
            int random2 = (int) (Math.random() * 20) + 1;

            System.out.println("The next turn is about to begin!");

            //we check if either characters can heal themselves (if attackCommand()[1] is bigger than 0, means
            //they can
            if(heal1 > 0){
                System.out.println(ANSI_HEAL + fighter1.getName() + " heals themselves for "
                        + heal1 + " life points!");
                fighter1.setHp(fighter1.getHp() +heal1);
            }
            if(heal2 > 0){
                System.out.println(ANSI_HEAL + fighter2.getName() + " heals themselves for "
                        + heal2 + " life points!");
                fighter1.setHp(fighter2.getHp() +heal2);
            }

            //we start combat
            if(random1 < 4){
                //we miss!
                System.out.println(fighter1.getName() + " misses their attack.");
            } else if(random1 < 18){
                //Hit! We do the damage
                System.out.println(colorArray.get(classColor1) + fighter1.getName()
                        + " deals " + damage1 + " damage." + ANSI_RESET);
                fighter2.setHp(fighter2.getHp() - damage1);
            } else {
                //we do crit damage!
                System.out.println(colorArray.get(classColor1) + fighter1.getName() + " deals "
                        + damage1 + ANSI_CRIT + " CRITICAL" + colorArray.get(classColor1) + " damage." + ANSI_RESET);
                fighter2.setHp(fighter2.getHp() - damage1 * 2);
            }

            if(random2 < 4){
                //we miss!
                System.out.println(fighter2.getName() + " misses their attack.");
            } else if(random2 < 18){
                //Hit! We do the damage
                System.out.println(colorArray.get(classColor2) + fighter2.getName()
                        + " deals " + damage2 + " damage." + ANSI_RESET);
                fighter1.setHp(fighter1.getHp() - damage2);
            } else {
                //we do crit damage!
                System.out.println(colorArray.get(classColor2) + fighter2.getName() + " deals "
                        + damage2 + ANSI_CRIT + " CRITICAL" + colorArray.get(classColor2) + " damage." + ANSI_RESET);
                fighter1.setHp(fighter1.getHp() - damage2 *2);
            }

            //now we'll check if any of the characters have an array [3] > 0, so we can check if any of them are a houndmaster
            //and if any of them are getting extra attacks from their dog companion

            if(dogHit1 > 0) {
                System.out.println("The Houndmaster's pet attacks! Hitting " + fighter2.getName() + " a total of " + dogHit1 + " times!");
                for (int i = 0; i < dogHit1; i++) {
                    System.out.println(colorArray.get(classColor1) + fighter1.getName()
                            + "'s dog deals " + damage1 + " damage." + ANSI_RESET);
                    fighter2.setHp(fighter2.getHp() - damage1 /4);
                }
            }
            if(dogHit2 > 0) {
                System.out.println("The Houndmaster's pet attacks! Hitting " + fighter1.getName() + " a total of " + dogHit2 + " times!");
                for (int i = 0; i < dogHit2; i++) {
                    System.out.println(colorArray.get(classColor2) + fighter2.getName()
                            + "'s dog deals " + damage2 + " damage." + ANSI_RESET);
                    fighter1.setHp(fighter1.getHp() - damage2 /4);
                }
            }
        }
    }
}
