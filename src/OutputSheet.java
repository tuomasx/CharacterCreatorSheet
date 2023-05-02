import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;  
//import javax.swing.event.*;
//import javax.swing.text.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;



public class OutputSheet extends JPanel {

	private JPanel panel = new JPanel();
    private static OutputSheet outputSheetInstance;

	//Output variables & labels
	//Name
    private String outputName = "";
	private JLabel labelName = new JLabel("");
	//Age
	private int outputAge = 0;
	private JLabel labelAge = new JLabel("");
	//Gender
	private String outputGender = "";
	private JLabel labelGender = new JLabel("");
	//Aligment
	private String outputAlignment = "";
	private JLabel labelAlignment = new JLabel("");
	//Playername
	private String outputPlayerName = "";
	private JLabel labelPlayerName = new JLabel("");
	//Character Features
	//Race
	private String outputRace = "";
	private JLabel labelRace = new JLabel("");
	//Class
	private String outputClass = "";
	private JLabel labelClass = new JLabel("");
	//Level
	private int outputLevel = 1;
	private JLabel labelLevel = new JLabel("");
	//Background
	private String outputBackground = "";
	private JLabel labelBackground = new JLabel("");
	//Ability Scores
	//
	private int totalStrenght = 10;
	private JLabel labeltotalStrenght = new JLabel("10");
	//
	private int totalDexterity = 10;
	private JLabel labeltotalDexterity = new JLabel("10");
	//
	private int totalConstitution = 10;
	private JLabel labeltotalConstitution = new JLabel("10");
	//
	private int totalIntelligence = 10;
	private JLabel labeltotalIntelligence = new JLabel("10");
	//
	private int totalWisdom = 10;
	private JLabel labeltotalWisdom = new JLabel("10");
	//
	private int totalCharisma = 10;
	private JLabel labeltotalCharisma = new JLabel("10");
	//Modifiers
	//
	private int bonusProficiency = 2;
	private JLabel labelbonusProficiency = new JLabel("2");
	//
	private int bonusStrenght = 0;
	private JLabel labelbonusStrenght = new JLabel("0");
	//
	private int bonusDexterity = 0;
	private JLabel labelbonusDexterity = new JLabel("0");
	//
	private int bonusConstitution = 0;
	private JLabel labelbonusConstitution = new JLabel("0");
	//
	private int bonusIntelligence = 0;
	private JLabel labelbonusIntelligence = new JLabel("0");
	//
	private int bonusWisdom = 0;
	private JLabel labelbonusWisdom = new JLabel("0");
	//
	private int bonusCharisma = 0;
	private JLabel labelbonusCharisma = new JLabel("0");
	//Other Stats
	//
	private int armorClass = 10;
	private JLabel labelarmorClass = new JLabel("10");
	//
	private int bonusInitative = 0;
	private JLabel labelbonusInitative = new JLabel("0");
	//
	private int baseMovementSpeed = 30;
	private JLabel labelbaseMovementSpeed = new JLabel("30");
	//
	private int hitPointMaximum = 0;
	private JLabel labelhitPointMaximum = new JLabel("0");
	//
	private int passivePerception = 10;
	private JLabel labelpassivePerception = new JLabel("10");
	//Equipment
	//
	private String outputArmor = "";
	private JLabel labeloutputArmor = new JLabel("None");
	//
	private String outputWeapon = "";
	private JLabel labeloutputWeapon = new JLabel("");
	//
	private boolean outputShield = false;
	//private JLabel labeloutputShield = new JLabel("LabelShield");
	//
	private String outputOther = "";
	private JLabel labeloutputOther = new JLabel("");
	//
	private int outputGold = 0;
	private JLabel labeloutputGold = new JLabel("0");
	//Character Description
	//
	private String outputCharacterDescription = "";
	private JLabel labeloutputCharacterDescription = new JLabel("");
	//
	private String outputCharacterPersonality = "";
	private JLabel labeloutputCharacterPersonality = new JLabel("");
	//
	private String outputCharacterIdeals = "";
	private JLabel labeloutputCharacterIdeals = new JLabel("");
	//
	private String outputCharacterBonds = "";
	private JLabel labeloutputCharacterBonds = new JLabel("");
	//
	private String outputCharacterFlaws = "";
	private JLabel labeloutputCharacterFlaws = new JLabel("");
	//

	//Saving Throws
	//Strenght
	private int outputSavingThrowStrenght = 0;
	private JLabel labeloutputSavingThrowStrenght = new JLabel("0");
	//Dexterity
	private int outputSavingThrowDexterity = 0;
	private JLabel labeloutputSavingThrowDexterity = new JLabel("0");
	//Constitution
	private int outputSavingThrowConstitution = 0;
	private JLabel labeloutputSavingThrowConstitution = new JLabel("0");
	//Intelligence
	private int outputSavingThrowIntelligence = 0;
	private JLabel labeloutputSavingThrowIntelligence = new JLabel("0");
	//Wisdom
	private int outputSavingThrowWisdom = 0;
	private JLabel labeloutputSavingThrowWisdom = new JLabel("0");
	//Charisma
	private int outputSavingThrowCharisma = 0;
	private JLabel labeloutputSavingThrowCharisma = new JLabel("0");

