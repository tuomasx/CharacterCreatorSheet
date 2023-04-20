
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Layout extends JFrame{
	
	//private String outputName = "";
	//private JLabel label = new JLabel("TestLabel");
	
	public Layout( ) {
		
		
		JFrame frame = new JFrame();
		//JFrame frame = new Layout();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600, 1000);
		frame.setLayout(new BorderLayout());
		

		frame.setTitle("Character Creator Sheet");

		frame.setJMenuBar(new Menu());
		//frame.setContentPane(new Content());
		
		//JPanel panel1 = new JPanel();

		JPanel panel1 = new Content();

		//panel1.setBackground(new Color(255, 255, 255));
		panel1.setPreferredSize(new Dimension(300, 1000));
		

		//Scrolling:
		JScrollPane scrollPane = new JScrollPane(panel1);
		panel1.setAutoscrolls(true);
		//scrollPane.setPreferredSize(getPreferredSize());
		scrollPane.setPreferredSize(new Dimension( 300, 1000));
		
		//Adding a scrolling panel containing the Content
		frame.add(scrollPane, BorderLayout.WEST);
		//frame.add(panel1, BorderLayout.WEST);


		//Character sheet Preview side:
		//JPanel panel2 = new JPanel();
		//JPanel panel2 = new OutputSheet();
		//JPanel panel2 = OutputSheet.getInstance();
		JPanel panel2 = OutputSheet.getInstance().createOutputSheet();

		//OutputSheet.getInstance().printOutputs();

		//Scrolling:
		JScrollPane scrollPane2 = new JScrollPane(panel2);
		panel2.setAutoscrolls(true);
		//scrollPane.setPreferredSize(getPreferredSize());
		scrollPane2.setPreferredSize(new Dimension( 1275, 1650));
		

		frame.add(scrollPane2, BorderLayout.CENTER);



		frame.setVisible(true);
        
        
	}
	
	public static void createMainFrame( ) {
		new Layout();
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
