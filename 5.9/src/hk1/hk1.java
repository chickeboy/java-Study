package hk1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*����һ�������࣬��������name,age 
дһ�����࣬�̳��ڶ����࣬������������ colour,Ҫ�� 
����һ��HASHSET�����Ƕ������ͣ�����¼��5�����Ķ��� 
������2����Ϊ�ظ����ظ����ж����ݾ��� ���ֺ���ɫ��ͬ����ͬһ���� 
������4��������Ϣ�� */
public class hk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Dog> dogs = new HashSet<Dog>();
		System.out.println(dogs.add(new Dog("aa", "black")));
		System.out.println(dogs.add(new Dog("bb", "white")));
		System.out.println(dogs.add(new Dog("acc", "black")));
		System.out.println(dogs.add(new Dog("bbv", "white")));
		System.out.println(dogs.add(new Dog("aa", "black")));
		for (Iterator iterator = dogs.iterator(); iterator.hasNext();) {
			Dog dog = (Dog) iterator.next();
			System.out.println(dog);
		}
	}

}
