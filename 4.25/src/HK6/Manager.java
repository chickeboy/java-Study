package HK6;

import java.util.Arrays;

/*
 * 管理学生数组的类，提供相应的操作
 */
public class Manager {
	private Student[] stus;
	private int size;

	public Student[] getAll() {
		return Arrays.copyOf(stus, size);
	}

	public Manager(int init) {
		stus = new Student[init];
	}

	public Manager() {
		this(5);
	}
	public boolean save(Student student) {
		Student stu = findById(student.getId());
		if (stu == null) {
			bigger();
			stus[size++] = student;
			return true;
		}
		return false;
	}

	public boolean update(int id, Student student) {
		int index = indexOf(id);
		if (index == -1) {
			return false;
		}
		if (student.getId() != id && findById(student.getId()) != null) {
			return false;
		}
		stus[index] = student;
		return true;
	}

	public void bigger() {
		if (size == stus.length) {
			stus = Arrays.copyOf(stus, size * 2 + 1);
		}
	}
	public boolean remove(int id) {
		int index = indexOf(id);
		
		if (index == -1) {
			return false;
		}
		for (int i = index; i < size - 1; i++) {
			stus[i] = stus[i + 1]; // 2 = 3 3 = 4
		}
		
		stus[--size] = null;
		return true;
	}

	
	public int indexOf(int id) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (stus[i].getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}

	
	public Student findById(int id) {
		Student student = null;
		for (int i = 0; i < size; i++) {
			if (stus[i].getId() == id) {
				student = stus[i];
				break;
			}
		}
		return student;
	}
}
