
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pictures extends JFrame {// ����ͼƬ������

	private JPanel contentPane;// �������
	private JTable table;// ���ģ��
	private LocalTableModel model = new LocalTableModel();// ����ʵ�ֱ��ģ�ͽӿڵ�ʵ������
	private JTextField tfName;// ���û�ID���ı���
	private JLabel lblShowPic;// ��ʾͼƬ��ǩ
	private String userID;// �û�ID
	private int flag = 0;// ��Ǳ���

	public static void main(String[] args) {
		Pictures frame = new Pictures();// ����ͼƬ�������
		frame.setVisible(true);// ��ʾͼƬ����
	}

	public Pictures() {// ͼƬ����Ĺ��췽��
		setTitle("ʹ�ö����ƴ�ȡ�û�ͷ��");// �������Ŀ
		setResizable(false);// ���ܸı䴰��Ĵ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ����Ĺرշ�ʽ
		setBounds(100, 100, 500, 325);// �����λ�á����
		// �������
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		setContentPane(contentPane);
		// �����ݿ������Ϣ�����
		JPanel insertPane = new JPanel();
		insertPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "�û�ID��ͷ��չʾ��", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		contentPane.add(insertPane);
		insertPane.setLayout(null);
		// ���û�ID����ǩ
		JLabel lblID = new JLabel("�û�ID��");
		lblID.setFont(new Font("����", Font.PLAIN, 14));
		lblID.setBounds(10, 28, 222, 15);
		insertPane.add(lblID);
		// ���û�ID���ı���
		tfName = new JTextField();
		tfName.setBounds(10, 53, 222, 21);
		tfName.setEditable(false);
		tfName.setColumns(10);
		insertPane.add(tfName);
		// ���û�ͼƬ����ǩ
		JLabel lblPicture = new JLabel("�û�ͷ��");
		lblPicture.setFont(new Font("����", Font.PLAIN, 14));
		lblPicture.setBounds(10, 85, 70, 15);
		insertPane.add(lblPicture);
		// ͼƬ���
		JPanel picturePane = new JPanel();
		picturePane.setBackground(Color.WHITE);
		picturePane.setBounds(81, 85, 151, 196);
		insertPane.add(picturePane);
		picturePane.setLayout(new BorderLayout(0, 0));
		// ͼƬ����ѡ����ӣ����
		JPanel handlePane = new JPanel();
		picturePane.add(handlePane, BorderLayout.SOUTH);
		// ��ͼƬ��ʾ������ǩ
		lblShowPic = new JLabel("ͼƬ��ʾ��");
		lblShowPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPic.setFont(new Font("��Բ", Font.PLAIN, 14));
		picturePane.add(lblShowPic, BorderLayout.CENTER);
		// ����ѯ���ݿ���Ϣ�����
		JPanel queryPane = new JPanel();
		queryPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "��ѯ���ݿ���Ϣ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		contentPane.add(queryPane);
		queryPane.setLayout(new BorderLayout(0, 0));
		// ��ť���
		JPanel btnPane = new JPanel();
		queryPane.add(btnPane, BorderLayout.SOUTH);
		// ����ѯ����ť
		JButton btnQuery = new JButton("��ѯ");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuery_actionPerformed(e);
			}
		});
		btnQuery.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		btnPane.add(btnQuery);
		// �������
		JScrollPane scrollPane = new JScrollPane();
		queryPane.add(scrollPane, BorderLayout.CENTER);
		
		// ���ģ�Ͳ��Ա��ģ���еĵ�Ԫ�������������¼�
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_table_mouseClicked(e);
			}
		});
		scrollPane.setViewportView(table);// �ѱ��ģ����ӵ����������
	}
	
	protected void do_table_mouseClicked(MouseEvent e) {
		flag++;
		lblShowPic.setIcon(null);
		int row = table.getSelectedRow();// ������������
		// �����ĳһ���е�������ʱ�������������еĵ�һ����Ԫ�����������
		userID = (String) table.getValueAt(row, 0);
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		ImageIcon icon = util.getPicture(userID, flag);
		tfName.setText(userID);
		lblShowPic.setText("");
		lblShowPic.setIcon(icon);
	}

	protected void do_btnQuery_actionPerformed(ActionEvent e) {
		model.setRowCount(0);// ������ģ���е�ԭ����
		JDBCUtil util = new JDBCUtil();// ����Java���ݿ����ӹ��߰������
		List<User> list = util.getUserInfo();// �����洢�û���Ϣ�ļ���
		for (int i = 0; i < list.size(); i++) {
			User user = (User) list.get(i);// ����û���Ϣ
			model.addRow(new Object[] { user.getUserID(), user.getPicture() });// ����ģ��������û���Ϣ
		}
	}
	
}
