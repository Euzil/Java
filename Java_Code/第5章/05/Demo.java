import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String content = "天猫    聚划算    天猫超市   | 淘抢购    司法拍卖     淘宝心选    兴农扶贫   | 飞猪旅行";
        System.out.println(content);
        Scanner sc = new Scanner(System.in);
        System.out.println("请您选择要被替换的导航菜单：");
        String target = sc.next();
        if (content.contains(target)) {
            System.out.println("请您输入新的导航菜单：");
            String item = sc.next();
            String newContent = content.replace(target, item);
            System.out.println("被替换后的导航菜单：\n" + newContent);
        } else {
            System.out.println("导航栏没有找到要被替换的导航菜单。");
        }
        sc.close();
    }
}
