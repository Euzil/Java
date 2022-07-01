
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

public class Pictures extends JFrame {// 创建图片窗体类

	private JPanel contentPane;// 内容面板
	private JTable table;// 表格模型
	private LocalTableModel model = new LocalTableModel();// 创建实现表格模型接口的实例对象
	private JTextField tfName;// “用户ID”文本框
	private JLabel lblShowPic;// 显示图片标签
	private String userID;// 用户ID
	private int flag = 0;// 标记变量

	public static void main(String[] args) {
		Pictures frame = new Pictures();// 创建图片窗体对象
		frame.setVisible(true);// 显示图片窗体
	}

	public Pictures() {// 图片窗体的构造方法
		setTitle("使用二进制存取用户头像");// 窗体的题目
		setResizable(false);// 不能改变窗体的大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 窗体的关闭方式
		setBounds(100, 100, 500, 325);// 窗体的位置、宽高
		// 内容面板
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		setContentPane(contentPane);
		// “数据库添加信息”面板
		JPanel insertPane = new JPanel();
		insertPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "用户ID与头像展示区", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		contentPane.add(insertPane);
		insertPane.setLayout(null);
		// “用户ID”标签
		JLabel lblID = new JLabel("用户ID：");
		lblID.setFont(new Font("宋体", Font.PLAIN, 14));
		lblID.setBounds(10, 28, 222, 15);
		insertPane.add(lblID);
		// “用户ID”文本框
		tfName = new JTextField();
		tfName.setBounds(10, 53, 222, 21);
		tfName.setEditable(false);
		tfName.setColumns(10);
		insertPane.add(tfName);
		// “用户图片”标签
		JLabel lblPicture = new JLabel("用户头像：");
		lblPicture.setFont(new Font("宋体", Font.PLAIN, 14));
		lblPicture.setBounds(10, 85, 70, 15);
		insertPane.add(lblPicture);
		// 图片面板
		JPanel picturePane = new JPanel();
		picturePane.setBackground(Color.WHITE);
		picturePane.setBounds(81, 85, 151, 196);
		insertPane.add(picturePane);
		picturePane.setLayout(new BorderLayout(0, 0));
		// 图片处理（选择，添加）面板
		JPanel handlePane = new JPanel();
		picturePane.add(handlePane, BorderLayout.SOUTH);
		// “图片显示区”标签
		lblShowPic = new JLabel("图片显示区");
		lblShowPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPic.setFont(new Font("幼圆", Font.PLAIN, 14));
		picturePane.add(lblShowPic, BorderLayout.CENTER);
		// “查询数据库信息”面板
		JPanel queryPane = new JPanel();
		queryPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "查询数据库信息", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		contentPane.add(queryPane);
		queryPane.setLayout(new BorderLayout(0, 0));
		// 按钮面板
		JPanel btnPane = new JPanel();
		queryPane.add(btnPane, BorderLayout.SOUTH);
		// “查询”按钮
		JButton btnQuery = new JButton("查询");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuery_actionPerformed(e);
			}
		});
		btnQuery.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnPane.add(btnQuery);
		// 滚动面板
		JScrollPane scrollPane = new JScrollPane();
		queryPane.add(scrollPane, BorderLayout.CENTER);
		
		// 表格模型并对表格模型中的单元格设置鼠标监听事件
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				do_table_mouseClicked(e);
			}
		});
		scrollPane.setViewportView(table);// 把表格模型添加到滚动面板上
	}
	
	protected void do_table_mouseClicked(MouseEvent e) {
		flag++;
		lblShowPic.setIcon(null);
		int row = table.getSelectedRow();// 获得鼠标点击的行
		// 鼠标点击某一行中的任意列时，都会获得这行中的第一个单元格的数据内容
		userID = (String) table.getValueAt(row, 0);
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		ImageIcon icon = util.getPicture(userID, flag);
		tfName.setText(userID);
		lblShowPic.setText("");
		lblShowPic.setIcon(icon);
	}

	protected void do_btnQuery_actionPerformed(ActionEvent e) {
		model.setRowCount(0);// 清除表格模型中的原有行
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		List<User> list = util.getUserInfo();// 用来存储用户信息的集合
		for (int i = 0; i < list.size(); i++) {
			User user = (User) list.get(i);// 获得用户信息
			model.addRow(new Object[] { user.getUserID(), user.getPicture() });// 向表格模型中添加用户信息
		}
	}
	
}
