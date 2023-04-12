import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{
	
	JMenu fileMenu, settingMenu;
	JMenuItem i1, i2, i3, i4, i5, i6, i7;
	JMenuItem s1, s2;
	public Menu(){
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
		
		fileMenu.add(i1); fileMenu.add(i2); fileMenu.add(i3); fileMenu.add(i4);
		fileMenu.add(i5); fileMenu.add(i6); fileMenu.add(i7);
		
		settingMenu.add(s1);
		settingMenu.add(s2);
		
		
		add(fileMenu);
		add(settingMenu);
		
		
		
	}
	

}