
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

public class Login extends JFrame { // ����һ������¼���࣬���̳�JFrame
	// ���������е����
	private JPanel contentPane;
	private JTextField tName;
	private JPasswordField passwordField;
	private JLabel lblBanner;
	/**
	 * ������
	 */
	public static void main(String[] args) {
		Login frame = new Login(); // ����Login����
		frame.setVisible(true); // ʹframe����
	}
	/**
	 * ����JFrame����
	 */
	public Login() { // Login�Ĺ��췽��
		setResizable(false); // ���ɸı䴰���С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 406, 289); // ���ô����С
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ������ǩlblName�������contentPane�У����ñ�ǩ�Ĵ�С�Լ���ǩ����������ݡ���ʽ
		 */
		JLabel lblName = new JLabel("�û�����");
		lblName.setFont(new Font("��Բ", Font.PLAIN, 16));
		lblName.setBounds(115, 144, 64, 18);
		contentPane.add(lblName);
		/**
		 * �����ı���tName�������contentPane�У������ı���Ĵ�С
		 */
		tName = new JTextField();
		tName.setBounds(180, 143, 156, 21);
		contentPane.add(tName);
		tName.setColumns(10);
		/**
		 * ������ǩlblPwd�������contentPane�У����ñ�ǩ�Ĵ�С�Լ���ǩ����������ݡ���ʽ
		 */
		JLabel lblPwd = new JLabel("���룺");
		lblPwd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPwd.setFont(new Font("��Բ", Font.PLAIN, 16));
		lblPwd.setBounds(125, 175, 54, 15);
		contentPane.add(lblPwd);
		/**
		 * ������ťbtnLogin�������contentPane�У����ð�ť�Ĵ�С�Լ���ť����������ݡ���ʽ
		 */
		JButton btnLogin = new JButton("�ǡ�¼");
		btnLogin.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				if (tName.getText().equals("mr") && new String(passwordField.getPassword()).equals("mrsoft")) { // ����½�ɹ���������
					JOptionPane.showMessageDialog(null, "��¼�ɹ���", "Success", JOptionPane.INFORMATION_MESSAGE); // �����򣺡���½�ɹ�����
				} else if (tName.getText().equals("") || new String(passwordField.getPassword()).equals("")) { // �ı���Ϊ��ʱ
					JOptionPane.showMessageDialog(null, "�û��������벻��Ϊ�գ�", "Warning", JOptionPane.WARNING_MESSAGE); // �����򣺡��û��������벻��Ϊ�գ���
				} else { // �����������������ʱ��
					JOptionPane.showMessageDialog(null, "�û������������", "Error", JOptionPane.ERROR_MESSAGE); // �����򣺡��û�����������󣡡�
				}
			}
		});
		btnLogin.setFont(new Font("��Բ", Font.PLAIN, 16));
		btnLogin.setBounds(125, 216, 156, 23);
		contentPane.add(btnLogin);
		/**
		 * ����������������contentPane�У����������Ĵ�С
		 */
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 172, 156, 21);
		passwordField.addKeyListener(new KeyAdapter() {// Ϊ�����롱�ı�����Ӽ���ʱ��ļ���
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == '\n')// ���µİ����ǻس�ʱ
					btnLogin.doClick();// ����¼����ťִ�е���¼�
			}
		});
		contentPane.add(passwordField);
		/**
		 * ������ǩlblBanner�������contentPane�У����ñ�ǩ�Ĵ�С�����ǩ�����ͼ��
		 */
		lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(Login.class.getResource("QQlogin.png")));
		lblBanner.setBounds(0, 0, 400, 129);
		contentPane.add(lblBanner);
		/**
		 * ������ǩlblIcon�������contentPane�У����ñ�ǩ�Ĵ�С�����ǩ�����ͼ��
		 */
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(Login.class.getResource("Photo.jpg")));
		lblIcon.setBounds(56, 140, 55, 55);
		contentPane.add(lblIcon);
	}
}
