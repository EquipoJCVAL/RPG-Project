package Characters;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class GenerateCharactersList {

    public Character[] generateCharacters() throws FileNotFoundException {
        File file = new File("characters.csv");
        Scanner r = new Scanner(file);
        int counterLines = 0;
        while(r.hasNextLine()){
            counterLines++;
            r.nextLine();
        }

        Character[] charactersList = new Character[counterLines];


        Scanner reader = new Scanner(file);

        int listPosition = 0;
        while (reader.hasNextLine()) {

            String data = reader.nextLine();
            String[] list = data.split("-");



            for (int i = 0; i < list.length; i++){
                list[i] = list[i].trim();
            }

            switch (list[1]) {
                case "Warrior" -> {
                    Warrior warrior = new Warrior(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = warrior;

                }
                case "Wizard" -> {
                    Wizard wizard = new Wizard(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = wizard;

                }
                case "Ranger" -> {
                    Ranger ranger = new Ranger(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = ranger;
                }
                case "Dragon" -> {
                    Dragon dragon = new Dragon(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = dragon;

                }
                case "Witch" -> {
                    Witch witch = new Witch(Integer.parseInt(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = witch;

                }
                case "Houndmaster" -> {
                    Houndmaster houndmaster = new Houndmaster(Integer.parseInt(list[0]), list[1], Integer.parseInt(list[2]), Boolean.parseBoolean(list[3]), Boolean.parseBoolean(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                    charactersList[listPosition] = houndmaster;

                }



            }

            listPosition++;

        }


        return charactersList;
    }


}