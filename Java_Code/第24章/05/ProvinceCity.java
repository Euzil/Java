import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ProvinceCity extends JFrame {
	private JPanel contentPane;
	private JComboBox comboBoxProvince;
	private JComboBox comboBoxCity;

	public static void main(String[] args) {
					ProvinceCity frame = new ProvinceCity();
					frame.setVisible(true);
	}

	public ProvinceCity() {
		setTitle("籍贯");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 75);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("籍　贯：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		comboBoxProvince = new JComboBox();
		comboBoxProvince.addActionListener(new ActionListener() { // 添加动作监听的事件
			@Override
			public void actionPerformed(ActionEvent e) { // 发生操作时
				if (comboBoxProvince.getSelectedIndex() == 0) { // 选择“黑龙江省”时，下拉列表的内容如下
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"哈尔滨", "齐齐哈尔", "牡丹江", "大庆", "伊春", "双鸭山", "鹤岗", 
							"鸡西", "佳木斯", "七台河", "黑河", "绥化", "大兴安岭"}));
				} else if (comboBoxProvince.getSelectedIndex() == 1) { // 选择“吉林省”时，下拉列表的内容如下
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"长春", "延边", "吉林", "白山", "白城", "四平", "松原", "辽源", "大安", "通化"}));
				} else if (comboBoxProvince.getSelectedIndex() == 2) { // 选择“辽宁省”时，下拉列表的内容如下
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"沈阳", "大连", "葫芦岛", "旅顺", "本溪", "抚顺", "铁岭", "辽阳", 
							"营口", "阜新", "朝阳", "锦州", "丹东", "鞍山"}));
				}
			}
		});
		comboBoxProvince.setModel(new DefaultComboBoxModel(new String[] {"黑龙江省", "吉林省", "辽宁省"}));
		contentPane.add(comboBoxProvince);
		
		JLabel labelProvince = new JLabel("省");
		labelProvince.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		contentPane.add(labelProvince);
		
		comboBoxCity = new JComboBox();
		comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"哈尔滨", "齐齐哈尔", "牡丹江", "大庆", "伊春", "双鸭山", "鹤岗", 
				"鸡西", "佳木斯", "七台河", "黑河", "绥化", "大兴安岭"}));
		contentPane.add(comboBoxCity);
		
		JLabel labelCity = new JLabel("市");
		labelCity.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		contentPane.add(labelCity);
	}
}
