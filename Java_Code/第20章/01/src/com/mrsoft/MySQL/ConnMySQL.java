
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMySQL {
	private final String dbDriver = "com.mysql.jdbc.Driver"; // ����MySQL���ݿ������
	private static final String URL = "jdbc:mysql://localhost:3306/test"; // ����MySQL���ݿ��·��
	private static final String USERNAME = "root"; // ����MySQL���ݿ���û���
	private static final String PASSWORD = "root"; // ����MySQL���ݿ������
	private static Connection con = null; // ��ʼ������MySQL���ݿ�Ķ���

	public ConnMySQL() { // ����MySQL���ݿ�Ĺ��췽��
		try {
			Class.forName(dbDriver); // ����MySQL���ݿ������
			System.out.println("MySQL���ݿ��������سɹ���");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("MySQL���ݿ���������ʧ�ܣ�");
		}
	}
	
	public boolean creatConnection() { // ����MySQL���ݿ������
		try {
			// ��������MySQL���ݿ��·�����û�������������MySQL���ݿ�
			con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {
		ConnMySQL connMySQL = new ConnMySQL();
		if (connMySQL.creatConnection()) {
			System.out.println("�ɹ���MySQL���ݿ⽨�����ӡ�");
		}
	}
}
