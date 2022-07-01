
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	private final String dbDriver = "com.mysql.jdbc.Driver"; // 连接MySQL数据库的驱动
	private static final String URL = "jdbc:mysql://localhost:3306/db_employeeInfo"; // 连接MySQL数据库的路径
	private static final String USERNAME = "root"; // 连接MySQL数据库的用户名
	private static final String PASSWORD = "root"; // 连接MySQL数据库的密码
	private static Connection con = null; // 初始化连接MySQL数据库的对象
    
    // 获取数据库连接
    public Connection getConn() {
        try {
            Class.forName(dbDriver); // 加载数据库驱动
            // 根据连接MySQL数据库的路径、用户名、密码连接MySQL数据库
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // 返回Connection对象
    }
    
    public void insertEmp(Employee employee) {
    	con = getConn(); // 获取数据库连接
        try {
            PreparedStatement statement = 
            		con.prepareStatement("insert into tb_employer values(?,?,?,?,?,?)"); // 定义插入数据库的预处理语句
            statement.setString(1, employee.getName()); // 设置预处理语句的参数值
            statement.setString(2, employee.getSex());
            statement.setInt(3, employee.getAge());
            statement.setString(4, employee.getDept());
            statement.setString(5, employee.getPhone());
            statement.setString(6, employee.getRemark());
            statement.executeUpdate(); // 执行预处理语句
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
