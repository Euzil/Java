
abstract class Fireworks {
	abstract void boom();
}

public class BoomFireworks {
	public static void main(String[] args) {
		new Fireworks() {
			void boom() {
				System.out.println("��ɫ���̻��������");
			}
		}.boom();
	}
}


