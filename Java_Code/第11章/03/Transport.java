
public class Transport {
	static final int SEATS = 108;
	int carriageNum = 10;
	int passengers = 1189;
	public static void main(String[] args) {
		Transport transport = new Transport();
		if (SEATS * transport.carriageNum < transport.passengers) {
			int leftPassengers = transport.passengers - SEATS * transport.carriageNum;
			System.out.println("��վʣ���ÿ�����" + leftPassengers + "��");
		} else {
			int leftPassengers = 0;
			System.out.println("��վʣ���ÿ�����" + leftPassengers + "��");
		}
	}
}
