
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
				System.out.println("现电梯里已有乘客" + (++passangerNum) + "人。");
				if (totalWeight > 1000) {
					interrupt();
				}
			} catch (InterruptedException e) {
				System.out.println("乘客的总重量已超过1000kg，电梯发出预警提示音……");
				System.out.println("电梯可容纳" + (passangerNum - 1) + "位体重为80kg的乘客。");
				flag = false;
			}
		}
	}
}