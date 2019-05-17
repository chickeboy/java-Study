package hk7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 交易明细文件内容如下例：log.txt
#姓名 性别 帐号 发生额
刘德华|1|4155990188888888|300.00
晓龙|1|1155990199999999|500.00
黄晓明|1|4155990100000000|1000.50
张东健|1|4155990155555555|600.99
梁朝伟|0|4155990111111111|5000.00
刘德华|1|4155990188888888|200.00
张东健|1|4155990155555555|500.99
刘德华|1|4155880188888888|1200.00
PS:	1)	一行是一条交易明细，每行分4列，列间用|分隔。#为注释符号。
2)	类TransRecord存储一条明细。
实现功能:
一个人可能消费有多笔。（当姓名和账号相同的话就认为是同一人)
统计每个人的消费总额。按消费额的金额升序排序。
要求显示每个人的姓名、性别、帐号、消费总额的信息
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
