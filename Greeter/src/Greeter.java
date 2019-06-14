import java.awt.Dimension;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

public class Greeter implements Runnable {

	private JFrame Jframe;
	
	public Greeter() {
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Swing On");
		this.Jframe.setPreferredSize(new Dimension(400,200));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		JLabel jlabel = new JLabel("Hi");
		container.add(jlabel);
	}
	
	public JFrame getJFrame() {
		
		return this.Jframe;
	}
}