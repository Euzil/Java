import java.util.Scanner;

public class MyMath {

    static double add(double a, double b) {
        return a + b;
    }
    static double subtractadd(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请输出两个数字，用空格隔开:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("请输运算符号{+-*/}:");
            String code = sc.nextLine();
            double result = 0;
            switch (code.trim()) {
                case "+" :
                    result = add(a, b);
                    break;
                case "-" :
                    result = subtractadd(a, b);
                    break;
                case "*" :
                    result = multiply(a, b);
                    break;
                case "/" :
                    result = divide(a, b);
                    break;
            }
            System.out.println("计算结果为：" + result);
        }

    }

}
