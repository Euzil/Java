import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����������Ʒ��ţ�");
        String number = sc.next();
        System.out.println("����������Ʒ���ƣ�");
        String name = sc.next();
        System.out.println("����������Ʒ���");
        String pattern = sc.next();
        System.out.println("����������Ʒ�۸�");
        String price = sc.next();
        System.out.println("����������Ʒ������");
        String account = sc.next();
        System.out.println("��Ʒ��ⵥ");
        System.out.println("      ��Ʒ��ţ�" + number);
        System.out.println("      ��Ʒ���ƣ�" + name);
        System.out.println("      ��Ʒ���" + pattern);
        System.out.println("      ��Ʒ�۸�" + price);
        System.out.println("      ��Ʒ������" + account);
        System.out.println("              ����      ȡ��");
        sc.close();
    }
}
