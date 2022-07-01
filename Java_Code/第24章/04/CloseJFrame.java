
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CloseJFrame extends JFrame {
	private JPanel contentPane;

	public static void main(String[] args) {
		CloseJFrame frame = new CloseJFrame();
		frame.setVisible(true);
	}

	public CloseJFrame() {
		setTitle("�رմ���ʱ����ȷ�϶Ի���"); // ���ô�����Ŀ
		addWindowListener(new WindowAdapter() { // ���մ����¼��ļ���
			@Override
			public void windowClosing(WindowEvent e) { // ���ڹرմ���ʱ������
				String[] options = { "ȷ��", "ȡ��" };//����Ի����еİ�ťѡ��
				//��ʾ�����Ի���
				int flag = JOptionPane.showOptionDialog(null, "�����Ҫ�˳�������ô?", "ȷ�Ϲر�", JOptionPane.YES_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (flag == 0) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
					dispose();//�ͷ���Դ
				} else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // ���ò��رմ���
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblImage = new JLabel();
		lblImage.setIcon(new ImageIcon(CloseJFrame.class.getResource("1.jpg")));
		contentPane.add(lblImage, BorderLayout.CENTER);
	}
}
