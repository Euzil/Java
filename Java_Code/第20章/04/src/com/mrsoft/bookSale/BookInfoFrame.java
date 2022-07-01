
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
 * 查询销售量占前50%的图书信息
 */

public class BookInfoFrame extends JFrame {// 创建图书信息窗体类

	private JPanel contentPane;// 内容面板
	private JTable table;// 表格模型
	private LocalTableModel model = new LocalTableModel();// 创建实现表格模型接口的实例对象

	public static void main(String[] args) {
		BookInfoFrame frame = new BookInfoFrame();// 创建图书信息窗体对象
		frame.setVisible(true);// 显示图书信息窗体
	}

	public BookInfoFrame() {// 图书信息窗体的构造方法
		setTitle("查询销售量占前50%的图书信息");// 窗体的题目
		setResizable(false);// 不能改变窗体的大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 窗体的退出方式
		setBounds(100, 100, 450, 300);// 窗体的位置、宽高
		// 内容面板
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		// 按钮面板
		JPanel btnPane = new JPanel();
		contentPane.add(btnPane, BorderLayout.SOUTH);
		// “查询”按钮
		JButton btnQuery = new JButton("查　询");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnQuery_actionPerformed(e);
			}
		});
		btnPane.add(btnQuery);
		// 滚动面板
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		// 表格模型
		table = new JTable(model);
		scrollPane.setViewportView(table);// 把表格模型添加到滚动面板上
	}

	protected void do_btnQuery_actionPerformed(ActionEvent e) {
		model.setRowCount(0);// 清除表格模型中的原有行
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		List<Book> list = util.getBookInfo();// 用来存储图书信息的集合
		for (int i = 0; i < list.size(); i++) {
			Book book = (Book) list.get(i);// 获得图书信息
			model.addRow(new Object[] { book.getBookID(), book.getBookName(), book.getBookSales() });// 向表格模型中添加图书信息
		}		
	}
}
