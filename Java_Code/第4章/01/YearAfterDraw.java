
import java.util.Scanner;

public class YearAfterDraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的奖号：");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("恭喜获得一等奖：42寸彩电");
		}
		if (number == 2) {
			System.out.println("恭喜获得二等奖：光波炉");
		}
		if (number == 3) {
			System.out.println("恭喜获得三等奖：加湿器");
		}
		if (number == 4) {
			System.out.println("安慰一下：奉上16G-U盘。明年继续努力！");
		}
		sc.close();
	}
}
