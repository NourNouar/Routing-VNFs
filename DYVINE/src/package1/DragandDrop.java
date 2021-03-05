package package1;
/*
 * package test2;
 * 
 * 
 * import java.awt.Color; import java.awt.Component; import java.awt.Container;
 * import java.awt.Graphics; import java.awt.Graphics2D; import java.awt.Point;
 * import java.awt.Rectangle; import java.awt.event.MouseEvent; import
 * java.awt.geom.Line2D; import java.util.ArrayList; import java.util.Iterator;
 * import java.util.List;
 * 
 * import javax.swing.JPanel; import javax.swing.JTextField;
 * 
 * import test2.AD_NEW_Maker.ConnectTheDots; import
 * test2.AD_NEW_Maker.TablePoint;
 * 
 * public class createNS { private Component target; Graphics2D g2d; Line2D
 * line; Rectangle bounds; Point startPoint; Point endPoint; private Component
 * pressComponent; private Component releaseComponent; int i = 0;
 * 
 * public class TablePoint { Point Start; Point End;
 * 
 * TablePoint(Point Start, Point End) { this.Start = Start; this.End = End; } }
 * 
 * public List<TablePoint> table = new ArrayList<TablePoint>();
 * Iterator<TablePoint> iter = table.iterator(); private JTextField textField;
 * private JTextField textField_1; private JTextField textField_2; private
 * JTextField textField_3; private JTextField textField_4; private JTextField
 * textField_5; private JTextField textField_6; private JTextField textField_7;
 * private JTextField textField_8;
 * 
 * public void mousePressed(MouseEvent e) {
 * 
 * 
 * }
 * 
 * public void mouseDragged(MouseEvent e) {
 * 
 * if (target != null) { target.setBounds(e.getX(), e.getY(), target.getWidth(),
 * target.getHeight()); e.getComponent().repaint(); }
 * 
 * }
 * 
 * public void mouseReleased(MouseEvent e) { target = null;
 * workspace.removeMouseListener(dragger);
 * workspace.removeMouseMotionListener(dragger); releaseComponent =
 * contentPane.getComponentAt(new Point(e.getX(), e.getY())); joinTheDots();
 * 
 * }
 * 
 * public class ConnectTheDots extends JPanel {
 * 
 * private Point startPoint; private Point endPoint;
 * 
 * public ConnectTheDots() { setOpaque(false); }
 * 
 * public void drawLine(Point startPoint, Point endPoint) { this.startPoint =
 * startPoint; this.endPoint = endPoint; repaint(); }
 * 
 * @Override protected void paintComponent(Graphics g) {
 * super.paintComponent(g); Point p1, p2; for (int j = 0; j < table.size(); j++)
 * {
 * 
 * p1 = table.get(j).Start; p2 = table.get(j).End; if (p1 != null && p2 != null)
 * { g2d = (Graphics2D) g.create(); line = new Line2D.Double(p1, p2);
 * g2d.setColor(Color.BLACK); g2d.draw(line); g2d.dispose();
 * 
 * }
 * 
 * } i++;
 * 
 * }
 * 
 * }
 * 
 * protected void joinTheDots() {
 * 
 * bounds = pressComponent.getBounds(); startPoint = centerOf(bounds); bounds =
 * releaseComponent.getBounds(); endPoint = centerOf(bounds); TablePoint s1 =
 * new TablePoint(startPoint, endPoint); table.add(s1);
 * //System.out.println("Start table element "+ table.get(i).Start);
 * //System.out.println("End table element "+ table.get(i).End);
 * //System.out.println("table size "+ table.size()); ((ConnectTheDots)
 * getGlassPane()).drawLine(startPoint, endPoint);
 * 
 * }
 * 
 * protected Point centerOf(Rectangle bounds) {
 * 
 * return new Point(bounds.x + (bounds.width / 2), bounds.y + (bounds.height /
 * 2));
 * 
 * }
 * 
 * }
 */