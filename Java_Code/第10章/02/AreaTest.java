
public class AreaTest {

    static double area() {
        return Math.PI;
    }
    static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double area(double w, double h) {
        return w * h;
    }

    public static void main(String[] args) {
        System.out.println(area());
        System.out.println(area(4));
        System.out.println(area(4, 3));
    }

}
