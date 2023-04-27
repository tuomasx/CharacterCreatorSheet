
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Layout extends JFrame{
	
	//private String outputName = "";
	//private JLabel label = new JLabel("TestLabel");
	
	//private static Layout layout;
	private static Layout layoutInstance;
	private static JFrame frame = new JFrame();

	public static JPanel panel1 = new Content();
	private static JPanel panel2 = OutputSheet.getInstance().createOutputSheet();
	public static JPanel panel3 = new HelpDialog();

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
	

	//public JFrame createLayout( ) {
	public Layout createLayout( ) {
	//public Layout( ) {
		
		//JFrame frame = new JFrame();
		Layout frame = new Layout();
		//JFrame frame = new Layout();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600, 1000);
		frame.setLayout(new BorderLayout());
		

		frame.setTitle("Character Creator Sheet");

		frame.setJMenuBar(new Menu());
		//frame.setContentPane(new Content());
		
		//JPanel panel1 = new JPanel();

		//panel1 = new Content();

		//panel1.setBackground(new Color(255, 255, 255));
		panel1.setPreferredSize(new Dimension(300, 1000));
		
		//panel1.

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
		//JPanel panel2 = OutputSheet.getInstance().createOutputSheet();
		
		//panel2 = OutputSheet.getInstance().createOutputSheet();

		//OutputSheet.getInstance().printOutputs();

		//Scrolling:
		JScrollPane scrollPane2 = new JScrollPane(panel2);
		panel2.setAutoscrolls(true);
		//scrollPane.setPreferredSize(getPreferredSize());
		scrollPane2.setPreferredSize(new Dimension( 1275, 1650));
		

		frame.add(scrollPane2, BorderLayout.CENTER);
		
		
		//Glass Pane popup
		//frame.setGlassPane(panel3);
		
		JPanel glass = (JPanel) frame.getGlassPane();

		
		//glass.setLayout(new GridBagLayout());
		glass.setLayout(new GridBagLayout());
		//glass.setPreferredSize(new Dimension(1000,300));
		glass.setOpaque(false);
		glass.setVisible(false);
		glass.setLocation(500,500);
		
		
		
		//frame.pack();

		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
        
        return frame;

	}
	
	public static void createMainFrame( ) {
		//new Layout();
		//layout = new Layout();
		//layout = Layout.getInstance();
	}

	public static void clearContentMenu() {
		
		System.out.println("Clearing Content Menu");
		//Remove Previous:
		Layout.layoutInstance.dispose();
		
		//Create New:
		Layout.layoutInstance = Layout.getInstance().createLayout();
		//Layout.getInstance().createLayout();
	
		Layout.panel1.removeAll();
		//panel1.setPreferredSize(new Dimension(300, 1000));

		Layout.panel1.add(new Content());
	

		Layout.panel1.revalidate();
		//layoutInstance.revalidate();
		



	}


}



