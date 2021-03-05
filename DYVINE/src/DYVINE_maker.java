import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import package1.CreateNS;
import package1.DYVINE.ConnectTheDots;
import package1.DYVINE.TablePoint;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DYVINE_maker extends JFrame implements MouseListener {

	private JPanel contentPane ;

	JButton btnNewButton;

	private Component target;
	int xorclick = 1;
	Graphics2D g2d;
	Line2D line;
	Rectangle bounds;
	Point startPoint;
	Point endPoint;
	private Component pressComponent;
	private Component releaseComponent;
	int i = 0;
	private JPanel panel = new JPanel();

	public class TablePoint {
		Point Start;
		Point End;

		TablePoint(Point Start, Point End) {
			this.Start = Start;
			this.End = End;
		}
	}

	public List<TablePoint> table = new ArrayList<TablePoint>();
	Iterator<TablePoint> iter = table.iterator();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DYVINE_maker frame = new DYVINE_maker();
				// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				frame.setVisible(true);
				// ClassNotFoundException | InstantiationException | IllegalAccessException |
				// UnsupportedLookAndFeelException ex
			}
		});

	}

	/**
	 * Create the frame.
	 * 
	 */

	public DYVINE_maker() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 809);

		contentPane = new JPanel();
		contentPane.addMouseListener(this);
		//contentPane.addMouseMotionListener(t);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		
		tabbedPane.addTab("NS Maker", null, panel, null);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 16, 276, 431);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JInternalFrame internalFrame = new JInternalFrame("Functional VNFS");
		internalFrame.setFrameIcon(null);
		internalFrame.setBounds(0, 0, 276, 431);
		panel_2.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);

		btnNewButton = new JButton("IPS");
		btnNewButton.setBounds(45, 17, 168, 29);
		internalFrame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Firewall");
		btnNewButton_1.setBounds(45, 63, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("ThC");
		btnNewButton_2.setBounds(45, 247, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("IDS");
		btnNewButton_3.setBounds(45, 109, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_3_1 = new JButton("IDAM");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3_1.setBounds(45, 155, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_3_1);

		JButton btnNewButton_3_1_1 = new JButton("TM");
		btnNewButton_3_1_1.setBounds(45, 201, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_3_1_1);

		JButton btnNewButton_3_1_1_1 = new JButton("ThM");
		btnNewButton_3_1_1_1.setBounds(45, 293, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_3_1_1_1);

		JButton btnNewButton_3_1_1_1_1 = new JButton("VPN");
		btnNewButton_3_1_1_1_1.setBounds(45, 339, 168, 29);
		internalFrame.getContentPane().add(btnNewButton_3_1_1_1_1);
		internalFrame.setVisible(true);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 498, 276, 198);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JInternalFrame internalFrame_1 = new JInternalFrame("Swing VNFs");
		internalFrame_1.setFrameIcon(null);
		internalFrame_1.setBounds(0, 0, 276, 198);
		panel_3.add(internalFrame_1);
		internalFrame_1.getContentPane().setLayout(null);

		JButton btnAnd = new JButton("Swing-AND");
		btnAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnd.setBounds(54, 17, 168, 29);
		internalFrame_1.getContentPane().add(btnAnd);

		JButton btnNewButton_1_1 = new JButton("Swing-XoR");
		btnNewButton_1_1.setBounds(54, 63, 168, 29);
		internalFrame_1.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_3_2 = new JButton("Swing-OR");
		btnNewButton_3_2.setBounds(54, 109, 168, 29);
		internalFrame_1.getContentPane().add(btnNewButton_3_2);

		JInternalFrame internalFrame_2 = new JInternalFrame("Properties");
		internalFrame_2.setFrameIcon(null);
		internalFrame_2.setBounds(703, 16, 330, 649);
		panel.add(internalFrame_2);
		internalFrame_2.getContentPane().setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(
				new TitledBorder(null, "Functional Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(9, 6, 297, 314);
		internalFrame_2.getContentPane().add(panel_5);
		panel_5.setLayout(null);

		/*
		 * txtIps = new JTextField(); txtIps.setBounds(125, 30, 146, 26);
		 * panel_5.add(txtIps); txtIps.setText("IPS"); txtIps.setColumns(10);
		 */

		JLabel lblNewLabel = new JLabel("VNF Type:");
		lblNewLabel.setBounds(25, 33, 103, 20);
		panel_5.add(lblNewLabel);

		JLabel lblOperation = new JLabel("Operations:");
		lblOperation.setBounds(25, 89, 103, 20);
		panel_5.add(lblOperation);

		JLabel lblNewLabel_1_1 = new JLabel("Contents:");
		lblNewLabel_1_1.setBounds(25, 145, 103, 20);
		panel_5.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Techniques:");
		lblNewLabel_1_1_1.setBounds(25, 201, 103, 20);
		panel_5.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Standards:");
		lblNewLabel_1_1_1_1.setBounds(25, 257, 103, 20);
		panel_5.add(lblNewLabel_1_1_1_1);

		/*
		 * txtDetectBlock = new JTextField(); txtDetectBlock.setBounds(125, 86, 146,
		 * 26); panel_5.add(txtDetectBlock); txtDetectBlock.setText("Detect, Block");
		 * txtDetectBlock.setColumns(10);
		 * 
		 * txtMessagesVideos = new JTextField(); txtMessagesVideos.setBounds(125, 142,
		 * 146, 26); panel_5.add(txtMessagesVideos);
		 * txtMessagesVideos.setText("Messages, Videos");
		 * txtMessagesVideos.setColumns(10);
		 */
		textField_3 = new JTextField();
		textField_3.setBounds(125, 198, 146, 26);
		panel_5.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(125, 254, 146, 26);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
				textField = new JTextField();
				textField.setBounds(125, 30, 146, 26);
				panel_5.add(textField);
				textField.setText("IPS");
				textField.setColumns(10);
				
						textField_1 = new JTextField();
						textField_1.setBounds(125, 86, 146, 26);
						panel_5.add(textField_1);
						textField_1.setText("Detect, Block");
						textField_1.setColumns(10);
						
								textField_2 = new JTextField();
								textField_2.setBounds(125, 142, 146, 26);
								panel_5.add(textField_2);
								textField_2.setText("Messages, Videos");
								textField_2.setColumns(10);

		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new TitledBorder(null, "Non-Functional Properties", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		panel_5_1.setBounds(9, 336, 297, 288);
		internalFrame_2.getContentPane().add(panel_5_1);

		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setBounds(25, 48, 75, 20);
		panel_5_1.add(lblNewLabel_1);

		JLabel lblOperation_1 = new JLabel("CPU:");
		lblOperation_1.setBounds(25, 112, 83, 20);
		panel_5_1.add(lblOperation_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("Memory:");
		lblNewLabel_1_1_2.setBounds(25, 177, 68, 20);
		panel_5_1.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("Storage:");
		lblNewLabel_1_1_1_2.setBounds(25, 238, 86, 20);
		panel_5_1.add(lblNewLabel_1_1_1_2);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(125, 45, 146, 26);
		panel_5_1.add(textField_5);
		
		textField_9 = new JTextField();
		textField_9.setBounds(125, 109, 146, 26);
		panel_5_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(125, 177, 146, 26);
		panel_5_1.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(125, 235, 146, 26);
		panel_5_1.add(textField_11);
		textField_11.setColumns(10);

		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setBounds(703, 669, 330, 29);
		panel.add(btnNewButton_5);
		
		JLabel IPS = new JLabel("IDAM");
		IPS.setHorizontalAlignment(SwingConstants.CENTER);
		IPS.setFont(IPS.getFont().deriveFont(IPS.getFont().getStyle() | Font.BOLD));
		IPS.setBounds(479, 42, 69, 20);
		panel.add(IPS);
		
		JLabel XOR = new JLabel("Swing-XOR");
		XOR.setHorizontalAlignment(SwingConstants.CENTER);
		XOR.setFont(XOR.getFont().deriveFont(XOR.getFont().getStyle() | Font.BOLD));
		XOR.setBounds(454, 105, 119, 20);
		panel.add(XOR);
		
		JLabel lblFw = new JLabel("FW");
		lblFw.setHorizontalAlignment(SwingConstants.CENTER);
		lblFw.setFont(lblFw.getFont().deriveFont(lblFw.getFont().getStyle() | Font.BOLD));
		lblFw.setBounds(355, 168, 119, 20);
		panel.add(lblFw);
		
		JLabel lblSwingand = new JLabel("Swing-AND");
		lblSwingand.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwingand.setFont(lblSwingand.getFont().deriveFont(lblSwingand.getFont().getStyle() | Font.BOLD));
		lblSwingand.setBounds(454, 231, 119, 20);
		panel.add(lblSwingand);
		
		JLabel lblTm = new JLabel("TM");
		lblTm.setHorizontalAlignment(SwingConstants.CENTER);
		lblTm.setFont(lblTm.getFont().deriveFont(lblTm.getFont().getStyle() | Font.BOLD));
		lblTm.setBounds(524, 294, 119, 20);
		panel.add(lblTm);
		
		JLabel lblIds = new JLabel("IDS");
		lblIds.setHorizontalAlignment(SwingConstants.CENTER);
		lblIds.setFont(lblIds.getFont().deriveFont(lblIds.getFont().getStyle() | Font.BOLD));
		lblIds.setBounds(355, 294, 119, 20);
		panel.add(lblIds);
		
		JLabel lblIps = new JLabel("IPS");
		lblIps.setHorizontalAlignment(SwingConstants.CENTER);
		lblIps.setFont(lblIps.getFont().deriveFont(lblIps.getFont().getStyle() | Font.BOLD));
		lblIps.setBounds(454, 357, 119, 20);
		panel.add(lblIps);
		
		JLabel lblSwingxor = new JLabel("Swing-XOR");
		lblSwingxor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwingxor.setFont(lblSwingxor.getFont().deriveFont(lblSwingxor.getFont().getStyle() | Font.BOLD));
		lblSwingxor.setBounds(454, 420, 119, 20);
		panel.add(lblSwingxor);
		
		JLabel lblThc = new JLabel("ThC");
		lblThc.setHorizontalAlignment(SwingConstants.CENTER);
		lblThc.setFont(lblThc.getFont().deriveFont(lblThc.getFont().getStyle() | Font.BOLD));
		lblThc.setBounds(355, 483, 119, 20);
		panel.add(lblThc);
		
		JLabel lblThm = new JLabel("ThM");
		lblThm.setHorizontalAlignment(SwingConstants.CENTER);
		lblThm.setFont(lblThm.getFont().deriveFont(lblThm.getFont().getStyle() | Font.BOLD));
		lblThm.setBounds(355, 546, 119, 20);
		panel.add(lblThm);
		
		JLabel lblVpn = new JLabel("VPN");
		lblVpn.setHorizontalAlignment(SwingConstants.CENTER);
		lblVpn.setFont(lblVpn.getFont().deriveFont(lblVpn.getFont().getStyle() | Font.BOLD));
		lblVpn.setBounds(454, 609, 119, 20);
		panel.add(lblVpn);
		internalFrame_2.setVisible(true);
		internalFrame_1.setVisible(true);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("NS Manager", null, panel_1, null);
	}
	
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
	  
	  @Override public void mouseReleased(MouseEvent e) {
		  target = null;
	  releaseComponent = panel.getComponentAt(new Point(e.getX(), e.getY()));
	  joinTheDots(); 

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

	    }
	    protected void joinTheDots() {

	        bounds = pressComponent.getBounds();       
	        startPoint = centerOf(bounds);
	        bounds = releaseComponent.getBounds();
	        endPoint = centerOf(bounds);
	        TablePoint s1 = new TablePoint(startPoint, endPoint);
	        table.add(s1);
	        System.out.println("Start table element "+ table.get(i).Start);
	        System.out.println("End table element "+ table.get(i).End);
	        System.out.println("table size "+ table.size());
	        ((ConnectTheDots) getGlassPane()).drawLine(startPoint, endPoint);

	    }

	    protected Point centerOf(Rectangle bounds) {

	        return new Point(
	                        bounds.x + (bounds.width / 2),
	                        bounds.y + (bounds.height / 2));

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
}
