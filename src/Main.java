
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "FI)"));
		
		//CharacterSheet characterSheet = new CharacterSheet();

		//Using Singleton CharacterSheet
		CharacterSheet characterSheet = CharacterSheet.getInstance();
		
		//For testing:
		//characterSheet.setInputName("");
		
		//Layout.createMainFrame();
		Layout layout = Layout.getInstance();
	}
	

}
