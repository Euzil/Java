
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

public class JDBCUtil {// 创建Java数据库连接工具包类

	Connection conn = null;// 声明数据库连接对象

	public Connection getConn() {// 连接数据库的方法
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test";// 连接数据库路径
		String userName = "root";// 连接数据库的用户名
		String passWord = "root";// 连接数据库的密码
		try {
			conn = DriverManager.getConnection(url, userName, passWord);// 获取数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;// 返回Connection对象
	}

	public List<User> getUserInfo() {// 获得用户信息的方法
		conn = getConn();// 获取与数据库的连接
		ResultSet rest;// 结果集
		List<User> list = new ArrayList<User>();// 用来存储用户信息的集合
		try {
			Statement statement = conn.createStatement();// 获取Statement对象
			String sql = "SELECT * FROM tb_picture";// 定义查询语句
			rest = statement.executeQuery(sql);// 执行查询语句获取查询结果集
			while (rest.next()) {// 循环遍历查询结果集
				User user = new User();// 定义与数据表对应的JavaBean对象
				// 设置对象属性
				user.setUserID(rest.getString(1));
				user.setPicture(rest.getString(2));
				list.add(user);// 向集合中添加对象
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// 返回集合
	}

	public ImageIcon getPicture(String userID, int flag) {// 根据用户ID获得头像的方法
		conn = getConn();// 获取与数据库的连接
		ImageIcon icon = null;
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT picture FROM tb_picture WHERE userID = ?");// 把预编译的SQL语句存储在PreparedStatement对象中
			ps.setString(1, userID);// 将SQL语句中的“？”设置为userID
			ResultSet rs = ps.executeQuery();// 执行SQL语句获得的结果集
			rs.next();// 光标指向第一行
			InputStream in = rs.getBinaryStream("picture");// 创建输入流，读取表头picture下的数据内容
			byte[] b = new byte[in.available()];// 创建字节缓冲区，缓冲区的大小为表头picture下的数据内容的字节数
			in.read(b);// 读取数据
			OutputStream os = new FileOutputStream(flag + ".jpg");// 创建输出流，把二进制图片写入到当前Java	 Project的文件夹下并命名为“1.jpg”
			os.write(b);// 写入数据
			os.flush();// 刷新输出流
			os.close();// 关闭输出流
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
