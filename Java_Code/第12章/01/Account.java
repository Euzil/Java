
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account { // ����һ��Account��
	public static void main(String[] args) {
		double leftMoney = 1023.79; // ��ʼ�����˻���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ȡ���");
		try { // try��
			int drawMoney = sc.nextInt();
			double result = leftMoney - drawMoney; // ����������Ĺ�ϵ
			if(result >= 0) { // ��������ȡ����ʱ
				System.out.println("���˺��ϵ���" + (float)result + "Ԫ");
			} else { // ��ȡ��������ʱ
				System.out.println("���˺��ϵ����㣡");
			}
		}
		catch (InputMismatchException e) { // catch��
			System.out.println("�������ָ�ʽת���쳣������ġ�ȡ�������������");
		} finally {
			sc.close(); // �رտ���̨����
		}
	}
}
