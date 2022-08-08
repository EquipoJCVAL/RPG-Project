package Characters;

import java.util.Random;

public class RandomCharacter {


    static int id = 0;

    // Stats Limits
    //Warrior
    static int maxHpWarrior = 200;
    static int minHpWarrior = 100;
    static int minStamina = 10;
    static int maxStamina = 50;
    static int minStrength = 1;
    static int maxStrength = 10;

    //Wizard
    static int maxHpWizard = 100;
    static int minHpWizard = 50;
    static int minMana = 10;
    static int maxMana = 50;
    static int minIntelligence = 1;
    static int maxIntelligence = 50;
    //Dragon
    static int maxHpDragon = 200;
    static int minHpDragon = 100;
    static int minPower = 10;
    static int maxPower = 50;
    static int minEssence = 1;
    static int maxEssence = 50;
    //Houndmaster
    static int maxHpHoundmaster = 100;
    static int minHpHoundmaster = 50;
    static int minPrecision = 10;
    static int maxPrecision = 50;
    static int minFocus = 1;
    static int maxFocus = 10;
    //Ranger
    static int maxHpRanger = 200;
    static int minHpRanger = 100;
    static int minAgility = 10;
    static int maxAgility = 50;
    static int minEnergy = 1;
    static int maxEnergy = 50;
    //Witch
    static int maxHpWitch = 100;
    static int minHpWitch = 50;
    static int minDarkMana = 10;
    static int maxDarkMana = 50;
    static int minArcane = 1;
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
            /*constructors
            public RandomWarrior(int id, String WarriorName, int hp, boolean isAlive, boolean inCombat, int stamina, int strength) {

            }*/

    public static Warrior getRandomWarrior() {
        return new Warrior(id++, WarriorName[new Random().nextInt(WarriorName.length)],
                (int) Math.floor(Math.random() * (maxHpWarrior - minHpWarrior + 1) + minHpWarrior), true, true,
                (int) Math.floor(Math.random() * (maxStamina - minStamina + 1) + minStamina),
                (int) Math.floor(Math.random() * (maxStrength - minStrength + 1) + minStrength));
    }

    public static Wizard getRandomWizard() {
        return new Wizard(id++, WizardName[new Random().nextInt(WizardName.length)],
                (int) Math.floor(Math.random() * (maxHpWizard - minHpWizard + 1) + minHpWizard), true, true,
                (int) Math.floor(Math.random() * (maxMana - minMana + 1) + minMana),
                (int) Math.floor(Math.random() * (maxIntelligence - minIntelligence + 1) + minIntelligence));
    }

    public static Dragon getRandomDragon() {
        return new Dragon(id++, DragonName[new Random().nextInt(DragonName.length)],
                (int) Math.floor(Math.random() * (maxHpDragon - minHpDragon + 1) + minHpDragon), true, true,
                (int) Math.floor(Math.random() * (maxPower - minPower + 1) + minPower),
                (int) Math.floor(Math.random() * (maxEssence - minEssence + 1) + minEssence));
    }

    public static Houndmaster getRandomHoundmaster() {
        return new Houndmaster(id++, HoundmasterName[new Random().nextInt(HoundmasterName.length)],
                (int) Math.floor(Math.random() * (maxHpHoundmaster - minHpHoundmaster + 1) + minHpHoundmaster), true, true,
                (int) Math.floor(Math.random() * (maxPrecision - minPrecision + 1) + minPrecision),
                (int) Math.floor(Math.random() * (maxFocus - minFocus + 1) + minFocus));

    }
    public static Ranger getRandomRanger() {
        return new Ranger(id++, RangerName[new Random().nextInt(RangerName.length)],
                (int) Math.floor(Math.random() * (maxHpRanger - minHpRanger + 1) + minHpRanger), true, true,
                (int) Math.floor(Math.random() * (maxAgility - minAgility + 1) + minAgility),
                (int) Math.floor(Math.random() * (maxEnergy - minEnergy + 1) + minEnergy));

    }
    public static Witch getRandomWitch() {
        return new Witch(id++, WitchName[new Random().nextInt(WitchName.length)],
                (int) Math.floor(Math.random() * (maxHpWitch - minHpWitch + 1) + minHpWitch), true, true,
                (int) Math.floor(Math.random() * (maxDarkMana - minDarkMana + 1) + minDarkMana),
                (int) Math.floor(Math.random() * (maxArcane - minArcane + 1) + minArcane));

    }

    public static int getId() {
        return id;
    }

    public static int getMaxHpWarrior() {
        return maxHpWarrior;
    }

    public static int getMinHpWarrior() {
        return minHpWarrior;
    }

    public static int getMinStamina() {
        return minStamina;
    }

    public static int getMaxStamina() {
        return maxStamina;
    }

    public static int getMinStrength() {
        return minStrength;
    }

    public static int getMaxStrength() {
        return maxStrength;
    }

    public static int getMaxHpWizard() {
        return maxHpWizard;
    }

    public static int getMinHpWizard() {
        return minHpWizard;
    }

