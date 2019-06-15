import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame Jframe; 
	
	public UserInterface() {
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Notice Board");
		this.Jframe.setPreferredSize(new Dimension(300,100));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		GridLayout layout = new GridLayout(3,1);
		container.setLayout(layout);
		
		JTextArea textAreaTop = new JTextArea("Hi I am the text which gets copied");
		JLabel textAreaBottom = new JLabel("");
		JButton jButton = new JButton("Copy");
		
		ActionEventListener listener = new ActionEventListener(textAreaTop,textAreaBottom);
		jButton.addActionListener(listener);
		
		container.add(textAreaTop);
		container.add(jButton);
		container.add(textAreaBottom);
	}
	
	public JFrame getJFrame() {
		
		return this.Jframe;
	}
}
