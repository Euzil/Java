import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String content = "��è    �ۻ���    ��è����   | ������    ˾������     �Ա���ѡ    ��ũ��ƶ   | ��������";
        System.out.println(content);
        Scanner sc = new Scanner(System.in);
        System.out.println("����ѡ��Ҫ���滻�ĵ����˵���");
        String target = sc.next();
        if (content.contains(target)) {
            System.out.println("���������µĵ����˵���");
            String item = sc.next();
            String newContent = content.replace(target, item);
            System.out.println("���滻��ĵ����˵���\n" + newContent);
        } else {
            System.out.println("������û���ҵ�Ҫ���滻�ĵ����˵���");
        }
        sc.close();
    }
}
