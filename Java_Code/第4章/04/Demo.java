import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������빫˾���ƣ�");
        String flag = sc.next();
        switch (flag) {
            case "���տƼ�" :
                System.out.println("���տƼ���Ҫ����רҵ�Ļ�������������鼮���������������ſ������֣���ѧ��ԭ��\n������鼮��python��c���ԣ�java��");
                break;
            case "��������" :
                System.out.println("����Ͱ��ǹ������Ļ���������ƽ̨֮һ��������֧�������Ա���ҵ��");
                break;
            case "����Ͱ�" :
                System.out.println("����������Ҫ��Ӫ���Ϲ����̳ǣ���������������������Ҫ�Ķ�����\n�����鼮���ճ�������Ʒ����ͨ���ߣ����Ӳ�Ʒϵ�еȡ�");
                break;
            default :
                System.out.println("����ѯ�����ݲ����ڡ�");
        }
        sc.close();
    }
}
