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

            System.out.println("������������֣��ÿո����:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("�����������{+-*/}:");
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
            System.out.println("������Ϊ��" + result);
        }

    }

}
