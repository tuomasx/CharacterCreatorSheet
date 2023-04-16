

import java.awt.*;
import javax.swing.*;




public class CharacterAbilityScores extends JPanel {

    //Ability Scores: Value range: 1 - 20, Default 10
    SpinnerModel strenghtValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel dexterityValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel constitutionValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel intelligenceValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel wisdomValue = new SpinnerNumberModel(10, 1, 20, 1);
    SpinnerModel charismaValue = new SpinnerNumberModel(10, 1, 20, 1);


    public CharacterAbilityScores () {

        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        
        JLabel label = new JLabel("Ability Scores");
        
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.NORTH;
        add(label, constraints2);
        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        //Fields:

        //Strenght:
        JLabel strenghtLabel = new JLabel("Strenght: ");
        //JSpinner number select:
        JSpinner strenghtSpinner = new JSpinner(strenghtValue);
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(strenghtLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(strenghtSpinner, constraints2);

        //Dexterity:
        JLabel dexterityLabel = new JLabel("Dexterity: ");
        //JSpinner number select:
        JSpinner dexteritySpinner = new JSpinner(dexterityValue);
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(dexterityLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(dexteritySpinner, constraints2);

        //Constitution:
        JLabel constitutionLabel = new JLabel("Constitution: ");
        //JSpinner number select:
        JSpinner constitutionSpinner = new JSpinner(constitutionValue);
        constraints2.gridx = 0;
        constraints2.gridy = 2;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(constitutionLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(constitutionSpinner, constraints2);

        //Intelligence:
        JLabel intelligenceLabel = new JLabel("Intelligence: ");
        //JSpinner number select:
        JSpinner intelligenceSpinner = new JSpinner(intelligenceValue);
        constraints2.gridx = 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(intelligenceLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(intelligenceSpinner, constraints2);

        //Wisdom:
        JLabel wisdomLabel = new JLabel("Wisdom: ");
        //JSpinner number select:
        JSpinner wisdomSpinner = new JSpinner(wisdomValue);
        constraints2.gridx = 0;
        constraints2.gridy = 4;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(wisdomLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(wisdomSpinner, constraints2);

        //Charisma:
        JLabel charismaLabel = new JLabel("Charisma: ");
        //JSpinner number select:
        JSpinner charismaSpinner = new JSpinner(charismaValue);
        constraints2.gridx = 0;
        constraints2.gridy = 5;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(charismaLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(charismaSpinner, constraints2);

        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints2);


    }
    
}
