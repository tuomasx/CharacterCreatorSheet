
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;





public class Help5 extends JFrame {

    JFrame frameHelp0 = new JFrame();

    Help5 () {
        System.out.println("Help");

        frameHelp0.setTitle("Help 5/5: Character Description");
        frameHelp0.setBackground(new Color(255, 255, 255));
		frameHelp0.setPreferredSize(new Dimension(500, 200));
			
		JPanel help0Panel = new JPanel();
		help0Panel.setPreferredSize(new Dimension(490, 200));
        help0Panel.setBackground(new Color(255, 255, 255));

		JTextArea help0Label = new JTextArea(" In the Character Description panel the user can add a description of their character. \n \n \n \n \n \n ");
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
                new Help4();
				//Close current window
				frameHelp0.setVisible(false);
				frameHelp0.dispose();
					
			}
		});


		help0Panel.add(help0Label);
		help0Panel.add(buttonPrevious);
		help0Panel.add(buttonClose);
		//help0Panel.add(buttonNext);

		frameHelp0.add(help0Panel);
			
		//Set frame opening location:
		frameHelp0.setLocationRelativeTo(null);
		frameHelp0.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameHelp0.pack();
		frameHelp0.setVisible(true);


    }
    
}
