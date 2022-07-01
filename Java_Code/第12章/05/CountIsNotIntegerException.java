
public class CountIsNotIntegerException extends Exception {

    public CountIsNotIntegerException(String message) {
        super(message);// 实现父类构造法方法
    }

    public static void main(String[] args) {
        Number count = 456214.2; // 人数
        School school = new School();
        school.setCount(count);
    }

}

class School {// 学校
    private Number count;// 人数

    public void setCount(Number count) {// 设置人数
        Integer i = count.intValue();// 把人数转为整数
        Double d = count.doubleValue();// 把人数转为浮点数
        double di = i;// 整数付给浮点数
        if (d.equals(di)) {// 如果两个浮点数数值相同
            this.count = count;
        } else {// 否则抛异常
            try {
                throw new CountIsNotIntegerException("人数不能为小数：" + d);
            } catch (CountIsNotIntegerException e) {
                e.printStackTrace();
            }
        }

    }
}
