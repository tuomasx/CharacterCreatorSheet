

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class CharacterEquipment extends JPanel implements ActionListener {

	private JTextField armorField;
	private JCheckBox shieldField;
	private JTextField weaponField;
	private JTextField goldField;
	private JTextField otherField;
	
	
    //Armor Types: "None" 
        // Light:   // "Leather Armor" "Padded Armor" "Studded Leather Armor"
        // Medium:  // "Breastplate" "Chain Shirt" "Half Plate Armor" "Hide Armor" "Scale Mail"
        // Heavy:   // "Chain Mail" "Plate Armor" "Ring Mail" "Splint Armor"
    private String armors[]={"None", "Leather Armor","Padded Armor","Studded Leather Armor","Breastplate","Chain Shirt","Half Plate Armor","Hide Armor","Scale Mail","Chain Mail","Plate Armor","Ring Mail","Splint Armor"};
    private JComboBox armorComboBox = new JComboBox<>(armors);
    
    private JCheckBox shieldSelect = new JCheckBox();
    //
    //private String simpleWeapons[]={"Club","Dagger","Greatclub","Handaxe","Javelin","Light hammer", "Mace", "Quarterstaff", "Sickle", "Spear"};
    
    //private String martialWeapons[]= {"Battleaxe","Dwarven Urgrosh", "Elven Crescent Blade", "Flail", 
    //		"Glaive", "Greataxe", "Halberd", "Lance", "Longsword", "Maul", "Morningstar", "Pike", "Rapier", "Scimitar", "Shortsword"
    //		,"Spiked Chain", "Trident", "War pick", "Warhammer", "Whip", "War Scythe"};
    
    private String weapons[]={"", "Club","Dagger","Greatclub","Handaxe","Javelin","Light hammer", "Mace", "Quarterstaff", "Sickle", "Spear","Battleaxe","Dwarven Urgrosh", "Elven Crescent Blade", "Flail", 
    		"Glaive", "Greataxe", "Halberd", "Lance", "Longsword", "Maul", "Morningstar", "Pike", "Rapier", "Scimitar", "Shortsword"
    		,"Spiked Chain", "Trident", "War pick", "Warhammer", "Whip", "War Scythe"};
    private JComboBox weaponComboBox = new JComboBox<>(weapons);
    
    // Other
    private String others[] = {"", "Bedroll","Book","Lamp","Torch"};
    private JComboBox otherComboBox = new JComboBox<>(others);
    
    // Shield
    private boolean shield = false;
    
    // Gold
    SpinnerModel goldValue = new SpinnerNumberModel(0, 0, 1000000, 10);
    private String charArmor = "None";
    private String charWeapon = "";
    private String charOther = "";
    private int intGold = 0;
    

    public CharacterEquipment () {


        setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Equipment");
        
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.NORTH;
        add(label, constraints2);


        //Button for Help 4
        JButton buttonHelp = new JButton("?");
		    buttonHelp.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed( ActionEvent e ) {
				  //Open help window
                new Help4();	
			    }
		    });
        buttonHelp.setPreferredSize(new Dimension(25, 25));
        buttonHelp.setMargin(new java.awt.Insets(1, 1, 1, 1));
        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.EAST;
        //Add button next to "Character Details"
        add(buttonHelp, constraints2);
        //
        constraints2.anchor = GridBagConstraints.NORTH;



        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        //Fields:

        //Dropdown Menus:

        //Armor:
        //Dropdown Menu: Race
        JLabel armorLabel = new JLabel("Armor: ");
        armorComboBox = new JComboBox<>(armors);
        armorComboBox.setPreferredSize(new Dimension(150, 24));
        armorComboBox.addActionListener(this);
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(armorLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(armorComboBox, constraints2);

        //Shield: true/false checkbox
        JLabel shieldLabel = new JLabel("Shield: ");
        //JComboBox weaponComboBox = new JComboBox<>(weapons);
        //weaponComboBox.setPreferredSize(new Dimension(150, 24));
        shieldSelect = new JCheckBox();
        shieldSelect.addActionListener(this);
        //shieldSelect.addItemListener();

        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(shieldLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(shieldSelect, constraints2);

        //Weapon:
        JLabel weaponLabel = new JLabel("Weapon: ");
        weaponComboBox = new JComboBox<>(weapons);
        weaponComboBox.setEditable(true);
        weaponComboBox.setPreferredSize(new Dimension(150, 24));
        weaponComboBox.addActionListener(this);
        constraints2.gridx = 0;
        constraints2.gridy = 2;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(weaponLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(weaponComboBox, constraints2);


        //Gold:
        //Intelligence:
        JLabel goldLabel = new JLabel("Gold: ");
        //JSpinner number select:
        JSpinner goldSpinner = new JSpinner(goldValue);
        //Document Listener:
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor)goldSpinner.getEditor();
        JTextField textField = editor.getTextField();
        textField.getDocument().addDocumentListener( new DocumentListener()
        {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
            
        }); //End of DocumentListener for Age
        
        constraints2.gridx = 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(goldLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(goldSpinner, constraints2);


        //Other:
        JLabel othersLabel = new JLabel("Other: ");
        otherComboBox = new JComboBox<>(others);
        otherComboBox.setPreferredSize(new Dimension(150, 24));
        otherComboBox.setEditable(true);
        otherComboBox.addActionListener(this);
        constraints2.gridx = 0;
        constraints2.gridy = 4;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(othersLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(otherComboBox, constraints2);

        //Additional


        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints2);
        

    }

    public String getArmorField() {
		return armorField.getText();
	}

	public boolean getShieldField() {
		return (boolean) shieldField.isSelected();
	}
    
	public String getWeaponField() {
		return armorField.getText();
	}
	
	public int getGoldField() {
		return Integer.parseInt(goldField.getText());
	}
	
	public String getOtherField() {
		return otherField.getText();
	}
	
	public void update() {
        //Set input values from GUI to CharacterSheet Inputs:
        //Armor:
		charArmor = armorComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputArmor(charArmor);
        //CharacterSheet.getInstance().setInputArmor(armorField.getText());

        //Shield:
        shield = shieldSelect.isSelected();
        CharacterSheet.getInstance().setInputShield(shield);

        //Weapon:
        charWeapon = weaponComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputWeapon(charWeapon);
        
        intGold = (Integer) goldValue.getValue();
        CharacterSheet.getInstance().setInputGold(intGold);
        
        //Other:
        charOther = otherComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputOther(charOther);
        //Change Alignment to ComboBox dropdown select.
        //CharacterSheet.getInstance().setInputAlignment(alignmentField.getText());

                
        //Calculate Changes:
        CharacterSheet.getInstance().calculateOutput();
        //Display Changes: //Test print to console
        CharacterSheet.getInstance().printOutputs();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
	}
}
