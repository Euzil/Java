import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈë¹ºÂòÅ£ÄÌµÄºĞÊı£º");
        int counts = sc.nextInt();
        double unit = 6.4;
        double total = counts * unit;
        System.out.print(counts + "´üÅ£ÄÌº¬ÓĞµÄµ°°×ÖÊ£º");
        System.out.printf("%.1f", total);
        sc.close();
    }
}
