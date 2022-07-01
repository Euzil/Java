
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Folder extends JFrame { // 创建“文件夹”类继承JFrame

	private JPanel contentPane; // 内容面板
	private JTextField tf_Path; // 输入“文件路径”的文本框
	private JTextField tf_From; // “从”后面的文本框
	private JTextField tf_To; // “到”后面的文本框
	private String Path; // 文件路径
	private JRadioButton rdbtnNum;
	private JRadioButton rdbtnChar;
	private JLabel lblShow;

	public static void main(String[] args) {
		Folder folder = new Folder(); // 创建“文件夹”对象
		folder.setVisible(true); // 使得“文件夹”可视
	}

	/**
	 * 创建窗体
	 */
	public Folder() { // “文件夹”类的构造方法
		setResizable(false); // 不可改变窗体大小
		setTitle("按照模板创建文件夹"); // 设置窗体的题目
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的关闭方式
		setBounds(100, 100, 424, 200); // 设定该窗体的横、纵坐标，宽、高
		/**
		 * 创建内容面板，设置面板的边距，布局（绝对布局），把内容面板放到窗体中
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 创建“请选择文件夹”的标签，设置标签的横、纵坐标，宽、高，字体内容和样式，把该标签放到内容面板中
		 */
		JLabel lb_Choose = new JLabel("请选择文件夹：");
		lb_Choose.setFont(new Font("宋体", Font.PLAIN, 12));
		lb_Choose.setBounds(10, 30, 85, 20);
		contentPane.add(lb_Choose);
		/**
		 * 创建输入“文件路径”的文本框，设置文本框的横、纵坐标，宽、高，字体内容和样式，把该文本框放到内容面板中
		 */
		tf_Path = new JTextField();
		tf_Path.setFont(new Font("宋体", Font.PLAIN, 12));
		tf_Path.setBounds(95, 30, 215, 20);
		contentPane.add(tf_Path);
		tf_Path.setColumns(10);
		/**
		 * 创建“浏览”按钮，设置按钮的横、纵坐标，宽、高，字体内容和样式，把该按钮放到内容面板中
		 */
		JButton btn_Search = new JButton("浏　览");
		btn_Search.addActionListener(new ActionListener() { // 动作事件的监听
			public void actionPerformed(ActionEvent e) { // 发生操作时
				JFileChooser jfc = new JFileChooser(); // 创建文件选择对话框
				jfc.setDialogTitle("请选择要导出目录"); // 设置对话框的标题
				jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // 设置自允许获得路径
				int result = jfc.showOpenDialog(getContentPane()); // 显示文件选择对话框
				File file = null; // 创建一个空的文件对象
				if (JFileChooser.APPROVE_OPTION == result) { // 判断用户单击的是否为“打开”按钮
					file = jfc.getSelectedFile(); // 获得选中的文件对象
					Path = file.getAbsolutePath() + "\\"; // 拼接编辑器识别的文件路径
					tf_Path.setText(Path); // 把拼接好的文件路径写入到“文件路径”的文本框中
				}
			}
		});
		btn_Search.setFont(new Font("宋体", Font.PLAIN, 12));
		btn_Search.setBounds(318, 30, 90, 20);
		contentPane.add(btn_Search);
		/**
		 * 创建“添加文件夹：从”的标签，设置标签的横、纵坐标，宽、高，字体内容和样式，把该标签放到内容面板中
		 */
		JLabel lb_From = new JLabel("添加文件夹：从");
		lb_From.setFont(new Font("宋体", Font.PLAIN, 12));
		lb_From.setBounds(10, 120, 85, 20);
		contentPane.add(lb_From);
		/**
		 * 创建输入起始整型变量的文本框，设置文本框的横、纵坐标，宽、高，字体内容和样式，把该文本框放到内容面板中
		 */
		tf_From = new JTextField();
		tf_From.setBounds(95, 120, 93, 20);
		contentPane.add(tf_From);
		tf_From.setColumns(10);
		/**
		 * 创建输入终止整型变量的文本框，设置文本框的横、纵坐标，宽、高，字体内容和样式，把该文本框放到内容面板中
		 */
		tf_To = new JTextField();
		tf_To.setBounds(213, 120, 93, 20);
		contentPane.add(tf_To);
		tf_To.setColumns(10);
		/**
		 * 创建“到”的标签，设置标签的横、纵坐标，宽、高，字体内容和样式，把该标签放到内容面板中
		 */
		JLabel lb_To = new JLabel("到");
		lb_To.setFont(new Font("宋体", Font.PLAIN, 12));
		lb_To.setBounds(196, 120, 15, 20);
		contentPane.add(lb_To);
		/**
		 * 创建“添加”按钮，设置按钮的横、纵坐标，宽、高，字体内容和样式，把该按钮放到内容面板中
		 */
		JButton btn_Add = new JButton("添　加");
		btn_Add.addActionListener(new ActionListener() { // 动作事件的监听
			public void actionPerformed(ActionEvent e) { // 发生操作时
				if (rdbtnNum.isSelected()) {
					handleNum();
				}
				if (rdbtnChar.isSelected()) {
					handleChar();
				}
			}
		});
		btn_Add.setFont(new Font("宋体", Font.PLAIN, 12));
		btn_Add.setBounds(318, 120, 90, 20);
		contentPane.add(btn_Add);
		/**
		 * 单选按钮“数字型”
		 */
		rdbtnNum = new JRadioButton("数字型");
		rdbtnNum.setSelected(true);
		rdbtnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText("数字型样式：000001");
			}
		});
		rdbtnNum.setFont(new Font("宋体", Font.PLAIN, 12));
		rdbtnNum.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNum.setBounds(6, 86, 70, 23);
		contentPane.add(rdbtnNum);
		/**
		 * 单选按钮“非数字型”
		 */
		rdbtnChar = new JRadioButton("非数字型");
		rdbtnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText("非数字型样式：Demo_001");
			}
		});
		rdbtnChar.setFont(new Font("宋体", Font.PLAIN, 12));
		rdbtnChar.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnChar.setBounds(100, 86, 80, 23);
		contentPane.add(rdbtnChar);
		/**
		 * 单选按钮组
		 */
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNum);
		buttonGroup.add(rdbtnChar);
		/**
		 * 样式标签
		 */
		lblShow = new JLabel("数字型样式：000001");
		lblShow.setFont(new Font("隶书", Font.PLAIN, 14));
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setBounds(195, 86, 160, 23);
		contentPane.add(lblShow);
	}

	public String getPattern(String str) { // 获得目标格式的方法
		StringBuilder stringBuilder = new StringBuilder(); // 创建存储字符串的容器
		for (int i = 0; i < str.length(); i++) { // 向字符串容器中添加与目标字符串长度一致的“0”
			stringBuilder.append(0);
		}
		String pattern = stringBuilder.toString(); // 获得目标格式
		return pattern; // 返回目标格式
	}

	public int getValidNum(String str) { // 获得有效数字的方法
		char flag = '0'; // 标志变量，用来与目标字符串中每个索引位置上的字符进行比较
		int index = 0; // 初始化字符串中第一位不为“0”的字符的索引值
		for (int i = 0; i < str.length(); i++) { // 通过循环，使用标志变量与目标字符串中每个索引位置上的字符进行比较
			if (flag != str.charAt(i)) { // 目标字符串中索引位置上的字符不为“0”时
				index = i; // 获得字符串中第一位不为“0”的字符的索引值
				break; // 终止循环
			}
		}
		String tempResult = str.substring(index, str.length()); // 获得有效数字
		int validNum = Integer.parseInt(tempResult); // 数据类型转换得到int类型的有效数字
		return validNum; // 有效数字
	}

	public void handleNum() { // 处理选择“数字型”的方法
		try {
			if (tf_From.getText().length() == tf_To.getText().length()) { // 如果“从”后的文本框中的文本长度等于“到”后的文本框中的文本长度
				// 获得文本框中的文本内容
				String strFrom = tf_From.getText();
				String strTo = tf_To.getText();
				// 获得有效数字（例如：0000000012的有效数字是12）
				int num_From = getValidNum(strFrom);
				int num_To = getValidNum(strTo);
				if (num_From >= num_To) { // 当起始整型变量大于等于终止整型变量时的弹出框内容
					JOptionPane.showMessageDialog(null, "数据输入格式错误！\n“从”后的文本框中的有效数字要小于\n“到”后的文本框中的有效数字。", "警告",
							JOptionPane.ERROR_MESSAGE);
				} else { // 当起始整型变量小于终止整型变量时
					DecimalFormat df = new DecimalFormat(getPattern(strFrom)); // 根据目标格式，格式化文件名
					for (int i = num_From; i <= num_To; i++) { // 通过循环创建文件
						File file = new File(Path + df.format(i)); // 按照指定路径生成文件夹
						if (!file.exists()) { // 如果文件不存在
							file.mkdir(); // 创建此抽象路径名指定的目录
						}
					}
					JOptionPane.showMessageDialog(null, "文件夹创建成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "输入的文本内容长度不一致！\n请重新输入...", "警告", JOptionPane.ERROR_MESSAGE);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "请参照指定样式输入数据！", "警告", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void handleChar() { // 处理选择“非数字型”的方法
		try {
			if (tf_From.getText().length() == tf_To.getText().length()) { // 如果“从”后的文本框中的文本长度等于“到”后的文本框中的文本长度
				// 获得文本框中的文本内容
				String strFrom = tf_From.getText();
				String strTo = tf_To.getText();
				// 拆分文本框中的文本内容
				String[] targetFrom = strFrom.split("_");
				String[] targetTo = strTo.split("_");
				if (targetFrom[0].equals(targetTo[0])) {
					// 获得有效数字（例如：0000000012的有效数字是12）
					int num_From = getValidNum(targetFrom[1]);
					int num_To = getValidNum(targetTo[1]);
					if (num_From >= num_To) { // 当起始整型变量大于等于终止整型变量时的弹出框内容
						JOptionPane.showMessageDialog(null, "数据输入格式错误！\n“从”后的文本框中的有效数字要小于\n“到”后的文本框中的有效数字。", "警告",
								JOptionPane.ERROR_MESSAGE);
					} else { // 当起始整型变量小于终止整型变量时
						DecimalFormat df = new DecimalFormat(getPattern(targetFrom[1])); // 根据目标格式，格式化文件名
						for (int i = num_From; i <= num_To; i++) { // 通过循环创建文件
							File file = new File(Path + targetFrom[0] + "_" + df.format(i)); // 按照指定路径生成文件夹
							if (!file.exists()) { // 如果文件不存在
								file.mkdir(); // 创建此抽象路径名指定的目录
							}
						}
						JOptionPane.showMessageDialog(null, "文件夹创建成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "输入的文本内容字符不一致！\n请重新输入...", "警告", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "输入的文本内容长度不一致！\n请重新输入...", "警告", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) { // 当输入的文本内容不能转换为int型时的弹出框内容
			JOptionPane.showMessageDialog(null, "请参照指定样式输入数据！", "警告", JOptionPane.ERROR_MESSAGE);
		}
	}
}
