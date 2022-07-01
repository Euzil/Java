import java.util.Scanner;

public class Apples {
	public static void main(String[] args) {
		double price = 2.49;
		System.out.println("苹果售价：" + price + "元RMB/斤。");
		Scanner sc = new Scanner(System.in);
		System.out.print("输入顾客购买苹果的重量(斤)：");
		double weight = sc.nextDouble();
		double totalPrice = price * weight;
		System.out.println("顾客购买的苹果总价格为" + String.format("%.1f", totalPrice) + "RMB。");
		if (String.format("%.1f", totalPrice).contains(".5")) {
			System.out.println("顾客的应付金额为" + (Math.round(totalPrice) + 1) + "RMB。");
		} else {
			System.out.println("顾客的应付金额为" + Math.round(totalPrice) + "RMB。");
		}
		sc.close();
	}
}
