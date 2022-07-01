
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookSale {// 创建图书销售量类

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

	public int getBookSale() {// 获得图书销售量的方法
		conn = getConn();// 获取数据库连接
		int count = 0;// 初始化图书销售量
		try {
			// 创建一个PreparedStatement对象，动态查询编程词典销量表中某个月份的总销量
			PreparedStatement ps = conn.prepareStatement("select sum(bookCount) from tb_book where month(bookDate) = ?");
			ps.setInt(1, 6);// 通配符“？”赋值为6，即“查询编程词典销量表中6月的总销量”
			ResultSet set = ps.executeQuery();// 执行查询语句返回查询结果集
			while (set.next()) {// 循环遍历查询结果集
				count = set.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;// 返回图书销售量
	}

	public static void main(String[] args) {
		BookSale sell = new BookSale();// 创建图书销售量对象
		int count = sell.getBookSale();// 获得图书销售量
		System.out.println("编程词典6月的销售额是：" + count);// 输出图书销售量
	}
}
