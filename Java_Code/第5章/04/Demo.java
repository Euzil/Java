import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String home;
        String company;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的家：");
        home = sc.next();
        System.out.print("请输入你的单位：");
        company = sc.next();
        System.out.println("=====设置常用地点=====");
        System.out.println("我的家：" + home);
        System.out.println("我的单位：" + company);
        sc.close();
    }
}
