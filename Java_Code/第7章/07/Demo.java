
public class Demo {

    static {
        System.out.println("��ʼ�������ݿ����������");
        System.out.println("�ɹ��������ݿ����������");
    }

    public Demo() {
        System.out.println("�������ݿ����Ӷ���");
    }

    public static void main(String[] args) {
        Demo conMySQL = new Demo();
        Demo conOracle = new Demo();
    }
}
