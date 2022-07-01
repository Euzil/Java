
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTextStringFrame extends JFrame {
    DrawTextStringPanel textStringPanel = new DrawTextStringPanel(); // 创建面板类的实例
    
    public static void main(String args[]) { // 主方法
        DrawTextStringFrame frame = new DrawTextStringFrame(); // 创建窗体类的实例
        frame.setVisible(true); // 显示窗体
    }
    
    public DrawTextStringFrame() {
        super(); // 调用超类的构造方法
        setTitle("绘制文本"); // 窗体标题
        setBounds(100, 100, 308, 186); // 窗体的显示位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗体关闭方式
        add(textStringPanel); // 将面板类的实例添加到窗体容器中
    }
    
    class DrawTextStringPanel extends JPanel { // 创建内部面板类
        public void paint(Graphics g) { // 重写paint()方法
            String value = "2019必看影片";
            int x = 107;  // 文本位置的横坐标
            int y = 20;  // 文本位置的纵坐标
            g.drawString(value, x, y);   // 绘制文本
            value = "《复仇者联盟4：终局之战》";
            x = 70;  // 文本位置的横坐标
            y = 50;  // 文本位置的纵坐标
            g.drawString(value, x, y);   // 绘制文本
            value = "《X战警：黑凤凰》";
            x = 70;  // 文本位置的横坐标
            y = 77;  // 文本位置的纵坐标
            g.drawString(value, x, y);   // 绘制文本
            value = "《阿拉丁》";
            x = 70;  // 文本位置的横坐标
            y = 104;  // 文本位置的纵坐标
            g.drawString(value, x, y);   // 绘制文本
            value = "《地狱男爵：血皇后崛起》";
            x = 70;  // 文本位置的横坐标
            y = 131;  // 文本位置的纵坐标
            g.drawString(value, x, y);   // 绘制文本
        }
    }
}
