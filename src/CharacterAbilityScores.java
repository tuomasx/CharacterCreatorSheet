

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

import java.awt.event.*;  
import javax.swing.event.*;
import javax.swing.text.*;


public class CharacterAbilityScores extends JPanel implements ActionListener {

    //Ability Scores: Value range: 1 - 20, Default 10
    SpinnerModel strenghtValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel dexterityValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel constitutionValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel intelligenceValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel wisdomValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel charismaValue = new SpinnerNumberModel(10, 1, 20, 1);

    private int charStrenght = 10;
    private int charDexterity = 10;
    private int charConstitution = 10;
    private int charIntelligence = 10;
    private int charWisdom = 10;
    private int charCharisma = 10;

    public CharacterAbilityScores () {

        //this.setPreferredSize(new Dimension(260, 170));
        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        
        JLabel label = new JLabel("Ability Scores");
        
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.NORTH;
        add(label, constraints2);

        //Button for Help 3
        JButton buttonHelp = new JButton("?");
		    buttonHelp.addActionListener(new ActionListener(){
			  @Override
			  public void actionPerformed( ActionEvent e ) {
				  //Open help window
                new Help3();	
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
        constraints2.anchor = GridBagConstraints.NORTHWEST;


        //this.setPreferredSize(new Dimension(260, 170));
        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        //fieldsPanel.setPreferredSize(new Dimension(300, 200));


        //Fields:

        //Strenght:
        JLabel strenghtLabel = new JLabel("Strenght: ");
        strenghtLabel.setPreferredSize(new Dimension(50, 20));
        //JSpinner number select:
        JSpinner strenghtSpinner = new JSpinner(strenghtValue);
        //Document Listener:
        JSpinner.DefaultEditor editorStr = (JSpinner.DefaultEditor)strenghtSpinner.getEditor();
        JTextField textFieldStr = editorStr.getTextField();
        textFieldStr.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        
        fieldsPanel.add(strenghtLabel, constraints2);
        constraints2.gridx = 10;
        fieldsPanel.add(strenghtSpinner, constraints2);

        

        //Dexterity:
        JLabel dexterityLabel = new JLabel("Dexterity: ");
        //JSpinner number select:
        JSpinner dexteritySpinner = new JSpinner(dexterityValue);
        //Document Listener:
        JSpinner.DefaultEditor editorDex = (JSpinner.DefaultEditor)dexteritySpinner.getEditor();
        JTextField textFieldDex = editorDex.getTextField();
        textFieldDex.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(dexterityLabel, constraints2);

        constraints2.gridx = 5;
        fieldsPanel.add(new JLabel("           "), constraints2);
        
        constraints2.gridx = 10;
        fieldsPanel.add(dexteritySpinner, constraints2);

        //Constitution:
        JLabel constitutionLabel = new JLabel("Constitution: ");
        //JSpinner number select:
        JSpinner constitutionSpinner = new JSpinner(constitutionValue);
        //Document Listener:
        JSpinner.DefaultEditor editorCon = (JSpinner.DefaultEditor)constitutionSpinner.getEditor();
        JTextField textFieldCon = editorCon.getTextField();
        textFieldCon.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 2;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(constitutionLabel, constraints2);
        constraints2.gridx = 10;
        fieldsPanel.add(constitutionSpinner, constraints2);

        //Intelligence:
        JLabel intelligenceLabel = new JLabel("Intelligence: ");
        //JSpinner number select:
        JSpinner intelligenceSpinner = new JSpinner(intelligenceValue);
        //Document Listener:
        JSpinner.DefaultEditor editorInt = (JSpinner.DefaultEditor)intelligenceSpinner.getEditor();
        JTextField textFieldInt = editorInt.getTextField();
        textFieldInt.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(intelligenceLabel, constraints2);
        constraints2.gridx = 10;
        fieldsPanel.add(intelligenceSpinner, constraints2);

        //Wisdom:
        JLabel wisdomLabel = new JLabel("Wisdom: ");
        //JSpinner number select:
        JSpinner wisdomSpinner = new JSpinner(wisdomValue);
        //Document Listener:
        JSpinner.DefaultEditor editorWis = (JSpinner.DefaultEditor)wisdomSpinner.getEditor();
        JTextField textFieldWis = editorWis.getTextField();
        textFieldWis.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 4;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(wisdomLabel, constraints2);
        constraints2.gridx = 10;
        fieldsPanel.add(wisdomSpinner, constraints2);

        //Charisma:
        JLabel charismaLabel = new JLabel("Charisma: ");
        //JSpinner number select:
        JSpinner charismaSpinner = new JSpinner(charismaValue);
        //Document Listener:
        JSpinner.DefaultEditor editorCha = (JSpinner.DefaultEditor)charismaSpinner.getEditor();
        JTextField textFieldCha = editorCha.getTextField();
        textFieldCha.getDocument().addDocumentListener( new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }
            public void removeUpdate(DocumentEvent e) {
                update();
            }
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        }); //End of DocumentListener
        constraints2.gridx = 0;
        constraints2.gridy = 5;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(charismaLabel, constraints2);
        constraints2.gridx = 10;
        fieldsPanel.add(charismaSpinner, constraints2);

        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;

        constraints2.anchor = GridBagConstraints.NORTHWEST;
        add(fieldsPanel, constraints2);
        validate();
        //setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        update();
    }
    


    public void update() {
            //Set input values from GUI to CharacterSheet Inputs:

            //Strenght:
            charStrenght = (Integer) strenghtValue.getValue();
            CharacterSheet.getInstance().setInputStrenght(charStrenght);
            //Dexterity:
            charDexterity = (Integer) dexterityValue.getValue();
            CharacterSheet.getInstance().setInputDexterity(charDexterity);
            //Constitution:
            charConstitution = (Integer) constitutionValue.getValue();
            CharacterSheet.getInstance().setInputConstitution(charConstitution);
            //Intelligence:
            charIntelligence = (Integer) intelligenceValue.getValue();
            CharacterSheet.getInstance().setInputIntelligence(charIntelligence);
            //Wisdom:
            charWisdom = (Integer) wisdomValue.getValue();
            CharacterSheet.getInstance().setInputWisdom(charWisdom);
            //Charisma:
            charCharisma = (Integer) charismaValue.getValue();
            CharacterSheet.getInstance().setInputCharisma(charCharisma);

            //Calculate Changes:
            CharacterSheet.getInstance().calculateOutput();
            //Display Changes: //Test print to console
            CharacterSheet.getInstance().printOutputs();
    }

}
