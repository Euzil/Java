import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����������ķ�����");
        int scoreF = sc.nextInt();
        System.out.println("����������ķ�����");
        int scoreJ = sc.nextInt();
        System.out.println("�������С�յķ�����");
        int scoreG = sc.nextInt();
        System.out.println("�����������ķ�����");
        int scoreW = sc.nextInt();
        System.out.println("������Ʋ��ķ�����");
        int scoreB = sc.nextInt();
        double result = (scoreF + scoreJ + scoreG + scoreW + scoreB) / 5;
        System.out.println("���С���ƽ������Ϊ��" + result);
        sc.close();
    }
}
