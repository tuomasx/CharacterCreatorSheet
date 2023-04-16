import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;

import java.io.*;

public class Content extends JPanel{
    
	private JPanel contentPane;
    
    Content() {
    	
		//Character Details:
    	setLayout(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	
		constraints.anchor = GridBagConstraints.NORTH;
    	constraints.weighty = 0;
		
		constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
    	
    	add(new CharacterDetails(), constraints);
		
		//Character Features
		GridBagConstraints constraints2 = new GridBagConstraints();
    	
		constraints2.anchor = GridBagConstraints.NORTH;
    	constraints2.weighty = 0;
		
		constraints2.gridx = 0;
        constraints2.gridy = 1;
        constraints2.gridwidth = 5;
		add(new CharacterFeatures(), constraints2);


		//Character Ability Scores
		GridBagConstraints constraints3 = new GridBagConstraints();
    	
		constraints3.anchor = GridBagConstraints.NORTH;
    	constraints3.weighty = 1;
		
		constraints3.gridx = 0;
        constraints3.gridy = 2;
        constraints3.gridwidth = 5;
		add(new CharacterAbilityScores(), constraints3);



    }
    	
    	
        
    
}
