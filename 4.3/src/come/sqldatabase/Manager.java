package come.sqldatabase;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
	public void UPDATE() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		try {
			Statement statement = connection.createStatement();
			String sql = "update employee set gender =\"Ů\" where name = \"����\"";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�������޸ĵķ���");
	}
	public void DELETE() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		try {
			Statement statement = connection.createStatement();
			String sql = "delete from employee where name = \"����\"";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ɾ���ķ���");
	}
	public void INSERT() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		try {
			Statement statement = connection.createStatement();
			String sql = "insert into employee(name,age,gender,salary,department)values(\"����\",18,\"��\",5000,\"IT����\"),(\"����\",20,\"��\",6000,\"�г���\"),(\"С��\",28,\"Ů\",10000,\"���²�\")";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���������ӵķ���");
	}
	public void show() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		String sql = "select * from employee";
		// ����䷢�͸����ݿ�
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			// ����Ԥ������󣬽�����д�õ���佻��ϵͳ���ߵȴ����͸����ݿ�
			ResultSet rs = ps.executeQuery();// �����ݿ��л�ȡ����
			// ����һ�����������д������ݿ���ͨ������ѯ�ĵ�������
			while (rs.next()) {
				// ÿһ��ѭ���������õ�һ������
				int id = rs.getInt("id");// ""������д���������ݿ�����ֶ���
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				float salary = rs.getFloat("salary");
				String department = rs.getString("department");
				System.out.println(id + "," + name + "," + age + "," + gender + "," + salary + "," + department );
			}
			System.out.println("�����˲�ѯ�ķ���");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
