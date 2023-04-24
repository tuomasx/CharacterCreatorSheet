import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar implements ActionListener{
	
	//private Layout layout;

	JMenu fileMenu, settingMenu;
	JMenuItem i1, i2, i3, i4, i5, i6, i7;
	JMenuItem s1, s2;

	public Menu( ){
		//this.layout = layout;


		fileMenu = new JMenu("FILE");
		settingMenu = new JMenu("SETTINGS");
		
		i1= new JMenuItem("New File");
		i2 = new JMenuItem("Save File");
		i3 = new JMenuItem("Save File as");
		i4 = new JMenuItem("Load File");
		i5 = new JMenuItem("item Print File");
		i6 = new JMenuItem("Create PDF/PNG");
		i7 = new JMenuItem("Help");
		
		s1 = new JMenuItem("Language");
		s2 = new JMenuItem("Shortcuts");

		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);

		s1.addActionListener(this);
		s2.addActionListener(this);
		
		fileMenu.add(i1); fileMenu.add(i2); fileMenu.add(i3); fileMenu.add(i4);
		fileMenu.add(i5); fileMenu.add(i6); fileMenu.add(i7);
		
		settingMenu.add(s1);
		settingMenu.add(s2);
		
		
		add(fileMenu);
		add(settingMenu);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
		
		//New File
		if(e.getSource()==i1){
			System.out.println("New File");
			CharacterSheet.getInstance().newFile();
			//Reset Layout content menu values:
			//incomplete:
			//Layout.clearContentMenu();
			Layout.getInstance().clearContentMenu();
			//Layout.getInstance().createLayout();
			//
			
			Layout.panel1 = new Content();
			
		}
		//Save File
		if(e.getSource()==i2){
			System.out.println("Save File");
			
			
			JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(fileMenu);
            if(option == JFileChooser.APPROVE_OPTION){
               System.out.println("File saved");
			   //
            }else{
			   System.out.println("Saving Canceled");
			   //
            }
		}
		//Save File As
		if(e.getSource()==i3){
			System.out.println("Save File As");
			//JFrame parentFrame = new JFrame();
			JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(fileMenu);
            if(option == JFileChooser.APPROVE_OPTION){
               //File file = fileChooser.getSelectedFile();
               //label.setText("File Saved as: " + file.getName());
			   //System.out.println("Save as file: " + file.getAbsolutePath());
			   System.out.println("File saved");
			   //
            }else{
               //label.setText("Save command canceled");
			   System.out.println("Saving Canceled");
			   //
            }
		}
		//Load File
		if(e.getSource()==i4){
			System.out.println("Load File");
			JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(fileMenu);
            if(option == JFileChooser.APPROVE_OPTION){
               System.out.println("File Opened");
			   //
            }else{
			   System.out.println("Loading Canceled");
			   //
            }
		}
		//Print File
		if(e.getSource()==i5){
			System.out.println("Print File");
		}
		//Create PDF/PNG
		if(e.getSource()==i6){
			System.out.println("Create PDF/PNG");
		}
		//Help
		if(e.getSource()==i7){
			System.out.println("Help");
		}

		//Languages
		if(e.getSource()==s1){
			System.out.println("Languages");
		}
		//Shortcuts
		if(e.getSource()==s2){
			System.out.println("Shortcuts");
		}
	
	
	
	
	}
	

}
