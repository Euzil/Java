
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

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

	public List<User> getUserInfo() {// ����û���Ϣ�ķ���
		conn = getConn();// ��ȡ�����ݿ������
		ResultSet rest;// �����
		List<User> list = new ArrayList<User>();// �����洢�û���Ϣ�ļ���
		try {
			Statement statement = conn.createStatement();// ��ȡStatement����
			String sql = "SELECT * FROM tb_picture";// �����ѯ���
			rest = statement.executeQuery(sql);// ִ�в�ѯ����ȡ��ѯ�����
			while (rest.next()) {// ѭ��������ѯ�����
				User user = new User();// ���������ݱ��Ӧ��JavaBean����
				// ���ö�������
				user.setUserID(rest.getString(1));
				user.setPicture(rest.getString(2));
				list.add(user);// �򼯺�����Ӷ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// ���ؼ���
	}

	public ImageIcon getPicture(String userID, int flag) {// �����û�ID���ͷ��ķ���
		conn = getConn();// ��ȡ�����ݿ������
		ImageIcon icon = null;
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT picture FROM tb_picture WHERE userID = ?");// ��Ԥ�����SQL���洢��PreparedStatement������
			ps.setString(1, userID);// ��SQL����еġ���������ΪuserID
			ResultSet rs = ps.executeQuery();// ִ��SQL����õĽ����
			rs.next();// ���ָ���һ��
			InputStream in = rs.getBinaryStream("picture");// ��������������ȡ��ͷpicture�µ���������
			byte[] b = new byte[in.available()];// �����ֽڻ��������������Ĵ�СΪ��ͷpicture�µ��������ݵ��ֽ���
			in.read(b);// ��ȡ����
			OutputStream os = new FileOutputStream(flag + ".jpg");// ������������Ѷ�����ͼƬд�뵽��ǰJava	 Project���ļ����²�����Ϊ��1.jpg��
			os.write(b);// д������
			os.flush();// ˢ�������
			os.close();// �ر������
			icon = new ImageIcon(flag + ".jpg");
			File file = null;
			for (int j = 1; j < flag; j++) {
				file = new File(j + ".jpg");
				if (file.exists())
					file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return icon;
	}

}
