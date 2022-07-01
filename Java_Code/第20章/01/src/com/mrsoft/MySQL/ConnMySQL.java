
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMySQL {
	private final String dbDriver = "com.mysql.jdbc.Driver"; // 连接MySQL数据库的驱动
	private static final String URL = "jdbc:mysql://localhost:3306/test"; // 连接MySQL数据库的路径
	private static final String USERNAME = "root"; // 连接MySQL数据库的用户名
	private static final String PASSWORD = "root"; // 连接MySQL数据库的密码
	private static Connection con = null; // 初始化连接MySQL数据库的对象

	public ConnMySQL() { // 连接MySQL数据库的构造方法
		try {
			Class.forName(dbDriver); // 加载MySQL数据库的驱动
			System.out.println("MySQL数据库驱动加载成功。");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("MySQL数据库驱动加载失败！");
		}
	}
	
	public boolean creatConnection() { // 建立MySQL数据库的连接
		try {
			// 根据连接MySQL数据库的路径、用户名、密码连接MySQL数据库
			con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {
		ConnMySQL connMySQL = new ConnMySQL();
		if (connMySQL.creatConnection()) {
			System.out.println("成功与MySQL数据库建立连接。");
		}
	}
}
