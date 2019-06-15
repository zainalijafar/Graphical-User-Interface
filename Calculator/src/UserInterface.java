import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable{

	private JFrame Jframe;
	
	public UserInterface() {	
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Calculator");
		this.Jframe.setPreferredSize(new Dimension(200,300));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(this.Jframe.getContentPane());
		
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponents(Container container) {
		
		GridLayout layout = new GridLayout(3,1);
		container.setLayout(layout);
		
		JTextField output = new JTextField();
		JTextField input = new JTextField();
		
		JPanel panel = new JPanel(new GridLayout(1,3));			
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton resetButton = new JButton("Z");
		
		panel.add(add);
		panel.add(sub);
		panel.add(resetButton);
		
		AddClickListener addition = new AddClickListener(output,input);
		add.addActionListener(addition);
		SubClickListener subtraction = new SubClickListener(output,input);
		sub.addActionListener(subtraction);
		ResetClickListener reset = new ResetClickListener(output);
		resetButton.addActionListener(reset);
		
		container.add(output);
		container.add(input);
		container.add(panel,BorderLayout.SOUTH);
	}
	
	public JFrame getJframe() {
		
		return this.Jframe;
	}
}
