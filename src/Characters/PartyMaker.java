package Characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class PartyMaker {
    private String partyName;
    private int partySize=4;


    public static List<Character>randomParty(){
        List<Character> partyMembers=new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int dice=(int)(Math.random()*5)+1;
            System.out.println(dice);

            switch(dice){
                case 1:
                    partyMembers.add(RandomCharacter.getRandomWitch());

                    break;
                case 2:
                    partyMembers.add(RandomCharacter.getRandomWizard());
                    //
                    break;
                case 3:
                    //
                    partyMembers.add(RandomCharacter.getRandomWarrior());

                    break;
                case 4:
                    //
                    partyMembers.add(RandomCharacter.getRandomRanger());

                    break;
                case 5:
                    //
                    partyMembers.add(RandomCharacter.getRandomDragon());

                    break;
                case 6:
                    //
                    partyMembers.add(RandomCharacter.getRandomHoundmaster());

                    break;




            }


        }
        return partyMembers;

    }

    public static String[] PartyNames = {"Rational Wolfpack","Kitchen Mafia","Peace Rainbows",
            "Productive Escapism","The Public Spat","All in the Mind","Halter Ego","Heart Dark Matter",
            "Thrill Called Money","Gossip Goblins"};

    public int getRandomPartyName(List<Integer> PartyNames){
        Random rand = new Random();
        return PartyNames.get(rand.nextInt(PartyNames.size()));
    }

    public PartyMaker(String partyName, int partySize, List<Character> partyMembers) {
        this.partyName = getRandomPartyName();
        this.partySize = partySize;
        //this.partyMembers = partyMembers;
    }

     /*    public static String getRandomPartyName() {git
             return PartyNames[new Random().nextInt(PartyNames.length)];


         }
*/
}




