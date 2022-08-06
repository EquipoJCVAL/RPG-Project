package Characters;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateOpponentsCSV {
    private final String[] characters = {"Warrior", "Wizard", "Ranger"};

    public void createReadCSV() throws IOException {

            FileWriter writer = new FileWriter("randomOpponents.csv");

            Random rand = new Random();


            for (int i = 0; i < 2; i++){

                int hpWarrior = rand.nextInt(100, 200);

                int hpWizard = rand.nextInt(50, 100);

                int hpRanger = rand.nextInt(75, 150);

                int strength = rand.nextInt(1, 10);

                int mana = rand.nextInt(10, 50);

                int intelligence = rand.nextInt(1, 50);

                String randChar = characters[rand.nextInt(0, characters.length - 1)];

                if (randChar == "Warrior"){
                    writer.write(randChar + " - " + hpWarrior + " - " + strength + " - " + mana + " - " + intelligence + "\n");
                }
                if (randChar == "Wizard") {
                    writer.write(randChar + " - " + hpWizard + " - " + strength + " - " + mana + " - " + intelligence + "\n");
                }
                if (randChar == "Ranger") {
                    writer.write(randChar + " - " + hpRanger + " - " + strength + " - " + mana + " - " + intelligence + "\n");
                }


            }
            writer.close();


            File file = new File("randomOpponents.csv");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] list = data.split("-");
                System.out.println(data);


            }
    }
}