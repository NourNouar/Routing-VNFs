import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
public class Movement implements MouseListener,MouseMotionListener{

	private int X,Y;
	
	public Movement(Component... cpns) {
		for (Component cpn : cpns) {
			cpn.addMouseListener(this);
			cpn.addMouseMotionListener(this);
			 
		}
		
	}
	@Override
	public void mouseDragged(MouseEvent event) {
		event.getComponent().setLocation((event.getX()+event.getComponent().getX())- X , (event.getY()+event.getComponent().getY())- Y);
		
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		X = event.getX();
		Y = event.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