	//Skill bonuses:
	private int outputskillBonusAthletics = 0;
    //Dexterity:
    private int outputskillBonusAcrobatics = 0;
    private int outputskillBonusSleightOfHand = 0;
    private int outputskillBonusStealth = 0;
    //Intelligence:
    private int outputskillBonusArcana = 0;
    private int outputskillBonusHistory = 0;
    private int outputskillBonusInvestigation = 0;
    private int outputskillBonusNature = 0;
    private int outputskillBonusReligion = 0;
    //Wisdom:
    private int outputskillBonusAnimalHandling = 0;
    private int outputskillBonusInsight = 0;
    private int outputskillBonusMedicine = 0;
    private int outputskillBonusPerception = 0;
    private int outputskillBonusSurvival = 0;
    //Charisma:
    private int outputskillBonusDeception = 0;
    private int outputskillBonusIntimidation = 0;
    private int outputskillBonusPerformance = 0;
    private int outputskillBonusPersuasion = 0;

	//Skill Labels:
	private JLabel labeloutputskillBonusAthletics = new JLabel("0");
    //Dexterity:
    private JLabel labeloutputskillBonusAcrobatics = new JLabel("0");
    private JLabel labeloutputskillBonusSleightOfHand = new JLabel("0");
    private JLabel labeloutputskillBonusStealth = new JLabel("0");
    //Intelligence:
    private JLabel labeloutputskillBonusArcana = new JLabel("0");
    private JLabel labeloutputskillBonusHistory = new JLabel("0");
    private JLabel labeloutputskillBonusInvestigation = new JLabel("0");
    private JLabel labeloutputskillBonusNature = new JLabel("0");
    private JLabel labeloutputskillBonusReligion = new JLabel("0");
    //Wisdom:
    private JLabel labeloutputskillBonusAnimalHandling = new JLabel("0");
    private JLabel labeloutputskillBonusInsight = new JLabel("0");
    private JLabel labeloutputskillBonusMedicine = new JLabel("0");
    private JLabel labeloutputskillBonusPerception = new JLabel("0");
    private JLabel labeloutputskillBonusSurvival = new JLabel("0");
    //Charisma:
    private JLabel labeloutputskillBonusDeception = new JLabel("0");
    private JLabel labeloutputskillBonusIntimidation = new JLabel("0");
    private JLabel labeloutputskillBonusPerformance = new JLabel("0");
    private JLabel labeloutputskillBonusPersuasion = new JLabel("0");

	


    // Singleton: prevent duplicate objects
    private OutputSheet() {
    }

    public static OutputSheet getInstance() {
        if (outputSheetInstance == null) {
            outputSheetInstance = new OutputSheet();
        }
        return outputSheetInstance;
    }

    

