import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要购买的楼房的面积：");
        int area = sc.nextInt();
        if (area >= 90) {
            System.out.println("以上房屋的面积符合您的要求。");
            System.out.println("请输入您要购买的楼层数：");
            int floor = sc.nextInt();
            if (floor >= 6) {
                System.out.println("以上房屋的楼层数符合您的要求。");
                System.out.println("请输入您能承担的总房款：（万元）");
                int money = sc.nextInt();
                if (money <= 60) {
                    System.out.println("以上房屋的总房款符合您的要求。");
                } else {
                    System.out.println("暂时没有符合要求的房源");
                }
            } else {
                System.out.println("暂时没有符合要求的房源");
            }
        } else {
            System.out.println("暂时没有符合要求的房源");
        }
        sc.close();
    }
}
