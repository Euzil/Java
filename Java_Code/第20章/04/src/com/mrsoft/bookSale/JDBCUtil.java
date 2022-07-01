
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * ��ѯ������ռǰ50%��ͼ����Ϣ
 */

public class JDBCUtil {// ����Java���ݿ����ӹ��߰���

	Connection conn = null;// �������ݿ����Ӷ���

	public Connection getConn() {// �������ݿ�ķ���
		try {
			Class.forName("com.mysql.jdbc.Driver");// ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test?&useUnicode=true&characterEncoding=gbk";// �������ݿ�·��
		String userName = "root";// �������ݿ���û���
		String passWord = "root";// �������ݿ������
		try {
			conn = DriverManager.getConnection(url, userName, passWord);// ��ȡ���ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;// ����Connection����
	}

	public List<Book> getBookInfo() {
		int sum = 0;// ���е���������
		conn = getConn();// ��ȡ�����ݿ������
		ResultSet rest;// �����
		List<Book> list = new ArrayList<Book>();// �����洢ͼ����Ϣ�ļ���
		try {
			Statement statement = conn.createStatement();// ��ȡStatement����
			String sqlNums = "SELECT COUNT(bookID) FROM tb_bookSaleInfo";// ͨ����ͼ���Ż�á����е���������
			ResultSet dataNums = statement.executeQuery(sqlNums);// ִ�в�ѯ����ȡ��ѯ�����
			while (dataNums.next()) {// ѭ��������ѯ�����
				Book book = new Book();// ���������ݱ��Ӧ��JavaBean����
				sum = dataNums.getInt(1);// ���ö�������
			}
			int halfNum = sum/2;// ��ñ��е�50%������
			String sqlData = "SELECT * FROM tb_bookSaleInfo ORDER BY bookSales DESC LIMIT " + halfNum;// �����ѯ���
			rest = statement.executeQuery(sqlData);// ִ�в�ѯ����ȡ��ѯ�����
			while (rest.next()) {// ѭ��������ѯ�����
				Book book = new Book();// ���������ݱ��Ӧ��JavaBean����
				book.setBookID(rest.getInt(1));// ���ö�������
				book.setBookName(rest.getString(2));
				book.setBookSales(rest.getInt(3));
				list.add(book);// �򼯺�����Ӷ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// ���ؼ���
	}
}
