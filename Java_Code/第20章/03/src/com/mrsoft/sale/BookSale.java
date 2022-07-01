
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookSale {// ����ͼ����������

	Connection conn = null;// �������ݿ����Ӷ���

	public Connection getConn() {// �������ݿ�ķ���
		try {
			Class.forName("com.mysql.jdbc.Driver");// ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test";// �������ݿ�·��
		String userName = "root";// �������ݿ���û���
		String passWord = "root";// �������ݿ������
		try {
			conn = DriverManager.getConnection(url, userName, passWord);// ��ȡ���ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;// ����Connection����
	}

	public int getBookSale() {// ���ͼ���������ķ���
		conn = getConn();// ��ȡ���ݿ�����
		int count = 0;// ��ʼ��ͼ��������
		try {
			Statement statement = conn.createStatement();// ʹ�����ݿ����Ӷ��󴴽�һ��Statement����
			String sql = "select sum(bookCount) from tb_book where month(bookDate) = 6";// ��ѯ��̴ʵ���������6�µ�������
			ResultSet set = statement.executeQuery(sql);// ִ�в�ѯ��䷵�ز�ѯ�����
			while (set.next()) {// ѭ��������ѯ�����
				count = set.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;// ����ͼ��������
	}

	public static void main(String[] args) {
		BookSale sell = new BookSale();// ����ͼ������������
		int count = sell.getBookSale();// ���ͼ��������
		System.out.println("��̴ʵ�6�µ����۶��ǣ�" + count);// ���ͼ��������
	}
}
