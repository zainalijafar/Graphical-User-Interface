import java.util.*;
import java.awt.Graphics;

public class CompoundFigure extends Figure {

	private List<Figure> figureList; 
	
	public CompoundFigure() {
		
		super(0,0);
		this.figureList = new ArrayList<>();
	}
	
	public void add(Figure figure) {
		
		this.figureList.add(figure);
	}
	
	public void move(int dx,int dy) {
		
		for (Figure f : this.figureList) {
			f.move(dx, dy);
		}
	}
	
	public void draw(Graphics graphics) {
		
		for (Figure f : this.figureList) {
			f.draw(graphics);
		}
	}
}