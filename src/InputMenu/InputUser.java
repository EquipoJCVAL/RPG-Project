package InputMenu;

import BattleSimulator.Combat;
import CSVImportExport.ImportCharacters;
import Characters.*;
import Characters.Character;
import Randomizer.PartyMaker;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.*;

public class InputUser {

    static ArrayList<Characters.Character> characterList = new ArrayList<>();
    String winnerTeam;
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

            System.out.println("1.- Create new character \n 2.- Import party \n 3.- Visit the graveyard \n 4.- Start combat \n 5.- Party fight \n 6.- Leave the game");

            for (int i = 0; i < characterList.size(); i++) {
                System.out.println(characterList.get(i).getId());
            }
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
                    int characterPower = 15 + (3 * numPow);
                    int characterMana = 15 + (3 * numMana);

                    switch (characterClass) {
                        case "1" -> {
                            Warrior warrior = new Warrior(characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(warrior);
                        }
                        case "2" -> {
                            Wizard wizard = new Wizard(characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(wizard);
                        }
                        case "4" -> {
                            Ranger ranger = new Ranger(characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(ranger);
                        }
                        case "3" -> {
                            Dragon dragon = new Dragon(characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(dragon);
                        }
                        case "5" -> {
                            Witch witch = new Witch(characterName, characterHP, true, true, characterMana, characterPower);
                            characterList.add(witch);
                        }
                        case "6" -> {
                            Houndmaster houndmaster = new Houndmaster(characterName, characterHP, true, true, characterMana, characterPower);
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

                        Character[] list = ImportCharacters.importCharacters(path);
                        characterList.addAll(Arrays.asList(list));
                        for (int i = 0; i < list.length; i++) {
                            System.out.println("The following character has been added to the game: " + list[i].getName());
                        }

                        break;
                    }

                } else if (whatNext.equals("3")) {

                    if (Combat.graveyardList.size() == 0) {
                        System.out.println("Well.. it would seems like there's no one dead here-");
                        System.out.println("Go on. Go get some people dead by making them fight or something, dunno");
                        break;
                    } else {
                        System.out.println("You hear the sound of crows in the distance as you walk closer to the doors of the graveyard");
                        System.out.println("\u001b[31m" + "So? Your dead friends are there, what were you expecting, come on?" + "\u001B[0m\"");
                        System.out.println("These are the following characters that have died in battle;");
                        for (int i = 0; i < Combat.graveyardList.size(); i++) {
                            System.out.println(Combat.graveyardList.get(i).getName() + " the " + Combat.graveyardList.get(i).getClass());
                        }
                        System.out.println("Press Enter to continue");
                        sc.nextLine();
                    }
                    break;
                } else if (whatNext.equals("4")) {

                    if (characterList.size() < 2) {
                        System.out.println("I'm very sorry to ruin your bloodthirst, but you need at least two characters to do this.");
                        System.out.println("Please go back and make some more~");
                    } else {
                        System.out.println("Very well... you wish to fight.");
                        System.out.println("Please choose your fighters!");
                        Characters.Character fighter1 = null;
                        boolean valid = false;
                        while (!valid) {
                            String nameCheck1 = sc.nextLine();
                            for (int i = 0; i < characterList.size(); i++) {
                                if (characterList.get(i).getName().equals(nameCheck1)) {
                                    if (characterList.get(i).getName().equals(nameCheck1)) {
                                        fighter1 = characterList.get(i);
                                        valid = true;
                                        break;
                                    } else {
                                        System.out.println("The name you entered is not one of an existing character, please try again.");
                                        System.out.println("Enter your character's name:");
                                    }
                                }
                            }
                            System.out.println("And your adversary");
                            Characters.Character fighter2 = null;
                            valid = false;
                            while (!valid) {
                                String nameCheck2 = sc.nextLine();
                                for (int i = 0; i < characterList.size(); i++) {
                                    if (characterList.get(i).getName().equals(nameCheck2)) {
                                        if (characterList.get(i).getName().equals(nameCheck2)) {
                                            fighter2 = characterList.get(i);
                                            valid = true;
                                            break;
                                        } else {
                                            System.out.println("The name you entered is not one of an existing character, please try again.");
                                            System.out.println("Enter your opponent's name:");
                                        }
                                    }
                                }
                            }
                            Combat.combat(fighter1, fighter2);
                        }
                    }
                } else if (whatNext.equals("5")) {
                    System.out.println("So I see you'd like to see a massacre huh?");
                    System.out.println("Very well, there will be blood- Now, now. I will summon two random parties for our entertainment, yes?");

                    //we pick two parties thanks to the random party generator already existing in PartyMaker.
                    List<Character> team1 = PartyMaker.randomParty();
                    List<Character> team2 = PartyMaker.randomParty();

                    //we make two random number pickers between 0 and the team size, so it will pick the fighters.
                    for (int c = 0; c < 4; c++) {
                        for (int i = 0; i < team1.size(); i++) {
                            if (team1.get(i).getHp() <= 0) {
                                team1.remove(i);
                            }
                        }
                        for (int i = 0; i < team2.size(); i++) {
                            if (team2.get(i).getHp() <= 0) {
                                team2.remove(i);
                            }
                        }
                        int random1 = (int) ((Math.random() * team1.size()));
                        int random2 = (int) ((Math.random() * team1.size()));

                        Character fighter1 = team1.get(random1);
                        Character fighter2 = team2.get(random2);

                        Combat.combat(fighter1, fighter2);
                    }
                    System.out.println("Oh well... looks like there's that, they're done with their stupid little fights");
                    System.out.println("...");
                    System.out.println("Anyways... what do you want to do now? \n ===");
                    break;
                } else if (whatNext.equals("6")) {
                    System.out.println("Oh, it's a pity! We'll see you soon enough I'm sure. Goodbye~");
                    System.exit(0);
                } else {
                    System.out.println("Please, only write the number, nothing else");
                }
            }
        }
    }
}