    public static int getMinMana() {
        return minMana;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static int getMinIntelligence() {
        return minIntelligence;
    }

    public static int getMaxIntelligence() {
        return maxIntelligence;
    }

    public static int getMaxHpDragon() {
        return maxHpDragon;
    }

    public static int getMinHpDragon() {
        return minHpDragon;
    }

    public static int getMinPower() {
        return minPower;
    }

    public static int getMaxPower() {
        return maxPower;
    }

    public static int getMinEssence() {
        return minEssence;
    }

    public static int getMaxEssence() {
        return maxEssence;
    }

    public static int getMaxHpHoundmaster() {
        return maxHpHoundmaster;
    }

    public static int getMinHpHoundmaster() {
        return minHpHoundmaster;
    }

    public static int getMinPrecision() {
        return minPrecision;
    }

    public static int getMaxPrecision() {
        return maxPrecision;
    }

    public static int getMinFocus() {
        return minFocus;
    }

    public static int getMaxFocus() {
        return maxFocus;
    }

    public static int getMaxHpRanger() {
        return maxHpRanger;
    }

    public static int getMinHpRanger() {
        return minHpRanger;
    }

    public static int getMinAgility() {
        return minAgility;
    }

    public static int getMaxAgility() {
        return maxAgility;
    }

    public static int getMinEnergy() {
        return minEnergy;
    }

    public static int getMaxEnergy() {
        return maxEnergy;
    }

    public static int getMaxHpWitch() {
        return maxHpWitch;
    }

    public static int getMinHpWitch() {
        return minHpWitch;
    }

    public static int getMinDarkMana() {
        return minDarkMana;
    }

    public static int getMaxDarkMana() {
        return maxDarkMana;
    }

    public static int getMinArcane() {
        return minArcane;
    }

    public static int getMaxArcane() {
        return maxArcane;
    }

    public static void setId(int id) {
        RandomCharacter.id = id;
    }

    public static void setMaxHpWarrior(int maxHpWarrior) {
        RandomCharacter.maxHpWarrior = maxHpWarrior;
    }

    public static void setMinHpWarrior(int minHpWarrior) {
        RandomCharacter.minHpWarrior = minHpWarrior;
    }

    public static void setMinStamina(int minStamina) {
        RandomCharacter.minStamina = minStamina;
    }

    public static void setMaxStamina(int maxStamina) {
        RandomCharacter.maxStamina = maxStamina;
    }

    public static void setMinStrength(int minStrength) {
        RandomCharacter.minStrength = minStrength;
    }

    public static void setMaxStrength(int maxStrength) {
        RandomCharacter.maxStrength = maxStrength;
    }

    public static void setMaxHpWizard(int maxHpWizard) {
        RandomCharacter.maxHpWizard = maxHpWizard;
    }

    public static void setMinHpWizard(int minHpWizard) {
        RandomCharacter.minHpWizard = minHpWizard;
    }

    public static void setMinMana(int minMana) {
        RandomCharacter.minMana = minMana;
    }

    public static void setMaxMana(int maxMana) {
        RandomCharacter.maxMana = maxMana;
    }

    public static void setMinIntelligence(int minIntelligence) {
        RandomCharacter.minIntelligence = minIntelligence;
    }

    public static void setMaxIntelligence(int maxIntelligence) {
        RandomCharacter.maxIntelligence = maxIntelligence;
    }

    public static void setMaxHpDragon(int maxHpDragon) {
        RandomCharacter.maxHpDragon = maxHpDragon;
    }

    public static void setMinHpDragon(int minHpDragon) {
        RandomCharacter.minHpDragon = minHpDragon;
    }

    public static void setMinPower(int minPower) {
        RandomCharacter.minPower = minPower;
    }

    public static void setMaxPower(int maxPower) {
        RandomCharacter.maxPower = maxPower;
    }

    public static void setMinEssence(int minEssence) {
        RandomCharacter.minEssence = minEssence;
    }

    public static void setMaxEssence(int maxEssence) {
        RandomCharacter.maxEssence = maxEssence;
    }

    public static void setMaxHpHoundmaster(int maxHpHoundmaster) {
        RandomCharacter.maxHpHoundmaster = maxHpHoundmaster;
    }

    public static void setMinHpHoundmaster(int minHpHoundmaster) {
        RandomCharacter.minHpHoundmaster = minHpHoundmaster;
    }

    public static void setMinPrecision(int minPrecision) {
        RandomCharacter.minPrecision = minPrecision;
    }

    public static void setMaxPrecision(int maxPrecision) {
        RandomCharacter.maxPrecision = maxPrecision;
    }

    public static void setMinFocus(int minFocus) {
        RandomCharacter.minFocus = minFocus;
    }

    public static void setMaxFocus(int maxFocus) {
        RandomCharacter.maxFocus = maxFocus;
    }

    public static void setMaxHpRanger(int maxHpRanger) {
        RandomCharacter.maxHpRanger = maxHpRanger;
    }

    public static void setMinHpRanger(int minHpRanger) {
        RandomCharacter.minHpRanger = minHpRanger;
    }

    public static void setMinAgility(int minAgility) {
        RandomCharacter.minAgility = minAgility;
    }

    public static void setMaxAgility(int maxAgility) {
        RandomCharacter.maxAgility = maxAgility;
    }

    public static void setMinEnergy(int minEnergy) {
        RandomCharacter.minEnergy = minEnergy;
    }

    public static void setMaxEnergy(int maxEnergy) {
        RandomCharacter.maxEnergy = maxEnergy;
    }

    public static void setMaxHpWitch(int maxHpWitch) {
        RandomCharacter.maxHpWitch = maxHpWitch;
    }

    public static void setMinHpWitch(int minHpWitch) {
        RandomCharacter.minHpWitch = minHpWitch;
    }

    public static void setMinDarkMana(int minDarkMana) {
        RandomCharacter.minDarkMana = minDarkMana;
    }

    public static void setMaxDarkMana(int maxDarkMana) {
        RandomCharacter.maxDarkMana = maxDarkMana;
    }

    public static void setMinArcane(int minArcane) {
        RandomCharacter.minArcane = minArcane;
    }

    public static void setMaxArcane(int maxArcane) {
        RandomCharacter.maxArcane = maxArcane;
    }
}