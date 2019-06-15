import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ResetClickListener implements ActionListener {

	private JTextField firstNumber; 
	
	public ResetClickListener(JTextField firstNumber) {
		
		this.firstNumber = firstNumber;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		int reset = 0;
		String stringReset = Integer.toString(reset);
		this.firstNumber.setText(stringReset);
	}
}