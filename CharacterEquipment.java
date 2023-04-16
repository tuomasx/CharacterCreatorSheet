

import java.awt.*;
import javax.swing.*;


public class CharacterEquipment extends JPanel  {


    //Armor Types: "None" 
        // Light:   // "Leather Armor" "Padded Armor" "Studded Leather Armor"
        // Medium:  // "Breastplate" "Chain Shirt" "Half Plate Armor" "Hide Armor" "Scale Mail"
        // Heavy:   // "Chain Mail" "Plate Armor" "Ring Mail" "Splint Armor"
    private String armors[]={"None", "Leather Armor","Padded Armor","Studded Leather Armor","Breastplate","Chain Shirt","Half Plate Armor","Hide Armor","Scale Mail","Chain Mail","Plate Armor","Ring Mail","Splint Armor"};
    


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

        //Weapon:

        //Gold:

        //Other:

        //Additional


        //
        constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
        constraints2.fill = GridBagConstraints.HORIZONTAL;
        add(fieldsPanel, constraints2);
        

    }
    
}
