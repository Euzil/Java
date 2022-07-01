import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String company = "长春惠鹏石油化工科技有限公司";
        String account = "0140117369";
        String address = "吉林省长春市二道区中意之尊小区4#楼商铺101";
        String time = "19日4时";
        int debt = 574;
        System.out.println("欠费金额：" + debt + "元");
        System.out.println("\t户名：" + company);
        System.out.println("\t户号：" + account);
        System.out.println(address);
        System.out.println("截止时间：" + time);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入缴费金额（大于574）：");
        int money = sc.nextInt();
        if (money > debt) {
            System.out.println("账户电费余额为：" + (money - debt));
        }
        sc.close();
    }
}
