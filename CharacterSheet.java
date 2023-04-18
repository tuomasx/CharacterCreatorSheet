











public class CharacterSheet {




 // Input Variables:

    // 1. Character Details
    static String inputName = "";
    static int inputAge = 0;
    static String inputGender = "";
    static String inputAlignment = "";
    static String inputPlayerName = "";
    // 2. Character Features
    static String inputRace = "";
    static String inputClass = "";
    static int inputLevel = 1;
    static String inputBackground = "";
    // 3. Ability Scores
    static int inputStrenght = 10;
    static int inputDexterity = 10;
    static int inputConstitution = 10;
    static int inputIntelligence = 10;
    static int inputWisdom = 10;
    static int inputCharisma = 10;
    // 4. Equipment
    static String inputArmor = "";
    static String inputWeapon = "";
    static Boolean inputShield = false;
    static String inputOther = "";
    static int inputGold = 0;
    // +Add Equipment
    // 5. Character Description
    static String inputCharacterDescription = "";
    static String inputCharacterPersonality = "";
    static String inputCharacterIdeals = "";
    static String inputCharacterBonds = "";
    static String inputCharacterFlaws = "";

    // Death saving throws: leave empty if printed
    static int deathSaveSuccess = 0;
    static int deathSaveFailure = 0;




    // Output Variables Calculated based on inputs:
    // No direct Access for the user, derived only from Inputs

    // Proficiency Bonus based on level:
    static int bonusProficiency = 0;
    // Racial Ability Score Inriease:
    static int racialStrenght = 0;
    static int racialDexterity = 0;
    static int racialConstitution = 0;
    static int racialIntelligence = 0;
    static int racialWisdom = 0;
    static int racialCharisma = 0;
    // Total Ability Scores: InputAbilityScore + Racial Bonus
    static int totalStrenght = 0;
    static int totalDexterity = 0;
    static int totalConstitution = 0;
    static int totalIntelligence = 0;
    static int totalWisdom = 0;
    static int totalCharisma = 0;
    // Ability Score Bonuses calculated based on totalAbilityScores
    static int bonusStrenght = 0;
    static int bonusDexterity = 0;
    static int bonusConstitution = 0;
    static int bonusIntelligence = 0;
    static int bonusWisdom = 0;
    static int bonusCharisma = 0;
    // Saving Throw proficiency: based on Class
    static Boolean savingThrowProficiencyStrenght = false;
    static Boolean savingThrowProficiencyDexterity = false;
    static Boolean savingThrowProficiencyConstitution = false;
    static Boolean savingThrowProficiencyIntelligence = false;
    static Boolean savingThrowProficiencyWisdom = false;
    static Boolean savingThrowProficiencyCharisma = false;
    // Saving Throw Bonuses: Ability score Bonus + ( Proficiency Bonus if proficient
    // )
    static int savingThrowStrenght = 0;
    static int savingThrowDexterity = 0;
    static int savingThrowConstitution = 0;
    static int savingThrowIntelligence = 0;
    static int savingThrowWisdom = 0;
    static int savingThrowCharisma = 0;

    // Skill Proficiencies: based on Class, Background, Race
    // Skills: Acrobatics, AnimalHandling, ...
    //static Boolean skillProficiency = false;
    //Strenght:
    static Boolean skillProficiencyAthletics = false;
    //Dexterity:
    static Boolean skillProficiencyAcrobatics = false;
    static Boolean skillProficiencySleightOfHand = false;
    static Boolean skillProficiencyStealth = false;
    //Intelligence:
    static Boolean skillProficiencyArcana = false;
    static Boolean skillProficiencyHistory = false;
    static Boolean skillProficiencyInvestigation = false;
    static Boolean skillProficiencyNature = false;
    static Boolean skillProficiencyReligion = false;
    //Wisdom:
    static Boolean skillProficiencyAnimalHandling = false;
    static Boolean skillProficiencyInsight = false;
    static Boolean skillProficiencyMedicine = false;
    static Boolean skillProficiencyPerception = false;
    static Boolean skillProficiencySurvival = false;
    //Charisma:
    static Boolean skillProficiencyDeception = false;
    static Boolean skillProficiencyIntimidation = false;
    static Boolean skillProficiencyPerformance = false;
    static Boolean skillProficiencyPersuasion = false;

    // Skill Bonuses: Related Ability Score + (Proficiency Bonus if proficient)
    //static int skillBonus = 0;
    //Strenght:
    static int skillBonusAthletics = 0;
    //Dexterity:
    static int skillBonusAcrobatics = 0;
    static int skillBonusSleightOfHand = 0;
    static int skillBonusStealth = 0;
    //Intelligence:
    static int skillBonusArcana = 0;
    static int skillBonusHistory = 0;
    static int skillBonusInvestigation = 0;
    static int skillBonusNature = 0;
    static int skillBonusReligion = 0;
    //Wisdom:
    static int skillBonusAnimalHandling = 0;
    static int skillBonusInsight = 0;
    static int skillBonusMedicine = 0;
    static int skillBonusPerception = 0;
    static int skillBonusSurvival = 0;
    //Charisma:
    static int skillBonusDeception = 0;
    static int skillBonusIntimidation = 0;
    static int skillBonusPerformance = 0;
    static int skillBonusPersuasion = 0;

    
    
    // passivePerception: 10 + (skillBonusPerception) == 10 + wisdom bonus +
    // (proficiency if skillProficiencyPerception is true)
    static int passivePerception = 0;

    // Armor Class: Armor choice + Dexterity Bonus up to the armors maximum + shield
    // + class bonus
    static int armorClass = 0;

    // Iniative Bonus: dexterity bonus + other bonuses (Class, Feats)
    static int bonusInitative = 0;
    // Passive Iniative: 10 + Iniative Bonus
    static int passiveIniative = 0;

    // Speed: Race + Class Bonus
    static int baseMovementSpeed = 0;

    // Hit point Maximum: Class base HP + Class Hit Dice per lvl higher than 2 +
    // (Con mod * lvl) + (race bonus * lvl) + other bonuses
    static int hitPointMaximum = 0;
    static int hitPointMaximumRangeLow = 0;
    static int hitPointMaximumRangeHigh = 0;
    static int hitPointMaximumRangeAverage = 0;
    // Current HP value, Leave empty if printed
    static int currentHitPoints = 0;

