import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;

import java.io.*;

public class Content extends JPanel{
    
	private JPanel contentPane;
    
    Content() {
    	
    	
    	setLayout(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	
		constraints.anchor = GridBagConstraints.NORTH;
    	constraints.weighty = 1.0;

		constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
    	
    	add(new CharacterDetails(), constraints);
    }
    	
    	
        
    
}
