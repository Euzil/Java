import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ��ѯ��������ţ�");
        String flag = sc.next();
        switch (flag) {
            case "a" :
                System.out.println("����ѯ���ǣ�������");
                break;
            case "b" :
                System.out.println("����ѯ���ǣ���ţ��");
                break;
            case "1" :
                System.out.println("����ѯ���ǣ�˫����");
                break;
            case "2" :
                System.out.println("����ѯ���ǣ���з��");
                break;
            case "3" :
                System.out.println("����ѯ���ǣ�ʨ����");
                break;
            case "4" :
                System.out.println("����ѯ���ǣ���Ů��");
                break;
            case "5" :
                System.out.println("����ѯ���ǣ���ƽ��");
                break;
            case "6" :
                System.out.println("����ѯ���ǣ�������");
                break;
            case "7" :
                System.out.println("����ѯ���ǣ�ħЫ��");
                break;
            case "8" :
                System.out.println("����ѯ���ǣ�ˮƿ��");
                break;
            case "9" :
                System.out.println("����ѯ���ǣ�˫����");
                break;
            default :
                System.out.println("����ѯ�����ݲ����ڡ�");
        }
        sc.close();
    }
}
