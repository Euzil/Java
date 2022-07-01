
public class Payment {
	public static void main(String[] args) {
		Integer zsMoney = new Integer(100); // 张三的100元RMB
		Integer lisiMoney = 100; // 李四的100元RMB
		if (zsMoney == lisiMoney) {
			System.out.println("张三和李四的100元RMB是同一张钞票!");
		} else {
			System.out.println("张三和李四的100元RMB不是同一张钞票。");
		}
		Integer cashierMoney = 100; // 收款员手中的100元RMB
		if (cashierMoney == lisiMoney) {
			System.out.println("李四和收款员手中的100元RMB是同一张钞票。");
		} else {
			System.out.println("李四和收款员手中的100元RMB不是同一张钞票!");
		}
		if (cashierMoney == zsMoney) {
			System.out.println("张三和收款员手中的100元RMB是同一张钞票!");
		} else {
			System.out.println("张三和收款员手中的100元RMB不是同一张钞票。");
		}
	}
}