    // Hit Dice: Based on Class and Level:
    // Hit dice type and number
    static int hitDiceD4 = 0;
    static int hitDiceD6 = 0;
    static int hitDiceD8 = 0;
    static int hitDiceD10 = 0;
    static int hitDiceD12 = 0;

    // Languages Known: Based on Race, Background, Class
    // Common
    static Boolean speakLanguageCommon = false;
    static Boolean speakLanguageDwarvish = false;
    static Boolean speakLanguageElvish = false;
    static Boolean speakLanguageGiant = false;
    static Boolean speakLanguageGnomish = false;
    static Boolean speakLanguageGoblin = false;
    static Boolean speakLanguageHalfling = false;
    static Boolean speakLanguageOrc = false;
    // Exotic
    static Boolean speakLanguageDraconic = false;
    static Boolean speakLanguageAbyssal = false;
    static Boolean speakLanguageInfernal = false;
    static Boolean speakLanguageCelestial = false;
    static Boolean speakLanguagePrimordial = false;
    static Boolean speakLanguageSylvan = false;
    static Boolean speakLanguageUndercommon = false;

    //Gold:
    static int outputGold = 0;
    static int outputClassGold = 0;
    static int outputBackgroundGold = 0;

    //Traits:
    static Boolean traitDarkvision = false;

    //Resistances:
    static Boolean resistanceAcid = false;
    static Boolean resistanceBludgeoning = false;
    static Boolean resistanceCold = false;
    static Boolean resistanceFire = false;
    static Boolean resistanceForce = false;
    static Boolean resistanceLightning = false;
    static Boolean resistanceNecrotic = false;
    static Boolean resistancePiercing = false;
    static Boolean resistancePoison = false;
    static Boolean resistancePsychic = false;
    static Boolean resistanceRadiant = false;
    static Boolean resistanceSlashing = false;
    static Boolean resistanceThunder = false;

    //Features:
    //

    //Armor Proficiencies:
    static Boolean ProficiencyLightArmor = false;
    static Boolean ProficiencyMediumArmor = false;
    static Boolean ProficiencyHeavyArmor = false;
    static Boolean ProficiencyShields = false;

    //Weapon Proficiencies:
    static Boolean ProficiencySimpleWeapons = false;
    static Boolean ProficiencyMartialWeapons = false;

    //Tool Proficiencies:
    static Boolean ProficiencyMusicalInstruments = false;
    static Boolean ProficiencyThievesTools = false;
    static Boolean ProficiencyTinkersTools = false;
    static Boolean ProficiencyHerbalismKit = false;
    static Boolean ProficiencyArtisansTools = false;
    


    private static CharacterSheet characterSheetInstance;

    public static CharacterSheet getInstance() {
        if (characterSheetInstance == null) {
            characterSheetInstance = new CharacterSheet();
        }
        return characterSheetInstance;
    }

    // Singleton: prevent duplicate objects
    private CharacterSheet() {
    }




    /* 
    //Constructor:
    public CharacterSheet() {
        //Sets Input & Output values to Defaults
        clearInputs();
        clearOutputs();
    }
    */










    public void calculateOutput() {
        // Calculates input variables to produce output variables

        //Clears previous calculated outputs
        clearOutputs();

        // Calculate Proficiency Bonus: based on level
        calculateProficiency();

        // Calculate Racial Ability Score Bonus:
        calculateRace();

        // Calculate Ability Scores: based on inputAbilityScore + race bonus
        // Calculate Ability Score Bonuses: based on totalAbilityScore
        // Calculation ( Ability Score - 10 ) divided by 2, rounded down
        calculateAbilityScores();


        // Add class bonuses to movement Speed:
        if (inputClass.equals("Barbarian")) {
            if (inputLevel >= 5) {
                baseMovementSpeed = baseMovementSpeed + 10;
            }  
        }
        if (inputClass.equals("Monk")) {
            if (inputLevel >= 2 && inputLevel < 6) {
                baseMovementSpeed = baseMovementSpeed + 10;
            }
            if (inputLevel >= 6 && inputLevel < 10) {
                baseMovementSpeed = baseMovementSpeed + 15;
            }
            if (inputLevel >= 10 && inputLevel < 14) {
                baseMovementSpeed = baseMovementSpeed + 20;
            }
            if (inputLevel >= 14 && inputLevel < 18) {
                baseMovementSpeed = baseMovementSpeed + 25;
            }
            if (inputLevel >= 18) {
                baseMovementSpeed = baseMovementSpeed + 30;
            }
        }

        //Calculate based on Class, Ability scores & level: Hitpoints, Gold, Saving throws
        calculateClass();

        //Calculate ArmorClass based on Armor type and Ability Score bonus
        calculateArmorClass();


        // Calculate Iniative Bonus: dexterity bonus + other bonuses (Class, Feats)
        bonusInitative = bonusDexterity;
        // Passive Iniative: 10 + Iniative Bonus
        passiveIniative = 10 + bonusInitative;

        // Calculate Background: SkillProficiencies & Background Gold
        calculateBackground();
        
        // Calculate Skill Bonuses: based on skill proficiencies & ability score bonuses
        calculateSkillBonuses();

        // passivePerception: 10 + skillBonusPerception
        passivePerception = 10 + skillBonusPerception;

        //Higher level extra Gold:
        int highLevelExtraGold = 0;
        //

        //Calculate Total outputGold
        //outputGold = 0;
        outputGold = inputGold + outputClassGold + outputBackgroundGold + highLevelExtraGold;


    }

    private void updateOutputSheet() {
        //Send update to output sheet

        //Test Output: Name
        OutputSheet.getInstance().setOutputName(inputName);
    }



    private static void calculateProficiency() {
        // Calculate Proficiency Bonus: based on level
        if (inputLevel == 0) {
            bonusProficiency = 0;
        }
        if (inputLevel >= 1 && inputLevel <= 4) {
            bonusProficiency = 2;
        }
        if (inputLevel >= 5 && inputLevel <= 8) {
            bonusProficiency = 3;
        }
        if (inputLevel >= 9 && inputLevel <= 12) {
            bonusProficiency = 4;
        }
        if (inputLevel >= 13 && inputLevel <= 16) {
            bonusProficiency = 5;
        }
        if (inputLevel >= 17 && inputLevel <= 20) {
            bonusProficiency = 6;
        }
    }

