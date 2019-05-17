package come.sqldatabase;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * ���ݿ�������
 */
public class JDBCUTIL {
	public static String URL;// ���ӵ�ַ
	public static String DRIVER;// ��������
	public static String USERNAME;// ���ݿ��û���
	public static String PASSWORD;// ����
	// ��ȡ�����ļ�
	static {
		ClassLoader cl = JDBCUTIL.class.getClassLoader();
		// �������
		InputStream is = cl.getResourceAsStream("jdbc.properties");
		// ��ȡҪ��ȡ���ļ���������
		Properties properties = new Properties();
		try {
			properties.load(is);//����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ�����ļ��Ĺ��߶���
		URL = properties.getProperty("url");
		DRIVER = properties.getProperty("driver");
		USERNAME = properties.getProperty("user");
		PASSWORD = properties.getProperty("password");
	}

	// ��ȡ���ݿ�����
	public static Connection getConn() {
		Connection connection = null;// �������ӹ���
		try {
			Class.forName(DRIVER);// �������ݿ�����
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
