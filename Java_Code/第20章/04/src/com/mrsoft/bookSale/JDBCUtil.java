
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询销售量占前50%的图书信息
 */

public class JDBCUtil {// 创建Java数据库连接工具包类

	Connection conn = null;// 声明数据库连接对象

	public Connection getConn() {// 连接数据库的方法
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/test?&useUnicode=true&characterEncoding=gbk";// 连接数据库路径
		String userName = "root";// 连接数据库的用户名
		String passWord = "root";// 连接数据库的密码
		try {
			conn = DriverManager.getConnection(url, userName, passWord);// 获取数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;// 返回Connection对象
	}

	public List<Book> getBookInfo() {
		int sum = 0;// 表中的数据总量
		conn = getConn();// 获取与数据库的连接
		ResultSet rest;// 结果集
		List<Book> list = new ArrayList<Book>();// 用来存储图书信息的集合
		try {
			Statement statement = conn.createStatement();// 获取Statement对象
			String sqlNums = "SELECT COUNT(bookID) FROM tb_bookSaleInfo";// 通过“图书编号获得”表中的数据总量
			ResultSet dataNums = statement.executeQuery(sqlNums);// 执行查询语句获取查询结果集
			while (dataNums.next()) {// 循环遍历查询结果集
				Book book = new Book();// 定义与数据表对应的JavaBean对象
				sum = dataNums.getInt(1);// 设置对象属性
			}
			int halfNum = sum/2;// 获得表中的50%数据量
			String sqlData = "SELECT * FROM tb_bookSaleInfo ORDER BY bookSales DESC LIMIT " + halfNum;// 定义查询语句
			rest = statement.executeQuery(sqlData);// 执行查询语句获取查询结果集
			while (rest.next()) {// 循环遍历查询结果集
				Book book = new Book();// 定义与数据表对应的JavaBean对象
				book.setBookID(rest.getInt(1));// 设置对象属性
				book.setBookName(rest.getString(2));
				book.setBookSales(rest.getInt(3));
				list.add(book);// 向集合中添加对象
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// 返回集合
	}
}
