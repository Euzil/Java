
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.UIManager;

public class ResizeTableTest extends JFrame {

    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        ResizeTableTest frame = new ResizeTableTest();
        frame.setVisible(true);
    }

    public ResizeTableTest() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("±‡≥Ã”Ô—‘«∞»˝º◊");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 2, 5, 5));

        JPanel panel = new JPanel();
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JLabel label = new JLabel("◊‘∂®“Â±Ì∏Ò");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 16));
        panel.add(label, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
        table.setRowHeight(35);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 16));
        header.setPreferredSize(new Dimension(header.getWidth(), 40));
        scrollPane.setViewportView(table);
    }

    protected void do_this_windowActivated(WindowEvent e) {
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[] { "≈≈√˚", "”Ô—‘" });
        model.addRow(new Object[] { "1", "Java" });
        model.addRow(new Object[] { "2", "C" });
        model.addRow(new Object[] { "3", "Python" });
        table.setModel(model);
    }
}
