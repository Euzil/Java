
import java.util.Random;
import java.util.Scanner;

public class SevenColors { // 创建一个SevenColors类
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 控制台输入
		System.out.print("请输入您要购买的彩票数："); // 提示信息
		int counts = sc.nextInt(); // 输入“购买的彩票数”
		Random rnd = new Random(); // 创建随机号码对象r
		int nums[] = new int[counts]; // 声明一个int类型“购买彩票”的数组，用来存放购买的彩票号码
		System.out.println("您购买的彩票号码如下："); // 提示信息
		for (int i = 0; i < counts; i++) { // 遍历“购买彩票”的数组
			int randNum = rnd.nextInt(8999999) + 1000000; // 7位彩票号码，范围是1000000~9999999
			System.out.println(randNum); // 输出随机生成的彩票号码
			nums[i] = randNum;// 把随机生成的彩票号码插入“购买彩票”的数组
		}
		int useMoney = nums.length * 2;// 购买彩票花费的金额
		System.out.println("您购买彩票的号码量：" + counts + "张，共消费：" + useMoney + "元。");// 输出结果
		int getMoney = 0; // 初始化“中奖金额”
		int bonus = rnd.nextInt(8999999) + 1000000; // 7位“开奖号码”，范围是1000000~9999999
		System.out.println("本期开奖号 : " + bonus);
		String rightNum = Integer.toString(bonus); // 类型转换
		for (int l = 0; l < nums.length; l++) { // 遍历由购买彩票组成的数组
			String myNum = Integer.toString(nums[l]); // 彩票号码
			int series = 0; // 初始化中“我的号码”跟开奖号一样的连续号码的组数
			int arr[] = new int[7]; // 声明一个int类型的数组，用来存放跟开奖号一样的连续号码的组数
			for (int m = 0; m < 7; m++) {// 7位号码
				String everyNum = myNum.substring(m, m + 1); // 分别截取“我的号码”每一位上的字符串
				String everyRightNum = rightNum.substring(m, m + 1); // 分别截取“开奖号”每一位上的字符串
				if (everyNum.equals(everyRightNum)) { // 判断“我的号码”跟“开奖号”每位上的号码字是否相同
					series++; // 条件成立时，统计“我的号码”跟开奖号一样的连续号码的组数
				} else { // 条件不成立时
					if (series > 0) {// 如果有中奖的号码
						arr[series - 1] = series;// 把中奖的号码插入号码组
						series = 0;// 初始化中“我的号码”跟开奖号一样的连续号码的组数
					}
				}
			}
			// 求最大的连续号码的组数
			for (int i = 0; i < arr.length; i++) {
				if (series < arr[i]) {
					series = arr[i];
				}
			}
			if (series > 1) { // 连续号码的组数大于1
				switch (series) { // 多分支语句
				case 2:
					System.out.println("您赢得了5元！");
					getMoney += 5; // 六等奖5元
					break;
				case 3:
					System.out.println("您赢得了20元！");
					getMoney += 20; // 五等奖20元
					break;
				case 4:
					System.out.println("您赢得了300元！");
					getMoney += 300; // 四等奖300元
					break;
				case 5:
					System.out.println("您赢得了1800元！");
					getMoney += 1800; // 三等奖1800元
					break;
				case 6:
					System.out.println("您赢得了20000元！");
					getMoney += 20000; // 二等奖20000元
					break;
				case 7:
					System.out.println("您赢得了5000000元！");
					getMoney += 5000000; // 一等奖5000000元
					break;
				}
			}
		}
		System.out.println("您中奖的总金额：" + getMoney + "元。"); // 总奖金
		sc.close(); // 关闭控制台输入
	}
}
