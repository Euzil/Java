import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String one = "�������������Ի�";
        String two = "�ܴ�����֣������";
        String three = "ǮӢ������ѷ���";
        Scanner sc = new Scanner(System.in);
        System.out.println("����������������");
        String name = sc.next();
        if (one.contains(name)) {
            System.out.println("����һ����");
        } else if (two.contains(name)) {
            System.out.println("���Ƕ�����");
        } else if (three.contains(name)) {
            System.out.println("����������");
        } else {
            System.out.println("δ�鵽����λ�ã����ҹ���Ա���к˲顣");
        }
        sc.close();
    }
}
