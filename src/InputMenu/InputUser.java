package InputMenu;

import BattleSimulator.Combat;
import CSVImportExport.ImportCharacters;
import Characters.*;

import java.io.FileNotFoundException;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Scanner;

public class InputUser {

    static ArrayList<Characters.Character> characterList = new ArrayList<>();
    static int numHp;
    static int numPow;
    static int numMana;


    public static void start() throws FileNotFoundException, InterruptedException {
        System.out.println("   ▄████████    ▄███████▄    ▄██████▄          ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████ \n" +
                "  ███    ███   ███    ███   ███    ███        ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███ \n" +
                "  ███    ███   ███    ███   ███    █▀         ███    █▀    ███    ███ ███   ███   ███   ███    █▀  \n" +
                " ▄███▄▄▄▄██▀   ███    ███  ▄███              ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄     \n" +
                "▀▀███▀▀▀▀▀   ▀█████████▀  ▀▀███ ████▄       ▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀     \n" +
                "▀███████████   ███          ███    ███        ███    ███   ███    ███ ███   ███   ███   ███    █▄  \n" +
                "  ███    ███   ███          ███    ███        ███    ███   ███    ███ ███   ███   ███   ███    ███ \n" +
                "  ███    ███  ▄████▀        ████████▀         ████████▀    ███    █▀   ▀█   ███   █▀    ██████████ \n" +
                "  ███    ███                                                                                       ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the game, adventurer, please state your name.");
        String playerName = sc.nextLine();
        System.out.println("Oh well oh well- It's the all mighty " + playerName + "... I.. I'm joking of course, who are you?");
        System.out.println("Regardless.. tell me, what do you want to do?");

        while(true) {

            System.out.println("1.- Create new character \n 2.- Import party \n 3.- Visit the graveyard \n 4.- Start combat \n 5.- Leave the game");

            while (true) {

                String whatNext = sc.nextLine();

                if (whatNext.equals("1")) {

                    System.out.println("Well well... you're gonna need characters, won't you? How about you make some");
                    System.out.println("...");
                    System.out.println("What will your character's name be?");
                    String characterName = sc.nextLine();
                    System.out.println("Choose the character class! Type the respective number");
                    System.out.println("1 - Warrior \n2 - Wizard \n3 - Dragon\n4 - Ranger\n5 - Witch\n6 - Houndmaster\n");
                    String characterClass = sc.nextLine();
                    System.out.println("Now.. now.. since I'm a merciful " + "\u001b[31m" + "narrator text" + "\u001B[0m" + ", I will let you assign your character 5 points, you can decide to give it more life, damage, or more resources to cast more special attacks");

                    while (true) {

                        System.out.println("How many points would you like to use to improve " + characterName + "'s life?");
                        String extraHp = sc.nextLine();
                        System.out.println("How many points would you like to use to improve " + characterName + "'s power?");
                        String extraPower = sc.nextLine();
                        System.out.println("How many points would you like to use to improve " + characterName + "'s ability to cast more spells?");
                        String extraMana = sc.nextLine();

                        numHp = Integer.parseInt(extraHp);
                        numPow = Integer.parseInt(extraPower);
                        numMana = Integer.parseInt(extraMana);

                        int totalValue = numMana + numPow + numHp;

                        if (totalValue > 5 || numHp > 5 || numPow > 5 || numMana > 5) {
                            System.out.println("\u001b[31m" + "You tried to asign too many points, please don't try and cheat ;)" + "\u001B[0m\"");
                            System.out.println("Try again");
                        } else {
                            break;
                        }
                    }

                    int characterHP = 120 + (20 * numHp);
                    int characterPower = 30 + (5 * numPow);
                    int characterMana = 15 + (3 * numMana);

                    switch (characterClass) {
                        case "1" -> {
                            Warrior warrior = new Warrior(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(warrior);
                        }
                        case "2" -> {
                            Wizard wizard = new Wizard(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(wizard);
                        }
                        case "4" -> {
                            Ranger ranger = new Ranger(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(ranger);
                        }
                        case "3" -> {
                            Dragon dragon = new Dragon(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(dragon);
                        }
                        case "5" -> {
                            Witch witch = new Witch(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(witch);
                        }
                        case "6" -> {
                            Houndmaster houndmaster = new Houndmaster(01, characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(houndmaster);
                            houndmaster.getName();
                        }
                    }

                    System.out.println("Very well, " + characterName + " Is now part of this stupid non real game, what would you want to do now?");
                    break;

                } else if (whatNext.equals("2")) {
                    while (true) {
                        System.out.println("Please, state the filename of the file you wish to import");
                        String path = sc.nextLine();
                        ImportCharacters.importCharacters(path);
                        break;
                    }
                } else if (whatNext.equals("3")) {
                    break;
                } else if (whatNext.equals("4")) {
                    if (characterList.size() < 2) {
                        System.out.println("I'm very sorry to ruin your bloodthirst, but you need at least two characters to do this.");
                        System.out.println("Please go back and make some more~");
                    } else {
                        System.out.println("Very well... you wish to fight.");
                        System.out.println("Please choose your fighters!");
                        String nameCheck1 = sc.nextLine();
                        Characters.Character fighter1 = null;
                        for (int i = 0; i < characterList.size(); i++) {
                            if (characterList.get(i).getName().equals(nameCheck1)) {
                                fighter1 = characterList.get(i);
                            }
                        }
                        System.out.println("And your adversary");
                        String nameCheck2 = sc.nextLine();
                        Characters.Character fighter2 = null;
                        for (int i = 0; i < characterList.size(); i++) {
                            if (characterList.get(i).getName().equals(nameCheck2)) {
                                fighter2 = characterList.get(i);
                            }
                        }

                        Combat.combat(fighter1, fighter2);
                    }
                    break;
                } else if (whatNext.equals("5")) {
                    System.out.println("Oh, it's a pity! We'll see you soon enough I'm sure. Goodbye~");
                    System.exit(0);
                } else {
                    System.out.println("Please, only write the number, nothing else");
                }
            }
        }
    }
}
