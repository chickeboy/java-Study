import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {
	public void show() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		String sql = "select * from stu";
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
				double score = rs.getDouble("score");
				System.out.println(id + "," + name + "," + age + "," + score);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
