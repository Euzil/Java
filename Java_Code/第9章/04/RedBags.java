
import java.util.Random;
import java.util.Scanner;

public class RedBags { 						// ����һ��RedBags��
	public static void main(String[] args) {
		System.out.println("������������������ģ��΢�������������������������\n");
		Scanner sc = new Scanner(System.in); 		// ����̨����
		System.out.print("������Ҫװ�������ܽ�Ԫ����");
		double total = sc.nextDouble(); 			// ���롰������ܽ�
		System.out.print("���������ĸ�����������");
		int bagsnum = sc.nextInt(); 				// ���롰����ĸ�����
		double min = 0.01; 						// ��ʼ�����������С��
		Random random = new Random(); 			// �������������random
		if (total / bagsnum == 0.01) {			// ����ܽ�����������Ϊ0.01ʱ
			for (int i = 1; i < bagsnum; i++) {
				double money = min;				// ��ÿ�����еĽ���Ϊ��С���0.01
				total -= money;					// ����е�ʣ����
				System.out.println
					("��" + i + "�������" + String.format("%.2f", money) + "Ԫ");
			}
		} else if (total / bagsnum < 0.01) {		// ����ܽ�����������С��0.01ʱ
			System.out.println("Ҫ��֤ÿ���˶��ֵܷ�1��ǮŶ��");
			return;								// ����ִ�е�22�����µĴ��룬�����46��
		} else {
			for (int i = 1; i < bagsnum; i++) { 	// ���á�ѭ����
				/*
				 * ���κ����������� = 
				 * �ɷ����� - (������� * �ѷ����ĺ����) * �������С���
				 */
				double max = total - (bagsnum - i) * min;
				double bound = max - min;			// �����������ȡֵ��Χ
				/*
				 * ���������ȡֵ��Χ��������ɺ���� ����nextInt(int
				 * bound)ֻ���������������������Ƚ�bound��100��С��������Ų��λ��
				 * ��ȡ��һ�������󣬽����������100��С��������Ų��λ)
				 * ��ת����������ͬ�ĸ�������
				 */
				double safe = (double) random.nextInt((int) (bound * 100)) / 100;
				double money = safe + min;	// �����Ϻ������С���Է�safe����0ֵ
				total = total - money; 		// �滻total��ֵ
				System.out.println
					("��" + i + "�������" + String.format("%.2f", money) + "Ԫ");
			}
		}
		// ���ʣ����
		System.out.println
			("��" + bagsnum + "�������" + String.format("%.2f", total) + "Ԫ");
		sc.close(); 							// �رտ���̨����
	}
}