    private static void calculateRace() {
        // Calculate Racial Ability Score Bonus:
        if (inputRace.equals("")) {
            racialStrenght = 0;
            racialDexterity = 0;
            racialConstitution = 0;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 0;
            //Languages:
            speakLanguageCommon = false;
        }
        if (inputRace.equals("Dragonborn")) {
            racialStrenght = 2;
            racialDexterity = 0;
            racialConstitution = 0;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 1;
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageDraconic = true;
        }
        if (inputRace.equals("Dwarf")) {
            racialStrenght = 0;
            racialDexterity = 0;
            racialConstitution = 2;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 25;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageDwarvish = true;
        }
        if (inputRace.equals("Elf")) {
            racialStrenght = 0;
            racialDexterity = 2;
            racialConstitution = 0;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageElvish = true;
            skillProficiencyPerception = true;
        }
        if (inputRace.equals("Gnome")) {
            racialStrenght = 0;
            racialDexterity = 0;
            racialConstitution = 0;
            racialIntelligence = 2;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 25;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageGnomish = true;
        }
        if (inputRace.equals("Half-Elf")) {
            racialStrenght = 0;
            racialDexterity = 0;
            racialConstitution = 0;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 2;
            //2x +1 other free ability score increases
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageElvish = true;
            //+1 other language
        }
        if (inputRace.equals("Half-Orc")) {
            racialStrenght = 2;
            racialDexterity = 0;
            racialConstitution = 1;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageOrc = true;
        }
        if (inputRace.equals("Halfling")) {
            racialStrenght = 0;
            racialDexterity = 2;
            racialConstitution = 0;
            racialIntelligence = 0;
            racialWisdom = 0;
            racialCharisma = 0;
            //Racial Movement Speed:
            baseMovementSpeed = 25;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageHalfling = true;
        }
        if (inputRace.equals("Human")) {
            racialStrenght = 1;
            racialDexterity = 1;
            racialConstitution = 1;
            racialIntelligence = 1;
            racialWisdom = 1;
            racialCharisma = 1;
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            //+1 other language
        }
        if (inputRace.equals("Tiefling")) {
            racialStrenght = 0;
            racialDexterity = 0;
            racialConstitution = 0;
            racialIntelligence = 1;
            racialWisdom = 0;
            racialCharisma = 2;
            //Racial Movement Speed:
            baseMovementSpeed = 30;
            //Languages:
            speakLanguageCommon = true;
            speakLanguageInfernal = true;
            resistanceFire = true;
        }
    }

    private static void calculateAbilityScores() {
        // Calculate Ability Scores: base on inputAbilityScore + race bonus
        totalStrenght = inputStrenght + racialStrenght;
        totalDexterity = inputDexterity + racialDexterity;
        totalConstitution = inputConstitution + racialConstitution;
        totalIntelligence = inputIntelligence + racialIntelligence;
        totalWisdom = inputWisdom + racialWisdom;
        totalCharisma = inputCharisma + racialCharisma;

        // Calculate Ability Score Bonuses: based on totalAbilityScore
        // Calculation ( Ability Score - 10 ) divided by 2, rounded down
        double calcStrenght = (totalStrenght - 10) / 2;
        bonusStrenght = (int) calcStrenght;
        double calcDexterity = (totalDexterity - 10) / 2;
        bonusDexterity = (int) calcDexterity;
        double calcConstitution = (totalConstitution - 10) / 2;
        bonusConstitution = (int) calcConstitution;
        double calcIntelligence = (totalIntelligence - 10) / 2;
        bonusIntelligence = (int) calcIntelligence;
        double calcWisdom = (totalWisdom - 10) / 2;
        bonusWisdom = (int) calcWisdom;
        double calcCharisma = (totalCharisma - 10) / 2;
        bonusCharisma = (int) calcCharisma;

    }

