import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�ȸ�������");
        String flag = sc.next();
        switch (flag) {
            case "�Ա�":
                System.out.println("https://ai.taobao.com/");
                break;
            case "��è":
                System.out.println("https://www.tmall.com/");
                break;
            case "����":
                System.out.println("https://www.jd.com/");
                break;
            case "����ѧԺ":
                System.out.println("https://www.mingrisoft.com/");
                break;
            default:
                System.out.println("����ѯ�����ݲ����ڡ�");
        }
        sc.close();
    }
}
