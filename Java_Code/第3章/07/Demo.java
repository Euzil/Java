import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入支付金额：");
        double amount=sc.nextDouble();
        System.out.println();
        System.out.println("         支付成功");
        System.out.println("         京东商城");
        System.out.println("    "+amount+"元");
        System.out.println("优惠金额            10.00元");
        System.out.println("支付方式            工商银行储蓄卡(5009)");
        System.out.println("交易时间            2018-11-27 00:34:02");
        System.out.println("订单编号             893412929");
        
    }
}
