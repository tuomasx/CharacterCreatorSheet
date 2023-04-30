import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  

import javax.swing.event.*;
import javax.swing.text.*;

public class CharacterDescription extends JPanel implements ActionListener {

    private JTextField characterDescription;
    private JTextField characterPersonality;
    private JTextField characterIdeals;
    private JTextField characterBonds;
    private JTextField characterFlaws;


    public CharacterDescription ( ) {

        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Description");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.anchor = GridBagConstraints.NORTH;
        add(label, constraints);
        
        //Button for Help 5
        JButton buttonHelp = new JButton("?");
		    buttonHelp.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed( ActionEvent e ) {
				  //Open help window
                new Help5();	
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
        
        //Fields:
        
        //Character Description:
        JLabel descriptionLabel = new JLabel("Character Description: ");
        characterDescription = new JTextField(10);
        characterDescription.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        //characterDescription.addActionListener(this);
        //DocumentListener:
        characterDescription.getDocument().addDocumentListener(new DocumentListener() {
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
                CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
                CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
                CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
                CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater
        
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(descriptionLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterDescription, constraints);

        //Personality:
        JLabel personalityLabel = new JLabel("Personality: ");
        characterPersonality = new JTextField(3);
        characterPersonality.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        //characterPersonality.addActionListener(this);
        //DocumentListener:
        characterPersonality.getDocument().addDocumentListener(new DocumentListener() {
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
                CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
                CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
                CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
                CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater

        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 1;
        fieldsPanel.add(personalityLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterPersonality, constraints);

        //Ideals:
        JLabel idealsLabel = new JLabel("Ideals: ");
        characterIdeals = new JTextField(6);
        characterIdeals.setPreferredSize(new Dimension(75, 24));
        //Actionlistener:
        //characterIdeals.addActionListener(this);
        //DocumentListener:
        characterIdeals.getDocument().addDocumentListener(new DocumentListener() {
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
                CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
                CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
                CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
                CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 2;
        fieldsPanel.add(idealsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterIdeals, constraints);

        //Bonds:
        JLabel bondsLabel = new JLabel("Bonds: ");
        characterBonds = new JTextField(10);
        characterBonds.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        //characterBonds.addActionListener(this);
        //DocumentListener:
        characterBonds.getDocument().addDocumentListener(new DocumentListener() {
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
                CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
                CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
                CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
                CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 3;
        fieldsPanel.add(bondsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterBonds, constraints);

        //Flaws:
        JLabel flawsLabel = new JLabel("Flaws: ");
        characterFlaws = new JTextField(10);
        characterFlaws.setPreferredSize(new Dimension(150, 24));
        //Actionlistener:
        //characterFlaws.addActionListener(this);
        //DocumentListener:
        characterFlaws.getDocument().addDocumentListener(new DocumentListener() {
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
                CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
                CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
                CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
                CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
                //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
                //Calculate Changes:
                CharacterSheet.getInstance().calculateOutput();
                //Display Changes:
                //Test print to console
                CharacterSheet.getInstance().printOutputs();
            }
        }); //End of DocumentListener Updater
        //Constraints:
        constraints.gridx = 0;
        constraints.gridy = 4;
        fieldsPanel.add(flawsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterFlaws, constraints);
        
        //End of Fields
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints);

    }

    

    //Deprecated in CharacterDescription, Uses DocumentListener instead
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        //Set input values from GUI to CharacterSheet Inputs:
        CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
        CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
        CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
        CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
        CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
        //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
        //Calculate Changes:
        CharacterSheet.getInstance().calculateOutput();
        //Display Changes:
        //Test print to console
        CharacterSheet.getInstance().printOutputs();
        
       
    }

    public void update() {
      //Set input values from GUI to CharacterSheet Inputs:
      CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
      CharacterSheet.getInstance().setInputCharacterPersonality(characterPersonality.getText());
      CharacterSheet.getInstance().setInputCharacterIdeals(characterIdeals.getText());
      CharacterSheet.getInstance().setInputCharacterBonds(characterBonds.getText());
      CharacterSheet.getInstance().setInputCharacterFlaws(characterFlaws.getText());
      //CharacterSheet.getInstance().setInputCharacterDescription(characterDescription.getText());
      //Calculate Changes:
      CharacterSheet.getInstance().calculateOutput();
      //Display Changes:
      //Test print to console
      CharacterSheet.getInstance().printOutputs();

    }
    
}
