

import java.awt.*;
import javax.swing.*;


public class CharacterEquipment extends JPanel  {


    //Armor Types: "None" 
        // Light:   // "Leather Armor" "Padded Armor" "Studded Leather Armor"
        // Medium:  // "Breastplate" "Chain Shirt" "Half Plate Armor" "Hide Armor" "Scale Mail"
        // Heavy:   // "Chain Mail" "Plate Armor" "Ring Mail" "Splint Armor"
    private String armors[]={"None", "Leather Armor","Padded Armor","Studded Leather Armor","Breastplate","Chain Shirt","Half Plate Armor","Hide Armor","Scale Mail","Chain Mail","Plate Armor","Ring Mail","Splint Armor"};
    //
    private String weapons[]={"None", "Leather Armor","Padded Armor","Studded Leather Armor","Breastplate","Chain Shirt","Half Plate Armor","Hide Armor","Scale Mail","Chain Mail","Plate Armor","Ring Mail","Splint Armor"};
    // Other
    private String others[]={"None", "Leather Armor","Padded Armor","Studded Leather Armor","Breastplate","Chain Shirt","Half Plate Armor","Hide Armor","Scale Mail","Chain Mail","Plate Armor","Ring Mail","Splint Armor"};
    // Shield
    private boolean shield = false;
    
    // Gold
    SpinnerModel goldValue = new SpinnerNumberModel(0, 0, 1000000, 10);
    

    public CharacterEquipment () {


        setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        
        JLabel label = new JLabel("Character Equipment");
        
        constraints2.gridx = 0;
        constraints2.gridy = 0;
        constraints2.gridwidth = 5;
        constraints2.anchor = GridBagConstraints.NORTH;
        add(label, constraints2);
        
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        //Fields:

        //Dropdown Menus:

        //Armor:
        //Dropdown Menu: Race
        JLabel armorLabel = new JLabel("Armor: ");
        JComboBox armorComboBox = new JComboBox<>(armors);
        armorComboBox.setPreferredSize(new Dimension(150, 24));
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
        JCheckBox shieldSelect = new JCheckBox();
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
        JComboBox weaponComboBox = new JComboBox<>(weapons);
        weaponComboBox.setPreferredSize(new Dimension(150, 24));
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
        constraints2.gridx = 0;
        constraints2.gridy = 3;
        constraints2.gridwidth = 1;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        fieldsPanel.add(goldLabel, constraints2);
        constraints2.gridx = 1;
        fieldsPanel.add(goldSpinner, constraints2);


        //Other:
        JLabel othersLabel = new JLabel("Other: ");
        JComboBox otherComboBox = new JComboBox<>(others);
        otherComboBox.setPreferredSize(new Dimension(150, 24));
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
    
}
