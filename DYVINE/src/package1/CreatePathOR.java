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

public class CreatePathOR extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdam;
	private JTextField txtFw;
	private JTextField txtSwingand;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePathOR frame = new CreatePathOR();
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
	public CreatePathOR() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\adminnennouar\\Downloads\\AD-new logo - Copy.PNG"));
		setTitle("AD-NEW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(5, 15, 652, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Active path");
		lblNewLabel.setBounds(342, 27, 100, 20);
		panel.add(lblNewLabel);
		
		txtIdam = new JTextField();
		txtIdam.setBounds(32, 125, 146, 26);
		panel.add(txtIdam);
		txtIdam.setColumns(10);
		
		txtFw = new JTextField();
		txtFw.setBounds(474, 24, 146, 26);
		panel.add(txtFw);
		txtFw.setColumns(10);
		
		txtSwingand = new JTextField();
		txtSwingand.setBounds(474, 177, 146, 26);
		panel.add(txtSwingand);
		txtSwingand.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(520, 330, 100, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Swing-OR");
		lblNewLabel_1.setBounds(210, 128, 100, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Active path");
		lblNewLabel_2.setBounds(342, 77, 100, 20);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(474, 74, 146, 26);
		panel.add(textField);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Passive path");
		lblNewLabel_2_1_1.setBounds(342, 180, 100, 20);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Passive path");
		lblNewLabel_2_1_1_1.setBounds(342, 230, 100, 20);
		panel.add(lblNewLabel_2_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(474, 227, 146, 26);
		panel.add(textField_2);
		Icon icon = new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\add.png");
		JButton btnNewButton_2_1 = new JButton(new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\add.png"));
		btnNewButton_2_1.setBounds(591, 124, 29, 29);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton(new ImageIcon("C:\\Users\\adminnennouar\\Downloads\\add.png"));
		btnNewButton_2_1_1.setBounds(591, 277, 29, 29);
		panel.add(btnNewButton_2_1_1);
		
		btnNewButton_1 = new JButton("Finish");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 setVisible(false);
			}
		});
		btnNewButton_1.setBounds(542, 402, 115, 29);
		contentPane.add(btnNewButton_1);
	}
}
