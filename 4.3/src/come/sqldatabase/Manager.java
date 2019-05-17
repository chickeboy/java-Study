package come.sqldatabase;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
	public void UPDATE() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		try {
			Statement statement = connection.createStatement();
			String sql = "update employee set gender =\"女\" where name = \"李四\"";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("调用了修改的方法");
	}
	public void DELETE() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		try {
			Statement statement = connection.createStatement();
			String sql = "delete from employee where name = \"张三\"";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("调用了删除的方法");
	}
	public void INSERT() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		try {
			Statement statement = connection.createStatement();
			String sql = "insert into employee(name,age,gender,salary,department)values(\"张三\",18,\"男\",5000,\"IT部门\"),(\"李四\",20,\"男\",6000,\"市场部\"),(\"小红\",28,\"女\",10000,\"人事部\")";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("调用了增加的方法");
	}
	public void show() {
		Connection connection = JDBCUTIL.getConn();// 获取连接对象
		String sql = "select * from employee";
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
				String gender = rs.getString("gender");
				float salary = rs.getFloat("salary");
				String department = rs.getString("department");
				System.out.println(id + "," + name + "," + age + "," + gender + "," + salary + "," + department );
			}
			System.out.println("调用了查询的方法");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
