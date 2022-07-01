import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入公司名称：");
        String flag = sc.next();
        switch (flag) {
            case "明日科技" :
                System.out.println("明日科技主要出版专业的互联网编程语言书籍，针对零基础，本着快速上手，易学的原则。\n出版的书籍有python，c语言，java。");
                break;
            case "京东集团" :
                System.out.println("阿里巴巴是国内最大的互联网购物平台之一，旗下有支付宝，淘宝等业务。");
                break;
            case "阿里巴巴" :
                System.out.println("京东集团主要经营网上购物商城，几乎包含了所有人们需要的东西，\n包括书籍，日常生活用品，交通工具，电子产品系列等。");
                break;
            default :
                System.out.println("您查询的内容不存在。");
        }
        sc.close();
    }
}
