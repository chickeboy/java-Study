package hk7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ������ϸ�ļ�������������log.txt
#���� �Ա� �ʺ� ������
���»�|1|4155990188888888|300.00
����|1|1155990199999999|500.00
������|1|4155990100000000|1000.50
�Ŷ���|1|4155990155555555|600.99
����ΰ|0|4155990111111111|5000.00
���»�|1|4155990188888888|200.00
�Ŷ���|1|4155990155555555|500.99
���»�|1|4155880188888888|1200.00
PS:	1)	һ����һ��������ϸ��ÿ�з�4�У��м���|�ָ���#Ϊע�ͷ��š�
2)	��TransRecord�洢һ����ϸ��
ʵ�ֹ���:
һ���˿��������ж�ʡ������������˺���ͬ�Ļ�����Ϊ��ͬһ��)
ͳ��ÿ���˵������ܶ�����Ѷ�Ľ����������
Ҫ����ʾÿ���˵��������Ա��ʺš������ܶ����Ϣ
 */
public class Hk7 {
	public static void main(String[] args) throws IOException {
		File file = new File("x.txt");
		ArrayList<TransRecorder> read = new Util(file).read();
		for (TransRecorder transRecorder : read) {
			System.out.println(transRecorder);
		}
	}
}

class Util {
	File file;

	public Util(File file) {
		super();
		this.file = file;
	}

	public ArrayList<TransRecorder> read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<TransRecorder> al = new ArrayList<TransRecorder>();
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.contains("#")) {
				continue;
			}
			String[] strs = line.split("\\|");
			String name = strs[0];
			int gender = Integer.valueOf(strs[1]);
			String userName = strs[2];
			double money = Double.valueOf(strs[3]);
			TransRecorder recorder = new TransRecorder(gender, name, userName, money);
			if (al.contains(recorder)) {
				int index = al.indexOf(recorder);
				al.get(index).addMoney(money);
			} else {
				al.add(recorder);
			}
		}
		return al;
	}
}

class TransRecorder {
	private int gender;
	private String name;
	private String userName;
	private double money;

	public TransRecorder(int gender, String name, String userName, double money) {
		super();
		this.gender = gender;
		this.name = name;
		this.userName = userName;
		this.money = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransRecorder other = (TransRecorder) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void addMoney(double money) {
		this.money += money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return name + "|" + gender + "|" + userName + "|" + money;
	}

}
