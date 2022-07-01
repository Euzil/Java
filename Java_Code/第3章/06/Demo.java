import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高（单位：米）：");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重（单位：公斤）：");
        double weight = sc.nextDouble();
        int exponent = (int) (weight/(height * height));
        System.out.println("得出的BMI的值为：" + exponent);
        sc.close();
    }
}
