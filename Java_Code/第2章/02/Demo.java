import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���ļ��е��ַ���");
        String str = sc.nextLine();
        char c = str.charAt(0);
        System.out.println(c + "�滻Ϊ��" + (int) c);
    }
}
