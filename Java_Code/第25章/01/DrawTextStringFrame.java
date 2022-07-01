
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTextStringFrame extends JFrame {
    DrawTextStringPanel textStringPanel = new DrawTextStringPanel(); // ����������ʵ��
    
    public static void main(String args[]) { // ������
        DrawTextStringFrame frame = new DrawTextStringFrame(); // �����������ʵ��
        frame.setVisible(true); // ��ʾ����
    }
    
    public DrawTextStringFrame() {
        super(); // ���ó���Ĺ��췽��
        setTitle("�����ı�"); // �������
        setBounds(100, 100, 308, 186); // �������ʾλ�úʹ�С
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����رշ�ʽ
        add(textStringPanel); // ��������ʵ����ӵ�����������
    }
    
    class DrawTextStringPanel extends JPanel { // �����ڲ������
        public void paint(Graphics g) { // ��дpaint()����
            String value = "2019�ؿ�ӰƬ";
            int x = 107;  // �ı�λ�õĺ�����
            int y = 20;  // �ı�λ�õ�������
            g.drawString(value, x, y);   // �����ı�
            value = "������������4���վ�֮ս��";
            x = 70;  // �ı�λ�õĺ�����
            y = 50;  // �ı�λ�õ�������
            g.drawString(value, x, y);   // �����ı�
            value = "��Xս�����ڷ�ˡ�";
            x = 70;  // �ı�λ�õĺ�����
            y = 77;  // �ı�λ�õ�������
            g.drawString(value, x, y);   // �����ı�
            value = "����������";
            x = 70;  // �ı�λ�õĺ�����
            y = 104;  // �ı�λ�õ�������
            g.drawString(value, x, y);   // �����ı�
            value = "�������о���Ѫ�ʺ�����";
            x = 70;  // �ı�λ�õĺ�����
            y = 131;  // �ı�λ�õ�������
            g.drawString(value, x, y);   // �����ı�
        }
    }
}
