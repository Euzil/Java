import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String home;
        String company;
        Scanner sc = new Scanner(System.in);
        System.out.print("��������ļң�");
        home = sc.next();
        System.out.print("��������ĵ�λ��");
        company = sc.next();
        System.out.println("=====���ó��õص�=====");
        System.out.println("�ҵļң�" + home);
        System.out.println("�ҵĵ�λ��" + company);
        sc.close();
    }
}
