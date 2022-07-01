import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入售出汉堡的数量：");
        int counts = sc.nextInt();
        double price = 15.5;
        double total = counts * price;
        System.out.println("一天总出售的汉堡数量为：" + counts + "个");
        System.out.println("全天售出的总金额为：" + total + "元");
        sc.close();
    }
}
