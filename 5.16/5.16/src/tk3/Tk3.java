package tk3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 2.����һ��ѧ����: id name score
(1)Ҫ�����¼��5�����ݣ�����������id
(2)��дһ����ר�Ų����ļ�����ɶ���д
(3)��д���еĶ�д��������ɹ��ܣ�5������¼����Ϻ󱣴���d:\1.txt�ļ���
(4)����ȡ��5�����ݣ�����score��������Ȼ�󸲸�ԭ������
 */
public class Tk3 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(3, "ff", 43));
		al.add(new Student(2, "fff", 13));
		al.add(new Student(1, "zz", 44));
		al.add(new Student(5, "11", 32));
		al.add(new Student(4, "xx", 54));
		U.show(al);
		File file = new File("student.txt");
		Util util = new Util(file);
		util.write(al);
		ArrayList<Student> a = util.read();
		U.show(a);
		Collections.sort(a, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getScore(), o2.getScore());
			}
		});
		util.write(a);
		a = util.read();
		U.show(a);
	}
}

class U {
	public static void show(ArrayList<Student> al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("++++++++++++++++++++++++++++++");
	}
}

class Util {
	private File file;
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private BufferedWriter bw;

	public Util(File file) {
		super();
		this.file = file;
	}

	// д
	public void write(ArrayList<Student> al) {
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (Student student : al) {
				bw.write(student.writeToString());// ��:��Ϊһ�����ݷָ���
				// ��ʵһ�����ݾ���һ��ѧ������� �������� ֻ����:���зָ�
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
	}

	// ��
	public ArrayList<Student> read() {
		ArrayList<Student> al = new ArrayList<Student>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				// line 3 : mike : 98
				String[] strs = line.split(":");
				// �ı��ж��������ݶ���String����
				int id = Integer.parseInt(strs[0]);
				String name = strs[1];
				double score = Double.parseDouble(strs[2]);
				Student student = new Student(id, name, score);
				al.add(student);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return al;
	}

	// �ر���
	public void closeAll() {
		// ֻ�п����������ܹر�
		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Student {
	private int id;
	private String name;
	private double score;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Student(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	// ר�Ÿ��𷵻��������浽�ļ������������ʽ
	public String writeToString() {
		return id + ":" + name + ":" + score;
	}
}