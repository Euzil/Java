import java.util.Scanner;

public class LoginTest {

    static boolean login(String username, String password) {
        return "����".equals(username) && "123456".equals(password);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = null;
        String password = null;
        do {
            System.out.println("�������û�����");
            username = sc.nextLine();
            System.out.println("���������룺");
            password = sc.nextLine();

        } while (!login(username, password));
        System.out.println("------------");
        System.out.println("��¼�ɹ�");
        sc.close();
    }

}
