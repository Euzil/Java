
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Judges { // ����һ��Judges�����У���
	public static void main(String[] args) {
		System.out.println("������������������������ģ��NBA�������������֡�����������������������\n");
		System.out.println("����λ��ί���\n(��ʾ���������0-10�ڵ��������м���Ӣ�Ķ��Ÿ��������磺10,9,9,8,10)��");
		Scanner sc = new Scanner(System.in); // ����̨����
		String score = sc.next();
		String[] scores = score.split(",");
		// ����̨�����������
		int score1 = Integer.valueOf(scores[0]);
		int score2 = Integer.valueOf(scores[1]);
		int score3 = Integer.valueOf(scores[2]);
		int score4 = Integer.valueOf(scores[3]);
		int score5 = Integer.valueOf(scores[4]);
		HashMap<String, Integer> hm = new HashMap<>(); // ����HashMap����
		// ʹ��put()�����򼯺�hm����Ӽ���ֵ��
		hm.put("ħ��ʦԼ��ѷ", score1);
		hm.put("����������", score2);
		hm.put("���", score3);
		hm.put("�´���", score4);
		hm.put("���˸���", score5);
		int total = 0; // ��ʼ��һ��int���͵ı���total���ܷ�����
		Iterator<String> it = hm.keySet().iterator(); // ����������
		while (it.hasNext()){ // �жϼ���hm���Ƿ���key
			String key = (String) it.next(); // ����key
			System.out.println(key + "��" + hm.get(key) + "��"); // �������hm�еļ���ֵ��
			total += (int) hm.get(key); // �滻int���͵ı���total
		}
		System.out.println(); // ����
		System.out.println("��Ա���ֿ����ĳɼ���" + total + "��"); // ���total
		sc.close(); // �رտ���̨����
	}
}
