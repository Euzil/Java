
public class Fibonacci {
    /**
     * ���õݹ��ȡ���ֵķ���
     * 
     * @param index
     *            - Ŀ��λ��
     * @return �����ж�Ӧλ��������
     */
    static int getNumber(int index) {
        if (index == 1 || index == 2) {// �����ǰ��λ
            return 1;//ֱ�ӷ���1
        }
        //����Ŀ��λ��ǰһλ����ǰ��λ���ĺ�
        return getNumber(index - 1) + getNumber(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(getNumber(10));
    }

}
