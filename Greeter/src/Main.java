import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[]args) {
		
		Greeter gr = new Greeter();
		SwingUtilities.invokeLater(gr);
	}
}