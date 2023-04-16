
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "FI)"));
		
		CharacterSheet characterSheet = new CharacterSheet();
		
		//For testing:
		//characterSheet.setInputName("");
		
		Layout.createMainFrame();
	}
	

}
