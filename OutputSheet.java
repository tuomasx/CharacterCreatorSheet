import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import javax.swing.event.*;
import javax.swing.text.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class OutputSheet extends JPanel {

    private String outputName = "";
	private JLabel label = new JLabel("TestLabel");
    private JPanel panel = new JPanel();

    private static OutputSheet outputSheetInstance;

    // Singleton: prevent duplicate objects
    private OutputSheet() {
    }

    public static OutputSheet getInstance() {
        if (outputSheetInstance == null) {
            outputSheetInstance = new OutputSheet();
        }
        return outputSheetInstance;
    }

    

    public JPanel createOutputSheet( ) {
        

        panel.setBackground(new Color(255, 255, 255));
		//Adding an empty White frame to the center & right side

		//jlabel.getBackground().setOpaque(false);

		//Adding image to panel:
		//CharacterSheetBase Resolution: 1700 x 2200
		//1275 x 1650
		try {
			//Change File Path:
			BufferedImage myPicture = ImageIO.read(new File("C:/Users/Heikki/Desktop/Ohj4_CharacterCreatorSheet/CharacterCreatorSheet/CharacterSheetBase.png"));
			Image newImage = myPicture.getScaledInstance(850, 1100, Image.SCALE_DEFAULT);
			JLabel picLabel = new JLabel(new ImageIcon(newImage));
			


			JLabel background = new JLabel(new ImageIcon(newImage));
			background.setLayout(new BorderLayout());
			panel.add(background);

			
			label.setText("Test Label");

    		label.setFont(label.getFont().deriveFont(Font.BOLD, 48));
    		label.setForeground(Color.BLACK);
    		label.setHorizontalAlignment(JLabel.CENTER);
    		background.add(label);

    		//pack();
    		//setLocationRelativeTo(null);
    		setVisible(true);

			/* 
			JLabel label = new JLabel("Test");
			label.setText("Test Label");
			label.setVisible(true);
			//picLabel.add(label);
			//picLabel.setPreferredSize(new Dimension(640, 480));
			panel2.add(picLabel);
			*/

		} catch (IOException e) {
			//Image not found
			System.out.println("Image not Found");
		}

        return panel;

    }


    public String getOutputName() {
		return outputName;
	}

	public void setOutputName(String outputName) {
		this.outputName = outputName;
        //Test: Update test label:
		label.setText(outputName);
	}


    
}

/*
 
        panel2.setBackground(new Color(255, 255, 255));
		//Adding an empty White frame to the center & right side

		//jlabel.getBackground().setOpaque(false);

		//Adding image to panel:
		//CharacterSheetBase Resolution: 1700 x 2200
		//1275 x 1650
		try {
			//Change File Path:
			BufferedImage myPicture = ImageIO.read(new File("C:/Users/Heikki/Desktop/Ohj4_CharacterCreatorSheet/CharacterCreatorSheet/CharacterSheetBase.png"));
			Image newImage = myPicture.getScaledInstance(850, 1100, Image.SCALE_DEFAULT);
			JLabel picLabel = new JLabel(new ImageIcon(newImage));
			


			JLabel background = new JLabel(new ImageIcon(newImage));
			background.setLayout(new BorderLayout());
			panel2.add(background);

			
			label.setText("Test Label");

    		label.setFont(label.getFont().deriveFont(Font.BOLD, 48));
    		label.setForeground(Color.BLACK);
    		label.setHorizontalAlignment(JLabel.CENTER);
    		background.add(label);

    		pack();
    		setLocationRelativeTo(null);
    		setVisible(true);

	
			


		} catch (IOException e) {
			//Image not found
			System.out.println("Image not Found");
		}
		
		





 */