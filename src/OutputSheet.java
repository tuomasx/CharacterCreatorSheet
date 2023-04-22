import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import javax.swing.event.*;
import javax.swing.text.*;

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
	private JLabel labelName = new JLabel("TestLabelName");
	//Age
	private int outputAge = 0;
	private JLabel labelAge = new JLabel("LabelAge");
	//Gender
	private String outputGender = "";
	private JLabel labelGender = new JLabel("LabelGender");
	//Aligment
	private String outputAlignment = "";
	private JLabel labelAlignment = new JLabel("LabelAlignment");
	//Playername
	private String outputPlayerName = "";
	private JLabel labelPlayerName = new JLabel("LabelPlayerName");
	//Character Features
	//Race
	private String outputRace = "";
	private JLabel labelRace = new JLabel("LabelRace");
	//Class
	private String outputClass = "";
	private JLabel labelClass = new JLabel("LabelClass");
	//Level
	private int outputLevel = 1;
	private JLabel labelLevel = new JLabel("LabelLevel");
	//Background
	private String outputBackground = "";
	private JLabel labelBackground = new JLabel("LabelBackground");
	//Ability Scores
	//
	private int totalStrenght = 10;
	private JLabel labeltotalStrenght = new JLabel("LabelSTR");
	//
	private int totalDexterity = 10;
	private JLabel labeltotalDexterity = new JLabel("LabelDEX");
	//
	private int totalConstitution = 10;
	private JLabel labeltotalConstitution = new JLabel("LabelCON");
	//
	private int totalIntelligence = 10;
	private JLabel labeltotalIntelligence = new JLabel("LabelINT");
	//
	private int totalWisdom = 10;
	private JLabel labeltotalWisdom = new JLabel("LabelWIS");
	//
	private int totalCharisma = 10;
	private JLabel labeltotalCharisma = new JLabel("LabelCHA");
	//Modifiers
	//
	private int bonusProficiency = 2;
	private JLabel labelbonusProficiency = new JLabel("LabelProficiency");
	//
	private int bonusStrenght = 0;
	private JLabel labelbonusStrenght = new JLabel("LabelSTRB");
	//
	private int bonusDexterity = 0;
	private JLabel labelbonusDexterity = new JLabel("LabelDEXB");
	//
	private int bonusConstitution = 0;
	private JLabel labelbonusConstitution = new JLabel("LabelCONB");
	//
	private int bonusIntelligence = 0;
	private JLabel labelbonusIntelligence = new JLabel("LabelINTB");
	//
	private int bonusWisdom = 0;
	private JLabel labelbonusWisdom = new JLabel("LabelWISB");
	//
	private int bonusCharisma = 0;
	private JLabel labelbonusCharisma = new JLabel("LabelCHAB");
	//Other Stats
	//
	private int armorClass = 10;
	private JLabel labelarmorClass = new JLabel("LabelArmorClass");
	//
	private int bonusInitative = 0;
	private JLabel labelbonusInitative = new JLabel("LabelIniativeBonus");
	//
	private int baseMovementSpeed = 30;
	private JLabel labelbaseMovementSpeed = new JLabel("LabelMovementSpeed");
	//
	private int hitPointMaximum = 0;
	private JLabel labelhitPointMaximum = new JLabel("LabelHitPointMaximum");
	//
	private int passivePerception = 10;
	private JLabel labelpassivePerception = new JLabel("LabelPassivePerception");
	//Equipment
	//
	private String outputArmor = "";
	private JLabel labeloutputArmor = new JLabel("LabelArmor");
	//
	private String outputWeapon = "";
	private JLabel labeloutputWeapon = new JLabel("LabelWeapon");
	//
	private boolean outputShield = false;
	//private JLabel labeloutputShield = new JLabel("LabelShield");
	//
	private String outputOther = "";
	private JLabel labeloutputOther = new JLabel("LabelOtherItem");
	//
	private int outputGold = 0;
	private JLabel labeloutputGold = new JLabel("LabelGold");
	//Character Description
	//
	private String outputCharacterDescription = "";
	private JLabel labeloutputCharacterDescription = new JLabel("LabelCharDescription");
	//
	private String outputCharacterPersonality = "";
	private JLabel labeloutputCharacterPersonality = new JLabel("LabelCharPersonality");
	//
	private String outputCharacterIdeals = "";
	private JLabel labeloutputCharacterIdeals = new JLabel("LabelCharIdeals");
	//
	private String outputCharacterBonds = "";
	private JLabel labeloutputCharacterBonds = new JLabel("LabelCharBonds");
	//
	private String outputCharacterFlaws = "";
	private JLabel labeloutputCharacterFlaws = new JLabel("LabelCharFlaws");
	//


	


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
			JLabel picLabel = new JLabel(new ImageIcon(newImage));
			


			JLabel background = new JLabel(new ImageIcon(newImage));

			//background.setLayout(new BorderLayout());
			//Changed to GridBagLayout
			background.setLayout(new GridBagLayout());
        	GridBagConstraints constraints = new GridBagConstraints();
			
			panel.add(background);

			//Constraints:
			constraints.gridx = 0;
        	constraints.gridy = 0;
			constraints.gridwidth = 5;
        	constraints.anchor = GridBagConstraints.NORTH;
			

			//Test Label 1: Name
			//labelName.setText("Test Label");
    		labelName.setFont(labelName.getFont().deriveFont(Font.BOLD, 48));
    		labelName.setForeground(Color.BLACK);
    		//labelName.setHorizontalAlignment(JLabel.CENTER);
			//Constraints
			constraints.gridx = 0;
        	constraints.gridy = 0;
    		background.add(labelName, constraints);
			//Age
			labelAge.setFont(labelAge.getFont().deriveFont(Font.BOLD, 48));
    		labelAge.setForeground(Color.BLACK);
    		//labelAge.setHorizontalAlignment(JLabel.CENTER);
			//Constraints
			constraints.gridx = 0;
        	constraints.gridy = 1;
    		background.add(labelAge, constraints);
			//Gender
			labelGender.setFont(labelGender.getFont().deriveFont(Font.BOLD, 48));
    		labelGender.setForeground(Color.BLACK);
    		//labelGender.setHorizontalAlignment(JLabel.CENTER);
			//Constraints
			constraints.gridx = 0;
        	constraints.gridy = 2;
    		background.add(labelGender, constraints);
			//Alignment
			labelAlignment.setFont(labelAlignment.getFont().deriveFont(Font.BOLD, 48));
    		labelAlignment.setForeground(Color.BLACK);
    		//labelAlignment.setHorizontalAlignment(JLabel.CENTER);
			//Constraints
			constraints.gridx = 0;
        	constraints.gridy = 3;
    		background.add(labelAlignment, constraints);
			//PlayerName
			labelPlayerName.setFont(labelPlayerName.getFont().deriveFont(Font.BOLD, 48));
    		labelPlayerName.setForeground(Color.BLACK);
    		//labelPlayerName.setHorizontalAlignment(JLabel.CENTER);
			//Constraints
			constraints.gridx = 0;
        	constraints.gridy = 4;
    		background.add(labelPlayerName, constraints);

    		//pack();
    		//setLocationRelativeTo(null);
    		setVisible(true);

			/* 
			JLabel label = new JLabel("Test");
			label.setText("Test Label");
			label.setVisible(true);
			//picLabel.add(label);
			//picLabel.setPreferredSize(new Dimension(640, 480));
			panel2.add(picLabel);
			*/

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



    
}

