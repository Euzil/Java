
import java.util.Random;
import java.util.Scanner;

public class SevenColors { // ����һ��SevenColors��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ����̨����
		System.out.print("��������Ҫ����Ĳ�Ʊ����"); // ��ʾ��Ϣ
		int counts = sc.nextInt(); // ���롰����Ĳ�Ʊ����
		Random rnd = new Random(); // ��������������r
		int nums[] = new int[counts]; // ����һ��int���͡������Ʊ�������飬������Ź���Ĳ�Ʊ����
		System.out.println("������Ĳ�Ʊ�������£�"); // ��ʾ��Ϣ
		for (int i = 0; i < counts; i++) { // �����������Ʊ��������
			int randNum = rnd.nextInt(8999999) + 1000000; // 7λ��Ʊ���룬��Χ��1000000~9999999
			System.out.println(randNum); // ���������ɵĲ�Ʊ����
			nums[i] = randNum;// ��������ɵĲ�Ʊ������롰�����Ʊ��������
		}
		int useMoney = nums.length * 2;// �����Ʊ���ѵĽ��
		System.out.println("�������Ʊ�ĺ�������" + counts + "�ţ������ѣ�" + useMoney + "Ԫ��");// ������
		int getMoney = 0; // ��ʼ�����н���
		int bonus = rnd.nextInt(8999999) + 1000000; // 7λ���������롱����Χ��1000000~9999999
		System.out.println("���ڿ����� : " + bonus);
		String rightNum = Integer.toString(bonus); // ����ת��
		for (int l = 0; l < nums.length; l++) { // �����ɹ����Ʊ��ɵ�����
			String myNum = Integer.toString(nums[l]); // ��Ʊ����
			int series = 0; // ��ʼ���С��ҵĺ��롱��������һ�����������������
			int arr[] = new int[7]; // ����һ��int���͵����飬������Ÿ�������һ�����������������
			for (int m = 0; m < 7; m++) {// 7λ����
				String everyNum = myNum.substring(m, m + 1); // �ֱ��ȡ���ҵĺ��롱ÿһλ�ϵ��ַ���
				String everyRightNum = rightNum.substring(m, m + 1); // �ֱ��ȡ�������š�ÿһλ�ϵ��ַ���
				if (everyNum.equals(everyRightNum)) { // �жϡ��ҵĺ��롱���������š�ÿλ�ϵĺ������Ƿ���ͬ
					series++; // ��������ʱ��ͳ�ơ��ҵĺ��롱��������һ�����������������
				} else { // ����������ʱ
					if (series > 0) {// ������н��ĺ���
						arr[series - 1] = series;// ���н��ĺ�����������
						series = 0;// ��ʼ���С��ҵĺ��롱��������һ�����������������
					}
				}
			}
			// �������������������
			for (int i = 0; i < arr.length; i++) {
				if (series < arr[i]) {
					series = arr[i];
				}
			}
			if (series > 1) { // �����������������1
				switch (series) { // ���֧���
				case 2:
					System.out.println("��Ӯ����5Ԫ��");
					getMoney += 5; // ���Ƚ�5Ԫ
					break;
				case 3:
					System.out.println("��Ӯ����20Ԫ��");
					getMoney += 20; // ��Ƚ�20Ԫ
					break;
				case 4:
					System.out.println("��Ӯ����300Ԫ��");
					getMoney += 300; // �ĵȽ�300Ԫ
					break;
				case 5:
					System.out.println("��Ӯ����1800Ԫ��");
					getMoney += 1800; // ���Ƚ�1800Ԫ
					break;
				case 6:
					System.out.println("��Ӯ����20000Ԫ��");
					getMoney += 20000; // ���Ƚ�20000Ԫ
					break;
				case 7:
					System.out.println("��Ӯ����5000000Ԫ��");
					getMoney += 5000000; // һ�Ƚ�5000000Ԫ
					break;
				}
			}
		}
		System.out.println("���н����ܽ�" + getMoney + "Ԫ��"); // �ܽ���
		sc.close(); // �رտ���̨����
	}
}
