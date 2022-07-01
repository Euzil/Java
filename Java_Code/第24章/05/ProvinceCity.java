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
		setTitle("����");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 75);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("�����᣺");
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		comboBoxProvince = new JComboBox();
		comboBoxProvince.addActionListener(new ActionListener() { // ��Ӷ����������¼�
			@Override
			public void actionPerformed(ActionEvent e) { // ��������ʱ
				if (comboBoxProvince.getSelectedIndex() == 0) { // ѡ�񡰺�����ʡ��ʱ�������б����������
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"������", "�������", "ĵ����", "����", "����", "˫Ѽɽ", "�׸�", 
							"����", "��ľ˹", "��̨��", "�ں�", "�绯", "���˰���"}));
				} else if (comboBoxProvince.getSelectedIndex() == 1) { // ѡ�񡰼���ʡ��ʱ�������б����������
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"����", "�ӱ�", "����", "��ɽ", "�׳�", "��ƽ", "��ԭ", "��Դ", "��", "ͨ��"}));
				} else if (comboBoxProvince.getSelectedIndex() == 2) { // ѡ������ʡ��ʱ�������б����������
					comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"����", "����", "��«��", "��˳", "��Ϫ", "��˳", "����", "����", 
							"Ӫ��", "����", "����", "����", "����", "��ɽ"}));
				}
			}
		});
		comboBoxProvince.setModel(new DefaultComboBoxModel(new String[] {"������ʡ", "����ʡ", "����ʡ"}));
		contentPane.add(comboBoxProvince);
		
		JLabel labelProvince = new JLabel("ʡ");
		labelProvince.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		contentPane.add(labelProvince);
		
		comboBoxCity = new JComboBox();
		comboBoxCity.setModel(new DefaultComboBoxModel(new String[]{"������", "�������", "ĵ����", "����", "����", "˫Ѽɽ", "�׸�", 
				"����", "��ľ˹", "��̨��", "�ں�", "�绯", "���˰���"}));
		contentPane.add(comboBoxCity);
		
		JLabel labelCity = new JLabel("��");
		labelCity.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		contentPane.add(labelCity);
	}
}
