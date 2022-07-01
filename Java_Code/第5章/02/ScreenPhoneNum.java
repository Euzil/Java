import java.util.Scanner;

public class ScreenPhoneNum {
	public static void main(String[] args) {
		System.out.println("请输入手机号：");
		Scanner sc = new Scanner(System.in);
		String phoneNum = sc.next();
		StringBuffer sbf = new StringBuffer(phoneNum);
		if (sbf.length() == 11) {
			sbf.replace(3, 7, "****");
			System.out.println("手机号" + phoneNum + "屏蔽后的效果：" + sbf.toString());
		} else {
			System.out.println("输入的手机号有误！");
		}
		sc.close();
	}
}
