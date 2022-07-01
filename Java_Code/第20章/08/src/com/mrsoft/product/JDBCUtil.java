
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {// ����Java���ݿ����ӹ��߰���

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

	public List<Product> getListInfo() {// �����Ʒ��Ϣ�ķ���
		conn = getConn();// ��ȡ�����ݿ������
		ResultSet rest;// �����
		List<Product> list = new ArrayList<Product>();// �����洢��Ʒ��Ϣ�ļ���
		try {
			Statement statement = conn.createStatement();// ��ȡStatement����
			String sql = "SELECT * FROM tb_listInfo";// �����ѯ���
			rest = statement.executeQuery(sql);// ִ�в�ѯ����ȡ��ѯ�����
			while (rest.next()) {// ѭ��������ѯ�����
				Product product = new Product();// ���������ݱ��Ӧ��JavaBean(��Ʒ��)����
				// ���ö�������
				product.setListID(rest.getString(1));
				product.setListDate(rest.getString(2));
				product.setListMaker(rest.getString(3));
				list.add(product);// �򼯺�����Ӷ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// ���ؼ���
	}
	
	public List<Product> getProductInfo() {// �����Ʒ��Ϣ�ķ���
		conn = getConn();// ��ȡ�����ݿ������
		ResultSet rest;// �����
		List<Product> list = new ArrayList<Product>();// �����洢��Ʒ��Ϣ�ļ���
		try {
			Statement statement = conn.createStatement();// ��ȡStatement����
			String sql = "SELECT * FROM tb_productInfo";// �����ѯ���
			rest = statement.executeQuery(sql);// ִ�в�ѯ����ȡ��ѯ�����
			while (rest.next()) {// ѭ��������ѯ�����
				Product product = new Product();// ���������ݱ��Ӧ��JavaBean(��Ʒ��)����
				// ���ö�������
				product.setId(rest.getInt(1));
				product.setListID(rest.getString(2));
				product.setProductID(rest.getString(3));
				product.setSocket(rest.getInt(4));
				list.add(product);// �򼯺�����Ӷ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// ���ؼ���
	}
	
	public void deleteListInfo(List<String> strlist, String listID) {// ɾ�����ݵķ���
		conn = getConn();// ��ȡ�����ݿ������
		try {
			conn.setAutoCommit(false);// ��SQL�����Ϊ�����������ύ
			PreparedStatement ps = conn.prepareStatement(" delete from tb_listInfo, tb_productInfo using tb_listInfo, tb_productInfo "
													   + " where tb_listInfo.listID = tb_productInfo.listID "
													   + " and tb_listInfo.listID = ? ");// ��Ԥ�����SQL���ŵ�PreparedStatement�Ķ�����
			for (int i = 0; i < strlist.size(); i++) {
				if (strlist.get(i).equals(listID)) {
					ps.setString(1, strlist.get(i));// ΪSQL����еġ�?����ֵ
					ps.addBatch();// ��Ԥ�����SQL���ŵ���������������
				}
			}
			ps.executeBatch();// ����ִ��
			conn.commit();// �ύ����
		} catch (Exception e) {
			try {
				conn.rollback();// ����ع�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
