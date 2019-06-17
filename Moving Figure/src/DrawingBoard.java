import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class DrawingBoard extends JPanel {

	private Figure figure; 
	
	public DrawingBoard(Figure figure) {
		
		super.setBackground(Color.WHITE);
		this.figure = figure;
	}
	
	protected void paintComponent(Graphics graphics) {
		
		super.paintComponent(graphics);
		this.figure.draw(graphics);
	}
}
