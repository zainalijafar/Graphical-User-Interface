import java.awt.Graphics;
public class Circle extends Figure {

	private int diameter; 
	
	public Circle(int x,int y,int diameter) {
		super(x,y);
		this.diameter = diameter;
	}
	
	public void draw(Graphics graphics) {
		
		graphics.fillOval(x, y,diameter,diameter);
	}
}
