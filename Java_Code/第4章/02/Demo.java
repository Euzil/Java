import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ��ѯ��¼ȡ������(������챾�ơ������౾�ơ������౾�ơ�������һ��)��");
        String name = sc.nextLine();
        switch (name) {
            case "��챾��" :
                System.out.println("��챾��¼ȡ�����ߣ�350��");
                break;
            case "�����౾��" :
                System.out.println("�����౾��¼ȡ�����ߣ�290��");
                break;
            case "�����౾��" :
                System.out.println("�����౾��¼ȡ�����ߣ�280��");
                break;
            case "����" :
                System.out.println("����¼ȡ�����ߣ�445��");
                break;
            case "һ��" :
                System.out.println("һ��¼ȡ�����ߣ�555��");
                break;
            default :
                System.out.println("����ѯ�����ݲ�����");
        }
        sc.close();
    }
}
