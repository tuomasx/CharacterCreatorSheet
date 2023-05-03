
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;





public class Help2 extends JFrame {

    JFrame frameHelp0 = new JFrame();
	

    Help2 () {
        System.out.println("Help");


        frameHelp0.setTitle("Help 2/5: Character Features ");
        frameHelp0.setBackground(new Color(255, 255, 255));
		frameHelp0.setPreferredSize(new Dimension(500, 300));

		JPanel help0Panel = new JPanel();
		help0Panel.setPreferredSize(new Dimension(490, 300));
        help0Panel.setBackground(new Color(255, 255, 255));

		JTextArea help0Label = new JTextArea(" In the Character Features panel the user can select the characters Race, Class, Level \n & Background. \n \n Race: the selected race determines ability Score Bonuses & racial abilities \n Class: determines the gameplay features, proficiencies & saving throw proficiencies \n Level: the level of progression, determines health & proficiency \n Background: Determines skill proficiencies \n \n For more information see the players handbook. \n ");
		help0Label.setPreferredSize(new Dimension(490, 220));

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
				new Help3();
				//Close current window
				frameHelp0.setVisible(false);
				frameHelp0.dispose();
					
			}
		});
		JButton buttonPrevious = new JButton("Previous");
		buttonPrevious.addActionListener(new ActionListener(){
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
		help0Panel.add(buttonPrevious);
		//help0Panel.add(buttonClose);
		help0Panel.add(buttonNext);

		frameHelp0.add(help0Panel);
			
		//Set frame opening location:
		frameHelp0.setLocationRelativeTo(null);
		frameHelp0.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameHelp0.pack();
		frameHelp0.setVisible(true);


    }
    
}
