import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("谷歌搜索：");
        String flag = sc.next();
        switch (flag) {
            case "淘宝":
                System.out.println("https://ai.taobao.com/");
                break;
            case "天猫":
                System.out.println("https://www.tmall.com/");
                break;
            case "京东":
                System.out.println("https://www.jd.com/");
                break;
            case "明日学院":
                System.out.println("https://www.mingrisoft.com/");
                break;
            default:
                System.out.println("您查询的内容不存在。");
        }
        sc.close();
    }
}
