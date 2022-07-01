
public class Fibonacci {
    /**
     * 采用递归获取数字的方法
     * 
     * @param index
     *            - 目标位数
     * @return 数列中对应位数的数字
     */
    static int getNumber(int index) {
        if (index == 1 || index == 2) {// 如果是前两位
            return 1;//直接返回1
        }
        //返回目标位置前一位数与前两位数的和
        return getNumber(index - 1) + getNumber(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(getNumber(10));
    }

}
