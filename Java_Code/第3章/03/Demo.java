
public class Demo {
    public static void main(String[] args) {
        double carWidth = 1.9;
        double carLength = 4.2;
        double carHeight = 1.9;
        double boxWidth = 0.5;
        double boxLength = 0.5;
        double boxHeight = 0.3;
        int x = (int) (carWidth / boxWidth);
        int y = (int) (carLength / boxLength);
        int z = (int) (carHeight / boxHeight);
        System.out.println("卸货区一层可以放" + (x * y * z) + "个箱子");
    }
}
