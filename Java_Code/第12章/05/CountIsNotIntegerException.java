
public class CountIsNotIntegerException extends Exception {

    public CountIsNotIntegerException(String message) {
        super(message);// ʵ�ָ��๹�취����
    }

    public static void main(String[] args) {
        Number count = 456214.2; // ����
        School school = new School();
        school.setCount(count);
    }

}

class School {// ѧУ
    private Number count;// ����

    public void setCount(Number count) {// ��������
        Integer i = count.intValue();// ������תΪ����
        Double d = count.doubleValue();// ������תΪ������
        double di = i;// ��������������
        if (d.equals(di)) {// ���������������ֵ��ͬ
            this.count = count;
        } else {// �������쳣
            try {
                throw new CountIsNotIntegerException("��������ΪС����" + d);
            } catch (CountIsNotIntegerException e) {
                e.printStackTrace();
            }
        }

    }
}
