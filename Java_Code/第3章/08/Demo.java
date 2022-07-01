import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 2;
        System.out.println("      购票信息");
        System.out.println("-----------------");
        System.out.println("目的车站：人民广场");
        System.out.println("票价：2.00");
        System.out.print("购票数量：");
        int count = sc.nextInt();
        System.out.println("应付金额：" + count * price);
        System.out.print("已付付金额：");
        int payment = sc.nextInt();
        System.out.println("找零：" + (payment - count * price));
    }
}
