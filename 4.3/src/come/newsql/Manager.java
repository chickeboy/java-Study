package come.newsql;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager {	
	public void show() {
		Connection connection = JDBCUTIL.getConn();// ��ȡ���Ӷ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ��ѯ����");
		String str = scanner.next();
		System.out.println("��������Ҫ��ѯ����");
		String str1 = scanner.next();
		String sql = "select * from users2 where name =" + "'" + str + "'";		// ����䷢�͸����ݿ�
		String sql1 = "select * from book where name =" + "'" + str1 + "'";	
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			PreparedStatement ps1 = connection.prepareStatement(sql1);
			// ����Ԥ������󣬽�����д�õ���佻��ϵͳ���ߵȴ����͸����ݿ�
			ResultSet rs = ps.executeQuery();// �����ݿ��л�ȡ����
			ResultSet rs1 = ps1.executeQuery();
			// ����һ�����������д������ݿ���ͨ������ѯ�ĵ�������
			while (rs.next()) {
				// ÿһ��ѭ���������õ�һ������
				int id = rs.getInt("id");// ""������д���������ݿ�����ֶ���
				String name = rs.getString("name");
				String password = rs.getString("password");
				int point = rs.getInt("point");
				int level = rs.getInt("level");
				System.out.println(id + "," + name + "," + password + "," + point + "," + level );
			}
			while (rs1.next()) {
				// ÿһ��ѭ���������õ�һ������
				int id = rs1.getInt("id");// ""������д���������ݿ�����ֶ���
				String name = rs1.getString("name");
				int count = rs1.getInt("count");
				String Type = rs1.getString("type");
				String author = rs1.getString("author");
				int discount = rs1.getInt("count");
				int hasLended = rs1.getInt("hasLended");
				System.out.println(id + "," + name + "," + count + "," + Type + "," + author + "," + discount + "," + hasLended );
			}
			System.out.println("�����˲�ѯ�ķ���");

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
