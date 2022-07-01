
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * ��ģ�����ؽ���
 */
public class ProgressBar extends JFrame { // ����������������̳д���

	private JPanel contentPane; // �������
	private JProgressBar progressBar; // ������
	private JButton btnStart; // ��ʼ��ť

	public static void main(String[] args) {
		ProgressBar progressBar = new ProgressBar(); // ������������������
		progressBar.setVisible(true); // ʹ�ý������������
	}

	/**
	 * ��������
	 */
	public ProgressBar() { // ����������Ĺ��췽��
		setResizable(false); // ���ɸı䴰��Ĵ�С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ���ķ�ʽ
		setBounds(100, 100, 450, 100); // ���ô���ĺᡢ�����꣬���
		// ������壨�߽粼�֣�
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// ��ť��壨�����֣�
		JPanel buttonPane = new JPanel();
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		// ����ʼ���ء���ť
		btnStart = new JButton("��ʼ����");
		btnStart.addActionListener(new ActionListener() { // Ϊ����ʼ���ء���ť��Ӷ����¼��ļ���
			public void actionPerformed(ActionEvent e) { // ����ʼ���ء���ť��������ʱ
				Progress progress = new Progress(progressBar, btnStart); // ����ʵ��Runnable�ӿڵġ����ȡ���ʵ��
				Thread thread = new Thread(progress); // ʹ��ʵ��Runnable�ӿڵġ����ȡ���ʵ������Thread�����
				if (btnStart.getText().equals("��ʼ����")) { // �����ť�е���������Ϊ����ʼ���ء�
					btnStart.setEnabled(false); // ���á���ʼ���ء���ť
					thread.start(); // �����߳�
				} else { // �����ť�е���������Ϊ��������ɡ�
					dispose(); // ���ٵ�ǰ����
				}
			}
		});
		btnStart.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		buttonPane.add(btnStart);
		// ��ʾ���ȵĽ�����
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		contentPane.add(progressBar, BorderLayout.CENTER);
	}

}

class Progress implements Runnable { // ���������ȡ���ʵ��Runnable�ӿ�

	JProgressBar jpb; // ������
	JButton jb; // ��ť

	int[] values = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100}; // ��ʾ���������ȵ�����

	public Progress(JProgressBar jpb, JButton jb) { // �Խ���������ťΪ�����Ĺ��췽�������ù��췽����ʼ�������ȡ����еĳ�Ա����
		this.jpb = jpb;
		this.jb = jb;
	}

	@Override
	public void run() { // �߳�Ҫִ�е�����
		for (int i = 0; i < values.length; i++) { // ��������õ�Ҫ��ʾ���������ȵ�����Ԫ��
			try {
				Thread.sleep(500); // �߳�����0.5��
			} catch (Exception e) {
				e.printStackTrace();
			}
			jpb.setValue(values[i]); // ��ʾ���������ȵ�Ԫ��
		}
		jpb.setIndeterminate(false); // ȷ�����ȵĽ�����
		jb.setEnabled(true); // ���ð�ť
		jb.setText("�������"); // �滻��ť�е���������
	}
}