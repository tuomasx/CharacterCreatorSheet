import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Content extends JPanel{
    
	private JPanel contentPane;
    
    Content() {
    	
    	
    	setLayout(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	
    	constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
    	
    	add(new CharacterDetails(), constraints);
    }
    	
    	
        
    
}
