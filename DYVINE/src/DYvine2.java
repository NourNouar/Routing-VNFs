import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import package1.CreateNS;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DYvine2 {

	private JFrame frmAdnew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DYvine2 window = new DYvine2();
					window.frmAdnew.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DYvine2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdnew = new JFrame();
		frmAdnew.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		frmAdnew.setTitle("AD-NEW");
		frmAdnew.setBounds(100, 100, 370, 273);
		frmAdnew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdnew.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("NS Design");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateNS ns= new CreateNS();
				
				//ns.setVisible(true);
			}
		});
		btnNewButton.setBounds(62, 38, 224, 57);
		frmAdnew.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NS Management");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(62, 129, 224, 57);
		frmAdnew.getContentPane().add(btnNewButton_1);
		
	}
}
