import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
	public void show() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		String sql = "select * from stu";
		// 将语句发送给数据库
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			// 生成预处理对象，将我们写好的语句交给系统工具等待发送给数据库
			ResultSet rs = ps.executeQuery();// 从数据库中获取数据
			// 返回一个容器，其中带有数据库中通过语句查询的到的数据
			while (rs.next()) {
				// 每一次循环，可以拿到一行数据
				int id = rs.getInt("id");// ""里面填写的是你数据库里的字段名
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double score = rs.getDouble("score");
				System.out.println(id + "," + name + "," + age + "," + score);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
