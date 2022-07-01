
import java.util.Random;
import java.util.Scanner;

public class RedBags { 						// 创建一个RedBags类
	public static void main(String[] args) {
		System.out.println("—————————模拟微信抢红包—————————\n");
		Scanner sc = new Scanner(System.in); 		// 控制台输入
		System.out.print("请输入要装入红包的总金额（元）：");
		double total = sc.nextDouble(); 			// 输入“红包的总金额”
		System.out.print("请输入红包的个数（个）：");
		int bagsnum = sc.nextInt(); 				// 输入“红包的个数”
		double min = 0.01; 						// 初始化“红包的最小金额”
		Random random = new Random(); 			// 创建随机数对象random
		if (total / bagsnum == 0.01) {			// 红包总金额与个数的商为0.01时
			for (int i = 1; i < bagsnum; i++) {
				double money = min;				// 让每个包中的金额均为最小金额0.01
				total -= money;					// 红包中的剩余金额
				System.out.println
					("第" + i + "个红包：" + String.format("%.2f", money) + "元");
			}
		} else if (total / bagsnum < 0.01) {		// 红包总金额与个数的商小于0.01时
			System.out.println("要保证每个人都能分到1分钱哦！");
			return;								// 不再执行第22行以下的代码，例如第46行
		} else {
			for (int i = 1; i < bagsnum; i++) { 	// 设置“循环”
				/*
				 * 本次红包可用最大金额 = 
				 * 可分配金额 - (红包总数 * 已发出的红包数) * 红包的最小金额
				 */
				double max = total - (bagsnum - i) * min;
				double bound = max - min;			// 设置随机金额的取值范围
				/*
				 * 据随机金额的取值范围，随机生成红包金额。 由于nextInt(int
				 * bound)只能用整型做参数，所以先将bound乘100（小数点向右挪两位）
				 * 获取到一个整数后，将这个整数除100（小数点向左挪两位)
				 * 并转换成与金额相同的浮点类型
				 */
				double safe = (double) random.nextInt((int) (bound * 100)) / 100;
				double money = safe + min;	// 最后加上红包的最小金额，以防safe出现0值
				total = total - money; 		// 替换total的值
				System.out.println
					("第" + i + "个红包：" + String.format("%.2f", money) + "元");
			}
		}
		// 输出剩余金额
		System.out.println
			("第" + bagsnum + "个红包：" + String.format("%.2f", total) + "元");
		sc.close(); 							// 关闭控制台输入
	}
}
