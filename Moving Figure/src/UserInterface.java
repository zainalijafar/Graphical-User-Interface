import java.awt.Dimension;
import java.awt.Container;
import javax.swing.*;

public class UserInterface implements Runnable {

	private Figure figure; 
	private JFrame Jframe;
	
	public UserInterface(Figure figure) {
		this.figure = figure;
	}
	
	public void run() {
		
		this.Jframe = new JFrame("Figure");
		this.Jframe.setPreferredSize(new Dimension(400,400));
		this.Jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponent(this.Jframe.getContentPane());
		this.Jframe.pack();
		this.Jframe.setVisible(true);
	}
	
	public void createComponent(Container container) {
		
		DrawingBoard drawingBoard = new DrawingBoard(this.figure);
		container.add(drawingBoard);
		KeyboardListener keyList = new KeyboardListener(this.figure,drawingBoard);
		this.Jframe.addKeyListener(keyList);
	}
	
	public JFrame getJFrame() {
		
		return this.Jframe;
	}
}
