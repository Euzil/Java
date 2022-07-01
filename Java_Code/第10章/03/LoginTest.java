import java.util.Scanner;

public class LoginTest {

    static boolean login(String username, String password) {
        return "张三".equals(username) && "123456".equals(password);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = null;
        String password = null;
        do {
            System.out.println("请输入用户名：");
            username = sc.nextLine();
            System.out.println("请输入密码：");
            password = sc.nextLine();

        } while (!login(username, password));
        System.out.println("------------");
        System.out.println("登录成功");
        sc.close();
    }

}
