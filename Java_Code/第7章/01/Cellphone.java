
public class Cellphone {
	
	public Cellphone() {
		System.out.println("�����ֻ���Ĭ������ΪӢ��");
	}
	
	public Cellphone(String defaultLanguage) {
		System.out.println("�������ֻ���Ĭ����������Ϊ" + defaultLanguage);
	}

	public static void main(String[] args) {
		Cellphone cellphone1 = new Cellphone();
		Cellphone cellphone2 = new Cellphone("����");
	}
}
