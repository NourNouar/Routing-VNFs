package package1;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test1 extends JFrame implements MouseMotionListener{

        protected JLabel label; 
        protected Point currentLocation;

        public test1() {
            initComponents(); 

            setSize(new Dimension(500, 500));
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        private void initComponents() {
            label = new JLabel("some label"); 
            currentLocation = label.getLocation();

            addMouseMotionListener(this);
            add(label); 
        }

        public JLabel getLabel() {
            return label;
        }

        public void setLabel(JLabel label) {
            this.label = label;
        }


        public void mouseDragged1(MouseEvent e) {

            Point p = e.getPoint();
            currentLocation.x = (int) p.getX();
            currentLocation.y = (int) p.getY() - 250; // Height/2

            label.setLocation(currentLocation);
        }

        public void mouseMoved1(MouseEvent e) {

        }

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}