import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String company = "��������ʯ�ͻ����Ƽ����޹�˾";
        String account = "0140117369";
        String address = "����ʡ�����ж���������֮��С��4#¥����101";
        String time = "19��4ʱ";
        int debt = 574;
        System.out.println("Ƿ�ѽ�" + debt + "Ԫ");
        System.out.println("\t������" + company);
        System.out.println("\t���ţ�" + account);
        System.out.println(address);
        System.out.println("��ֹʱ�䣺" + time);
        Scanner sc = new Scanner(System.in);
        System.out.println("������ɷѽ�����574����");
        int money = sc.nextInt();
        if (money > debt) {
            System.out.println("�˻�������Ϊ��" + (money - debt));
        }
        sc.close();
    }
}
