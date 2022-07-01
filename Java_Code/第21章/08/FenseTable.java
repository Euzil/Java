
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FenseTable extends JFrame {

    private static final long serialVersionUID = 4035732390683420335L;
    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        FenseTable frame = new FenseTable();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public FenseTable() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u81EA\u5B9A\u4E49\u6805\u680F\u6548\u679C\u7684\u8868\u683C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("΢���ź�", Font.PLAIN, 14));
        table.setRowHeight(30);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        scrollPane.setViewportView(table);
    }

    protected void do_this_windowActivated(WindowEvent e) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[] { "����", "������", "����ʱ��", "�������", "����" });
        model.addRow(new Object[] { "Java�����ŵ���ͨ����5�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "59.8Ԫ" });
        model.addRow(new Object[] { "PHP�����ŵ���ͨ����5�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        model.addRow(new Object[] { "Visual Basic�����ŵ���ͨ����5�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        model.addRow(new Object[] { "Visual C++�����ŵ���ͨ����5�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        table.setModel(model);
        table.setDefaultRenderer(Object.class, new FenseRenderer());
    }
}
