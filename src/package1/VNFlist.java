package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VNFlist extends JFrame {

	private JPanel contentPane;
	JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VNFlist frame = new VNFlist();
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
	public VNFlist() {
		setTitle("VNFs list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 626, 210);
		contentPane.add(scrollPane);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "IPS", "Security", "Nour", null},
				{null, null, null, null, null},
			},
			new String[] {
				"N\u00B0", "VNF name", "Type", "developed by", "released on"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(43);
		table.getColumnModel().getColumn(0).setMaxWidth(2147483639);
		table.getColumnModel().getColumn(4).setPreferredWidth(76);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				 setVisible(false);
			}
		});
		btnNewButton.setBounds(526, 245, 115, 29);
		contentPane.add(btnNewButton);
		
		
		
	}
	public void ListvnfType(String type) {
		
		System.out.println("type" + type);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().removeAllElements();
		model.fireTableDataChanged();
		int i=1;
		if (type.equals("IPS")) {
			//model.addRow(new Object[][] {{"2", "IPS", "Security", "Nour", "20-04-2020"}});
			model.addRow(new Object[]{i++, "IPS", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("IDAM")) {
			model.addRow(new Object[]{i++, "IDAM", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("FW")) {
			model.addRow(new Object[]{i++, "FW", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("IDS")) {
			model.addRow(new Object[]{i++, "IDs", "Security", "Nour", "20-04-2020"});
		}
		else if (type.equals("TM")) {
			model.addRow(new Object[]{i++, "TM", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("ThC")) {
			model.addRow(new Object[]{i++, "ThC", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("ThM")) {
			model.addRow(new Object[]{i++, "ThM", "Security", "Nour", "20-04-2020"});
		}else if (type.equals("VPN")) {
			model.addRow(new Object[]{i++, "VPN", "Security", "Nour", "20-04-2020"});
		}
		
	}
}
