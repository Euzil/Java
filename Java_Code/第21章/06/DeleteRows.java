
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ListSelectionModel;

public class DeleteRows extends JFrame {

    private static final long serialVersionUID = -4540775327957798372L;
    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        DeleteRows frame = new DeleteRows();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public DeleteRows() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u5220\u9664\u8868\u683C\u4E2D\u7684\u884C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);

        JButton button = new JButton("\u5220\u9664");
        button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_button_actionPerformed(e);
            }
        });
        panel.add(button);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setFont(new Font("΢���ź�", Font.PLAIN, 14));
        table.setRowHeight(30);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        scrollPane.setViewportView(table);
    }

    protected void do_button_actionPerformed(ActionEvent e) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int index = table.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "��ѡ��Ҫɾ������", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        model.removeRow(table.getSelectedRow());
        table.setModel(model);
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
    }
}
