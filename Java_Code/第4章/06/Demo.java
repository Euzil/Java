import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������д������֤�룺\nNtxg\n����д��");
        String code = sc.next();
        if (code.equals("Ntxg")) {
            System.out.println(code.toUpperCase());
        }
        sc.close();
    }
}
