import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SubClickListener implements ActionListener {

	private JTextField firstNumber;
	private JTextField secondNumber; 
	
	public SubClickListener(JTextField firstNumber,JTextField secondNumber) {
		
		this.firstNumber = firstNumber; 
		this.secondNumber = secondNumber; 
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String stringInput = this.secondNumber.getText();
		int intInput = Integer.parseInt(stringInput);
		
		String stringOutput = this.firstNumber.getText();
		int intOutput = Integer.parseInt(stringOutput);
		
		intOutput = intOutput - intInput;
		String stringResult = Integer.toString(intOutput);
		this.firstNumber.setText(stringResult);
	}
}