import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫ�����¥���������");
        int area = sc.nextInt();
        if (area >= 90) {
            System.out.println("���Ϸ��ݵ������������Ҫ��");
            System.out.println("��������Ҫ�����¥������");
            int floor = sc.nextInt();
            if (floor >= 6) {
                System.out.println("���Ϸ��ݵ�¥������������Ҫ��");
                System.out.println("���������ܳе����ܷ������Ԫ��");
                int money = sc.nextInt();
                if (money <= 60) {
                    System.out.println("���Ϸ��ݵ��ܷ����������Ҫ��");
                } else {
                    System.out.println("��ʱû�з���Ҫ��ķ�Դ");
                }
            } else {
                System.out.println("��ʱû�з���Ҫ��ķ�Դ");
            }
        } else {
            System.out.println("��ʱû�з���Ҫ��ķ�Դ");
        }
        sc.close();
    }
}
