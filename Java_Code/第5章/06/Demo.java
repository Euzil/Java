import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入商品编号：");
        String number = sc.next();
        System.out.println("请您输入商品名称：");
        String name = sc.next();
        System.out.println("请您输入商品规格：");
        String pattern = sc.next();
        System.out.println("请您输入商品价格：");
        String price = sc.next();
        System.out.println("请您输入商品数量：");
        String account = sc.next();
        System.out.println("商品入库单");
        System.out.println("      商品编号：" + number);
        System.out.println("      商品名称：" + name);
        System.out.println("      商品规格：" + pattern);
        System.out.println("      商品价格：" + price);
        System.out.println("      商品数量：" + account);
        System.out.println("              保存      取消");
        sc.close();
    }
}
