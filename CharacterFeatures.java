
import java.awt.*;
import javax.swing.*;


public class CharacterFeatures extends JPanel {

    private JTextField raceField;
    private JTextField classField;
    private JTextField levelField;
    private JTextField backgroundField;
    

    // "Dragonborn" "Dwarf" "Elf" "Gnome" "Half-Elf" "Half-Orc" "Halfling" "Human" "Tiefling"
    private String races[]={"Dragonborn","Dwarf","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Human","Tiefling"};
    //
    private String classes[]={"Artificer","Dwarf","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Human","Tiefling"};



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
        JComboBox raceComboBox = new JComboBox<>(races);
        raceComboBox.setPreferredSize(new Dimension(150, 24));
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(raceLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(raceComboBox, constraints2);

        //Dropdown Menu: Class
        JLabel classLabel = new JLabel("Class: ");
        JComboBox classComboBox = new JComboBox<>(classes);
        raceComboBox.setPreferredSize(new Dimension(150, 24));
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(classLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(classComboBox, constraints2);

        //Number select Menu: Level

        //Dropdown Menu: Background


        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints2);
        
    }
    
}