/*
 
        panel2.setBackground(new Color(255, 255, 255));
		//Adding an empty White frame to the center & right side

		//jlabel.getBackground().setOpaque(false);

		//Adding image to panel:
		//CharacterSheetBase Resolution: 1700 x 2200
		//1275 x 1650
		try {
			//Change File Path:
			BufferedImage myPicture = ImageIO.read(new File("C:/Users/Heikki/Desktop/Ohj4_CharacterCreatorSheet/CharacterCreatorSheet/CharacterSheetBase.png"));
			Image newImage = myPicture.getScaledInstance(850, 1100, Image.SCALE_DEFAULT);
			JLabel picLabel = new JLabel(new ImageIcon(newImage));
			


			JLabel background = new JLabel(new ImageIcon(newImage));
			background.setLayout(new BorderLayout());
			panel2.add(background);

			
			label.setText("Test Label");

    		label.setFont(label.getFont().deriveFont(Font.BOLD, 48));
    		label.setForeground(Color.BLACK);
    		label.setHorizontalAlignment(JLabel.CENTER);
    		background.add(label);

    		pack();
    		setLocationRelativeTo(null);
    		setVisible(true);

	
			


		} catch (IOException e) {
			//Image not found
			System.out.println("Image not Found");
		}
		
		





 */
