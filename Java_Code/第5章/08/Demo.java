import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������������ݣ�");
        String content = sc.next();
        System.out.println("���������ݣ�" + content);
        StringBuilder item = new StringBuilder("python    c    c++    php");
        item.append("    " + content);
        System.out.println("��������" + item.toString());
        sc.close();
    }
}
