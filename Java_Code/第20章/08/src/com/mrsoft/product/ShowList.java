
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
 * 使用事务批量删除生产单信息
 */

public class ShowList extends JFrame {// 创建显示单据窗体类

	private JPanel contentPane;// 内容面板
	private JTextField tfListID;// “单据编号”文本框
	private JTable table;// 表格模型
	private ListTableModel listModel = new ListTableModel();// 单据信息表
	private ProductTableModel productModel = new ProductTableModel();// 商品信息表
	private JScrollPane scrollPane;// 滚动面板

	public static void main(String[] args) {
		ShowList frame = new ShowList();// 创建显示单据窗体对象
		frame.setVisible(true);// 显示单据窗体
	}

	public ShowList() {// 显示单据窗体的构造方法
		setTitle("使用事务批量删除数据");// 窗体的题目
		setResizable(false);// 不能改变窗体的大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 窗体的关闭方式
		setBounds(100, 100, 450, 300);// 窗体的位置、宽高
		// 内容面板
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// 按钮面板
		JPanel btnPane = new JPanel();
		contentPane.add(btnPane, BorderLayout.SOUTH);
		// “单据信息”按钮
		JButton btnList = new JButton("单据信息");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnList_actionPerformed(e);
			}
		});
		btnList.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnPane.add(btnList);
		// “商品信息”按钮
		JButton btnProduct = new JButton("商品信息");
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnProduct_actionPerformed(e);
			}
		});
		btnProduct.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		btnPane.add(btnProduct);
		// 删除面板
		JPanel deletePane = new JPanel();
		contentPane.add(deletePane, BorderLayout.NORTH);
		// “单据编号”标签
		JLabel lblListID = new JLabel("单据编号：");
		lblListID.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		deletePane.add(lblListID);
		// “单据编号”文本框
		tfListID = new JTextField();
		deletePane.add(tfListID);
		tfListID.setColumns(10);
		// “删除”按钮
		JButton btnDelete = new JButton("删除");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnDelete_actionPerformed(e);
			}
		});
		btnDelete.setFont(new Font("宋体", Font.PLAIN, 14));
		deletePane.add(btnDelete);
		// 滚动面板
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

	protected void do_btnDelete_actionPerformed(ActionEvent e) {
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		List<Product> list = util.getProductInfo();// 用来存储商品信息的集合
		List<String> strList = new ArrayList<String>();// 创建单据编号的集合
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// 获得商品信息
			strList.add(product.getListID());// 向单据编号的集合添加单据编号
		}
		if (!tfListID.getText().equals("") && 
			tfListID.getText().equals("20140520") || 
			tfListID.getText().equals("20150315") || 
			tfListID.getText().equals("20160101")) {
			util.deleteListInfo(strList, tfListID.getText());// 调用删除单据的方法，并传参
			JOptionPane.showMessageDialog(null, tfListID.getText() + "号单据已删除！", "提示", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "文本框输入的内容错误！\n请重新输入......", "警告", JOptionPane.WARNING_MESSAGE);
		}
	}

	protected void do_btnProduct_actionPerformed(ActionEvent e) {
		table = new JTable(productModel);// 创建商品信息表
		scrollPane.setViewportView(table);// 把表格模型添加到滚动面板上
		productModel.setRowCount(0);// 清除表格模型中的原有行
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		List<Product> list = util.getProductInfo();// 用来存储商品信息的集合
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// 获得商品信息
			productModel.addRow(new Object[] { product.getId(), product.getListID(), product.getProductID(), product.getSocket() });// 向表格模型中添加商品信息
		}
	}

	protected void do_btnList_actionPerformed(ActionEvent e) {
		table = new JTable(listModel);// 创建单据信息表
		scrollPane.setViewportView(table);// 把表格模型添加到滚动面板上
		listModel.setRowCount(0);// 清除表格模型中的原有行
		JDBCUtil util = new JDBCUtil();// 创建Java数据库连接工具包类对象
		List<Product> list = util.getListInfo();// 用来存储单据信息的集合
		for (int i = 0; i < list.size(); i++) {
			Product product = (Product) list.get(i);// 获得单据信息
			listModel.addRow(new Object[] { product.getListID(), product.getListDate(), product.getListMaker() });// 向表格模型中添加单据信息
		}
	}

}
