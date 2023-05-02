
//import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;


public class Layout extends JFrame{

	
	private static Layout layoutInstance;
	//private static JFrame frame = new JFrame();

	public static JPanel panel1 = new Content();
	private static JPanel panel2 = OutputSheet.getInstance().createOutputSheet();
	//public static JPanel panel3 = new HelpDialog();

	// Singleton: prevent duplicate objects
    private Layout() {
    }

    public static Layout getInstance() {
        if (layoutInstance == null) {
            layoutInstance = new Layout();
			//frame = layoutInstance.createLayout();
			layoutInstance = layoutInstance.createLayout();
        }
        return layoutInstance;
    }
	

	public Layout createLayout( ) {
		Layout frame = new Layout();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Window Default Starting Size:
		frame.setSize(1600, 1000);

		//Setting the window to Screen size:
		Toolkit tk=Toolkit.getDefaultToolkit(); 
		Dimension screenSize = tk.getScreenSize(); 
		frame.setSize(screenSize.width,screenSize.height);
		//Setting window to 90% Screen size:
		frame.setSize(screenSize.width*9/10,screenSize.height*9/10);

		//Set to Fullscreen:
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		frame.setLayout(new BorderLayout());
		
		frame.setTitle("Character Creator Sheet");

		frame.setJMenuBar(new Menu());

		//panel1.setBackground(new Color(255, 255, 255));
		panel1.setPreferredSize(new Dimension(300, 1000));
		
		//Scrolling:
		JScrollPane scrollPane = new JScrollPane(panel1);
		panel1.setAutoscrolls(true);
		scrollPane.setPreferredSize(new Dimension( 300, 1000));
		//Adding the scrolling panel containing the Content
		frame.add(scrollPane, BorderLayout.WEST);
		

		//Character sheet Preview side:
		//Scrolling:
		JScrollPane scrollPane2 = new JScrollPane(panel2);
		panel2.setAutoscrolls(true);
		//scrollPane.setPreferredSize(getPreferredSize());
		scrollPane2.setPreferredSize(new Dimension( 1275, 1650));
		//
		frame.add(scrollPane2, BorderLayout.CENTER);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
        return frame;

	}
	

	public void clearContentMenu() {
		
		System.out.println("Clearing Content Menu");
		//Remove Previous:
		Layout.layoutInstance.dispose();
		
		//Create New:
		Layout.layoutInstance = Layout.getInstance().createLayout();
		
		Layout.panel1.removeAll();
		//panel1.setPreferredSize(new Dimension(300, 1000));

		Layout.panel1.add(new Content());
	
		Layout.panel1.revalidate();

	}


}



