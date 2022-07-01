
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

public class Folder extends JFrame { // �������ļ��С���̳�JFrame

	private JPanel contentPane; // �������
	private JTextField tf_Path; // ���롰�ļ�·�������ı���
	private JTextField tf_From; // ���ӡ�������ı���
	private JTextField tf_To; // ������������ı���
	private String Path; // �ļ�·��
	private JRadioButton rdbtnNum;
	private JRadioButton rdbtnChar;
	private JLabel lblShow;

	public static void main(String[] args) {
		Folder folder = new Folder(); // �������ļ��С�����
		folder.setVisible(true); // ʹ�á��ļ��С�����
	}

	/**
	 * ��������
	 */
	public Folder() { // ���ļ��С���Ĺ��췽��
		setResizable(false); // ���ɸı䴰���С
		setTitle("����ģ�崴���ļ���"); // ���ô������Ŀ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���Ĺرշ�ʽ
		setBounds(100, 100, 424, 200); // �趨�ô���ĺᡢ�����꣬����
		/**
		 * ����������壬�������ı߾࣬���֣����Բ��֣������������ŵ�������
		 */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ��������ѡ���ļ��С��ı�ǩ�����ñ�ǩ�ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹñ�ǩ�ŵ����������
		 */
		JLabel lb_Choose = new JLabel("��ѡ���ļ��У�");
		lb_Choose.setFont(new Font("����", Font.PLAIN, 12));
		lb_Choose.setBounds(10, 30, 85, 20);
		contentPane.add(lb_Choose);
		/**
		 * �������롰�ļ�·�������ı��������ı���ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹ��ı���ŵ����������
		 */
		tf_Path = new JTextField();
		tf_Path.setFont(new Font("����", Font.PLAIN, 12));
		tf_Path.setBounds(95, 30, 215, 20);
		contentPane.add(tf_Path);
		tf_Path.setColumns(10);
		/**
		 * �������������ť�����ð�ť�ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹð�ť�ŵ����������
		 */
		JButton btn_Search = new JButton("䯡���");
		btn_Search.addActionListener(new ActionListener() { // �����¼��ļ���
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				JFileChooser jfc = new JFileChooser(); // �����ļ�ѡ��Ի���
				jfc.setDialogTitle("��ѡ��Ҫ����Ŀ¼"); // ���öԻ���ı���
				jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // ������������·��
				int result = jfc.showOpenDialog(getContentPane()); // ��ʾ�ļ�ѡ��Ի���
				File file = null; // ����һ���յ��ļ�����
				if (JFileChooser.APPROVE_OPTION == result) { // �ж��û��������Ƿ�Ϊ���򿪡���ť
					file = jfc.getSelectedFile(); // ���ѡ�е��ļ�����
					Path = file.getAbsolutePath() + "\\"; // ƴ�ӱ༭��ʶ����ļ�·��
					tf_Path.setText(Path); // ��ƴ�Ӻõ��ļ�·��д�뵽���ļ�·�������ı�����
				}
			}
		});
		btn_Search.setFont(new Font("����", Font.PLAIN, 12));
		btn_Search.setBounds(318, 30, 90, 20);
		contentPane.add(btn_Search);
		/**
		 * ����������ļ��У��ӡ��ı�ǩ�����ñ�ǩ�ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹñ�ǩ�ŵ����������
		 */
		JLabel lb_From = new JLabel("����ļ��У���");
		lb_From.setFont(new Font("����", Font.PLAIN, 12));
		lb_From.setBounds(10, 120, 85, 20);
		contentPane.add(lb_From);
		/**
		 * ����������ʼ���ͱ������ı��������ı���ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹ��ı���ŵ����������
		 */
		tf_From = new JTextField();
		tf_From.setBounds(95, 120, 93, 20);
		contentPane.add(tf_From);
		tf_From.setColumns(10);
		/**
		 * ����������ֹ���ͱ������ı��������ı���ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹ��ı���ŵ����������
		 */
		tf_To = new JTextField();
		tf_To.setBounds(213, 120, 93, 20);
		contentPane.add(tf_To);
		tf_To.setColumns(10);
		/**
		 * �����������ı�ǩ�����ñ�ǩ�ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹñ�ǩ�ŵ����������
		 */
		JLabel lb_To = new JLabel("��");
		lb_To.setFont(new Font("����", Font.PLAIN, 12));
		lb_To.setBounds(196, 120, 15, 20);
		contentPane.add(lb_To);
		/**
		 * ��������ӡ���ť�����ð�ť�ĺᡢ�����꣬���ߣ��������ݺ���ʽ���Ѹð�ť�ŵ����������
		 */
		JButton btn_Add = new JButton("����");
		btn_Add.addActionListener(new ActionListener() { // �����¼��ļ���
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				if (rdbtnNum.isSelected()) {
					handleNum();
				}
				if (rdbtnChar.isSelected()) {
					handleChar();
				}
			}
		});
		btn_Add.setFont(new Font("����", Font.PLAIN, 12));
		btn_Add.setBounds(318, 120, 90, 20);
		contentPane.add(btn_Add);
		/**
		 * ��ѡ��ť�������͡�
		 */
		rdbtnNum = new JRadioButton("������");
		rdbtnNum.setSelected(true);
		rdbtnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText("��������ʽ��000001");
			}
		});
		rdbtnNum.setFont(new Font("����", Font.PLAIN, 12));
		rdbtnNum.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNum.setBounds(6, 86, 70, 23);
		contentPane.add(rdbtnNum);
		/**
		 * ��ѡ��ť���������͡�
		 */
		rdbtnChar = new JRadioButton("��������");
		rdbtnChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText("����������ʽ��Demo_001");
			}
		});
		rdbtnChar.setFont(new Font("����", Font.PLAIN, 12));
		rdbtnChar.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnChar.setBounds(100, 86, 80, 23);
		contentPane.add(rdbtnChar);
		/**
		 * ��ѡ��ť��
		 */
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNum);
		buttonGroup.add(rdbtnChar);
		/**
		 * ��ʽ��ǩ
		 */
		lblShow = new JLabel("��������ʽ��000001");
		lblShow.setFont(new Font("����", Font.PLAIN, 14));
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setBounds(195, 86, 160, 23);
		contentPane.add(lblShow);
	}

	public String getPattern(String str) { // ���Ŀ���ʽ�ķ���
		StringBuilder stringBuilder = new StringBuilder(); // �����洢�ַ���������
		for (int i = 0; i < str.length(); i++) { // ���ַ��������������Ŀ���ַ�������һ�µġ�0��
			stringBuilder.append(0);
		}
		String pattern = stringBuilder.toString(); // ���Ŀ���ʽ
		return pattern; // ����Ŀ���ʽ
	}

	public int getValidNum(String str) { // �����Ч���ֵķ���
		char flag = '0'; // ��־������������Ŀ���ַ�����ÿ������λ���ϵ��ַ����бȽ�
		int index = 0; // ��ʼ���ַ����е�һλ��Ϊ��0�����ַ�������ֵ
		for (int i = 0; i < str.length(); i++) { // ͨ��ѭ����ʹ�ñ�־������Ŀ���ַ�����ÿ������λ���ϵ��ַ����бȽ�
			if (flag != str.charAt(i)) { // Ŀ���ַ���������λ���ϵ��ַ���Ϊ��0��ʱ
				index = i; // ����ַ����е�һλ��Ϊ��0�����ַ�������ֵ
				break; // ��ֹѭ��
			}
		}
		String tempResult = str.substring(index, str.length()); // �����Ч����
		int validNum = Integer.parseInt(tempResult); // ��������ת���õ�int���͵���Ч����
		return validNum; // ��Ч����
	}

	public void handleNum() { // ����ѡ�������͡��ķ���
		try {
			if (tf_From.getText().length() == tf_To.getText().length()) { // ������ӡ�����ı����е��ı����ȵ��ڡ���������ı����е��ı�����
				// ����ı����е��ı�����
				String strFrom = tf_From.getText();
				String strTo = tf_To.getText();
				// �����Ч���֣����磺0000000012����Ч������12��
				int num_From = getValidNum(strFrom);
				int num_To = getValidNum(strTo);
				if (num_From >= num_To) { // ����ʼ���ͱ������ڵ�����ֹ���ͱ���ʱ�ĵ���������
					JOptionPane.showMessageDialog(null, "���������ʽ����\n���ӡ�����ı����е���Ч����ҪС��\n����������ı����е���Ч���֡�", "����",
							JOptionPane.ERROR_MESSAGE);
				} else { // ����ʼ���ͱ���С����ֹ���ͱ���ʱ
					DecimalFormat df = new DecimalFormat(getPattern(strFrom)); // ����Ŀ���ʽ����ʽ���ļ���
					for (int i = num_From; i <= num_To; i++) { // ͨ��ѭ�������ļ�
						File file = new File(Path + df.format(i)); // ����ָ��·�������ļ���
						if (!file.exists()) { // ����ļ�������
							file.mkdir(); // �����˳���·����ָ����Ŀ¼
						}
					}
					JOptionPane.showMessageDialog(null, "�ļ��д����ɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "������ı����ݳ��Ȳ�һ�£�\n����������...", "����", JOptionPane.ERROR_MESSAGE);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "�����ָ����ʽ�������ݣ�", "����", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void handleChar() { // ����ѡ�񡰷������͡��ķ���
		try {
			if (tf_From.getText().length() == tf_To.getText().length()) { // ������ӡ�����ı����е��ı����ȵ��ڡ���������ı����е��ı�����
				// ����ı����е��ı�����
				String strFrom = tf_From.getText();
				String strTo = tf_To.getText();
				// ����ı����е��ı�����
				String[] targetFrom = strFrom.split("_");
				String[] targetTo = strTo.split("_");
				if (targetFrom[0].equals(targetTo[0])) {
					// �����Ч���֣����磺0000000012����Ч������12��
					int num_From = getValidNum(targetFrom[1]);
					int num_To = getValidNum(targetTo[1]);
					if (num_From >= num_To) { // ����ʼ���ͱ������ڵ�����ֹ���ͱ���ʱ�ĵ���������
						JOptionPane.showMessageDialog(null, "���������ʽ����\n���ӡ�����ı����е���Ч����ҪС��\n����������ı����е���Ч���֡�", "����",
								JOptionPane.ERROR_MESSAGE);
					} else { // ����ʼ���ͱ���С����ֹ���ͱ���ʱ
						DecimalFormat df = new DecimalFormat(getPattern(targetFrom[1])); // ����Ŀ���ʽ����ʽ���ļ���
						for (int i = num_From; i <= num_To; i++) { // ͨ��ѭ�������ļ�
							File file = new File(Path + targetFrom[0] + "_" + df.format(i)); // ����ָ��·�������ļ���
							if (!file.exists()) { // ����ļ�������
								file.mkdir(); // �����˳���·����ָ����Ŀ¼
							}
						}
						JOptionPane.showMessageDialog(null, "�ļ��д����ɹ���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "������ı������ַ���һ�£�\n����������...", "����", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "������ı����ݳ��Ȳ�һ�£�\n����������...", "����", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) { // ��������ı����ݲ���ת��Ϊint��ʱ�ĵ���������
			JOptionPane.showMessageDialog(null, "�����ָ����ʽ�������ݣ�", "����", JOptionPane.ERROR_MESSAGE);
		}
	}
}