    public JPanel createOutputSheet( ) {
        

        panel.setBackground(new Color(255, 255, 255));
		//Adding an empty White frame to the center & right side

		//jlabel.getBackground().setOpaque(false);

		//Adding image to panel:
		//CharacterSheetBase Resolution: 1700 x 2200
		//1275 x 1650
		try {
			//Change File Path:
			//BufferedImage myPicture = ImageIO.read(new File("src/CharacterSheetBase.png"));
			//BufferedImage myPicture = ImageIO.read(new File("CharacterCreatorSheet/src/CharacterSheetBase.png"));
			//File path to root
			File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
			BufferedImage myPicture = ImageIO.read(new File( root, "CharacterSheetBase.png"));
			
			Image newImage = myPicture.getScaledInstance(850, 1100, Image.SCALE_DEFAULT);
			//JLabel picLabel = new JLabel(new ImageIcon(newImage));
			


			JLabel background = new JLabel(new ImageIcon(newImage));
			panel.add(background);

			//X/Y Layout:
			//
			//Dimension size = background.getPreferredSize();
			//background.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);

			//setLayout(null);

			//X/Y layout
			//Name
			labelName.setFont(labelName.getFont().deriveFont(Font.PLAIN, 15));
    		labelName.setForeground(Color.BLACK);
			//
			background.add(labelName);
			labelName.setBounds(75, 85, 250, 30);
			
			//Class & Level, Background, Player Name
			labelClass.setFont(labelClass.getFont().deriveFont(Font.PLAIN, 15));
    		labelClass.setForeground(Color.BLACK);
			labelLevel.setFont(labelLevel.getFont().deriveFont(Font.PLAIN, 15));
    		labelLevel.setForeground(Color.BLACK);
			labelBackground.setFont(labelBackground.getFont().deriveFont(Font.PLAIN, 15));
    		labelBackground.setForeground(Color.BLACK);
    		labelPlayerName.setFont(labelPlayerName.getFont().deriveFont(Font.PLAIN, 15));
    		labelPlayerName.setForeground(Color.BLACK);
			//Coordinates
			background.add(labelClass);
			labelClass.setBounds(375, 65, 100, 30);
			background.add(labelLevel);
			labelLevel.setBounds(440, 65, 100, 30);
			background.add(labelBackground);
			labelBackground.setBounds(530, 65, 100, 30);
			background.add(labelPlayerName);
			labelPlayerName.setBounds(665, 65, 100, 30);
			
			//Race, Alignment, Exp
			labelRace.setFont(labelRace.getFont().deriveFont(Font.PLAIN, 15));
    		labelRace.setForeground(Color.BLACK);
			labelAlignment.setFont(labelAlignment.getFont().deriveFont(Font.PLAIN, 15));
    		labelAlignment.setForeground(Color.BLACK);
			//Experience
			background.add(labelRace);
			labelRace.setBounds(375, 100, 100, 30);
			background.add(labelAlignment);
			labelAlignment.setBounds(530, 100, 100, 30);
			//background.add(labelPlayerName);
			//labelPlayerName.setBounds(665, 65, 100, 30);

			//Proficiency Bonus:
			labelbonusProficiency.setFont(labelbonusProficiency.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusProficiency.setForeground(Color.BLACK);
			//Coordinates
			background.add(labelbonusProficiency);
			labelbonusProficiency.setBounds(145, 231, 30, 30);

			//ArmorClass, Initiative, Speed
			labelarmorClass.setFont(labelarmorClass.getFont().deriveFont(Font.PLAIN, 15));
    		labelarmorClass.setForeground(Color.BLACK);
			labelbonusInitative.setFont(labelbonusInitative.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusInitative.setForeground(Color.BLACK);
			labelbaseMovementSpeed.setFont(labelbaseMovementSpeed.getFont().deriveFont(Font.PLAIN, 15));
    		labelbaseMovementSpeed.setForeground(Color.BLACK);
			//Coordinates
			background.add(labelarmorClass);
			labelarmorClass.setBounds(335, 205, 50, 30);
			background.add(labelbonusInitative);
			labelbonusInitative.setBounds(410, 205, 60, 30);
			background.add(labelbaseMovementSpeed);
			labelbaseMovementSpeed.setBounds(495, 205, 60, 30);
			
			//Ability Scores:
			//Strenght
			labeltotalStrenght.setFont(labeltotalStrenght.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalStrenght.setForeground(Color.BLACK);
			labelbonusStrenght.setFont(labelbonusStrenght.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusStrenght.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalStrenght);
			labeltotalStrenght.setBounds(70, 253, 60, 30);
			background.add(labelbonusStrenght);
			labelbonusStrenght.setBounds(70, 220, 60, 30);

			//Dexterity
			labeltotalDexterity.setFont(labeltotalDexterity.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalDexterity.setForeground(Color.BLACK);
			labelbonusDexterity.setFont(labelbonusDexterity.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusDexterity.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalDexterity);
			labeltotalDexterity.setBounds(70, 353, 60, 30);
			background.add(labelbonusDexterity);
			labelbonusDexterity.setBounds(70, 320, 60, 30);

			//Constitution
			labeltotalConstitution.setFont(labeltotalConstitution.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalConstitution.setForeground(Color.BLACK);
			labelbonusConstitution.setFont(labelbonusConstitution.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusConstitution.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalConstitution);
			labeltotalConstitution.setBounds(70, 453, 60, 30);
			background.add(labelbonusConstitution);
			labelbonusConstitution.setBounds(70, 420, 60, 30);

			//Intelligence
			labeltotalIntelligence.setFont(labeltotalIntelligence.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalIntelligence.setForeground(Color.BLACK);
			labelbonusIntelligence.setFont(labelbonusIntelligence.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusIntelligence.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalIntelligence);
			labeltotalIntelligence.setBounds(70, 553, 60, 30);
			background.add(labelbonusIntelligence);
			labelbonusIntelligence.setBounds(70, 520, 60, 30);

			//Wisdom
			labeltotalWisdom.setFont(labeltotalWisdom.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalWisdom.setForeground(Color.BLACK);
			labelbonusWisdom.setFont(labelbonusWisdom.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusWisdom.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalWisdom);
			labeltotalWisdom.setBounds(70, 653, 60, 30);
			background.add(labelbonusWisdom);
			labelbonusWisdom.setBounds(70, 620, 60, 30);

			//Charisma
			labeltotalCharisma.setFont(labeltotalCharisma.getFont().deriveFont(Font.PLAIN, 15));
    		labeltotalCharisma.setForeground(Color.BLACK);
			labelbonusCharisma.setFont(labelbonusCharisma.getFont().deriveFont(Font.PLAIN, 15));
    		labelbonusCharisma.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeltotalCharisma);
			labeltotalCharisma.setBounds(70, 753, 60, 30);
			background.add(labelbonusCharisma);
			labelbonusCharisma.setBounds(70, 720, 60, 30);

			//Passive Perception:
			labelpassivePerception.setFont(labelpassivePerception.getFont().deriveFont(Font.PLAIN, 15));
    		labelpassivePerception.setForeground(Color.BLACK);
			//Coordinates
			background.add(labelpassivePerception);
			labelpassivePerception.setBounds(50, 817, 60, 30);
			

			//Max Hitpoints:
			labelhitPointMaximum.setFont(labelhitPointMaximum.getFont().deriveFont(Font.PLAIN, 15));
    		labelhitPointMaximum.setForeground(Color.BLACK);
			//Coordinates
			background.add(labelhitPointMaximum);
			labelhitPointMaximum.setBounds(410, 265, 60, 30);


			//Character Description
			labeloutputCharacterPersonality.setFont(labeloutputCharacterPersonality.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputCharacterPersonality.setForeground(Color.BLACK);
			labeloutputCharacterIdeals.setFont(labeloutputCharacterIdeals.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputCharacterIdeals.setForeground(Color.BLACK);
			labeloutputCharacterBonds.setFont(labeloutputCharacterBonds.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputCharacterBonds.setForeground(Color.BLACK);
			labeloutputCharacterFlaws.setFont(labeloutputCharacterFlaws.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputCharacterFlaws.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputCharacterPersonality);
			labeloutputCharacterPersonality.setBounds(580, 195, 220, 30);
			background.add(labeloutputCharacterIdeals);
			labeloutputCharacterIdeals.setBounds(580, 295, 220, 30);
			background.add(labeloutputCharacterBonds);
			labeloutputCharacterBonds.setBounds(580, 365, 220, 30);
			background.add(labeloutputCharacterFlaws);
			labeloutputCharacterFlaws.setBounds(580, 445, 220, 30);

			//Saving Throws
			//Strenght
			labeloutputSavingThrowStrenght.setFont(labeloutputSavingThrowStrenght.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowStrenght.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowStrenght);
			labeloutputSavingThrowStrenght.setBounds(162, 276, 60, 30);
			//Dexterity
			labeloutputSavingThrowDexterity.setFont(labeloutputSavingThrowDexterity.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowStrenght.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowDexterity);
			labeloutputSavingThrowDexterity.setBounds(162, 295, 60, 30);
			//Constitution
			labeloutputSavingThrowConstitution.setFont(labeloutputSavingThrowConstitution.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowConstitution.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowConstitution);
			labeloutputSavingThrowConstitution.setBounds(162, 314, 60, 30);
			//Intelligence
			labeloutputSavingThrowIntelligence.setFont(labeloutputSavingThrowIntelligence.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowIntelligence.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowIntelligence);
			labeloutputSavingThrowIntelligence.setBounds(162, 333, 60, 30);
			//Wisdom
			labeloutputSavingThrowWisdom.setFont(labeloutputSavingThrowWisdom.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowWisdom.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowWisdom);
			labeloutputSavingThrowWisdom.setBounds(162, 352, 60, 30);
			//Charisma
			labeloutputSavingThrowCharisma.setFont(labeloutputSavingThrowCharisma.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputSavingThrowCharisma.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputSavingThrowCharisma);
			labeloutputSavingThrowCharisma.setBounds(162, 371, 60, 30);


			//Skill Proficiencies
			//
			labeloutputskillBonusAcrobatics.setFont(labeloutputskillBonusAcrobatics.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusAcrobatics.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusAcrobatics);
			labeloutputskillBonusAcrobatics.setBounds(162, 435, 60, 30);
			//
			labeloutputskillBonusAnimalHandling.setFont(labeloutputskillBonusAnimalHandling.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusAnimalHandling.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusAnimalHandling);
			labeloutputskillBonusAnimalHandling.setBounds(162, 455, 60, 30);
			//
			labeloutputskillBonusArcana.setFont(labeloutputskillBonusArcana.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusArcana.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusArcana);
			labeloutputskillBonusArcana.setBounds(162, 474, 60, 30);
			//
			labeloutputskillBonusAthletics.setFont(labeloutputskillBonusAthletics.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusAthletics.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusAthletics);
			labeloutputskillBonusAthletics.setBounds(162, 493, 60, 30);
			//
			labeloutputskillBonusDeception.setFont(labeloutputskillBonusDeception.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusDeception.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusDeception);
			labeloutputskillBonusDeception.setBounds(162, 512, 60, 30);
			//
			labeloutputskillBonusHistory.setFont(labeloutputskillBonusHistory.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusHistory.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusHistory);
			labeloutputskillBonusHistory.setBounds(162, 531, 60, 30);
			//
			labeloutputskillBonusInsight.setFont(labeloutputskillBonusInsight.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusInsight.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusInsight);
			labeloutputskillBonusInsight.setBounds(162, 550, 60, 30);
			//
			labeloutputskillBonusIntimidation.setFont(labeloutputskillBonusIntimidation.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusIntimidation.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusIntimidation);
			labeloutputskillBonusIntimidation.setBounds(162, 569, 60, 30);
			//
			labeloutputskillBonusInvestigation.setFont(labeloutputskillBonusInvestigation.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusInvestigation.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusInvestigation);
			labeloutputskillBonusInvestigation.setBounds(162, 587, 60, 30);
			//
			labeloutputskillBonusMedicine.setFont(labeloutputskillBonusMedicine.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusMedicine.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusMedicine);
			labeloutputskillBonusMedicine.setBounds(162, 606, 60, 30);
			//
			labeloutputskillBonusNature.setFont(labeloutputskillBonusNature.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusNature.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusNature);
			labeloutputskillBonusNature.setBounds(162, 624, 60, 30);
			//
			labeloutputskillBonusPerception.setFont(labeloutputskillBonusPerception.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusPerception.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusPerception);
			labeloutputskillBonusPerception.setBounds(162, 643, 60, 30);
			//
			labeloutputskillBonusPerformance.setFont(labeloutputskillBonusPerformance.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusPerformance.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusPerformance);
			labeloutputskillBonusPerformance.setBounds(162, 662, 60, 30);
			//
			labeloutputskillBonusPersuasion.setFont(labeloutputskillBonusPersuasion.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusPersuasion.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusPersuasion);
			labeloutputskillBonusPersuasion.setBounds(162, 681, 60, 30);
			//
			labeloutputskillBonusReligion.setFont(labeloutputskillBonusReligion.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusReligion.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusReligion);
			labeloutputskillBonusReligion.setBounds(162, 700, 60, 30);
			//
			labeloutputskillBonusSleightOfHand.setFont(labeloutputskillBonusSleightOfHand.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusSleightOfHand.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusSleightOfHand);
			labeloutputskillBonusSleightOfHand.setBounds(162, 718, 60, 30);
			//
			labeloutputskillBonusStealth.setFont(labeloutputskillBonusStealth.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusStealth.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusStealth);
			labeloutputskillBonusStealth.setBounds(162, 737, 60, 30);
			//
			labeloutputskillBonusSurvival.setFont(labeloutputskillBonusSurvival.getFont().deriveFont(Font.PLAIN, 15));
    		labeloutputskillBonusSurvival.setForeground(Color.BLACK);
			//Coordinates
			background.add(labeloutputskillBonusSurvival);
			labeloutputskillBonusSurvival.setBounds(162, 756, 60, 30);




			//Equipment
			//Armor, Weapon & Other
			labeloutputArmor.setFont(labeloutputArmor.getFont().deriveFont(Font.PLAIN, 15));
			labeloutputArmor.setForeground(Color.BLACK);
			labeloutputWeapon.setFont(labeloutputWeapon.getFont().deriveFont(Font.PLAIN, 15));
			labeloutputWeapon.setForeground(Color.BLACK);
			labeloutputOther.setFont(labeloutputOther.getFont().deriveFont(Font.PLAIN, 15));
			labeloutputOther.setForeground(Color.BLACK);
			
			
			background.add(labeloutputWeapon);
			labeloutputArmor.setBounds(372, 830, 200, 20);
			background.add(labeloutputArmor);
			labeloutputWeapon.setBounds(372, 885, 200, 20);
			background.add(labeloutputOther);
			labeloutputOther.setBounds(372, 940, 200, 20);
			
			labeloutputGold.setFont(labeloutputGold.getFont().deriveFont(Font.PLAIN, 15));
			labeloutputGold.setForeground(Color.BLACK);
			//Coordinates 640, 1875, 80, 60
			background.add(labeloutputGold);
			labeloutputGold.setBounds(325, 937, 35, 30);






    		setVisible(true);

		} catch (IOException e) {
			//Image not found
			System.out.println("Image not Found");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return panel;

    }

	//Getters & Setters
    public String getOutputName() {
		return outputName;
	}

	public void setOutputName(String outputName) {
		this.outputName = outputName;
        //Test: Update test label:
		labelName.setText(outputName);
	}
	public int getOutputAge() {
		return outputAge;
	}

	public void setOutputAge(int outputAge) {
		this.outputAge = outputAge;
		labelAge.setText("" + outputAge);
	}

	public String getOutputGender() {
		return outputGender;
	}

	public void setOutputGender(String outputGender) {
		this.outputGender = outputGender;
		labelGender.setText(outputGender);
	}

	public String getOutputAlignment() {
		return outputAlignment;
	}

	public void setOutputAlignment(String outputAlignment) {
		this.outputAlignment = outputAlignment;
		labelAlignment.setText(outputAlignment);
	}

	public String getOutputPlayerName() {
		return outputPlayerName;
	}

	public void setOutputPlayerName(String outputPlayerName) {
		this.outputPlayerName = outputPlayerName;
		labelPlayerName.setText(outputPlayerName);
	}

	public String getOutputRace() {
		return outputRace;
	}

	public void setOutputRace(String outputRace) {
		this.outputRace = outputRace;
		labelRace.setText(outputRace);
	}

	public String getOutputClass() {
		return outputClass;
	}

	public void setOutputClass(String outputClass) {
		this.outputClass = outputClass;
		labelClass.setText(outputClass);
	}

	public int getOutputLevel() {
		return outputLevel;
	}

	public void setOutputLevel(int outputLevel) {
		this.outputLevel = outputLevel;
		labelLevel.setText("" + outputLevel);
	}

	public String getOutputBackground() {
		return outputBackground;
	}

	public void setOutputBackground(String outputBackground) {
		this.outputBackground = outputBackground;
		labelBackground.setText(outputBackground);
	}

	public int getTotalStrenght() {
		return totalStrenght;
	}

	public void setTotalStrenght(int totalStrenght) {
		this.totalStrenght = totalStrenght;
		labeltotalStrenght.setText("" + totalStrenght);
	}

	public int getTotalDexterity() {
		return totalDexterity;
	}

	public void setTotalDexterity(int totalDexterity) {
		this.totalDexterity = totalDexterity;
		labeltotalDexterity.setText("" + totalDexterity);
	}

	public int getTotalConstitution() {
		return totalConstitution;
	}

	public void setTotalConstitution(int totalConstitution) {
		this.totalConstitution = totalConstitution;
		labeltotalConstitution.setText("" + totalConstitution);
	}

	public int getTotalIntelligence() {
		return totalIntelligence;
	}

	public void setTotalIntelligence(int totalIntelligence) {
		this.totalIntelligence = totalIntelligence;
		labeltotalIntelligence.setText("" + totalIntelligence);
	}

	public int getTotalWisdom() {
		return totalWisdom;
	}

	public void setTotalWisdom(int totalWisdom) {
		this.totalWisdom = totalWisdom;
		labeltotalWisdom.setText("" + totalWisdom);
	}

	public int getTotalCharisma() {
		return totalCharisma;
	}

	public void setTotalCharisma(int totalCharisma) {
		this.totalCharisma = totalCharisma;
		labeltotalCharisma.setText("" + totalCharisma);
	}

	public int getBonusProficiency() {
		return bonusProficiency;
	}

	public void setBonusProficiency(int bonusProficiency) {
		this.bonusProficiency = bonusProficiency;
		labelbonusProficiency.setText("" + bonusProficiency);
	}

	public int getBonusStrenght() {
		return bonusStrenght;
	}

	public void setBonusStrenght(int bonusStrenght) {
		this.bonusStrenght = bonusStrenght;
		labelbonusStrenght.setText("" + bonusStrenght);
	}

	public int getBonusDexterity() {
		return bonusDexterity;
	}

	public void setBonusDexterity(int bonusDexterity) {
		this.bonusDexterity = bonusDexterity;
		labelbonusDexterity.setText("" + bonusDexterity);
	}

	public int getBonusConstitution() {
		return bonusConstitution;
	}

	public void setBonusConstitution(int bonusConstitution) {
		this.bonusConstitution = bonusConstitution;
		labelbonusConstitution.setText("" + bonusConstitution);
	}

	public int getBonusIntelligence() {
		return bonusIntelligence;
	}

	public void setBonusIntelligence(int bonusIntelligence) {
		this.bonusIntelligence = bonusIntelligence;
		labelbonusIntelligence.setText("" + bonusIntelligence);
	}

	public int getBonusWisdom() {
		return bonusWisdom;
	}

	public void setBonusWisdom(int bonusWisdom) {
		this.bonusWisdom = bonusWisdom;
		labelbonusWisdom.setText("" + bonusWisdom);
	}

	public int getBonusCharisma() {
		return bonusCharisma;
	}

	public void setBonusCharisma(int bonusCharisma) {
		this.bonusCharisma = bonusCharisma;
		labelbonusCharisma.setText("" + bonusCharisma);
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
		labelarmorClass.setText("" + armorClass);
	}

	public int getBonusInitative() {
		return bonusInitative;
	}

	public void setBonusInitative(int bonusInitative) {
		this.bonusInitative = bonusInitative;
		labelbonusInitative.setText("" + bonusInitative);
	}

	public int getBaseMovementSpeed() {
		return baseMovementSpeed;
	}

	public void setBaseMovementSpeed(int baseMovementSpeed) {
		this.baseMovementSpeed = baseMovementSpeed;
		labelbaseMovementSpeed.setText("" + baseMovementSpeed);
	}

	public int getHitPointMaximum() {
		return hitPointMaximum;
	}

	public void setHitPointMaximum(int hitPointMaximum) {
		this.hitPointMaximum = hitPointMaximum;
		labelhitPointMaximum.setText("" + hitPointMaximum);
	}

	public int getPassivePerception() {
		return passivePerception;
	}

	public void setPassivePerception(int passivePerception) {
		this.passivePerception = passivePerception;
		labelpassivePerception.setText("" + passivePerception);
	}

	public String getOutputArmor() {
		return outputArmor;
	}

	public void setOutputArmor(String outputArmor) {
		this.outputArmor = outputArmor;
		labeloutputArmor.setText(outputArmor);
	}

	public String getOutputWeapon() {
		return outputWeapon;
	}

	public void setOutputWeapon(String outputWeapon) {
		this.outputWeapon = outputWeapon;
		labeloutputWeapon.setText(outputWeapon);
	}

	public boolean isOutputShield() {
		return outputShield;
	}

	public void setOutputShield(boolean outputShield) {
		this.outputShield = outputShield;
		//labeloutputShield.setText(outputShield);
	}

	public String getOutputOther() {
		return outputOther;
	}

	public void setOutputOther(String outputOther) {
		this.outputOther = outputOther;
		labeloutputOther.setText(outputOther);
	}

	public int getOutputGold() {
		return outputGold;
	}

	public void setOutputGold(int outputGold) {
		this.outputGold = outputGold;
		labeloutputGold.setText("" + outputGold);
	}

	public String getOutputCharacterDescription() {
		return outputCharacterDescription;
	}

	public void setOutputCharacterDescription(String outputCharacterDescription) {
		this.outputCharacterDescription = outputCharacterDescription;
		labeloutputCharacterPersonality.setText(outputCharacterPersonality);
	}

	public String getOutputCharacterPersonality() {
		return outputCharacterPersonality;
	}

	public void setOutputCharacterPersonality(String outputCharacterPersonality) {
		this.outputCharacterPersonality = outputCharacterPersonality;
		labeloutputCharacterPersonality.setText(outputCharacterPersonality);
	}

	public String getOutputCharacterIdeals() {
		return outputCharacterIdeals;
	}

	public void setOutputCharacterIdeals(String outputCharacterIdeals) {
		this.outputCharacterIdeals = outputCharacterIdeals;
		labeloutputCharacterIdeals.setText(outputCharacterIdeals);
	}

	public String getOutputCharacterBonds() {
		return outputCharacterBonds;
	}

	public void setOutputCharacterBonds(String outputCharacterBonds) {
		this.outputCharacterBonds = outputCharacterBonds;
		labeloutputCharacterBonds.setText(outputCharacterBonds);
	}

	public String getOutputCharacterFlaws() {
		return outputCharacterFlaws;
	}

	public void setOutputCharacterFlaws(String outputCharacterFlaws) {
		this.outputCharacterFlaws = outputCharacterFlaws;
		labeloutputCharacterFlaws.setText(outputCharacterFlaws);
	}

	//Saving Throws
	public int getOutputSavingThrowStrenght() {
		return outputSavingThrowStrenght;
	}

	public void setOutputSavingThrowStrenght(int outputSavingThrowStrenght) {
		this.outputSavingThrowStrenght = outputSavingThrowStrenght;
		labeloutputSavingThrowStrenght.setText("" + outputSavingThrowStrenght);
	}

	public int getOutputSavingThrowDexterity() {
		return outputSavingThrowDexterity;
	}

	public void setOutputSavingThrowDexterity(int outputSavingThrowDexterity) {
		this.outputSavingThrowDexterity = outputSavingThrowDexterity;
		labeloutputSavingThrowDexterity.setText("" + outputSavingThrowDexterity);
	}

	public int getOutputSavingThrowConstitution() {
		return outputSavingThrowConstitution;
	}

	public void setOutputSavingThrowConstitution(int outputSavingThrowConstitution) {
		this.outputSavingThrowConstitution = outputSavingThrowConstitution;
		labeloutputSavingThrowConstitution.setText("" + outputSavingThrowConstitution);
	}

	public int getOutputSavingThrowIntelligence() {
		return outputSavingThrowIntelligence;
	}

	public void setOutputSavingThrowIntelligence(int outputSavingThrowIntelligence) {
		this.outputSavingThrowIntelligence = outputSavingThrowIntelligence;
		labeloutputSavingThrowIntelligence.setText("" + outputSavingThrowIntelligence);
	}

	public int getOutputSavingThrowWisdom() {
		return outputSavingThrowWisdom;
	}

	public void setOutputSavingThrowWisdom(int outputSavingThrowWisdom) {
		this.outputSavingThrowWisdom = outputSavingThrowWisdom;
		labeloutputSavingThrowWisdom.setText("" + outputSavingThrowWisdom);
	}

	public int getOutputSavingThrowCharisma() {
		return outputSavingThrowCharisma;
	}

	public void setOutputSavingThrowCharisma(int outputSavingThrowCharisma) {
		this.outputSavingThrowCharisma = outputSavingThrowCharisma;
		labeloutputSavingThrowCharisma.setText("" + outputSavingThrowCharisma);
	}



	//Skill Bonuses:
	public int getOutputskillBonusAthletics() {
		return outputskillBonusAthletics;
	}

	public void setOutputskillBonusAthletics(int outputskillBonusAthletics) {
		this.outputskillBonusAthletics = outputskillBonusAthletics;
		labeloutputskillBonusAthletics.setText("" + outputskillBonusAthletics);
	}

	public int getOutputskillBonusAcrobatics() {
		return outputskillBonusAcrobatics;
	}

	public void setOutputskillBonusAcrobatics(int outputskillBonusAcrobatics) {
		this.outputskillBonusAcrobatics = outputskillBonusAcrobatics;
		labeloutputskillBonusAcrobatics.setText("" + outputskillBonusAcrobatics);
	}

	public int getOutputskillBonusSleightOfHand() {
		return outputskillBonusSleightOfHand;
	}

	public void setOutputskillBonusSleightOfHand(int outputskillBonusSleightOfHand) {
		this.outputskillBonusSleightOfHand = outputskillBonusSleightOfHand;
		labeloutputskillBonusSleightOfHand.setText("" + outputskillBonusSleightOfHand);
	}

	public int getOutputskillBonusStealth() {
		return outputskillBonusStealth;
	}

	public void setOutputskillBonusStealth(int outputskillBonusStealth) {
		this.outputskillBonusStealth = outputskillBonusStealth;
		labeloutputskillBonusStealth.setText("" + outputskillBonusStealth);
	}

	public int getOutputskillBonusArcana() {
		return outputskillBonusArcana;
	}

	public void setOutputskillBonusArcana(int outputskillBonusArcana) {
		this.outputskillBonusArcana = outputskillBonusArcana;
		labeloutputskillBonusArcana.setText("" + outputskillBonusArcana);
	}

	public int getOutputskillBonusHistory() {
		return outputskillBonusHistory;
	}

	public void setOutputskillBonusHistory(int outputskillBonusHistory) {
		this.outputskillBonusHistory = outputskillBonusHistory;
		labeloutputskillBonusHistory.setText("" + outputskillBonusHistory);
	}

	public int getOutputskillBonusInvestigation() {
		return outputskillBonusInvestigation;
	}

	public void setOutputskillBonusInvestigation(int outputskillBonusInvestigation) {
		this.outputskillBonusInvestigation = outputskillBonusInvestigation;
		labeloutputskillBonusInvestigation.setText("" + outputskillBonusInvestigation);
	}

	public int getOutputskillBonusNature() {
		return outputskillBonusNature;
	}

	public void setOutputskillBonusNature(int outputskillBonusNature) {
		this.outputskillBonusNature = outputskillBonusNature;
		labeloutputskillBonusNature.setText("" + outputskillBonusNature);
	}

	public int getOutputskillBonusReligion() {
		return outputskillBonusReligion;
	}

	public void setOutputskillBonusReligion(int outputskillBonusReligion) {
		this.outputskillBonusReligion = outputskillBonusReligion;
		labeloutputskillBonusReligion.setText("" + outputskillBonusReligion);
	}

	public int getOutputskillBonusAnimalHandling() {
		return outputskillBonusAnimalHandling;
	}

	public void setOutputskillBonusAnimalHandling(int outputskillBonusAnimalHandling) {
		this.outputskillBonusAnimalHandling = outputskillBonusAnimalHandling;
		labeloutputskillBonusAnimalHandling.setText("" + outputskillBonusAnimalHandling);
	}

	public int getOutputskillBonusInsight() {
		return outputskillBonusInsight;
	}

	public void setOutputskillBonusInsight(int outputskillBonusInsight) {
		this.outputskillBonusInsight = outputskillBonusInsight;
		labeloutputskillBonusInsight.setText("" + outputskillBonusInsight);
	}

	public int getOutputskillBonusMedicine() {
		return outputskillBonusMedicine;
	}

	public void setOutputskillBonusMedicine(int outputskillBonusMedicine) {
		this.outputskillBonusMedicine = outputskillBonusMedicine;
		labeloutputskillBonusMedicine.setText("" + outputskillBonusMedicine);
	}

	public int getOutputskillBonusPerception() {
		return outputskillBonusPerception;
	}

	public void setOutputskillBonusPerception(int outputskillBonusPerception) {
		this.outputskillBonusPerception = outputskillBonusPerception;
		labeloutputskillBonusPerception.setText("" + outputskillBonusPerception);
	}

	public int getOutputskillBonusSurvival() {
		return outputskillBonusSurvival;
	}

	public void setOutputskillBonusSurvival(int outputskillBonusSurvival) {
		this.outputskillBonusSurvival = outputskillBonusSurvival;
		labeloutputskillBonusSurvival.setText("" + outputskillBonusSurvival);
	}

	public int getOutputskillBonusDeception() {
		return outputskillBonusDeception;
	}

	public void setOutputskillBonusDeception(int outputskillBonusDeception) {
		this.outputskillBonusDeception = outputskillBonusDeception;
		labeloutputskillBonusDeception.setText("" + outputskillBonusDeception);
	}

	public int getOutputskillBonusIntimidation() {
		return outputskillBonusIntimidation;
	}

	public void setOutputskillBonusIntimidation(int outputskillBonusIntimidation) {
		this.outputskillBonusIntimidation = outputskillBonusIntimidation;
		labeloutputskillBonusIntimidation.setText("" + outputskillBonusIntimidation);
	}

	public int getOutputskillBonusPerformance() {
		return outputskillBonusPerformance;
	}

	public void setOutputskillBonusPerformance(int outputskillBonusPerformance) {
		this.outputskillBonusPerformance = outputskillBonusPerformance;
		labeloutputskillBonusPerformance.setText("" + outputskillBonusPerformance);
	}

	public int getOutputskillBonusPersuasion() {
		return outputskillBonusPersuasion;
	}

	public void setOutputskillBonusPersuasion(int outputskillBonusPersuasion) {
		this.outputskillBonusPersuasion = outputskillBonusPersuasion;
		labeloutputskillBonusPersuasion.setText("" + outputskillBonusPersuasion);
	}




	

    
}




