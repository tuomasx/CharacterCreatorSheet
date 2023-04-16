import java.awt.*;
import javax.swing.*;

public class CharacterDetails extends JPanel{
    
    private JTextField nameField;
    private JTextField ageField;
    private JTextField genderField;
    private JTextField alignmentField;
    private JTextField playerField;
    
    //private String races[]={"India","Aus","U.S.A","England","Newzealand"};
    // "Dragonborn" "Dwarf" "Elf" "Gnome" "Half-Elf" "Half-Orc" "Halfling" "Human" "Tiefling"
    private String races[]={"Dragonborn","Dwarf","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Human","Tiefling"};
    
    public CharacterDetails() {
        
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Details");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.anchor = GridBagConstraints.NORTH;
        add(label, constraints);
        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(10);
        nameField.setPreferredSize(new Dimension(150, 24));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(nameLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(nameField, constraints);

        JLabel ageLabel = new JLabel("Age: ");
        ageField = new JTextField(3);
        ageField.setPreferredSize(new Dimension(150, 24));
        constraints.gridx = 0;
        constraints.gridy = 1;
        fieldsPanel.add(ageLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(ageField, constraints);

        JLabel genderLabel = new JLabel("Gender: ");
        genderField = new JTextField(6);
        genderField.setPreferredSize(new Dimension(75, 24));
        constraints.gridx = 0;
        constraints.gridy = 2;
        fieldsPanel.add(genderLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(genderField, constraints);

        JLabel alignmentLabel = new JLabel("Alignment: ");
        alignmentField = new JTextField(10);
        alignmentField.setPreferredSize(new Dimension(150, 24));
        constraints.gridx = 0;
        constraints.gridy = 3;
        fieldsPanel.add(alignmentLabel, constraints);
        constraints.gridx = 1;
        fieldsPanel.add(alignmentField, constraints);

        JLabel playerLabel = new JLabel("Player Name: ");
        playerField = new JTextField(10);
        playerField.setPreferredSize(new Dimension(150, 24));
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
    
}
