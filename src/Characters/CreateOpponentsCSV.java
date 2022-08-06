package Characters;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateOpponentsCSV {


    public void createReadCSV() throws IOException {

            FileWriter writer = new FileWriter("randomOpponents.csv", true);

            Random rand = new Random();
            // Generate random numbers

            int hpWarrior = rand.nextInt(100, 200);

            int hpWizard =rand.nextInt(50, 100);

            int strength = rand.nextInt(1, 10);

            int mana = rand.nextInt(10, 50);

            int intelligence = rand.nextInt(1, 50);


            String[] characters = {"Warrior", "Wizard", "Ranger"};
            int n = rand.nextInt(0, characters.length - 1);
            String randChar = characters[n];





            File file = new File("randomOpponents.csv");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] list = data.split(",");


            }
    }
}