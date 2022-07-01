
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

/**
 * ʹ����������ɾ����������Ϣ
 */

public class ShowList extends JFrame {// ������ʾ���ݴ�����

	private JPanel contentPane;// �������
	private JTextField tfListID;// �����ݱ�š��ı���
	private JTable table;// ���ģ��
	private ListTableModel listModel = new ListTableModel();// ������Ϣ��
	private ProductTableModel productModel = new ProductTableModel();// ��Ʒ��Ϣ��
	private JScrollPane scrollPane;// �������

	public static void main(String[] args) {
		ShowList frame = new ShowList();// ������ʾ���ݴ������
		frame.setVisible(true);// ��ʾ���ݴ���
	}

	public ShowList() {// ��ʾ���ݴ���Ĺ��췽��
		setTitle("ʹ����������ɾ������");// �������Ŀ
		setResizable(false);// ���ܸı䴰��Ĵ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ����Ĺرշ�ʽ
		setBounds(100, 100, 450, 300);// �����λ�á����
		// �������
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// ��ť���
		JPanel btnPane = new JPanel();
		contentPane.add(btnPane, BorderLayout.SOUTH);
		// ��������Ϣ����ť
		JButton btnList = new JButton("������Ϣ");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnList_actionPerformed(e);
			}
		});
		btnList.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		btnPane.add(btnList);
		// ����Ʒ��Ϣ����ť
		JButton btnProduct = new JButton("��Ʒ��Ϣ");
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnProduct_actionPerformed(e);
			}
		});
		btnProduct.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		btnPane.add(btnProduct);
		// ɾ�����
		JPanel deletePane = new JPanel();
		contentPane.add(deletePane, BorderLayout.NORTH);
		// �����ݱ�š���ǩ
		JLabel lblListID = new JLabel("���ݱ�ţ�");
		lblListID.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		deletePane.add(lblListID);
		// �����ݱ�š��ı���
		tfListID = new JTextField();
		deletePane.add(tfListID);
		tfListID.setColumns(10);
		// ��ɾ������ť
		JButton btnDelete = new JButton("ɾ��");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDelete_actionPerformed(e);
			}
		});
		btnDelete.setFont(new Font("����", Font.PLAIN, 14));
		deletePane.add(btnDelete);
		// �������
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

	protected void do_btnDelete_actionPerformed(ActionEvent e) {
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		List<Product> list = util.getProductInfo();// �����洢��Ʒ��Ϣ�ļ���
		List<String> strList = new ArrayList<String>();// �������ݱ�ŵļ���
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// �����Ʒ��Ϣ
			strList.add(product.getListID());// �򵥾ݱ�ŵļ�����ӵ��ݱ��
		}
		if (!tfListID.getText().equals("") && 
			tfListID.getText().equals("20140520") || 
			tfListID.getText().equals("20150315") || 
			tfListID.getText().equals("20160101")) {
			util.deleteListInfo(strList, tfListID.getText());// ����ɾ�����ݵķ�����������
			JOptionPane.showMessageDialog(null, tfListID.getText() + "�ŵ�����ɾ����", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "�ı�����������ݴ���\n����������......", "����", JOptionPane.WARNING_MESSAGE);
		}
	}

	protected void do_btnProduct_actionPerformed(ActionEvent e) {
		table = new JTable(productModel);// ������Ʒ��Ϣ��
		scrollPane.setViewportView(table);// �ѱ��ģ����ӵ����������
		productModel.setRowCount(0);// ������ģ���е�ԭ����
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		List<Product> list = util.getProductInfo();// �����洢��Ʒ��Ϣ�ļ���
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// �����Ʒ��Ϣ
			productModel.addRow(new Object[] { product.getId(), product.getListID(), product.getProductID(), product.getSocket() });// ����ģ���������Ʒ��Ϣ
		}
	}

	protected void do_btnList_actionPerformed(ActionEvent e) {
		table = new JTable(listModel);// ����������Ϣ��
		scrollPane.setViewportView(table);// �ѱ��ģ����ӵ����������
		listModel.setRowCount(0);// ������ģ���е�ԭ����
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		List<Product> list = util.getListInfo();// �����洢������Ϣ�ļ���
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// ��õ�����Ϣ
			listModel.addRow(new Object[] { product.getListID(), product.getListDate(), product.getListMaker() });// ����ģ������ӵ�����Ϣ
		}
	}

}
