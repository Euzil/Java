
public class Payment {
	public static void main(String[] args) {
		Integer zsMoney = new Integer(100); // ������100ԪRMB
		Integer lisiMoney = 100; // ���ĵ�100ԪRMB
		if (zsMoney == lisiMoney) {
			System.out.println("���������ĵ�100ԪRMB��ͬһ�ų�Ʊ!");
		} else {
			System.out.println("���������ĵ�100ԪRMB����ͬһ�ų�Ʊ��");
		}
		Integer cashierMoney = 100; // �տ�Ա���е�100ԪRMB
		if (cashierMoney == lisiMoney) {
			System.out.println("���ĺ��տ�Ա���е�100ԪRMB��ͬһ�ų�Ʊ��");
		} else {
			System.out.println("���ĺ��տ�Ա���е�100ԪRMB����ͬһ�ų�Ʊ!");
		}
		if (cashierMoney == zsMoney) {
			System.out.println("�������տ�Ա���е�100ԪRMB��ͬһ�ų�Ʊ!");
		} else {
			System.out.println("�������տ�Ա���е�100ԪRMB����ͬһ�ų�Ʊ��");
		}
	}
}
