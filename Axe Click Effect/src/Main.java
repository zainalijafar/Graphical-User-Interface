import javax.swing.SwingUtilities;
public class Main {

	public static void main(String[]args) {
		
		PersonalCalculator calc = new PersonalCalculator();
		UserInterface ui = new UserInterface(calc);
		SwingUtilities.invokeLater(ui);
	}
}
