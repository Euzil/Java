import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����빺��ţ�̵ĺ�����");
        int counts = sc.nextInt();
        double unit = 6.4;
        double total = counts * unit;
        System.out.print(counts + "��ţ�̺��еĵ����ʣ�");
        System.out.printf("%.1f", total);
        sc.close();
    }
}
