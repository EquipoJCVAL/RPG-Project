package Randomizer;

import Characters.*;

import java.util.Random;

public class RandomCharacter {


    static int id = 0;

    // Stats Limits
    //Warrior
    static int maxHpWarrior = 200;
    static int minHpWarrior = 100;
    static int minStamina = 10;
    static int maxStamina = 50;
    static int minStrength = 10;
    static int maxStrength = 50;

    //Wizard
    static int maxHpWizard = 100;
    static int minHpWizard = 50;
    static int minMana = 10;
    static int maxMana = 50;
    static int minIntelligence = 10;
    static int maxIntelligence = 50;
    //Dragon
    static int maxHpDragon = 200;
    static int minHpDragon = 100;
    static int minPower = 10;
    static int maxPower = 50;
    static int minEssence = 10;
    static int maxEssence = 50;
    //Houndmaster
    static int maxHpHoundmaster = 100;
    static int minHpHoundmaster = 50;
    static int minPrecision = 10;
    static int maxPrecision = 50;
    static int minFocus = 10;
    static int maxFocus = 50;
    //Ranger
    static int maxHpRanger = 200;
    static int minHpRanger = 100;
    static int minAgility = 10;
    static int maxAgility = 50;
    static int minEnergy = 10;
    static int maxEnergy = 50;
    //Witch
    static int maxHpWitch = 100;
    static int minHpWitch = 50;
    static int minDarkMana = 10;
    static int maxDarkMana = 50;
    static int minArcane = 10;
    static int maxArcane = 50;

    //Warriors names

    public static String[] WarriorName = {"Aren", "Axe:", "Bjorn", "Daven",
            "Egil", "Einar", "Erik", "Esben", "Gerd", "Gisli", "Haakon"};

    //Wizars names
    public static String[] WizardName = {"Morden", "Abaris", "Cornelius", "Hellmut",
            "Balin", "Ramsey", "Duke", "Talisma", "Kara", "Vir", "Adnos"};

    public static String[] DragonName = {"Arman", "Falkor", "Dagahra", "Saphira",
            "Darksmoke", "Mushu", "Diaval", "Toothless", "Dragonite", "Draco"};

    //Houndmasters names
    public static String[] HoundmasterName = {"Mal'Ganis", "Mannoroth", "Mephistroth", "Shadow Council", "Tichondrius",
            "Annihilan", "Ered'ruin", "Man'ari eredar", "Mo'arg", "Nathrezim"};

    //Rangers names
    public static String[] RangerName = {"Jason", "Zach", "Billy", "Trini",
            "Kimberly", "Cole", "Shane", "Connor", "Tommy", "Andros"};

    //Witches names
    public static String[] WitchName = {"Agnes", "Allegra", "Althenea", "Aurora",
            "Beatrix", "Belladonna", "Calliope", "Cassandra", "Clara", "Cordelia"};

   //genera un Warrior con status random
    public static Warrior getRandomWarrior() {
        return new Warrior(WarriorName[new Random().nextInt(WarriorName.length)],
                (int) Math.floor(Math.random() * (maxHpWarrior - minHpWarrior + 1) + minHpWarrior), true, true,
                (int) Math.floor(Math.random() * (maxStamina - minStamina + 1) + minStamina),
                (int) Math.floor(Math.random() * (maxStrength - minStrength + 1) + minStrength));
    }
    //genera un Wizard con status random
    public static Wizard getRandomWizard() {
        return new Wizard(WizardName[new Random().nextInt(WizardName.length)],
                (int) Math.floor(Math.random() * (maxHpWizard - minHpWizard + 1) + minHpWizard), true, true,
                (int) Math.floor(Math.random() * (maxMana - minMana + 1) + minMana),
                (int) Math.floor(Math.random() * (maxIntelligence - minIntelligence + 1) + minIntelligence));
    }
    //genera un Dragon con status random
    public static Dragon getRandomDragon() {
        return new Dragon(DragonName[new Random().nextInt(DragonName.length)],
                (int) Math.floor(Math.random() * (maxHpDragon - minHpDragon + 1) + minHpDragon), true, true,
                (int) Math.floor(Math.random() * (maxPower - minPower + 1) + minPower),
                (int) Math.floor(Math.random() * (maxEssence - minEssence + 1) + minEssence));
    }
    //genera un Houndmaster con status random
    public static Houndmaster getRandomHoundmaster() {
        return new Houndmaster(HoundmasterName[new Random().nextInt(HoundmasterName.length)],
                (int) Math.floor(Math.random() * (maxHpHoundmaster - minHpHoundmaster + 1) + minHpHoundmaster), true, true,
                (int) Math.floor(Math.random() * (maxPrecision - minPrecision + 1) + minPrecision),
                (int) Math.floor(Math.random() * (maxFocus - minFocus + 1) + minFocus));

    }
    //genera un Ranger con status random
    public static Ranger getRandomRanger() {
        return new Ranger(RangerName[new Random().nextInt(RangerName.length)],
                (int) Math.floor(Math.random() * (maxHpRanger - minHpRanger + 1) + minHpRanger), true, true,
                (int) Math.floor(Math.random() * (maxAgility - minAgility + 1) + minAgility),
                (int) Math.floor(Math.random() * (maxEnergy - minEnergy + 1) + minEnergy));

    }
    ////genera un Witch con status random
    public static Witch getRandomWitch() {
        return new Witch(WitchName[new Random().nextInt(WitchName.length)],
                (int) Math.floor(Math.random() * (maxHpWitch - minHpWitch + 1) + minHpWitch), true, true,
                (int) Math.floor(Math.random() * (maxDarkMana - minDarkMana + 1) + minDarkMana),
                (int) Math.floor(Math.random() * (maxArcane - minArcane + 1) + minArcane));

    }

}