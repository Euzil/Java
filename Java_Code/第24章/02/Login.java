
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import java.awt.Color;

public class Login extends JFrame { // 创建一个“登录”类，并继承JFrame
	// 声明窗体中的组件
	private JPanel contentPane;
	private JTextField tName;
	private JPasswordField passwordField;
	private JLabel lblBanner;
	/**
	 * 主方法
	 */
	public static void main(String[] args) {
		Login frame = new Login(); // 创建Login对象
		frame.setVisible(true); // 使frame可视
	}
	/**
	 * 创建JFrame窗体
	 */
	public Login() { // Login的构造方法
		setResizable(false); // 不可改变窗体大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
		setBounds(100, 100, 406, 289); // 设置窗体大小
		/**
		 * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的边距和布局
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 创建标签lblName置于面板contentPane中，设置标签的大小以及标签中字体的内容、样式
		 */
		JLabel lblName = new JLabel("用户名：");
		lblName.setFont(new Font("幼圆", Font.PLAIN, 16));
		lblName.setBounds(115, 144, 64, 18);
		contentPane.add(lblName);
		/**
		 * 创建文本框tName置于面板contentPane中，设置文本框的大小
		 */
		tName = new JTextField();
		tName.setBounds(180, 143, 156, 21);
		contentPane.add(tName);
		tName.setColumns(10);
		/**
		 * 创建标签lblPwd置于面板contentPane中，设置标签的大小以及标签中字体的内容、样式
		 */
		JLabel lblPwd = new JLabel("密码：");
		lblPwd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPwd.setFont(new Font("幼圆", Font.PLAIN, 16));
		lblPwd.setBounds(125, 175, 54, 15);
		contentPane.add(lblPwd);
		/**
		 * 创建按钮btnLogin置于面板contentPane中，设置按钮的大小以及按钮中字体的内容、样式
		 */
		JButton btnLogin = new JButton("登　录");
		btnLogin.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				if (tName.getText().equals("mr") && new String(passwordField.getPassword()).equals("mrsoft")) { // “登陆成功”的条件
					JOptionPane.showMessageDialog(null, "登录成功！", "Success", JOptionPane.INFORMATION_MESSAGE); // 弹出框：“登陆成功！”
				} else if (tName.getText().equals("") || new String(passwordField.getPassword()).equals("")) { // 文本框为空时
					JOptionPane.showMessageDialog(null, "用户名或密码不能为空！", "Warning", JOptionPane.WARNING_MESSAGE); // 弹出框：“用户名或密码不能为空！”
				} else { // 以上条件都不满足的时候
					JOptionPane.showMessageDialog(null, "用户名或密码错误！", "Error", JOptionPane.ERROR_MESSAGE); // 弹出框：“用户名或密码错误！”
				}
			}
		});
		btnLogin.setFont(new Font("幼圆", Font.PLAIN, 16));
		btnLogin.setBounds(125, 216, 156, 23);
		contentPane.add(btnLogin);
		/**
		 * 创建密码框置于面板contentPane中，设置密码框的大小
		 */
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 172, 156, 21);
		passwordField.addKeyListener(new KeyAdapter() {// 为“密码”文本框添加键盘时间的监听
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == '\n')// 按下的按键是回车时
					btnLogin.doClick();// “登录”按钮执行点击事件
			}
		});
		contentPane.add(passwordField);
		/**
		 * 创建标签lblBanner置于面板contentPane中，设置标签的大小并向标签中添加图标
		 */
		lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(Login.class.getResource("QQlogin.png")));
		lblBanner.setBounds(0, 0, 400, 129);
		contentPane.add(lblBanner);
		/**
		 * 创建标签lblIcon置于面板contentPane中，设置标签的大小并向标签中添加图标
		 */
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(Login.class.getResource("Photo.jpg")));
		lblIcon.setBounds(56, 140, 55, 55);
		contentPane.add(lblIcon);
	}
}
