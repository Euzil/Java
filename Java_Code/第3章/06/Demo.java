import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������������ߣ���λ���ף���");
        double height = sc.nextDouble();
        System.out.println("�������������أ���λ�������");
        double weight = sc.nextDouble();
        int exponent = (int) (weight/(height * height));
        System.out.println("�ó���BMI��ֵΪ��" + exponent);
        sc.close();
    }
}
