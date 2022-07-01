import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入搜索的内容：");
        String content = sc.next();
        System.out.println("搜索的内容：" + content);
        StringBuilder item = new StringBuilder("python    c    c++    php");
        item.append("    " + content);
        System.out.println("导航栏：" + item.toString());
        sc.close();
    }
}
