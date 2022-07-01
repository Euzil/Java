import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的星座编号：");
        String flag = sc.next();
        switch (flag) {
            case "a" :
                System.out.println("您查询的是：白羊座");
                break;
            case "b" :
                System.out.println("您查询的是：金牛座");
                break;
            case "1" :
                System.out.println("您查询的是：双子座");
                break;
            case "2" :
                System.out.println("您查询的是：巨蟹座");
                break;
            case "3" :
                System.out.println("您查询的是：狮子座");
                break;
            case "4" :
                System.out.println("您查询的是：处女座");
                break;
            case "5" :
                System.out.println("您查询的是：天平座");
                break;
            case "6" :
                System.out.println("您查询的是：射手座");
                break;
            case "7" :
                System.out.println("您查询的是：魔蝎座");
                break;
            case "8" :
                System.out.println("您查询的是：水瓶座");
                break;
            case "9" :
                System.out.println("您查询的是：双鱼座");
                break;
            default :
                System.out.println("您查询的内容不存在。");
        }
        sc.close();
    }
}
