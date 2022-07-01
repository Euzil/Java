
import java.util.Scanner;

class PriceException extends Exception { // �Զ���۸��쳣�࣬���̳��쳣��
    public PriceException(String message) { // �����۸��쳣���вι��췽��
        super(message); // �����쳣����вι��췽��
    }
}

public class Tomato { // ������������
    private double price; // ����������

    public double getPrice() { // ��ȡ����������
        return price;
    }

    // �������������ۣ���������۸��쳣����ô���׳��۸��쳣
    public void setPrice(double price) throws PriceException {
        if (price > 7.0) { // ������������۴���7Ԫ
            throw new PriceException("���ҹ涨���������۲��ó���7Ԫ������"); // �׳��۸��쳣
        } else { // ������������۲�����7Ԫ
            this.price = price; // Ϊ���������price���Ը�ֵ
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ��������̨�������
        System.out.println("���������������(���۸�ʽΪ��3.00��)��"); // ����̨�����ʾ��Ϣ
        String dayPrice = sc.next(); // �ѿ���̨��������������۸�ֵ������dayPrice
        if (dayPrice.length() == 4) { // ����̨������ַ�������Ϊ4ʱ
            // ��String���͵�����������ת��Ϊdouble����
            double unitPriceDou = Double.parseDouble(dayPrice);
            Tomato tomato = new Tomato(); // ��������������
            try { // �ѿ��ܲ����쳣��Java�������try��
                tomato.setPrice(unitPriceDou); // ��������������������������۵ķ���
            } catch (Exception e) { // ��׽����Ԫ���±�Խ���쳣����
                System.out.println(e.getMessage()); // ����쳣��Ϣ
            } finally {
                sc.close(); // �رտ���̨�������
            }
        } else { // ����̨������ַ������Ȳ�Ϊ4ʱ
            // �����ʾ��Ϣ
            System.out.println("Υ�������" + "��������������ʱС������뱣����λ��Ч���֣���3.00����");
        }
    }
}
