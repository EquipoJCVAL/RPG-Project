package InputMenu;

import java.util.Scanner;

public class InputUser {

    private int[] listNumCharacters;

    public static void start(){
        System.out.println("   ▄████████    ▄███████▄    ▄██████▄          ▄██████▄     ▄████████   ▄▄▄▄███▄▄▄▄      ▄████████ \n" +
                "  ███    ███   ███    ███   ███    ███        ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄   ███    ███ \n" +
                "  ███    ███   ███    ███   ███    █▀         ███    █▀    ███    ███ ███   ███   ███   ███    █▀  \n" +
                " ▄███▄▄▄▄██▀   ███    ███  ▄███              ▄███          ███    ███ ███   ███   ███  ▄███▄▄▄     \n" +
                "▀▀███▀▀▀▀▀   ▀█████████▀  ▀▀███ ████▄       ▀▀███ ████▄  ▀███████████ ███   ███   ███ ▀▀███▀▀▀     \n" +
                "▀███████████   ███          ███    ███        ███    ███   ███    ███ ███   ███   ███   ███    █▄  \n" +
                "  ███    ███   ███          ███    ███        ███    ███   ███    ███ ███   ███   ███   ███    ███ \n" +
                "  ███    ███  ▄████▀        ████████▀         ████████▀    ███    █▀   ▀█   ███   █▀    ██████████ \n" +
                "  ███    ███                                                                                       ");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose how many characters: ");
        int totalNumCharacters = Integer.parseInt(input.nextLine());
        System.out.println("1 - Warrior \n2 - Wizard \n3 - Dragon\n4 - Ranger\n5 - Witch\n6 - Houndmaster\n\nChoose your characters(insert the respective number): ");

        int[]listNumCharacters = new int[totalNumCharacters];
        for (int i = 0; i < totalNumCharacters; i++) {

            int numCharacter = Integer.parseInt(input.nextLine());
            listNumCharacters[i] = numCharacter;
            System.out.println("Next: ");

        }


        System.out.println(totalNumCharacters);
    }

    public int[] getListNumCharacters() {
        return listNumCharacters;
    }
}
