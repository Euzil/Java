import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 2;
        System.out.println("      ��Ʊ��Ϣ");
        System.out.println("-----------------");
        System.out.println("Ŀ�ĳ�վ������㳡");
        System.out.println("Ʊ�ۣ�2.00");
        System.out.print("��Ʊ������");
        int count = sc.nextInt();
        System.out.println("Ӧ����" + count * price);
        System.out.print("�Ѹ�����");
        int payment = sc.nextInt();
        System.out.println("���㣺" + (payment - count * price));
    }
}
