
import java.util.Scanner;

class OverloadException extends Exception {// �Զ���һ���쳣��OverloadException�̳�Exception��
	public OverloadException(double weight) {// �����вεķ���
		// �����쳣ʱ����̨�������Ϣ
		System.out.println("�쳣��ʾ������ʼ���������Ϊ" + weight + "�����3���ˣ������ˣ�����");
	}
}

public class BuyEggs {// ����һ��BuyEggs��
	public static void pay(double weight) throws OverloadException {// ����һ����̬�ġ��вε�pay(double
		if (weight > 3.0) {// ���������������������
			throw new OverloadException(weight); // �׳��쳣
		}
		float money = (float) (weight * 3.98); // �������������û�г���������㡰Ӧ���
		System.out.println("Ӧ���" + money + "Ԫ"); // �����Ӧ���
	}

	public static void main(String[] args) {
		System.out.print("�������ʼ���������(��)��");
		Scanner sc = new Scanner(System.in); // ����̨����
		double weight = sc.nextDouble(); // ����һ��double���͵ı���weight���տ���̨�����ֵ
		try {// try��
			pay(weight); // ����pay()�����������ݲ���weight
		} catch (OverloadException ole) {// catch��
			/*
			 * ע�⣺ ���������֮����Ϊ���ա�����Ϊ���Զ����쳣����OverloadException�У� ����ͨ��������вη���public
			 * OverloadException(double weight)���ѽ������쳣ʱ����Ϣ�ڿ���̨������ˣ�
			 * ���ԣ��˴��Ͳ�����д��System.out.println(ole);����������̨�����䡣
			 */
		} finally {// finally��
			sc.close(); // �رտ���̨����
		}
	}
}
