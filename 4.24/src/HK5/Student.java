package HK5;

public class Student {
	String name;
	int age;
	String sex;
	String marjor;
	public  Student(int age,String name) {
		this.sex = "ÄÐ";
		this.marjor = "Android";
		this.age = age;
		this.name = name;
	}
	public  Student(String sex,String marjor,int age,String name) {
		this.sex = sex;
		this.marjor = marjor;
		this.age = age;
		this.name = name;
	}
	public void out() {
		System.out.println(name+","+age+","+sex+","+marjor);
	}
}
