
public class Barcode { // ����һ��Barcode��
	public static void main(String[] args) {
		String code = "6936983800013"; // ��ʼ��һ��String���͵ı���code������һ��ʮ��λ��������
		System.out.println("���������롰6936983800013���ĺ��壺");
		String country = code.substring(0, 3); // ��ȡ�ַ�����������ȡ�����ַ�����String���͵ı���country
		int countryNum = Integer.parseInt(country); // ��String���͵ı���country����Ϊint���͵ı���countryNum
		if (countryNum > 690 && countryNum < 695) { // �ж�countryNum�Ƿ�ͬʱ��������������
			System.out.println(countryNum + "��\t" + "��ʾ����Ʒ�Ĳ������й���½"); // ��������ʱ���������Ϣ����\t��������ƶ�����һ��ˮƽ�Ʊ�
		} else {
			System.out.println(countryNum + "��\t" + "��ʾ����Ʒ�Ĳ�������������"); // ����������ʱ���������Ϣ
		}
		System.out.println(code.substring(3, 8) + "��\t" + "��ʾ����Ʒ���������̴���"); // �����ȡ�����ַ������������ĺ���
		System.out.println(code.substring(8, 12) + "��\t" + "��ʾ����Ʒ�ĳ�����Ʒ����"); // �����ȡ�����ַ������������ĺ���
		System.out.println(code.substring(12) + "��\t" + "��ʾУ����"); // �����ȡ�����ַ������������ĺ���
	}
}
