
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<Product> getListInfo() {// 获得商品信息的方法
		conn = getConn();// 获取与数据库的连接
		ResultSet rest;// 结果集
		List<Product> list = new ArrayList<Product>();// 用来存储商品信息的集合
		try {
			Statement statement = conn.createStatement();// 获取Statement对象
			String sql = "SELECT * FROM tb_listInfo";// 定义查询语句
			rest = statement.executeQuery(sql);// 执行查询语句获取查询结果集
			while (rest.next()) {// 循环遍历查询结果集
				Product product = new Product();// 定义与数据表对应的JavaBean(商品类)对象
				// 设置对象属性
				product.setListID(rest.getString(1));
				product.setListDate(rest.getString(2));
				product.setListMaker(rest.getString(3));
				list.add(product);// 向集合中添加对象
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// 返回集合
	}
	
	public List<Product> getProductInfo() {// 获得商品信息的方法
		conn = getConn();// 获取与数据库的连接
		ResultSet rest;// 结果集
		List<Product> list = new ArrayList<Product>();// 用来存储商品信息的集合
		try {
			Statement statement = conn.createStatement();// 获取Statement对象
			String sql = "SELECT * FROM tb_productInfo";// 定义查询语句
			rest = statement.executeQuery(sql);// 执行查询语句获取查询结果集
			while (rest.next()) {// 循环遍历查询结果集
				Product product = new Product();// 定义与数据表对应的JavaBean(商品类)对象
				// 设置对象属性
				product.setId(rest.getInt(1));
				product.setListID(rest.getString(2));
				product.setProductID(rest.getString(3));
				product.setSocket(rest.getInt(4));
				list.add(product);// 向集合中添加对象
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;// 返回集合
	}
	
	public void deleteListInfo(List<String> strlist, String listID) {// 删除单据的方法
		conn = getConn();// 获取与数据库的连接
		try {
			conn.setAutoCommit(false);// 把SQL语句作为单独的事务提交
			PreparedStatement ps = conn.prepareStatement(" delete from tb_listInfo, tb_productInfo using tb_listInfo, tb_productInfo "
													   + " where tb_listInfo.listID = tb_productInfo.listID "
													   + " and tb_listInfo.listID = ? ");// 把预编译的SQL语句放到PreparedStatement的对象中
			for (int i = 0; i < strlist.size(); i++) {
				if (strlist.get(i).equals(listID)) {
					ps.setString(1, strlist.get(i));// 为SQL语句中的“?”赋值
					ps.addBatch();// 把预编译的SQL语句放到批量处理命令中
				}
			}
			ps.executeBatch();// 批量执行
			conn.commit();// 提交事务
		} catch (Exception e) {
			try {
				conn.rollback();// 事务回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
