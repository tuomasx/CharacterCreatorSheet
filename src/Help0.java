
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;





public class Help0 extends JFrame {

    JFrame frameHelp0 = new JFrame();

    Help0 () {
        System.out.println("Help");

        frameHelp0.setTitle("Help 0/5: Menu");
        frameHelp0.setBackground(new Color(255, 255, 255));
		frameHelp0.setPreferredSize(new Dimension(500, 200));
			
		JPanel help0Panel = new JPanel();
		help0Panel.setPreferredSize(new Dimension(490, 200));
        help0Panel.setBackground(new Color(255, 255, 255));

		JTextArea help0Label = new JTextArea(" New File: Resets the inputs back to starting values. \n Save File: Unimplemented \n Save File as: Unimplemented \n Load File: Unimplemented \n Print File: Unimplemented \n Create PDF: Unimplemented \n");
		help0Label.setPreferredSize(new Dimension(490, 120));

		JButton buttonClose = new JButton("Close");
		buttonClose.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent e ) {
				//System.out.println("");
				frameHelp0.setVisible(false);
				frameHelp0.dispose();
			}
		});
		JButton buttonNext = new JButton("Next");
		buttonNext.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent e ) {
				//Open next help window
                new Help1();
				//Close current window
				frameHelp0.setVisible(false);
				frameHelp0.dispose();
					
			}
		});

		help0Panel.add(help0Label);
		help0Panel.add(buttonClose);
		help0Panel.add(buttonNext);

		frameHelp0.add(help0Panel);
			
		//Set frame opening location:
		frameHelp0.setLocationRelativeTo(null);
		frameHelp0.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameHelp0.pack();
		frameHelp0.setVisible(true);


    }
    
}
