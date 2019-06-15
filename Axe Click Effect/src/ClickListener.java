import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {

	private PersonalCalculator calc; 
	private JLabel Jlabel;
	
	public ClickListener(PersonalCalculator calc,JLabel Jlabel) {
		
		this.calc = calc;
		this.Jlabel = Jlabel;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		this.calc.increase();
		int value = this.calc.giveValue();
		String stringValue = Integer.toString(value);
		this.Jlabel.setText(stringValue);
	}
}