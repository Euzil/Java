
public final class FiveStarRedFlag {			//������final�������Ǻ�����
	int starNum; 								//����ǵĸ���
	String starColor;							//����ǵ���ɫ
	String backgroundColor;						//���Ǻ����������ɫ
	//����Ϊ����ǵĸ���������ǵ���ɫ�Լ����Ǻ����������ɫ�Ĺ��췽��
	public FiveStarRedFlag (int starNum, String starColor, String backgroundColor) {
		this.starNum = starNum;					//Ϊ����ǵĸ�����ֵ
		this.starColor = starColor;				//Ϊ����ǵ���ɫ��ֵ
		this.backgroundColor = backgroundColor;	//Ϊ���Ǻ����������ɫ��ֵ
	}
	public static void main(String[] args) {
		//ʹ���вεĹ��췽�����������Ǻ������
		FiveStarRedFlag flag = new FiveStarRedFlag (5, "��ɫ", "��ɫ");
		//����̨��������Ǻ������ɺ�ɫ�������5�Ż�ɫ���������ɵġ�
		System.out.println("���Ǻ�������" + flag.backgroundColor + "�������"
				+ flag.starNum + "��" + flag.starColor + "���������ɵ�");
	}
}
