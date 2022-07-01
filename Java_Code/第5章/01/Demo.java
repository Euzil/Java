import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String one = "张三李四王五赵虎";
        String two = "周达吴天郑旺张龙";
        String three = "钱英王潮孙佳冯莱";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = sc.next();
        if (one.contains(name)) {
            System.out.println("您是一号桌");
        } else if (two.contains(name)) {
            System.out.println("您是二号桌");
        } else if (three.contains(name)) {
            System.out.println("您是三号桌");
        } else {
            System.out.println("未查到您的位置，请找管理员进行核查。");
        }
        sc.close();
    }
}
