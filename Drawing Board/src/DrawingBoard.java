import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class DrawingBoard extends JPanel {

	public DrawingBoard() {
		super.setBackground(Color.WHITE);
	}
	
	protected void paintComponent(Graphics graphics) {
		
		super.paintComponent(graphics);
		
		graphics.fillRect(30,20,50,50);
		graphics.fillRect(135,20,50,50);
		
		graphics.fillRect(10,120,50,50);
		graphics.fillRect(60,170,90,50);
		
		graphics.fillRect(150,120,50,50);
	}
}
