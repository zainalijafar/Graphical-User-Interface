import java.awt.Dimension;
import java.awt.Container; 
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame; 
import javax.swing.WindowConstants; 

public class Survey implements Runnable{

	private JFrame Jframe; 
	
	public Survey() {
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Survey");
		this.Jframe.setPreferredSize(new Dimension(200,300));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
		container.setLayout(layout);
		container.add(new JLabel("Choose meat or fish :"));
		
		JRadioButton meat = new JRadioButton("Meat");
		JRadioButton fish = new JRadioButton("Fish");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(meat);
		buttonGroup.add(fish);
		
		container.add(meat);
		container.add(fish);
	}
	
	public JFrame getJframe() {
		
		return this.Jframe;
	}
}
