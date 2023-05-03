
import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;




public class Help3 extends JFrame {

    JFrame frameHelp0 = new JFrame();

    Help3 () {
        System.out.println("Help");

        frameHelp0.setTitle("Help 3/5: Ability Scores");
        frameHelp0.setBackground(new Color(255, 255, 255));
		frameHelp0.setPreferredSize(new Dimension(500, 200));
			
		JPanel help0Panel = new JPanel();
		help0Panel.setPreferredSize(new Dimension(490, 200));
        help0Panel.setBackground(new Color(255, 255, 255));

		JTextArea help0Label = new JTextArea(" In the Ability Scores panel the user can set the starting Ability scores. \n The standard starting values the user can allocate are 15, 14, 13, 12, 10 & 8. \n For Example: \n Strenght and Dexterity can give a bonus to attacks, Constitution gives additional health, \n Intelligence gives a bonus to Arcana & History checks, Wisdom gives a bonus to \n perception & Charisma gives a bonus to Speech, Intimidation and Deception \n \n \n \n ");
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
				new Help4();
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
                new Help2();
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
