import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的录取分数线(比如民办本科、艺术类本科、体育类本科、二本、一本)：");
        String name = sc.nextLine();
        switch (name) {
            case "民办本科" :
                System.out.println("民办本科录取分数线：350分");
                break;
            case "艺术类本科" :
                System.out.println("艺术类本科录取分数线：290分");
                break;
            case "体育类本科" :
                System.out.println("体育类本科录取分数线：280分");
                break;
            case "二本" :
                System.out.println("二本录取分数线：445分");
                break;
            case "一本" :
                System.out.println("一本录取分数线：555分");
                break;
            default :
                System.out.println("您查询的内容不存在");
        }
        sc.close();
    }
}
