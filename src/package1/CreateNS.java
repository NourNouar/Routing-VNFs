
//Drag and drop labels
package package1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import package1.DYVINE.ConnectTheDots;
import package1.DYVINE.TablePoint;

import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

import java.awt.event.MouseListener;


import javax.swing.border.EmptyBorder;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.MouseMotionAdapter;



import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


import javax.swing.JCheckBox;


public class CreateNS extends JFrame implements MouseListener {

	static JPanel panel ; 
	private Component target;
     private static JTextField textField;
     private static JTextField textField_1;
     private static JTextField textField_2;
     private static JTextField textField_3;
     private static JTextField textField_4;
     private static JTextField textField_5;
     private static JTextField textField_6;
     private static JTextField textField_7;
     private static JTextField textField_8;
 	int xorclick = 1;
 	  Graphics2D g2d;
 	    Line2D line;
 	    Rectangle bounds;
 	    Point startPoint;
 	    Point endPoint;
 	    private Component pressComponent;
 	    private Component releaseComponent;
 		int i = 0;
 		public class TablePoint {
		    Point Start;
		    Point End;
		    TablePoint(Point Start,Point End){  
		    	   this.Start=Start;  
		    	   this.End=End;  
		    	  }  
		}
	public List<TablePoint> table= new ArrayList<TablePoint>();
	Iterator<TablePoint> iter = table.iterator();
 		

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				CreateNS frame = new CreateNS();
				// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				frame.setVisible(true);
				// ClassNotFoundException | InstantiationException | IllegalAccessException |
				// UnsupportedLookAndFeelException ex
			}
		});}
    public CreateNS() {
 
        setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		ConnectTheDots dots = new ConnectTheDots();
        setGlassPane(dots);
        dots.setVisible(true);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 751);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);	
		panel.addMouseListener(this);
     
        JInternalFrame internalFrame = new JInternalFrame("Elements");
        internalFrame.setFrameIcon(new ImageIcon("C:\\Users\\adminnennouar\\Pictures\\Picture1.png"));
        internalFrame.setBounds(15, 16, 250, 600);
        panel.add(internalFrame);
        internalFrame.getContentPane().setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Operative VNFs", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_2.setBounds(16, 22, 201, 387);
        internalFrame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JButton IPS = new JButton("IPS");
        IPS.setBounds(43, 22, 115, 29);
        panel_2.add(IPS);
        
        JButton FW = new JButton("FW");
        FW.setBounds(43, 67, 115, 29);
        panel_2.add(FW);
        
        JButton IDS = new JButton("IDS");
        IDS.setBounds(43, 112, 115, 29);
        panel_2.add(IDS);
        
        JButton IDAM = new JButton("IDAM");
        IDAM.setBounds(43, 157, 115, 29);
        panel_2.add(IDAM);
        
        JButton TM = new JButton("TM");
        TM.setBounds(43, 206, 115, 29);
        panel_2.add(TM);
        
        JButton ThC = new JButton("ThC");
        ThC.setBounds(43, 251, 115, 29);
        panel_2.add(ThC);
        
        JButton ThM = new JButton("ThM");
        ThM.setBounds(43, 296, 115, 29);
        panel_2.add(ThM);
        
        JButton VPN = new JButton("VPN");
        VPN.setBounds(43, 341, 115, 29);
        panel_2.add(VPN);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new TitledBorder(null, "Swing VNFs", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_3.setBounds(15, 407, 202, 143);
        internalFrame.getContentPane().add(panel_3);
        panel_3.setLayout(null);
        
        JButton SwingAND = new JButton("Swing-AND");
        SwingAND.setBounds(45, 109, 115, 29);
        SwingAND.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("Swing-AND");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        panel_3.add(SwingAND);
        
        JButton SwingOR = new JButton("Swing-OR");
        SwingOR.setBounds(45, 68, 115, 29);
        SwingOR.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("Swing-OR");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        panel_3.add(SwingOR);
        
        JButton SwingXOR = new JButton("Swing-XOR");
        SwingXOR.setBounds(45, 27, 115, 29);
        SwingXOR.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("Swing-XOR");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        panel_3.add(SwingXOR);
    
        VPN.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("VPN");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        ThM.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("ThM");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        ThC.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("ThC");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        TM.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("TM");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        IDAM.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("IDAM");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        IDS.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("IDS");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        FW.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("FW");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        IPS.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		 JLabel lblNewLabel = new JLabel("IPS");
        	        lblNewLabel.setBounds(269, 641, 69, 20);
        	        panel.add(lblNewLabel);
        	        panel.repaint();
        	}
        });
        
        JInternalFrame internalFrame_2 = new JInternalFrame("VNF description");
        internalFrame_2.setFrameIcon(new ImageIcon("C:\\Users\\adminnennouar\\Pictures\\Picture1.png"));
        internalFrame_2.setBounds(605, 16, 281, 600);
        panel.add(internalFrame_2);
        internalFrame_2.getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new TitledBorder(null, "Functional properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBounds(15, 16, 234, 234);
        internalFrame_2.getContentPane().add(panel_1);
        
        JLabel lblNewLabel_4 = new JLabel("VNF type:");
        lblNewLabel_4.setBounds(6, 37, 88, 20);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Operations:");
        lblNewLabel_5.setBounds(6, 74, 107, 20);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Contents:");
        lblNewLabel_6.setBounds(6, 116, 107, 20);
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Techniques:");
        lblNewLabel_7.setBounds(6, 157, 107, 20);
        panel_1.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("Standards");
        lblNewLabel_8.setBounds(6, 196, 107, 20);
        panel_1.add(lblNewLabel_8);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(100, 34, 128, 26);
        panel_1.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(100, 71, 128, 26);
        panel_1.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(100, 113, 128, 26);
        panel_1.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(100, 154, 128, 26);
        panel_1.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(100, 193, 128, 26);
        panel_1.add(textField_4);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBorder(new TitledBorder(null, "Non-Functional properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1_1.setBounds(15, 277, 234, 202);
        internalFrame_2.getContentPane().add(panel_1_1);
        
        JLabel lblNewLabel_9 = new JLabel("Price:");
        lblNewLabel_9.setBounds(6, 28, 69, 20);
        panel_1_1.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("CPU:");
        lblNewLabel_10.setBounds(6, 73, 69, 20);
        panel_1_1.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("Memory:");
        lblNewLabel_11.setBounds(6, 118, 69, 20);
        panel_1_1.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("Storage:");
        lblNewLabel_12.setBounds(6, 163, 69, 20);
        panel_1_1.add(lblNewLabel_12);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(100, 25, 128, 26);
        panel_1_1.add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(100, 70, 128, 26);
        panel_1_1.add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(100, 115, 128, 26);
        panel_1_1.add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(100, 160, 128, 26);
        panel_1_1.add(textField_8);
        
        JButton search = new JButton("Search");
        search.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        search.setBounds(134, 487, 115, 29);
        internalFrame_2.getContentPane().add(search);
        
        JButton btnNewButton = new JButton("Finish");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		//CreateNSpackage NSp = new CreateNSpackage("IDAM", "SwingXOR","FW", "SwingAND", "IDS","TM","IPS", "SwingXOR", "ThC", "ThM", "VPN");
        	}
        });
        btnNewButton.setBounds(605, 620, 281, 29);
        panel.add(btnNewButton);
        
     
        
       
       
        internalFrame_2.setVisible(true);
        internalFrame.setVisible(true);
        //f.setState(Frame.MAXIMIZED_BOTH);
    }



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Container container = (Container) e.getComponent();
        for (Component c : container.getComponents()) {
            if (c.getBounds().contains(e.getPoint())) {
                target = c;
                break;
            }
        }
  pressComponent = panel.getComponentAt(new Point(e.getX(), e.getY()));
		
	}
	  public void mouseDragged(MouseEvent e) {
		  if (target != null) {
	            target.setBounds(e.getX(), e.getY(), target.getWidth(), target.getHeight());
	            e.getComponent().repaint();
	            }
	  }
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		  target = null;
		  releaseComponent = panel.getComponentAt(new Point(e.getX(), e.getY()));
		  //joinTheDots();
		
	}
	public class ConnectTheDots extends JPanel {

        private Point startPoint;
        private Point endPoint;

        public ConnectTheDots() {
            setOpaque(false);
        }

        public void drawLine(Point startPoint, Point endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Point p1,p2;
            for (int j = 0; j < table.size(); j ++) {
            	
            	p1 = table.get(j).Start;
                p2 = table.get(j).End;
                if (p1 != null && p2 != null) {
                    g2d = (Graphics2D) g.create();
                    line = new Line2D.Double(p1, p2);
                    g2d.setColor(Color.BLACK);
                    g2d.draw(line);
                    g2d.dispose();
                
                    
               
			}     
 
            }i++;
            
        }

    }protected void joinTheDots() {

        bounds = pressComponent.getBounds();       
        startPoint = centerOf(bounds);
        bounds = releaseComponent.getBounds();
        endPoint = centerOf(bounds);
        TablePoint s1 = new TablePoint(startPoint, endPoint);
        table.add(s1);
        //System.out.println("Start table element "+ table.get(i).Start);
        //System.out.println("End table element "+ table.get(i).End);
        //System.out.println("table size "+ table.size());
        ((ConnectTheDots) getGlassPane()).drawLine(startPoint, endPoint);

    }

    protected Point centerOf(Rectangle bounds) {

        return new Point(
                        bounds.x + (bounds.width / 2),
                        bounds.y + (bounds.height / 2));

    }
}