
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JListSelectModelTest extends JFrame {
	private JPanel contentPane;
	private JList list1;
	private JList list2;
	private JList list3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	public static void main(String[] args) {
		try {// 设置窗体的外观样式
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		JListSelectModelTest frame = new JListSelectModelTest();
		frame.setVisible(true);
	}

	public JListSelectModelTest() {
		setTitle("列表项的选择模式");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 3, 5, 5));

		JScrollPane scrollPane1 = new JScrollPane();
		panel.add(scrollPane1);

		list1 = new JList();
		list1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane1.setViewportView(list1);

		label1 = new JLabel("单项选择");
		label1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane1.setColumnHeaderView(label1);

		JScrollPane scrollPane2 = new JScrollPane();
		panel.add(scrollPane2);

		list2 = new JList();
		list2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrollPane2.setViewportView(list2);

		label2 = new JLabel("连续选择(按Shift)");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		scrollPane2.setColumnHeaderView(label2);

		JScrollPane scrollPane3 = new JScrollPane();
		panel.add(scrollPane3);

		list3 = new JList();
		list3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		scrollPane3.setViewportView(list3);

		label3 = new JLabel("默认选择(按Ctrl/Shift)");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		scrollPane3.setColumnHeaderView(label3);

		String[] listData = new String[12];
		for (int i = 0; i < listData.length; i++) {
			listData[i] = "明日科技" + (i + 1);
		}
		list1.setListData(listData);
		list2.setListData(listData);
		list3.setListData(listData);
	}
}
