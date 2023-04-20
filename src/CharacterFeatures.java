
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;  

import javax.swing.event.*;
import javax.swing.text.*;

public class CharacterFeatures extends JPanel implements ActionListener {

    private JTextField raceField = new JTextField("");
    private JTextField classField = new JTextField("");
    //private JTextField levelField;
    private JTextField backgroundField = new JTextField("");
    
    

    // "Dragonborn" "Dwarf" "Elf" "Gnome" "Half-Elf" "Half-Orc" "Halfling" "Human" "Tiefling"
    private String races[]={"", "Dragonborn","Dwarf","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Human","Tiefling"};
    // "Artificer" "Barbarian" "Bard" "Cleric" "Druid" "Fighter" "Monk" "Paladin" "Ranger" "Rogue" "Sorcerer" "Warlock" "Wizard"
    private String classes[]={"", "Artificer","Barbarian","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorcerer","Warlock","Wizard"};
    // "Acolyte" "Charlatan" "Criminal" "Entertainer" "Folk Hero" "Gladiator" "Guild Artisan" "Guild Merchant" "Hermit" "Knight" "Noble" "Outlander" "Pirate" "Sage" "Sailor" "Soldier" "Urchin" ""
    private String backgrounds[]={"", "Acolyte","Charlatan","Criminal","Entertainer","Folk Hero","Gladiator","Guild Artisan","Guild Merchant","Hermit","Knight","Noble","Outlander","Pirate","Sage","Sailor","Soldier","Urchin"};
    // Level: Number range: 1 - 20
    SpinnerModel levelValue = new SpinnerNumberModel(1, 1, 20, 1);

    private JComboBox raceComboBox = new JComboBox<>(races);
    private JComboBox classComboBox = new JComboBox<>(classes);
    private JComboBox backgroundComboBox = new JComboBox<>(backgrounds);
    
    private String charRace = "";
    private String charClass = "";
    private int charLevel = 1;
    private String charBackground = "";

    public CharacterFeatures () {

        setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Features");
        
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.NORTH;
        add(label, constraints2);
        
        

        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        //Fields:

        //Dropdown Menus:

        //Dropdown Menu: Race
        JLabel raceLabel = new JLabel("Race: ");
        raceComboBox = new JComboBox<>(races);
        raceComboBox.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        raceComboBox.addActionListener(this);
        //Constraints:
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(raceLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(raceComboBox, constraints2);
        

        //Dropdown Menu: Class
        JLabel classLabel = new JLabel("Class: ");
        classComboBox = new JComboBox<>(classes);
        classComboBox.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        classComboBox.addActionListener(this);
        //Constraints:
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(classLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(classComboBox, constraints2);


        //Number select Menu: Level
        JLabel levelLabel = new JLabel("Level: ");
        //JSpinner number select:
        JSpinner levelSpinner = new JSpinner(levelValue);
        
        //Document Listener:
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor)levelSpinner.getEditor();
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
            public void update() {
                //Set input values from GUI to CharacterSheet Inputs:
                //Race
                charRace = raceComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputRace(charRace);
                //Class
                charClass = classComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputClass(charClass);
                //Added Change Listener to Level JSpinner instead
                int value = (Integer) levelValue.getValue();
                CharacterSheet.getInstance().setInputLevel(value);
                //Background
                charBackground = backgroundComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputBackground(charBackground);
                 
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
             }
        }); //End of DocumentListener for Level

        //Constraints:
        constraints2.gridx = 0;
        constraints2.gridy = 2;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(levelLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(levelSpinner, constraints2);

        //Dropdown Menu: Background
        JLabel backgroundLabel = new JLabel("Background: ");
        backgroundComboBox = new JComboBox<>(backgrounds);
        backgroundComboBox.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        backgroundComboBox.addActionListener(this);
        //Constraints:
        constraints2.gridx = 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(backgroundLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(backgroundComboBox, constraints2);
        

        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints2);
        
    }



    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        //Check for null: ?


        //Set input values from GUI to CharacterSheet Inputs:
        //Race
        //CharacterSheet.getInstance().setInputRace(raceField.getText());
        charRace = raceComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputRace(charRace);
        //Class
        //CharacterSheet.getInstance().setInputClass(classField.getText());
        charClass = classComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputClass(charClass);
        //Added Change Listener to Level JSpinner instead
        int value = (Integer) levelValue.getValue();
        CharacterSheet.getInstance().setInputLevel(value);
        //Background
        charBackground = backgroundComboBox.getSelectedItem().toString();
        CharacterSheet.getInstance().setInputBackground(charBackground);

        //Calculate Changes:
        CharacterSheet.getInstance().calculateOutput();
        //Display Changes:
        //Test print to console
        CharacterSheet.getInstance().printOutputs();
        
       
    }
    
}




//ChangeListener:
        /*
        levelSpinner.addChangeListener(new ChangeListener() {      
            @Override
            public void stateChanged(ChangeEvent e) {
              // handle update:
                //Level:
                int value = (Integer) levelValue.getValue();
                CharacterSheet.getInstance().setInputLevel(value);

                //Set input values from GUI to CharacterSheet Inputs:
                //Race
                charRace = raceComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputRace(charRace);
                //Class
                charClass = classComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputClass(charClass);
                //Background
                charBackground = backgroundComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputBackground(charBackground);

            }
          });
        */
        //DocumentListener:
        /* 
        levelSpinner.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              update();
            }
            public void removeUpdate(DocumentEvent e) {
              update();
            }
            public void insertUpdate(DocumentEvent e) {
              update();
            }
          
            public void update() {
               //Set input values from GUI to CharacterSheet Inputs:
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater
        */
