import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入郭帆的分数：");
        int scoreF = sc.nextInt();
        System.out.println("请输入郭京的分数：");
        int scoreJ = sc.nextInt();
        System.out.println("请输入冯小刚的分数：");
        int scoreG = sc.nextInt();
        System.out.println("请输入王晶的分数：");
        int scoreW = sc.nextInt();
        System.out.println("请输入黄渤的分数：");
        int scoreB = sc.nextInt();
        double result = (scoreF + scoreJ + scoreG + scoreW + scoreB) / 5;
        System.out.println("这个小组的平均分数为：" + result);
        sc.close();
    }
}
