
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "FI)"));
		
		//Using Singleton CharacterSheet
		CharacterSheet characterSheet = CharacterSheet.getInstance();
	
		Layout layout = Layout.getInstance();
	}
	

}
