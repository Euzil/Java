
public class Demo {

    static {
        System.out.println("开始加载数据库的驱动程序。");
        System.out.println("成功加载数据库的驱动程序。");
    }

    public Demo() {
        System.out.println("创建数据库连接对象");
    }

    public static void main(String[] args) {
        Demo conMySQL = new Demo();
        Demo conOracle = new Demo();
    }
}
