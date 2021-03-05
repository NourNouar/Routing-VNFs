package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CreatePathAND extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdam;
	private JTextField txtFw;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePathAND frame = new CreatePathAND();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreatePathAND() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 15, 635, 260);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Active path");
		lblNewLabel.setBounds(345, 23, 100, 20);
		panel.add(lblNewLabel);
		
		txtIdam = new JTextField();
		txtIdam.setBounds(33, 62, 146, 26);
		panel.add(txtIdam);
		txtIdam.setColumns(10);
		
		txtFw = new JTextField();
		txtFw.setBounds(478, 20, 146, 26);
		panel.add(txtFw);
		txtFw.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(524, 207, 100, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Swing-AND");
		lblNewLabel_1.setBounds(212, 65, 100, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Active path");
		lblNewLabel_2.setBounds(345, 69, 100, 20);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(478, 66, 146, 26);
		panel.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Active path");
		lblNewLabel_2_1.setBounds(345, 115, 100, 20);
		panel.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(478, 112, 146, 26);
		panel.add(textField_1);
		Icon icon = new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\add.png");
		JButton btnNewButton_2_1 = new JButton(new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\add.png"));
		btnNewButton_2_1.setBounds(595, 158, 29, 29);
		panel.add(btnNewButton_2_1);
		
		btnNewButton_1 = new JButton("Finish");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 setVisible(false);
			}
		});
		btnNewButton_1.setBounds(525, 291, 115, 29);
		contentPane.add(btnNewButton_1);
	}
}