    private static void calculateClass() {
        //Set Hitpoints, Gold & Saving throws based on Class

        // Hit point Maximum: Class base HP + Class Hit Dice per lvl higher than 2 +
        // (Con mod * lvl) + (race bonus * lvl) + other bonuses

        // At level 1:
        int classStartingHealth = 0;
        int classGold = 0;
        //Set Hitdice and Lvl 1 Hitpoints based on Class
        if (inputClass.equals("")) {
            classStartingHealth = 0;
            // Hit Dice:
            hitDiceD4 = 0;
            hitDiceD6 = 0;
            hitDiceD8 = 0;
            hitDiceD10 = 0;
            hitDiceD12 = 0;
            classGold = 0;
        }
        // Check Saving Throw proficiency: based on Class
        if (inputClass.equals("")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Classes:
        //Artificer:
        if (inputClass.equals("Artificer")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 100;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Artificer")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = true;
            savingThrowProficiencyIntelligence = true;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Barbarian:
        if (inputClass.equals("Barbarian")) {
            classStartingHealth = 12 + bonusConstitution;
            hitDiceD12 = 1;
            classGold = 50;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
            ProficiencyMartialWeapons = true;
        }
        if (inputClass.equals("Barbarian")) {
            savingThrowProficiencyStrenght = true;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = true;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Bard:
        if (inputClass.equals("Bard")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 125;
            ProficiencyLightArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Bard")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = true;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = true;
        }
        //Cleric:
        if (inputClass.equals("Cleric")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 125;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Cleric")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = true;
        }
        //Druid:
        if (inputClass.equals("Druid")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 50;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Druid")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = true;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = false;
        }
        //Fighter:
        if (inputClass.equals("Fighter")) {
            classStartingHealth = 10 + bonusConstitution;
            hitDiceD10 = 1;
            classGold = 125;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyHeavyArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
            ProficiencyMartialWeapons = true;
        }
        if (inputClass.equals("Fighter")) {
            savingThrowProficiencyStrenght = true;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = true;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Monk:
        if (inputClass.equals("Monk")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 125;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Monk")) {
            savingThrowProficiencyStrenght = true;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = false;
        }
        //Paladin:
        if (inputClass.equals("Paladin")) {
            classStartingHealth = 10 + bonusConstitution;
            hitDiceD10 = 1;
            classGold = 125;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyHeavyArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
            ProficiencyMartialWeapons = true;
        }
        if (inputClass.equals("Paladin")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = true;
        }
        //Ranger:
        if (inputClass.equals("Ranger")) {
            classStartingHealth = 10 + bonusConstitution;
            hitDiceD10 = 1;
            classGold = 125;
            ProficiencyLightArmor = true;
            ProficiencyMediumArmor = true;
            ProficiencyShields = true;
            ProficiencySimpleWeapons = true;
            ProficiencyMartialWeapons = true;
        }
        if (inputClass.equals("Ranger")) {
            savingThrowProficiencyStrenght = true;
            savingThrowProficiencyDexterity = true;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Rogue:
        if (inputClass.equals("Rogue")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 100;
            ProficiencyLightArmor = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Rogue")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = true;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = true;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = false;
        }
        //Sorcerer:
        if (inputClass.equals("Sorcerer")) {
            classStartingHealth = 6 + bonusConstitution;
            hitDiceD6 = 1;
            classGold = 75;
        }
        if (inputClass.equals("Sorcerer")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = true;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = false;
            savingThrowProficiencyCharisma = true;
        }
        //Warlock:
        if (inputClass.equals("Warlock")) {
            classStartingHealth = 8 + bonusConstitution;
            hitDiceD8 = 1;
            classGold = 100;
            ProficiencyLightArmor = true;
            ProficiencySimpleWeapons = true;
        }
        if (inputClass.equals("Warlock")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = false;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = true;
        }
        //Wizard:
        if (inputClass.equals("Wizard")) {
            classStartingHealth = 6 + bonusConstitution;
            hitDiceD6 = 1;
            classGold = 100;
        }
        if (inputClass.equals("Wizard")) {
            savingThrowProficiencyStrenght = false;
            savingThrowProficiencyDexterity = false;
            savingThrowProficiencyConstitution = false;
            savingThrowProficiencyIntelligence = true;
            savingThrowProficiencyWisdom = true;
            savingThrowProficiencyCharisma = false;
        }

        //Class Starting Gold Output:
        outputClassGold = classGold;

        // Extra Hit Points At levels 2 and Higher:
        int bonusConstitutionHPatHigherLevels = 0;
        int hitPointsGainedMin = 0;
        double hitPointsGainedAvg = 0;
        int hitPointsGainedMax = 0;
        int hitPointsGainedAvgInt = 0;

        if (inputLevel > 1) {
            // Constitution Bonus per level
            bonusConstitutionHPatHigherLevels = (inputLevel - 1) * bonusConstitution;
            // Hit points gained per level based on Class:
            //int levelmultplier = 0;
            //levelmultplier = inputLevel - 1;
            // Barbarian: +1d12
            if (inputClass.equals("Barbarian")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 6.5); // 1d12 Avg 6.5
                hitPointsGainedMax = ((inputLevel - 1) * 12);
                // Hit Dice
                hitDiceD12 = 1 + ((inputLevel - 1));
            }
            // Bard:
            if (inputClass.equals("Bard")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Cleric: 
            if (inputClass.equals("Cleric")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Druid:
            if (inputClass.equals("Druid")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Fighter: +1d10 health per level, min 1, avg 5.5, max 10
            if (inputClass.equals("Fighter")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 5.5); // 1d10 Avg 5.5
                hitPointsGainedMax = ((inputLevel - 1) * 10);
                // Hit Dice
                hitDiceD10 = 1 + ((inputLevel - 1));
            }
            // Monk: 
            if (inputClass.equals("Monk")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Paladin: 
            if (inputClass.equals("Paladin")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 5.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 10);
                // Hit Dice
                hitDiceD10 = 1 + ((inputLevel - 1));
            }
            if (inputClass.equals("Ranger")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 5.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 10);
                // Hit Dice
                hitDiceD10 = 1 + ((inputLevel - 1));
            }
            // Rogue:
            if (inputClass.equals("Rogue")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Sorcerer:
            if (inputClass.equals("Sorcerer")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 3.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 6);
                // Hit Dice
                hitDiceD6 = 1 + ((inputLevel - 1));
            }
            // Warlock:
            if (inputClass.equals("Warlock")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 4.5); // 
                hitPointsGainedMax = ((inputLevel - 1) * 8);
                // Hit Dice
                hitDiceD8 = 1 + ((inputLevel - 1));
            }
            // Wizard: 
            if (inputClass.equals("Wizard")) {
                hitPointsGainedMin = ((inputLevel - 1) * 1);
                hitPointsGainedAvg = ((inputLevel - 1) * 3.5); // 1d6 Avg 3.5
                hitPointsGainedMax = ((inputLevel - 1) * 6);
                //
                hitDiceD6 = 1 + ((inputLevel - 1));
            }

        }
        // Convert Double Avg back to Int, Round down
        hitPointsGainedAvgInt = (int) hitPointsGainedAvg;

        // Calculate Total HitPoint Values:
        // Minimum
        hitPointMaximumRangeLow = classStartingHealth + hitPointsGainedMin + bonusConstitutionHPatHigherLevels;
        // Maximum
        hitPointMaximumRangeHigh = classStartingHealth + hitPointsGainedMax + bonusConstitutionHPatHigherLevels;
        // Average
        hitPointMaximumRangeAverage = classStartingHealth + hitPointsGainedAvgInt + bonusConstitutionHPatHigherLevels;
        // Selected:
        hitPointMaximum = hitPointMaximumRangeAverage;
        // Current HP value, Leave empty if printed
        // currentHitPoints = hitPointMaximum;

        // Calculate Saving Throw bonus: Ability score Bonus + ( Proficiency Bonus if
        // proficient )
        // Strenght
        if (savingThrowProficiencyStrenght == true) {
            savingThrowStrenght = bonusStrenght + bonusProficiency;
        } else {
            savingThrowStrenght = bonusStrenght;
        }
        // Dexterity
        if (savingThrowProficiencyDexterity == true) {
            savingThrowDexterity = bonusDexterity + bonusProficiency;
        } else {
            savingThrowDexterity = bonusDexterity;
        }
        // Constitution
        if (savingThrowProficiencyConstitution == true) {
            savingThrowConstitution = bonusConstitution + bonusProficiency;
        } else {
            savingThrowConstitution = bonusConstitution;
        }
        // Intelligence
        if (savingThrowProficiencyIntelligence == true) {
            savingThrowIntelligence = bonusIntelligence + bonusProficiency;
        } else {
            savingThrowIntelligence = bonusIntelligence;
        }
        // Wisdom
        if (savingThrowProficiencyWisdom == true) {
            savingThrowWisdom = bonusWisdom + bonusProficiency;
        } else {
            savingThrowWisdom = bonusWisdom;
        }
        // Charisma
        if (savingThrowProficiencyCharisma == true) {
            savingThrowCharisma = bonusCharisma + bonusProficiency;
        } else {
            savingThrowCharisma = bonusCharisma;
        }

    }

    private static void calculateArmorClass() {
        //Calculate Armor Class:

        //Armor Types:
        // Light:
        // "None" "Leather Armor" "Padded Armor" "Studded Leather Armor"
        // Medium:
        // "Breastplate" "Chain Shirt" "Half Plate Armor" "Hide Armor" "Scale Mail"
        // Heavy:
        // "Chain Mail" "Plate Armor" "Ring Mail" "Splint Armor"

        // Armor Class: Based on Equipped armor type and Dexterity Bonus
        if (inputArmor.equals("")) {
            armorClass = 0;
        }
        // Base Armor Class without armor is 10 + Dexterity Bonus
        if (inputArmor.equals("None")) {
            armorClass = 10 + bonusDexterity;
        }
        // Light armor types get to add the characters Dex modifier to AC
        if (inputArmor.equals("Leather Armor")) {
            armorClass = 11 + bonusDexterity;
        }
        if (inputArmor.equals("Padded Armor")) {
            armorClass = 11 + bonusDexterity;
        }
        if (inputArmor.equals("Studded Leather Armor")) {
            armorClass = 11 + bonusDexterity;
        }

        // Medium armor types only get a Dexterity Bonus up to +2
        if (inputArmor.equals("Breastplate")) {
            armorClass = 14;
            if (bonusDexterity == 1) {
                armorClass = 14 + 1;
            } else if (bonusDexterity >= 2) {
                armorClass = 14 + 2;
            } else {
                armorClass = 14;
            }
        }
        if (inputArmor.equals("Chain Shirt")) {
            armorClass = 13;
            if (bonusDexterity == 1) {
                armorClass = 13 + 1;
            } else if (bonusDexterity >= 2) {
                armorClass = 13 + 2;
            } else {
                armorClass = 13;
            }
        }
        if (inputArmor.equals("Half Plate Armor")) {
            armorClass = 15;
            if (bonusDexterity == 1) {
                armorClass = 15 + 1;
            } else if (bonusDexterity >= 2) {
                armorClass = 15 + 2;
            } else {
                armorClass = 15;
            }
        }
        if (inputArmor.equals("Hide Armor")) {
            armorClass = 12;
            if (bonusDexterity == 1) {
                armorClass = 12 + 1;
            } else if (bonusDexterity >= 2) {
                armorClass = 12 + 2;
            } else {
                armorClass = 12;
            }
        }
        if (inputArmor.equals("Scale Mail")) {
            armorClass = 14;
            if (bonusDexterity == 1) {
                armorClass = 14 + 1;
            } else if (bonusDexterity >= 2) {
                armorClass = 14 + 2;
            } else {
                armorClass = 14;
            }
        }
        
        // Heavy armor types do not get to add a Dexterity Bonus
        if (inputArmor.equals("Chain Mail")) {
            armorClass = 16;
        }
        if (inputArmor.equals("Plate Armor")) {
            armorClass = 18;
        }
        if (inputArmor.equals("Ring Mail")) {
            armorClass = 14;
        }
        if (inputArmor.equals("Splint Armor")) {
            armorClass = 17;
        }
        
        // If a shield is equipped add +2 to Armor Class
        if (inputShield == true) {
            armorClass = armorClass + 2;
        }


    }

    private static void calculateBackground() {
        //Calculate Background:

        //Background Gold
        int backgroundGold = 0;
        // Backgrounds:
        // "Acolyte" 15 "Charlatan" 15 "Criminal" 15 "Entertainer" 15 "Folk Hero" 10 "Gladiator" 15 "Guild Artisan" 15 "Guild Merchant" 15 "Hermit" 5 "Knight" 25 "Noble" 25 "Outlander" 10 "Pirate" 10 "Sage" 10 "Sailor" 10 "Soldier" 10 "Urchin" 10 ""
        //skillProficiency = true;

        // Skill Proficiencies known: From Background
        if (inputBackground.equals("")) {
            backgroundGold = 0;
        }
        // Acolyte
        if (inputBackground.equals("Acolyte")) {
            backgroundGold = 15;
            skillProficiencyInsight = true;
            skillProficiencyReligion = true;
        }
        if (inputBackground.equals("Charlatan")) {
            backgroundGold = 15;
            skillProficiencyDeception = true;
            skillProficiencySleightOfHand = true;
        }
        if (inputBackground.equals("Criminal")) {
            backgroundGold = 15;
            skillProficiencyDeception = true;
            skillProficiencyStealth = true;
        }
        if (inputBackground.equals("Entertainer")) {
            backgroundGold = 15;
            skillProficiencyAcrobatics = true;
            skillProficiencyPerformance = true;
        }
        if (inputBackground.equals("Folk Hero")) {
            backgroundGold = 10;
            skillProficiencyAnimalHandling = true;
            skillProficiencySurvival = true;
        }
        if (inputBackground.equals("Gladiator")) {
            backgroundGold = 15;
            skillProficiencyAcrobatics = true;
            skillProficiencyPerformance = true;
        }
        if (inputBackground.equals("Guild Artisan")) {
            backgroundGold = 15;
            skillProficiencyInsight = true;
            skillProficiencyPersuasion = true;
        }
        if (inputBackground.equals("Guild Merchant")) {
            backgroundGold = 15;
            skillProficiencyInsight = true;
            skillProficiencyPersuasion = true;
        }
        if (inputBackground.equals("Hermit")) {
            backgroundGold = 5;
            skillProficiencyMedicine = true;
            skillProficiencyReligion = true;
        }
        if (inputBackground.equals("Knight")) {
            backgroundGold = 25;
            skillProficiencyHistory = true;
            skillProficiencyPersuasion = true;
        }
        if (inputBackground.equals("Noble")) {
            backgroundGold = 25;
            skillProficiencyHistory = true;
            skillProficiencyPersuasion = true;
        }
        if (inputBackground.equals("Outlander")) {
            backgroundGold = 10;
            skillProficiencyAthletics = true;
            skillProficiencySurvival = true;
        }
        if (inputBackground.equals("Pirate")) {
            backgroundGold = 10;
            skillProficiencyAthletics = true;
            skillProficiencyPerception = true;
        }
        if (inputBackground.equals("Sage")) {
            backgroundGold = 10;
            skillProficiencyArcana = true;
            skillProficiencyHistory = true;
        }
        if (inputBackground.equals("Sailor")) {
            backgroundGold = 10;
            skillProficiencyAthletics = true;
            skillProficiencyPerception = true;
        }
        if (inputBackground.equals("Soldier")) {
            backgroundGold = 10;
            skillProficiencyAthletics = true;
            skillProficiencyIntimidation = true;
        }
        if (inputBackground.equals("Urchin")) {
            backgroundGold = 10;
            skillProficiencySleightOfHand = true;
            skillProficiencyStealth = true;
        }
        //Output Background Gold:
        outputBackgroundGold = backgroundGold;

    }

    private static void calculateSkillBonuses() {
        // Calculate Skill Bonuses:

        // Skill Bonuses:
        //Strenght:
        skillBonusAthletics = bonusStrenght;
        if (skillProficiencyAthletics == true) { 
            skillBonusAthletics = bonusStrenght + bonusProficiency; 
        }
        //Dexterity:
        skillBonusAcrobatics = bonusDexterity;
        if (skillProficiencyAcrobatics == true) { 
            skillBonusAcrobatics = bonusDexterity + bonusProficiency; 
        }
        skillBonusSleightOfHand = bonusDexterity;
        if (skillProficiencySleightOfHand == true) { 
            skillBonusSleightOfHand = bonusDexterity + bonusProficiency; 
        }
        skillBonusStealth = bonusDexterity;
        if (skillProficiencyStealth == true) { 
            skillBonusStealth = bonusDexterity + bonusProficiency; 
        }
        //Intelligence:
        skillBonusArcana = bonusIntelligence;
        if (skillProficiencyArcana == true) { 
            skillBonusArcana = bonusIntelligence + bonusProficiency; 
        }
        skillBonusHistory = bonusIntelligence;
        if (skillProficiencyHistory == true) { 
            skillBonusHistory = bonusIntelligence + bonusProficiency; 
        }
        skillBonusInvestigation = bonusIntelligence;
        if (skillProficiencyInvestigation == true) { 
            skillBonusInvestigation = bonusIntelligence + bonusProficiency; 
        }
        skillBonusNature = bonusIntelligence;
        if (skillProficiencyNature == true) { 
            skillBonusNature = bonusIntelligence + bonusProficiency; 
        }
        skillBonusReligion = bonusIntelligence;
        if (skillProficiencyReligion == true) { 
            skillBonusReligion = bonusIntelligence + bonusProficiency; 
        }
        //Wisdom:
        skillBonusAnimalHandling = bonusWisdom;
        if (skillProficiencyAnimalHandling == true) { 
            skillBonusAnimalHandling = bonusWisdom + bonusProficiency; 
        }
        skillBonusInsight = bonusWisdom;
        if (skillProficiencyInsight == true) { 
            skillBonusInsight = bonusWisdom + bonusProficiency; 
        }
        skillBonusMedicine = bonusWisdom;
        if (skillProficiencyMedicine == true) { 
            skillBonusMedicine = bonusWisdom + bonusProficiency; 
        }
        skillBonusPerception = bonusWisdom;
        if (skillProficiencyPerception == true) { 
            skillBonusPerception = bonusWisdom + bonusProficiency; 
        }
        skillBonusSurvival = bonusWisdom;
        if (skillProficiencySurvival == true) { 
            skillBonusSurvival = bonusWisdom + bonusProficiency; 
        }
        //Charisma:
        skillBonusDeception = bonusCharisma;
        if (skillProficiencyDeception == true) { 
            skillBonusDeception = bonusCharisma + bonusProficiency; 
        }
        skillBonusIntimidation = bonusCharisma;
        if (skillProficiencyIntimidation == true) { 
            skillBonusIntimidation = bonusCharisma + bonusProficiency; 
        }
        skillBonusPerformance = bonusCharisma;
        if (skillProficiencyPerformance == true) { 
            skillBonusPerformance = bonusCharisma + bonusProficiency; 
        }
        skillBonusPersuasion = bonusCharisma;
        if (skillProficiencyPersuasion == true) { 
            skillBonusPersuasion = bonusCharisma + bonusProficiency; 
        }

    }



    public static void clearOutputs() {
        // Sets output variables Back to 0

        // Proficiency Bonus:
        bonusProficiency = 0;
        // Racial Ability Score:
        racialStrenght = 0;
        racialDexterity = 0;
        racialConstitution = 0;
        racialIntelligence = 0;
        racialWisdom = 0;
        racialCharisma = 0;
        // Total Ability Scores:
        totalStrenght = 0;
        totalDexterity = 0;
        totalConstitution = 0;
        totalIntelligence = 0;
        totalWisdom = 0;
        totalCharisma = 0;
        // Ability Score Bonuses
        bonusStrenght = 0;
        bonusDexterity = 0;
        bonusConstitution = 0;
        bonusIntelligence = 0;
        bonusWisdom = 0;
        bonusCharisma = 0;
        // Saving Throw proficiency:
        savingThrowProficiencyStrenght = false;
        savingThrowProficiencyDexterity = false;
        savingThrowProficiencyConstitution = false;
        savingThrowProficiencyIntelligence = false;
        savingThrowProficiencyWisdom = false;
        savingThrowProficiencyCharisma = false;
        // Saving Throw Bonuses:
        savingThrowStrenght = 0;
        savingThrowDexterity = 0;
        savingThrowConstitution = 0;
        savingThrowIntelligence = 0;
        savingThrowWisdom = 0;
        savingThrowCharisma = 0;

        // Skill Proficiencies:
        skillProficiencyAcrobatics = false;
        // Skill Bonuses:
        skillBonusAcrobatics = 0;
        skillProficiencyPerception = false;
        skillBonusPerception = 0;

        // Skill Proficiencies:
        skillProficiencyAthletics = false;
        //Dexterity:
        skillProficiencyAcrobatics = false;
        skillProficiencySleightOfHand = false;
        skillProficiencyStealth = false;
        //Intelligence:
        skillProficiencyArcana = false;
        skillProficiencyHistory = false;
        skillProficiencyInvestigation = false;
        skillProficiencyNature = false;
        skillProficiencyReligion = false;
        //Wisdom:
        skillProficiencyAnimalHandling = false;
        skillProficiencyInsight = false;
        skillProficiencyMedicine = false;
        skillProficiencyPerception = false;
        skillProficiencySurvival = false;
        //Charisma:
        skillProficiencyDeception = false;
        skillProficiencyIntimidation = false;
        skillProficiencyPerformance = false;
        skillProficiencyPersuasion = false;

        // Skill Bonuses:
        //Strenght:
        skillBonusAthletics = 0;
        //Dexterity:
        skillBonusAcrobatics = 0;
        skillBonusSleightOfHand = 0;
        skillBonusStealth = 0;
        //Intelligence:
        skillBonusArcana = 0;
        skillBonusHistory = 0;
        skillBonusInvestigation = 0;
        skillBonusNature = 0;
        skillBonusReligion = 0;
        //Wisdom:
        skillBonusAnimalHandling = 0;
        skillBonusInsight = 0;
        skillBonusMedicine = 0;
        skillBonusPerception = 0;
        skillBonusSurvival = 0;
        //Charisma:
        skillBonusDeception = 0;
        skillBonusIntimidation = 0;
        skillBonusPerformance = 0;
        skillBonusPersuasion = 0;

        // passivePerception:
        passivePerception = 0;
        // Armor Class:
        armorClass = 0;
        // Iniative Bonus:
        bonusInitative = 0;
        // Passive Iniative:
        passiveIniative = 0;
        // Speed:
        baseMovementSpeed = 0;
        // Hit point Maximum:
        hitPointMaximum = 0;
        hitPointMaximumRangeLow = 0;
        hitPointMaximumRangeHigh = 0;
        hitPointMaximumRangeAverage = 0;
        // Current HP value:
        currentHitPoints = 0;
        // Hit Dice:
        hitDiceD4 = 0;
        hitDiceD6 = 0;
        hitDiceD8 = 0;
        hitDiceD10 = 0;
        hitDiceD12 = 0;
        // Languages Known:
        // Common
        speakLanguageCommon = false;
        speakLanguageDwarvish = false;
        speakLanguageElvish = false;
        speakLanguageGiant = false;
        speakLanguageGnomish = false;
        speakLanguageGoblin = false;
        speakLanguageHalfling = false;
        speakLanguageOrc = false;
        // Exotic
        speakLanguageDraconic = false;
        speakLanguageAbyssal = false;
        speakLanguageInfernal = false;
        speakLanguageCelestial = false;
        speakLanguagePrimordial = false;
        speakLanguageSylvan = false;
        speakLanguageUndercommon = false;
        //Gold
        outputGold = 0;
        outputClassGold = 0;
        outputBackgroundGold = 0;

        //Traits:
        traitDarkvision = false;

        //Resistances:
        resistanceAcid = false;
        resistanceBludgeoning = false;
        resistanceCold = false;
        resistanceFire = false;
        resistanceForce = false;
        resistanceLightning = false;
        resistanceNecrotic = false;
        resistancePiercing = false;
        resistancePoison = false;
        resistancePsychic = false;
        resistanceRadiant = false;
        resistanceSlashing = false;
        resistanceThunder = false;

        //Armor Proficiencies:
        ProficiencyLightArmor = false;
        ProficiencyMediumArmor = false;
        ProficiencyHeavyArmor = false;
        ProficiencyShields = false;

        //Weapon Proficiencies:
        ProficiencySimpleWeapons = false;
        ProficiencyMartialWeapons = false;

        //Tool Proficiencies:
        ProficiencyMusicalInstruments = false;
        ProficiencyThievesTools = false;
        ProficiencyTinkersTools = false;
        ProficiencyHerbalismKit = false;
        ProficiencyArtisansTools = false;



    }

    public static void clearInputs() {
        // Input Variables:

        // 1. Character Details
        inputName = "";
        inputAge = 0;
        inputGender = "";
        inputAlignment = "";
        inputPlayerName = "";
        // 2. Character Features
        inputRace = "";
        inputClass = "";
        inputLevel = 1;
        inputBackground = "";
        // 3. Ability Scores
        inputStrenght = 10;
        inputDexterity = 10;
        inputConstitution = 10;
        inputIntelligence = 10;
        inputWisdom = 10;
        inputCharisma = 10;
        // 4. Equipment
        inputArmor = "";
        inputWeapon = "";
        inputShield = false;
        inputOther = "";
        inputGold = 0;
        // +Add Equipment
        // 5. Character Description
        inputCharacterDescription = "";
        inputCharacterPersonality = "";
        inputCharacterIdeals = "";
        inputCharacterBonds = "";
        inputCharacterFlaws = "";
        // Languages Known:
        // Death saving throws: leave empty if printed
        deathSaveSuccess = 0;
        deathSaveFailure = 0;

    }

    public void printOutputs() {
        //Print Outputs for testing:

        System.out.println("Character Sheet:");
        System.out.println("");
        System.out.println("Name:               " + inputName);
        System.out.println("Age:                " + inputAge);
        System.out.println("Gender:             " + inputGender);
        System.out.println("Alignment:          " + inputAlignment);
        System.out.println("Player name:        " + inputPlayerName);
        System.out.println("");
        System.out.println("Race:               " + inputRace);
        System.out.println("Class:              " + inputClass);
        System.out.println("Level:              " + inputLevel);
        System.out.println("Background:         " + inputBackground);
        System.out.println("");
        System.out.println("Proficiency Bonus:  " + bonusProficiency);
        System.out.println("");
        System.out.println("Ability Scores:");
        System.out.println("Strenght:           " + totalStrenght);
        System.out.println("Dexterity:          " + totalDexterity);
        System.out.println("Constitution:       " + totalConstitution);
        System.out.println("Intelligence:       " + totalIntelligence);
        System.out.println("Wisdom:             " + totalWisdom);
        System.out.println("Charisma:           " + totalCharisma);
        System.out.println("");
        System.out.println("Ability Score Bonuses:");
        System.out.println("Strenght Bonus:     " + bonusStrenght);
        System.out.println("Dexterity Bonus:    " + bonusDexterity);
        System.out.println("Constitution Bonus: " + bonusConstitution);
        System.out.println("Intelligence Bonus: " + bonusIntelligence);
        System.out.println("Wisdom Bonus:       " + bonusWisdom);
        System.out.println("Charisma Bonus:     " + bonusCharisma);
        System.out.println("");
        System.out.println("Armor Class:        " + armorClass);
        System.out.println("Iniative:           " + bonusInitative);
        System.out.println("Speed:              " + baseMovementSpeed);
        System.out.println("");
        System.out.println("Hit Point Maximum:  " + hitPointMaximum);
        System.out.println("");
        System.out.println("Passive Perception  " + passivePerception);
        System.out.println("");
        System.out.println("Equipment:          " + inputArmor);
        System.out.println("Equipment:          " + inputWeapon);
        System.out.println("Equipment:          " + inputOther);
        System.out.println("Equipment: Gold:    " + outputGold); // input + class + background?
        System.out.println("");
        System.out.println("Personality Traits: " + inputCharacterPersonality);
        System.out.println("Ideals:             " + inputCharacterIdeals);
        System.out.println("Bonds:              " + inputCharacterBonds);
        System.out.println("Flaws:              " + inputCharacterFlaws);


        updateOutputSheet();

    }



    public static String getInputName() {
        return inputName;
    }



    public static void setInputName(String inputName) {
        CharacterSheet.inputName = inputName;
    }



    public static int getInputAge() {
        return inputAge;
    }



    public static void setInputAge(int inputAge) {
        CharacterSheet.inputAge = inputAge;
    }



    public static String getInputGender() {
        return inputGender;
    }



    public static void setInputGender(String inputGender) {
        CharacterSheet.inputGender = inputGender;
    }



    public static String getInputAlignment() {
        return inputAlignment;
    }



    public static void setInputAlignment(String inputAlignment) {
        CharacterSheet.inputAlignment = inputAlignment;
    }



    public static String getInputPlayerName() {
        return inputPlayerName;
    }



    public static void setInputPlayerName(String inputPlayerName) {
        CharacterSheet.inputPlayerName = inputPlayerName;
    }



    public static String getInputRace() {
        return inputRace;
    }



    public void setInputRace(String inputRace) {
        CharacterSheet.inputRace = inputRace;
    }



    public static String getInputClass() {
        return inputClass;
    }



    public void setInputClass(String inputClass) {
        CharacterSheet.inputClass = inputClass;
    }



    public static int getInputLevel() {
        return inputLevel;
    }



    public void setInputLevel(int inputLevel) {
        CharacterSheet.inputLevel = inputLevel;
    }



    public static String getInputBackground() {
        return inputBackground;
    }



    public void setInputBackground(String inputBackground) {
        CharacterSheet.inputBackground = inputBackground;
    }



    public static int getInputStrenght() {
        return inputStrenght;
    }



    public static void setInputStrenght(int inputStrenght) {
        CharacterSheet.inputStrenght = inputStrenght;
    }



    public static int getInputDexterity() {
        return inputDexterity;
    }



    public static void setInputDexterity(int inputDexterity) {
        CharacterSheet.inputDexterity = inputDexterity;
    }



    public static int getInputConstitution() {
        return inputConstitution;
    }



    public static void setInputConstitution(int inputConstitution) {
        CharacterSheet.inputConstitution = inputConstitution;
    }



    public static int getInputIntelligence() {
        return inputIntelligence;
    }



    public static void setInputIntelligence(int inputIntelligence) {
        CharacterSheet.inputIntelligence = inputIntelligence;
    }



    public static int getInputWisdom() {
        return inputWisdom;
    }



    public static void setInputWisdom(int inputWisdom) {
        CharacterSheet.inputWisdom = inputWisdom;
    }



    public static int getInputCharisma() {
        return inputCharisma;
    }



    public static void setInputCharisma(int inputCharisma) {
        CharacterSheet.inputCharisma = inputCharisma;
    }



    public static String getInputArmor() {
        return inputArmor;
    }



    public static void setInputArmor(String inputArmor) {
        CharacterSheet.inputArmor = inputArmor;
    }



    public static String getInputWeapon() {
        return inputWeapon;
    }



    public static void setInputWeapon(String inputWeapon) {
        CharacterSheet.inputWeapon = inputWeapon;
    }



    public static Boolean getInputShield() {
        return inputShield;
    }



    public static void setInputShield(Boolean inputShield) {
        CharacterSheet.inputShield = inputShield;
    }



    public static String getInputOther() {
        return inputOther;
    }



    public static void setInputOther(String inputOther) {
        CharacterSheet.inputOther = inputOther;
    }



    public static int getInputGold() {
        return inputGold;
    }



    public static void setInputGold(int inputGold) {
        CharacterSheet.inputGold = inputGold;
    }



    public static String getInputCharacterDescription() {
        return inputCharacterDescription;
    }



    public void setInputCharacterDescription(String inputCharacterDescription) {
        CharacterSheet.inputCharacterDescription = inputCharacterDescription;
    }



    public static String getInputCharacterPersonality() {
        return inputCharacterPersonality;
    }



    public void setInputCharacterPersonality(String inputCharacterPersonality) {
        CharacterSheet.inputCharacterPersonality = inputCharacterPersonality;
    }



    public static String getInputCharacterIdeals() {
        return inputCharacterIdeals;
    }



    public void setInputCharacterIdeals(String inputCharacterIdeals) {
        CharacterSheet.inputCharacterIdeals = inputCharacterIdeals;
    }



    public static String getInputCharacterBonds() {
        return inputCharacterBonds;
    }



    public void setInputCharacterBonds(String inputCharacterBonds) {
        CharacterSheet.inputCharacterBonds = inputCharacterBonds;
    }



    public static String getInputCharacterFlaws() {
        return inputCharacterFlaws;
    }



    public void setInputCharacterFlaws(String inputCharacterFlaws) {
        CharacterSheet.inputCharacterFlaws = inputCharacterFlaws;
    }




    
    
}


