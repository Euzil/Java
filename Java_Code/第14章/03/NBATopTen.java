
import java.util.ArrayList;
import java.util.List;

public class NBATopTen {
	public static void main(String[] args) {
		System.out.print("������������������������NBA��ʷʮ����ǡ�����������������������\n");
		String titles[] = { "��Ա", "�º�", "�÷�", "����", "����" }; // ����һ��String���͵����飬�������Ա����Ϣ
		for (int i = 0; i < titles.length; i++) { // ��������titles
			System.out.print(titles[i] + "\t"); // ��������е�Ԫ��
		}
		System.out.println(); // ����
		List<String> list = new ArrayList<>(); // ʹ��ArrayListʵ��List�ӿ�
		// ʹ��add�����򼯺�list�����Ԫ��
		list.add("�ǵ�,����/��,30.1,6.2,5.3");
		list.add("������,ָ����,15.1,22.5,4.3");
		list.add("�ְͶ�,�칳,24.6,11.2,3.6");
		list.add("�Ų���,����ʵ�,30.1,22.9,4.4");
		list.add("Լ��ѷ,ħ��ʦ,19.5,7.2,11.2");
		list.add("����,����,24.3,10.0,6.3");
		list.add("�˿�,ʯ��,20.7,11.4,3.2");
		list.add("�Ʊ�,������,25.1,5.3,4.7");
		list.add("�����,������,23.7,10.9,2.5");
		list.add("��������,����,21.8,11.1,2.5");
		for (int i = 0; i < list.size(); i++) { // ��������list
			String element = (String) list.get(i); // ��ȡ����list�е�Ԫ�أ�������ת��ΪString����
			// ��","��ֱ�ת��ΪString���͵ļ���list�е�Ԫ�أ������Ѿ���ֵ����ݴ�ŵ�String���͵�������
			String info[] = element.split(",");
			for (int j = 0; j < info.length; j++) { // ��������info
				System.out.print(info[j] + "\t"); // �������info��Ԫ��
			}
			System.out.println(); // ����
		}
	}
}
