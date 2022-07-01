
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

/**
 * ��ѯ������ռǰ50%��ͼ����Ϣ
 */

public class BookInfoFrame extends JFrame {// ����ͼ����Ϣ������

	private JPanel contentPane;// �������
	private JTable table;// ���ģ��
	private LocalTableModel model = new LocalTableModel();// ����ʵ�ֱ��ģ�ͽӿڵ�ʵ������

	public static void main(String[] args) {
		BookInfoFrame frame = new BookInfoFrame();// ����ͼ����Ϣ�������
		frame.setVisible(true);// ��ʾͼ����Ϣ����
	}

	public BookInfoFrame() {// ͼ����Ϣ����Ĺ��췽��
		setTitle("��ѯ������ռǰ50%��ͼ����Ϣ");// �������Ŀ
		setResizable(false);// ���ܸı䴰��Ĵ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ������˳���ʽ
		setBounds(100, 100, 450, 300);// �����λ�á����
		// �������
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		// ��ť���
		JPanel btnPane = new JPanel();
		contentPane.add(btnPane, BorderLayout.SOUTH);
		// ����ѯ����ť
		JButton btnQuery = new JButton("�顡ѯ");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuery_actionPerformed(e);
			}
		});
		btnPane.add(btnQuery);
		// �������
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		// ���ģ��
		table = new JTable(model);
		scrollPane.setViewportView(table);// �ѱ��ģ����ӵ����������
	}

	protected void do_btnQuery_actionPerformed(ActionEvent e) {
		model.setRowCount(0);// ������ģ���е�ԭ����
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		List<Book> list = util.getBookInfo();// �����洢ͼ����Ϣ�ļ���
		for (int i = 0; i < list.size(); i++) {
			Book book = (Book) list.get(i);// ���ͼ����Ϣ
			model.addRow(new Object[] { book.getBookID(), book.getBookName(), book.getBookSales() });// ����ģ�������ͼ����Ϣ
		}		
	}
}
