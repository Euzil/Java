
public class Acceleration {
	public static void main(String[] args) {
		double time = 15.5;
		int distance = 1050;
		double a = 2 * distance / Math.pow(time, 2);
		System.out.println("�ɻ����ʱ�ļ��ٶȣ�" + String.format("%.2f", a) + "(��/���ƽ��)��");
	}
}
