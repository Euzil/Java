
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	private final String dbDriver = "com.mysql.jdbc.Driver"; // ����MySQL���ݿ������
	private static final String URL = "jdbc:mysql://localhost:3306/db_employeeInfo"; // ����MySQL���ݿ��·��
	private static final String USERNAME = "root"; // ����MySQL���ݿ���û���
	private static final String PASSWORD = "root"; // ����MySQL���ݿ������
	private static Connection con = null; // ��ʼ������MySQL���ݿ�Ķ���
    
    // ��ȡ���ݿ�����
    public Connection getConn() {
        try {
            Class.forName(dbDriver); // �������ݿ�����
            // ��������MySQL���ݿ��·�����û�������������MySQL���ݿ�
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // ����Connection����
    }
    
    public void insertEmp(Employee employee) {
    	con = getConn(); // ��ȡ���ݿ�����
        try {
            PreparedStatement statement = 
            		con.prepareStatement("insert into tb_employer values(?,?,?,?,?,?)"); // ����������ݿ��Ԥ�������
            statement.setString(1, employee.getName()); // ����Ԥ�������Ĳ���ֵ
            statement.setString(2, employee.getSex());
            statement.setInt(3, employee.getAge());
            statement.setString(4, employee.getDept());
            statement.setString(5, employee.getPhone());
            statement.setString(6, employee.getRemark());
            statement.executeUpdate(); // ִ��Ԥ�������
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
