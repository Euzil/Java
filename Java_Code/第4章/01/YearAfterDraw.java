
import java.util.Scanner;

public class YearAfterDraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������Ľ��ţ�");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("��ϲ���һ�Ƚ���42��ʵ�");
		}
		if (number == 2) {
			System.out.println("��ϲ��ö��Ƚ����Ⲩ¯");
		}
		if (number == 3) {
			System.out.println("��ϲ������Ƚ�����ʪ��");
		}
		if (number == 4) {
			System.out.println("��οһ�£�����16G-U�̡��������Ŭ����");
		}
		sc.close();
	}
}
