import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea; 
import javax.swing.JLabel;

public class ActionEventListener implements ActionListener {

	private JTextArea origin; 
	private JLabel destination; 
	
	public ActionEventListener(JTextArea origin,JLabel destination) {
		
		this.origin = origin; 
		this.destination = destination;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		this.destination.setText(this.origin.getText());
		this.origin.setText("");
	}
}