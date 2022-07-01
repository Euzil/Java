
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

public class SortedTable extends JFrame {
    
    private static final long serialVersionUID = 2215793712885732497L;
    private JPanel contentPane;
    private JTable table;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
                    SortedTable frame = new SortedTable();
                    frame.setVisible(true);
    }
    
    /**
     * Create the frame.
     */
    public SortedTable() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u652F\u6301\u6392\u5E8F\u529F\u80FD\u7684\u8868\u683C");
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
        table.setRowHeight(35);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        header.setPreferredSize(new Dimension(header.getWidth(), 40));
        scrollPane.setViewportView(table);
    }
    
    protected void do_this_windowActivated(WindowEvent e) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(new Object[] { "����", "������", "����ʱ��", "�������", "����" });
        tableModel.addRow(new Object[] { "Java�����ŵ���ͨ����3�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "59.8Ԫ" });
        tableModel.addRow(new Object[] { "PHP�����ŵ���ͨ����3�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        tableModel.addRow(new Object[] { "Visual Basic�����ŵ���ͨ����3�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        tableModel.addRow(new Object[] { "Visual C++�����ŵ���ͨ����3�棩", "�廪��ѧ������", "2019-01-01", "�������ʦ���Ŵ���", "69.8Ԫ" });
        table.setModel(tableModel);
        table.setAutoCreateRowSorter(true);
    }
}
