/*
 *����һ��Animal�࣬��������name
  age,Ҫ�󴴽�һ�����󣬸������Ը�ֵ
    Ȼ���ӡ��������޸ĳ�Ա����ֵ����� 
 */
public class Tk3 {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		animal.name = "ak";
		System.out.println(animal.name);
		animal.name = "kk";
		System.out.println(animal.name);
	}
}

class Animal1 {
	String name;
	int age;

}
