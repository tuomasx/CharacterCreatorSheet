
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class HelpDialog extends JPanel{

	public HelpDialog(){
		setLayout(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	
		//constraints.anchor = GridBagConstraints.WEST;
    	//constraints.weighty = 1;
		
		
        constraints.gridwidth = 1;
        constraints.gridheight = 5;
        constraints.gridx = 0;
        constraints.gridy = 0;
    	
    	add(new characterDetailsHelp(), 0);
    	
    	constraints.gridwidth = 1;
        constraints.gridheight = 5;
        constraints.gridx = 0;
        constraints.gridy = 1;
    	
    	add(new otherHelp(), 1);
    	
    	setVisible(true);
		
	}
	
	private class characterDetailsHelp extends JPanel{
		
		public characterDetailsHelp(){
			JLabel descriptionLabel = new JLabel("<html><div style='text-align: center;'>" +
				    "This window contains the descriptive details of the character.<br>" +
				    "Here, you can input the name, age, and select the character's gender and alignment.<br>" +
				    "You can also include your own name in the Player name field.</div></html>");
				descriptionLabel.setPreferredSize(new Dimension(200, 200));

	        add(descriptionLabel);
	    }
		
	}
		
	private class otherHelp extends JPanel{
		
		public otherHelp(){
			JLabel descriptionLabel = new JLabel("<html><div style='text-align: center;'>" +
				    "other help.<br>" +
				    "other help.<br>" +
				    "other help.</div></html>");
				descriptionLabel.setPreferredSize(new Dimension(200, 200));

	        add(descriptionLabel);
	    }
	}
}


	
