import java.util.Scanner;

public class Apples {
	public static void main(String[] args) {
		double price = 2.49;
		System.out.println("ƻ���ۼۣ�" + price + "ԪRMB/�");
		Scanner sc = new Scanner(System.in);
		System.out.print("����˿͹���ƻ��������(��)��");
		double weight = sc.nextDouble();
		double totalPrice = price * weight;
		System.out.println("�˿͹����ƻ���ܼ۸�Ϊ" + String.format("%.1f", totalPrice) + "RMB��");
		if (String.format("%.1f", totalPrice).contains(".5")) {
			System.out.println("�˿͵�Ӧ�����Ϊ" + (Math.round(totalPrice) + 1) + "RMB��");
		} else {
			System.out.println("�˿͵�Ӧ�����Ϊ" + Math.round(totalPrice) + "RMB��");
		}
		sc.close();
	}
}
