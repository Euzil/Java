
public class Elevator {
	public static void main(String[] args) {
		new Capacity().start();
	}
}

class Capacity extends Thread {
	int averWeight = 80;
	boolean flag = true;
	int totalWeight = 0;
	int passangerNum = 0;
	@Override
	public void run() {
		while (flag) {
			try {
				Thread.sleep(100);
				totalWeight += averWeight;
				System.out.println("�ֵ��������г˿�" + (++passangerNum) + "�ˡ�");
				if (totalWeight > 1000) {
					interrupt();
				}
			} catch (InterruptedException e) {
				System.out.println("�˿͵��������ѳ���1000kg�����ݷ���Ԥ����ʾ������");
				System.out.println("���ݿ�����" + (passangerNum - 1) + "λ����Ϊ80kg�ĳ˿͡�");
				flag = false;
			}
		}
	}
}