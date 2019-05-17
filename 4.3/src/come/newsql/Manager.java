package come.newsql;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {	
	public void show() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要查询的人");
		String str = scanner.next();
		System.out.println("请输入你要查询的书");
		String str1 = scanner.next();
		String sql = "select * from users2 where name =" + "'" + str + "'";		// 将语句发送给数据库
		String sql1 = "select * from book where name =" + "'" + str1 + "'";	
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			PreparedStatement ps1 = connection.prepareStatement(sql1);
			// 生成预处理对象，将我们写好的语句交给系统工具等待发送给数据库
			ResultSet rs = ps.executeQuery();// 从数据库中获取数据
			ResultSet rs1 = ps1.executeQuery();
			// 返回一个容器，其中带有数据库中通过语句查询的到的数据
			while (rs.next()) {
				// 每一次循环，可以拿到一行数据
				int id = rs.getInt("id");// ""里面填写的是你数据库里的字段名
				String name = rs.getString("name");
				String password = rs.getString("password");
				int point = rs.getInt("point");
				int level = rs.getInt("level");
				System.out.println(id + "," + name + "," + password + "," + point + "," + level );
			}
			while (rs1.next()) {
				// 每一次循环，可以拿到一行数据
				int id = rs1.getInt("id");// ""里面填写的是你数据库里的字段名
				String name = rs1.getString("name");
				int count = rs1.getInt("count");
				String Type = rs1.getString("type");
				String author = rs1.getString("author");
				int discount = rs1.getInt("count");
				int hasLended = rs1.getInt("hasLended");
				System.out.println(id + "," + name + "," + count + "," + Type + "," + author + "," + discount + "," + hasLended );
			}
			System.out.println("调用了查询的方法");

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
