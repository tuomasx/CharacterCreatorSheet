import java.awt.*;
import javax.swing.*;


public class CharacterDescription extends JPanel {

    private JTextField characterDescription;
    private JTextField characterPersonality;
    private JTextField characterIdeals;
    private JTextField characterBonds;
    private JTextField characterFlaws;


    public CharacterDescription () {

        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Description");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.anchor = GridBagConstraints.NORTH;
        add(label, constraints);
        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        //Fields:
        
        //Character Description:
        JLabel descriptionLabel = new JLabel("Character Description: ");
        characterDescription = new JTextField(10);
        characterDescription.setPreferredSize(new Dimension(150, 24));
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
        constraints.gridx = 0;
        constraints.gridy = 1;
        fieldsPanel.add(personalityLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterPersonality, constraints);

        //Ideals:
        JLabel idealsLabel = new JLabel("Ideals: ");
        characterIdeals = new JTextField(6);
        characterIdeals.setPreferredSize(new Dimension(75, 24));
        constraints.gridx = 0;
        constraints.gridy = 2;
        fieldsPanel.add(idealsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterIdeals, constraints);

        //Bonds:
        JLabel bondsLabel = new JLabel("Bonds: ");
        characterBonds = new JTextField(10);
        characterBonds.setPreferredSize(new Dimension(150, 24));
        constraints.gridx = 0;
        constraints.gridy = 3;
        fieldsPanel.add(bondsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterBonds, constraints);

        //Flaws:
        JLabel flawsLabel = new JLabel("Flaws: ");
        characterFlaws = new JTextField(10);
        characterFlaws.setPreferredSize(new Dimension(150, 24));
        constraints.gridx = 0;
        constraints.gridy = 4;
        fieldsPanel.add(flawsLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(characterFlaws, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints);

    }
    
}
