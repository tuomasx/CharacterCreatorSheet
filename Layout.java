
import javax.swing.*;
import java.awt.*;


public class Layout extends JFrame{
	
	
	public Layout() {
		
		
		JFrame frame = new JFrame();
		//JFrame frame = new Layout();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600, 1000);
		frame.setLayout(new BorderLayout());
		

		frame.setTitle("Character Creator Sheet");
		//frame.setSize(600, 800);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setJMenuBar(new Menu());
		//frame.setContentPane(new Content());
		
		//JPanel panel1 = new JPanel();
		JPanel panel1 = new Content();
		//JPanel panel1 = new Layout();
		panel1.setBackground(Color.red);
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setPreferredSize(new Dimension(300, 1000));

		frame.add(panel1, BorderLayout.WEST);

		frame.setVisible(true);
        
        
	}
	
	public static void createMainFrame() {
		new Layout();
	}

}
