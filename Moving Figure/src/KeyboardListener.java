import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Component;

public class KeyboardListener implements KeyListener {

	private Figure figure; 
	private Component component; 
	
	public KeyboardListener(Figure figure,Component component) {
		this.figure = figure; 
		this.component = component; 
	}
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			this.figure.move(-1,0);
		}else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			this.figure.move(1,0);
		}else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			this.figure.move(0,1);
		}else if (e.getKeyCode()==KeyEvent.VK_UP) {
			this.figure.move(0,-1);
		}
		this.component.repaint();
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
}