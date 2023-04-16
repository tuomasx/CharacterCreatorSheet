
import javax.swing.*;
import java.awt.*;


public class Layout extends JFrame{
	
	
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
		


		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));

		//Adding a scrolling panel containing the Content
		frame.add(scrollPane, BorderLayout.WEST);
		//frame.add(panel1, BorderLayout.WEST);

		//Adding an empty White frame to the center & right side
		frame.add(panel2, BorderLayout.CENTER);

		frame.setVisible(true);
        
        
	}
	
	public static void createMainFrame( ) {
		new Layout();
	}

}
