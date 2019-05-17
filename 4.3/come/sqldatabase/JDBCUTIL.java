package come.sqldatabase;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * 数据库连接类
 */
public class JDBCUTIL {
	public static String URL;// 连接地址
	public static String DRIVER;// 驱动连接
	public static String USERNAME;// 数据库用户名
	public static String PASSWORD;// 密码
	// 读取配置文件
	static {
		ClassLoader cl = JDBCUTIL.class.getClassLoader();
		// 类加载器
		InputStream is = cl.getResourceAsStream("jdbc.properties");
		// 获取要读取的文件的输入流
		Properties properties = new Properties();
		try {
			properties.load(is);//加载
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 读取配置文件的工具对象
		URL = properties.getProperty("url");
		DRIVER = properties.getProperty("driver");
		USERNAME = properties.getProperty("user");
		PASSWORD = properties.getProperty("password");
	}

	// 获取数据库连接
	public static Connection getConn() {
		Connection connection = null;// 创建连接工具
		try {
			Class.forName(DRIVER);// 加载数据库驱动
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}
}
