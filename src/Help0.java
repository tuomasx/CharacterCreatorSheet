
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





public class Help0 extends JFrame {

    JFrame frameHelp0 = new JFrame();

    Help0 () {
        System.out.println("Help");
			
			JPanel help0Panel = new JPanel();
			help0Panel.setPreferredSize(new Dimension(300, 170));

			JTextArea help0Label = new JTextArea("Help 0/5: \nInfo 1: \nInfo 2: \nInfo 3: \nInfo 4: \nInfo 5: \n");
			help0Label.setPreferredSize(new Dimension(300, 130));

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
