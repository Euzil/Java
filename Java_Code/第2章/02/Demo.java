import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输文件中的字符：");
        String str = sc.nextLine();
        char c = str.charAt(0);
        System.out.println(c + "替换为：" + (int) c);
    }
}
