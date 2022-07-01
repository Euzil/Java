import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»ÎÀŸ∂»£∫");
        int speed = sc.nextInt();
        double result = speed * 5 / 18;
        System.out.println(speed + "km/h = " + result + "m/s");
        sc.close();
    }
}
