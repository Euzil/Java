import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������۳�������������");
        int counts = sc.nextInt();
        double price = 15.5;
        double total = counts * price;
        System.out.println("һ���ܳ��۵ĺ�������Ϊ��" + counts + "��");
        System.out.println("ȫ���۳����ܽ��Ϊ��" + total + "Ԫ");
        sc.close();
    }
}
