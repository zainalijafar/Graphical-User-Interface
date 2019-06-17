import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

	private JFrame Jframe; 
	
	public UserInterface() {
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Drawing Board");
		this.Jframe.setPreferredSize(new Dimension(300,300));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		container.add(new DrawingBoard());
	}
	
	public JFrame getJFrame() {
		
		return this.Jframe;
	}
}