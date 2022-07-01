
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
		setTitle("关闭窗体时弹出确认对话框"); // 设置窗体题目
		addWindowListener(new WindowAdapter() { // 接收窗口事件的监听
			@Override
			public void windowClosing(WindowEvent e) { // 正在关闭窗口时被调用
				String[] options = { "确定", "取消" };//定义对话框中的按钮选项
				//显示操作对话框
				int flag = JOptionPane.showOptionDialog(null, "你真的要退出本窗口么?", "确认关闭", JOptionPane.YES_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if (flag == 0) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体
					dispose();//释放资源
				} else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 设置不关闭窗体
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
