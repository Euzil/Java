import java.util.Scanner;

public class ScreenPhoneNum {
	public static void main(String[] args) {
		System.out.println("�������ֻ��ţ�");
		Scanner sc = new Scanner(System.in);
		String phoneNum = sc.next();
		StringBuffer sbf = new StringBuffer(phoneNum);
		if (sbf.length() == 11) {
			sbf.replace(3, 7, "****");
			System.out.println("�ֻ���" + phoneNum + "���κ��Ч����" + sbf.toString());
		} else {
			System.out.println("������ֻ�������");
		}
		sc.close();
	}
}
