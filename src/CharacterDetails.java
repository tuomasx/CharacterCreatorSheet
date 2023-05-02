import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import javax.swing.event.*;
//import javax.swing.text.*;


public class CharacterDetails extends JPanel implements ActionListener {
	
	ImageIcon icon = new ImageIcon("src/questionmark.png");
    
    private JTextField nameField;
    private JTextField ageField;
    private JTextField genderField;
    private JTextField alignmentField;
    private JTextField playerField;
    
    
    // "Dragonborn" "Dwarf" "Elf" "Gnome" "Half-Elf" "Half-Orc" "Halfling" "Human" "Tiefling"
    //private String races[]={"Dragonborn","Dwarf","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Human","Tiefling"};
    
    SpinnerModel ageValue = new SpinnerNumberModel(20, 0, 10000, 1);
    private int charAge = 20;
    private String charAlignment = "";
    private String charGender = "";
    

    private String alignments[]={"", "Lawful Good","Neutral Good","Chaotic Good","Lawful Neutral","Neutral","Chaotic Neutral","Lawful Evil","Neutral Evil","Chaotic Evil","None","Unknown","Other"};
    private JComboBox alignmentComboBox = new JComboBox<>(alignments);

    private String genders[]={"", "Male","Female","None","Other","Neutral","Unknown","Both","Neither","Either","Variable"};
    private JComboBox genderComboBox = new JComboBox<>(genders);

    public CharacterDetails() {

        //this.setPreferredSize(new Dimension(260, 170));
        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Details");
        label.setPreferredSize(new Dimension(100, 30));
        
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.anchor = GridBagConstraints.NORTH;
        
        add(label, constraints);

        //Button for Help 1
        JButton buttonHelp = new JButton("?");
		buttonHelp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent e ) {
				//Open help window
                new Help1();	
			}
		});
        buttonHelp.setPreferredSize(new Dimension(25, 25));
        buttonHelp.setMargin(new java.awt.Insets(1, 1, 1, 1));
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.anchor = GridBagConstraints.EAST;
        //Add button next to "Character Details"
        add(buttonHelp, constraints);
        //
        constraints.anchor = GridBagConstraints.NORTH;


        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        
        //Name:
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(10);
        nameField.setPreferredSize(new Dimension(150, 24));
        //DocumentListener:
        nameField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              update();
            }
            public void removeUpdate(DocumentEvent e) {
              update();
            }
            public void insertUpdate(DocumentEvent e) {
              update();
            }
        }); //End of DocumentListener

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(nameLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(nameField, constraints);

        //Age:
        JLabel ageLabel = new JLabel("Age: ");
        JSpinner ageSpinner = new JSpinner(ageValue);
        //Document Listener:
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor)ageSpinner.getEditor();
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

        constraints.gridx = 0;
        constraints.gridy = 1;
        fieldsPanel.add(ageLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(ageSpinner, constraints);

        //Gender:
        JLabel genderLabel = new JLabel("Gender: ");
        //ComboBox:
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        genderComboBox.addActionListener(this);
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 2;
        fieldsPanel.add(genderLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(genderComboBox, constraints);

        //Alignment:
        JLabel alignmentLabel = new JLabel("Alignment: ");
        //ComboBox:
        alignmentComboBox = new JComboBox<>(alignments);
        alignmentComboBox.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        alignmentComboBox.addActionListener(this);
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 3;
        fieldsPanel.add(alignmentLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(alignmentComboBox, constraints);

        //Player Name:
        JLabel playerLabel = new JLabel("Player Name: ");
        playerField = new JTextField(10);
        playerField.setPreferredSize(new Dimension(150, 24));
        //DocumentListener:
        playerField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
              update();
            }
            public void removeUpdate(DocumentEvent e) {
              update();
            }
            public void insertUpdate(DocumentEvent e) {
              update();
            }
        }); //End of DocumentListener

        constraints.gridx = 0;
        constraints.gridy = 4;
        fieldsPanel.add(playerLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(playerField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints);
    }
    
    public String getNameField() {
        return nameField.getText();
    }
    
    public int getAgeField() {
        return Integer.parseInt(ageField.getText());
    }
    
    public String getGenderField() {
        return genderField.getText();
    }
    
    public String getAlignmentField() {
        return alignmentField.getText();
    }
    
    public String getPlayerField() {
        return playerField.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Update CharacterSheet:
        update();
    }


    public void update() {
        //Set input values from GUI to CharacterSheet Inputs:

                //Name:
                CharacterSheet.getInstance().setInputName(nameField.getText());

                //Age:
                charAge = (Integer) ageValue.getValue();
                CharacterSheet.getInstance().setInputAge(charAge);

                //Gender:
                charGender = genderComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputGender(charGender);
           

                //Alignment:
                charAlignment = alignmentComboBox.getSelectedItem().toString();
                CharacterSheet.getInstance().setInputAlignment(charAlignment);

                //Player Name:
                CharacterSheet.getInstance().setInputPlayerName(playerField.getText());
                
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();

                //Display Changes: //Test print to console
                CharacterSheet.getInstance().printOutputs();
    }
    
}

