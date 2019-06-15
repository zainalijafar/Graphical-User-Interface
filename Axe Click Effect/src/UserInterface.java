import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Container; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JButton;
import javax.swing.WindowConstants; 

public class UserInterface implements Runnable {

	private JFrame Jframe; 
	private PersonalCalculator calc;
	
	public UserInterface(PersonalCalculator calc) {
		this.calc = calc;
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Clicker");
		this.Jframe.setPreferredSize(new Dimension(200,300));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		GridLayout layout = new GridLayout(2,1);
		container.setLayout(layout);
		
		JLabel Jlabel = new JLabel();
		JButton jbutton = new JButton("Click");
		
		ClickListener clicker = new ClickListener(this.calc,Jlabel);
		jbutton.addActionListener(clicker);
		
		container.add(Jlabel);
		container.add(jbutton);
	}
	
	public JFrame getJFrame() {
		
		return this.Jframe;
	}
}
